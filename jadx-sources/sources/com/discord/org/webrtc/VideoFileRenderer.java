package com.discord.org.webrtc;

import android.os.Handler;
import android.os.HandlerThread;
import com.discord.org.webrtc.EglBase;
import com.discord.org.webrtc.VideoFrame;
import defpackage.a92;
import defpackage.ov3;
import defpackage.qx1;
import defpackage.sp5;
import defpackage.ze;
import defpackage.ze0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class VideoFileRenderer implements VideoSink {
    private static final String TAG = "VideoFileRenderer";
    private EglBase eglBase;
    private final HandlerThread fileThread;
    private final Handler fileThreadHandler;
    private int frameCount;
    private final int outputFileHeight;
    private final String outputFileName;
    private final int outputFileWidth;
    private final ByteBuffer outputFrameBuffer;
    private final int outputFrameSize;
    private final HandlerThread renderThread;
    private final Handler renderThreadHandler;
    private final FileOutputStream videoOutFile;
    private YuvConverter yuvConverter;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.discord.org.webrtc.VideoFileRenderer$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ EglBase.Context val$sharedContext;

        public AnonymousClass1(EglBase.Context context) {
            r2 = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoFileRenderer.this.eglBase = EglBase.create(r2, EglBase.CONFIG_PIXEL_BUFFER);
            VideoFileRenderer.this.eglBase.createDummyPbufferSurface();
            VideoFileRenderer.this.eglBase.makeCurrent();
            VideoFileRenderer.this.yuvConverter = new YuvConverter();
        }
    }

    public VideoFileRenderer(String str, int i, int i2, EglBase.Context context) {
        if (i % 2 != 1 && i2 % 2 != 1) {
            this.outputFileName = str;
            this.outputFileWidth = i;
            this.outputFileHeight = i2;
            int i3 = ((i * i2) * 3) / 2;
            this.outputFrameSize = i3;
            this.outputFrameBuffer = ByteBuffer.allocateDirect(i3);
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            this.videoOutFile = fileOutputStream;
            fileOutputStream.write(qx1.l("YUV4MPEG2 C420 W", i, " H", i2, " Ip F30:1 A1:1\n").getBytes(Charset.forName("US-ASCII")));
            HandlerThread handlerThread = new HandlerThread("VideoFileRendererRenderThread");
            this.renderThread = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.renderThreadHandler = handler;
            HandlerThread handlerThread2 = new HandlerThread("VideoFileRendererFileThread");
            this.fileThread = handlerThread2;
            handlerThread2.start();
            this.fileThreadHandler = new Handler(handlerThread2.getLooper());
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.discord.org.webrtc.VideoFileRenderer.1
                final /* synthetic */ EglBase.Context val$sharedContext;

                public AnonymousClass1(EglBase.Context context2) {
                    r2 = context2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VideoFileRenderer.this.eglBase = EglBase.create(r2, EglBase.CONFIG_PIXEL_BUFFER);
                    VideoFileRenderer.this.eglBase.createDummyPbufferSurface();
                    VideoFileRenderer.this.eglBase.makeCurrent();
                    VideoFileRenderer.this.yuvConverter = new YuvConverter();
                }
            });
            return;
        }
        ze0.k("Does not support uneven width or height");
        throw null;
    }

    public static /* synthetic */ void a(VideoFileRenderer videoFileRenderer, VideoFrame.I420Buffer i420Buffer, VideoFrame videoFrame) {
        videoFileRenderer.lambda$renderFrameOnRenderThread$1(i420Buffer, videoFrame);
    }

    public static /* synthetic */ void c(VideoFileRenderer videoFileRenderer) {
        videoFileRenderer.lambda$release$3();
    }

    public /* synthetic */ void lambda$release$2(CountDownLatch countDownLatch) {
        this.yuvConverter.release();
        this.eglBase.release();
        this.renderThread.quit();
        countDownLatch.countDown();
    }

    public /* synthetic */ void lambda$release$3() {
        try {
            this.videoOutFile.close();
            Logging.d(TAG, "Video written to disk as " + this.outputFileName + ". The number of frames is " + this.frameCount + " and the dimensions of the frames are " + this.outputFileWidth + "x" + this.outputFileHeight + ".");
            this.fileThread.quit();
        } catch (IOException e) {
            ov3.k("Error closing output file", e);
        }
    }

    public /* synthetic */ void lambda$renderFrameOnRenderThread$1(VideoFrame.I420Buffer i420Buffer, VideoFrame videoFrame) {
        YuvHelper.I420Rotate(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), this.outputFrameBuffer, i420Buffer.getWidth(), i420Buffer.getHeight(), videoFrame.getRotation());
        i420Buffer.release();
        try {
            this.videoOutFile.write("FRAME\n".getBytes(Charset.forName("US-ASCII")));
            this.videoOutFile.write(this.outputFrameBuffer.array(), this.outputFrameBuffer.arrayOffset(), this.outputFrameSize);
            this.frameCount++;
        } catch (IOException e) {
            ov3.k("Error writing video to disk", e);
        }
    }

    /* renamed from: renderFrameOnRenderThread */
    public void lambda$onFrame$0(VideoFrame videoFrame) {
        int i;
        int i2;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (videoFrame.getRotation() % 180 == 0) {
            i = this.outputFileWidth;
        } else {
            i = this.outputFileHeight;
        }
        int i3 = i;
        if (videoFrame.getRotation() % 180 == 0) {
            i2 = this.outputFileHeight;
        } else {
            i2 = this.outputFileWidth;
        }
        int i4 = i2;
        float width = buffer.getWidth() / buffer.getHeight();
        float f = i3 / i4;
        int width2 = buffer.getWidth();
        int height = buffer.getHeight();
        if (f > width) {
            height = (int) ((width / f) * height);
        } else {
            width2 = (int) ((f / width) * width2);
        }
        VideoFrame.Buffer cropAndScale = buffer.cropAndScale((buffer.getWidth() - width2) / 2, (buffer.getHeight() - height) / 2, width2, height, i3, i4);
        videoFrame.release();
        VideoFrame.I420Buffer i420 = cropAndScale.toI420();
        cropAndScale.release();
        this.fileThreadHandler.post(new ze((Object) this, (Object) i420, (Object) videoFrame, (byte) 26));
    }

    @Override // com.discord.org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        videoFrame.retain();
        this.renderThreadHandler.post(new sp5(this, videoFrame, (byte) 8));
    }

    public void release() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.renderThreadHandler.post(new sp5(this, countDownLatch, (byte) 9));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.fileThreadHandler.post(new a92(this, (byte) 29));
        try {
            this.fileThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Logging.e(TAG, "Interrupted while waiting for the write to disk to complete.", e);
        }
    }
}

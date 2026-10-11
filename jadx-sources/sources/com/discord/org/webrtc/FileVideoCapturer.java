package com.discord.org.webrtc;

import android.content.Context;
import android.os.SystemClock;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import defpackage.qx1;
import defpackage.v71;
import defpackage.ze0;
import defpackage.zo5;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class FileVideoCapturer implements VideoCapturer {
    private static final String TAG = "FileVideoCapturer";
    private CapturerObserver capturerObserver;
    private final VideoReader videoReader;
    private final Timer timer = new Timer();
    private final TimerTask tickTask = new TimerTask() { // from class: com.discord.org.webrtc.FileVideoCapturer.1
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            FileVideoCapturer.this.tick();
        }
    };

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public interface VideoReader {
        void close();

        VideoFrame getNextFrame();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static class VideoReaderY4M implements VideoReader {
        private static final int FRAME_DELIMETER_LENGTH = 6;
        private static final String TAG = "VideoReaderY4M";
        private static final String Y4M_FRAME_DELIMETER = "FRAME";
        private final int frameHeight;
        private final int frameWidth;
        private final RandomAccessFile mediaFile;
        private final FileChannel mediaFileChannel;
        private final long videoStart;

        public VideoReaderY4M(String str) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.mediaFile = randomAccessFile;
            this.mediaFileChannel = randomAccessFile.getChannel();
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = this.mediaFile.read();
                if (read != -1) {
                    if (read == 10) {
                        this.videoStart = this.mediaFileChannel.position();
                        String str2 = "";
                        int i = 0;
                        int i2 = 0;
                        for (String str3 : sb.toString().split("[ ]")) {
                            char charAt = str3.charAt(0);
                            if (charAt != 'C') {
                                if (charAt != 'H') {
                                    if (charAt == 'W') {
                                        i = Integer.parseInt(str3.substring(1));
                                    }
                                } else {
                                    i2 = Integer.parseInt(str3.substring(1));
                                }
                            } else {
                                str2 = str3.substring(1);
                            }
                        }
                        Logging.d(TAG, "Color space: " + str2);
                        if (!str2.equals("420") && !str2.equals("420mpeg2")) {
                            ze0.k("Does not support any other color space than I420 or I420mpeg2");
                            throw null;
                        }
                        if (i % 2 != 1 && i2 % 2 != 1) {
                            this.frameWidth = i;
                            this.frameHeight = i2;
                            Logging.d(TAG, qx1.l("frame dim: (", i, ", ", i2, ")"));
                            return;
                        }
                        ze0.k("Does not support odd width or height");
                        throw null;
                    }
                    sb.append((char) read);
                } else {
                    v71.i(zo5.l("Found end of file before end of header for file: ", str));
                    throw null;
                }
            }
        }

        @Override // com.discord.org.webrtc.FileVideoCapturer.VideoReader
        public void close() {
            try {
                this.mediaFile.close();
            } catch (IOException e) {
                Logging.e(TAG, "Problem closing file", e);
            }
        }

        @Override // com.discord.org.webrtc.FileVideoCapturer.VideoReader
        public VideoFrame getNextFrame() {
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            JavaI420Buffer allocate = JavaI420Buffer.allocate(this.frameWidth, this.frameHeight);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            allocate.getStrideY();
            allocate.getStrideU();
            allocate.getStrideV();
            try {
                int i = FRAME_DELIMETER_LENGTH;
                ByteBuffer allocate2 = ByteBuffer.allocate(i);
                if (this.mediaFileChannel.read(allocate2) < i) {
                    this.mediaFileChannel.position(this.videoStart);
                    if (this.mediaFileChannel.read(allocate2) < i) {
                        throw new RuntimeException("Error looping video");
                    }
                }
                String str = new String(allocate2.array(), Charset.forName("US-ASCII"));
                if (str.equals("FRAME\n")) {
                    this.mediaFileChannel.read(dataY);
                    this.mediaFileChannel.read(dataU);
                    this.mediaFileChannel.read(dataV);
                    return new VideoFrame(allocate, 0, nanos);
                }
                throw new RuntimeException("Frames should be delimited by FRAME plus newline, found delimter was: '" + str + "'");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public FileVideoCapturer(String str) {
        try {
            this.videoReader = new VideoReaderY4M(str);
        } catch (IOException e) {
            Logging.d(TAG, "Could not open video file: " + str);
            throw e;
        }
    }

    @Override // com.discord.org.webrtc.VideoCapturer
    public void dispose() {
        this.videoReader.close();
    }

    @Override // com.discord.org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.capturerObserver = capturerObserver;
    }

    @Override // com.discord.org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // com.discord.org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3) {
        this.timer.schedule(this.tickTask, 0L, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT / i3);
    }

    @Override // com.discord.org.webrtc.VideoCapturer
    public void stopCapture() {
        this.timer.cancel();
    }

    public void tick() {
        VideoFrame nextFrame = this.videoReader.getNextFrame();
        this.capturerObserver.onFrameCaptured(nextFrame);
        nextFrame.release();
    }

    @Override // com.discord.org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
    }
}

package s1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import f1.b0;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f9754a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f9755b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f9756c;

    public a0(MediaCodec mediaCodec) {
        this.f9754a = mediaCodec;
        if (b0.f3799a < 21) {
            this.f9755b = mediaCodec.getInputBuffers();
            this.f9756c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // s1.k
    public final void a() {
        this.f9755b = null;
        this.f9756c = null;
        this.f9754a.release();
    }

    @Override // s1.k
    public final void b(int i10, i1.d dVar, long j4, int i11) {
        this.f9754a.queueSecureInputBuffer(i10, 0, dVar.f5258i, j4, i11);
    }

    @Override // s1.k
    public final void c(Bundle bundle) {
        this.f9754a.setParameters(bundle);
    }

    @Override // s1.k
    public final void d(int i10, int i11, long j4, int i12) {
        this.f9754a.queueInputBuffer(i10, 0, i11, j4, i12);
    }

    @Override // s1.k
    public final int e(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f9754a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && b0.f3799a < 21) {
                this.f9756c = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // s1.k
    public final void f() {
    }

    @Override // s1.k
    public final void flush() {
        this.f9754a.flush();
    }

    @Override // s1.k
    public final void g(int i10, boolean z9) {
        this.f9754a.releaseOutputBuffer(i10, z9);
    }

    @Override // s1.k
    public final void h(b2.k kVar, Handler handler) {
        this.f9754a.setOnFrameRenderedListener(new a(this, kVar, 1), handler);
    }

    @Override // s1.k
    public final void i(int i10) {
        this.f9754a.setVideoScalingMode(i10);
    }

    @Override // s1.k
    public final MediaFormat j() {
        return this.f9754a.getOutputFormat();
    }

    @Override // s1.k
    public final ByteBuffer k(int i10) {
        if (b0.f3799a >= 21) {
            return this.f9754a.getInputBuffer(i10);
        }
        return this.f9755b[i10];
    }

    @Override // s1.k
    public final void l(Surface surface) {
        this.f9754a.setOutputSurface(surface);
    }

    @Override // s1.k
    public final ByteBuffer m(int i10) {
        if (b0.f3799a >= 21) {
            return this.f9754a.getOutputBuffer(i10);
        }
        return this.f9756c[i10];
    }

    @Override // s1.k
    public final void n(int i10, long j4) {
        this.f9754a.releaseOutputBuffer(i10, j4);
    }

    @Override // s1.k
    public final int o() {
        return this.f9754a.dequeueInputBuffer(0L);
    }
}

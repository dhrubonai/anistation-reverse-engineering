package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a12 extends ge6 {
    public static final int[] T = {2, 3, 6, 7, 8, 9, 11, 14};
    public static final int[] U = {1920, 1088};
    public static final long V;
    public final oe2 A;
    public oa1 B;
    public final int C;
    public final Surface D;
    public final SurfaceTexture E;
    public final float[] F;
    public final ConcurrentLinkedQueue G;
    public final ScheduledExecutorService H;
    public final boolean I;
    public int J;
    public int K;
    public boolean L;
    public bb2 M;
    public bb2 N;
    public boolean O;
    public ScheduledFuture P;
    public CountDownLatch Q;
    public volatile boolean R;
    public volatile RuntimeException S;

    static {
        long j;
        if (eq6.Q()) {
            j = 20000;
        } else {
            j = 500;
        }
        V = j;
    }

    public a12(oe2 oe2Var, final ts6 ts6Var, boolean z, boolean z2) {
        super(ts6Var);
        this.A = oe2Var;
        this.O = z;
        this.I = z2;
        try {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            a34.p();
            int i = iArr[0];
            a34.k(36197, i, 9729);
            this.C = i;
            SurfaceTexture surfaceTexture = new SurfaceTexture(i);
            this.E = surfaceTexture;
            this.F = new float[16];
            this.G = new ConcurrentLinkedQueue();
            this.H = Executors.newSingleThreadScheduledExecutor(new fv0("ExtTexMgr:Timer", (byte) 1));
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: z02
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    ts6Var.f(new y02(a12.this, (byte) 2), false);
                }
            });
            this.D = new Surface(surfaceTexture);
        } catch (ze2 e) {
            throw new ns6(e);
        }
    }

    public static float p(int i, float f) {
        int i2 = i;
        for (int i3 = 2; i3 <= 256; i3 *= 2) {
            int i4 = (((i + i3) - 1) / i3) * i3;
            if (t(f, i4, i) < t(f, i2, i)) {
                i2 = i4;
            }
        }
        for (int i5 = 0; i5 < 2; i5++) {
            int i6 = U[i5];
            if (i6 >= i && t(f, i6, i) < t(f, i2, i)) {
                i2 = i6;
            }
        }
        if (t(f, i2, i) > 1.0E-9f) {
            return f;
        }
        return i / i2;
    }

    public static float t(float f, int i, int i2) {
        float f2 = 1.0f;
        for (int i3 = 0; i3 <= 2; i3++) {
            float f3 = ((i2 - i3) / i) - f;
            if (Math.abs(f3) < f2) {
                f2 = Math.abs(f3);
            }
        }
        return f2;
    }

    @Override // defpackage.ge6
    public final void a() {
        this.R = true;
    }

    @Override // defpackage.ge6
    public final void b() {
        this.J = 0;
        this.M = null;
        this.G.clear();
        this.N = null;
        super.b();
    }

    @Override // defpackage.ge6
    public final Surface c() {
        return this.D;
    }

    @Override // defpackage.ge6
    public final int d() {
        return this.G.size();
    }

    @Override // defpackage.ge6
    public final void g(bb2 bb2Var) {
        this.N = bb2Var;
        if (!this.O) {
            this.G.add(bb2Var);
        }
        this.x.f(new y02(this, (byte) 5), true);
    }

    @Override // defpackage.te2
    public final void h() {
        this.x.f(new fj0(this, this.B, (byte) 2), true);
    }

    @Override // defpackage.ge6
    public final void i() {
        this.E.release();
        this.D.release();
        this.H.shutdownNow();
    }

    @Override // defpackage.ge6
    public final void j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.Q = countDownLatch;
        this.x.f(new y02(this, (byte) 0), true);
        try {
            if (!countDownLatch.await(V, TimeUnit.MILLISECONDS)) {
                kb0.O("ExtTexMgr", "Timeout reached while waiting for latch to be unblocked.");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            kb0.O("ExtTexMgr", "Interrupted when waiting for MediaCodec frames to arrive.");
        }
        this.Q = null;
        if (this.S == null) {
        } else {
            throw this.S;
        }
    }

    @Override // defpackage.te2
    public final void k(we2 we2Var) {
        this.x.f(new y02(this, (byte) 1), true);
    }

    @Override // defpackage.ge6
    public final void l(bb2 bb2Var, boolean z) {
        this.O = z;
        if (z) {
            this.N = bb2Var;
            ea2 ea2Var = bb2Var.a;
            this.E.setDefaultBufferSize(ea2Var.w, ea2Var.x);
        }
    }

    @Override // defpackage.ge6
    public final void n(oa1 oa1Var) {
        this.J = 0;
        this.B = oa1Var;
    }

    @Override // defpackage.ge6
    public final void o() {
        this.x.f(new y02(this, (byte) 4), true);
    }

    public final void r() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.J != 0 && this.K != 0 && this.M == null) {
            this.E.updateTexImage();
            int i7 = 1;
            this.K--;
            bb2 bb2Var = (bb2) this.G.element();
            this.M = bb2Var;
            this.J--;
            this.E.getTransformMatrix(this.F);
            long timestamp = (this.E.getTimestamp() / 1000) + bb2Var.b;
            if (this.I) {
                float[] fArr = this.F;
                ea2 ea2Var = bb2Var.a;
                int i8 = ea2Var.w;
                int i9 = ea2Var.x;
                int i10 = 0;
                if (fArr.length != 16) {
                    i = 1;
                } else {
                    i = 0;
                }
                int[] iArr = T;
                for (int i11 = 0; i11 < 8; i11++) {
                    if (Math.abs(fArr[iArr[i11]]) > 1.0E-9f) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    i |= i6;
                }
                if (Math.abs(fArr[10] - 1.0f) > 1.0E-9f) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                int i12 = i | i2;
                if (Math.abs(fArr[15] - 1.0f) > 1.0E-9f) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int i13 = i12 | i3;
                char c = '\r';
                char c2 = '\f';
                char c3 = 4;
                if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
                    if (Math.abs(fArr[1]) > 1.0E-9f) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    int i14 = i13 | i5;
                    if (Math.abs(fArr[4]) <= 1.0E-9f) {
                        i7 = 0;
                    }
                    i7 |= i14;
                    c2 = '\r';
                    c = '\f';
                    c3 = 5;
                } else if (Math.abs(fArr[1]) > 1.0E-9f && Math.abs(fArr[4]) > 1.0E-9f) {
                    if (Math.abs(fArr[0]) > 1.0E-9f) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    int i15 = i13 | i4;
                    if (Math.abs(fArr[5]) > 1.0E-9f) {
                        i10 = 1;
                    }
                    int i16 = i15 | i10;
                    i10 = 1;
                    i7 = i16;
                } else {
                    i10 = -1;
                    c = 65535;
                    c2 = 65535;
                    c3 = 65535;
                }
                if (i7 != 0) {
                    LinkedHashMap linkedHashMap = a61.a;
                    synchronized (a61.class) {
                    }
                } else {
                    float f = fArr[i10];
                    float f2 = fArr[c];
                    if (Math.abs(f) + 1.0E-9f < 1.0f) {
                        float copySign = Math.copySign(p(i8, Math.abs(f)), f);
                        float f3 = ((f - copySign) * 0.5f) + f2;
                        LinkedHashMap linkedHashMap2 = a61.a;
                        synchronized (a61.class) {
                        }
                        fArr[i10] = copySign;
                        fArr[c] = f3;
                    }
                    float f4 = fArr[c3];
                    float f5 = fArr[c2];
                    if (Math.abs(f4) + 1.0E-9f < 1.0f) {
                        float copySign2 = Math.copySign(p(i9, Math.abs(f4)), f4);
                        float f6 = ((f4 - copySign2) * 0.5f) + f5;
                        LinkedHashMap linkedHashMap3 = a61.a;
                        synchronized (a61.class) {
                        }
                        fArr[c3] = copySign2;
                        fArr[c2] = f6;
                    }
                }
            }
            oa1 oa1Var = this.B;
            oa1Var.getClass();
            oa1Var.h.f("uTexTransformationMatrix", this.F);
            oa1 oa1Var2 = this.B;
            oa1Var2.getClass();
            oe2 oe2Var = this.A;
            int i17 = this.C;
            ea2 ea2Var2 = bb2Var.a;
            oa1Var2.c(oe2Var, new we2(i17, -1, ea2Var2.w, ea2Var2.x), timestamp);
            ((bb2) this.G.remove()).getClass();
            a61.a();
        }
    }

    public final void s() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        while (true) {
            int i = this.K;
            concurrentLinkedQueue = this.G;
            if (i <= 0) {
                break;
            }
            this.K = i - 1;
            this.E.updateTexImage();
            concurrentLinkedQueue.remove();
        }
        if (this.Q != null && concurrentLinkedQueue.isEmpty()) {
            this.Q.countDown();
        }
    }
}

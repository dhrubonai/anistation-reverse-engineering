package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eu implements hp3 {
    public final y23 A;
    public boolean B;
    public byte C = 0;
    public final MediaCodec x;
    public final iu y;
    public final kp3 z;

    public eu(MediaCodec mediaCodec, HandlerThread handlerThread, kp3 kp3Var, y23 y23Var) {
        this.x = mediaCodec;
        this.y = new iu(handlerThread);
        this.z = kp3Var;
        this.A = y23Var;
    }

    public static String a(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.hp3
    public final void M(ArrayList arrayList) {
        this.x.subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.hp3
    public final void O(zp3 zp3Var, Handler handler) {
        this.x.setOnFrameRenderedListener(new cu(this, zp3Var, (byte) 0), handler);
    }

    @Override // defpackage.hp3
    public final void Q(ArrayList arrayList) {
        this.x.unsubscribeFromVendorParameters(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (r6 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.media.MediaFormat r5, android.view.Surface r6, android.media.MediaCrypto r7, int r8) {
        /*
            r4 = this;
            iu r0 = r4.y
            android.os.HandlerThread r1 = r0.b
            android.os.Handler r2 = r0.c
            r3 = 1
            if (r2 != 0) goto Lb
            r2 = r3
            goto Lc
        Lb:
            r2 = 0
        Lc:
            defpackage.io3.B(r2)
            r1.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r1 = r1.getLooper()
            r2.<init>(r1)
            android.media.MediaCodec r1 = r4.x
            r1.setCallback(r0, r2)
            r0.c = r2
            java.lang.String r0 = "configureCodec"
            android.os.Trace.beginSection(r0)
            r1.configure(r5, r6, r7, r8)
            android.os.Trace.endSection()
            kp3 r5 = r4.z
            r5.start()
            java.lang.String r5 = "startCodec"
            android.os.Trace.beginSection(r5)
            r1.start()
            android.os.Trace.endSection()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 35
            if (r5 < r6) goto L5f
            y23 r5 = r4.A
            if (r5 == 0) goto L5f
            java.lang.Object r6 = r5.z
            android.media.LoudnessCodecController r6 = (android.media.LoudnessCodecController) r6
            if (r6 == 0) goto L54
            boolean r6 = defpackage.bu.q(r6, r1)
            if (r6 != 0) goto L54
            goto L5f
        L54:
            java.lang.Object r5 = r5.y
            java.util.HashSet r5 = (java.util.HashSet) r5
            boolean r5 = r5.add(r1)
            defpackage.io3.B(r5)
        L5f:
            r4.C = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu.b(android.media.MediaFormat, android.view.Surface, android.media.MediaCrypto, int):void");
    }

    @Override // defpackage.hp3
    public final void c(int i, x21 x21Var, long j, int i2) {
        this.z.c(i, x21Var, j, i2);
    }

    @Override // defpackage.hp3
    public final void d(int i, int i2, int i3, long j) {
        this.z.d(i, i2, i3, j);
    }

    @Override // defpackage.hp3
    public final void f(int i) {
        this.x.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.hp3
    public final void flush() {
        this.z.flush();
        this.x.flush();
        iu iuVar = this.y;
        synchronized (iuVar.a) {
            iuVar.l++;
            Handler handler = iuVar.c;
            String str = eq6.a;
            handler.post(new p0((Object) iuVar, (byte) 4));
        }
        this.x.start();
    }

    @Override // defpackage.hp3
    public final boolean g(eo3 eo3Var) {
        iu iuVar = this.y;
        synchronized (iuVar.a) {
            iuVar.o = eo3Var;
        }
        return true;
    }

    @Override // defpackage.hp3
    public final ByteBuffer getInputBuffer(int i) {
        return this.x.getInputBuffer(i);
    }

    @Override // defpackage.hp3
    public final ByteBuffer getOutputBuffer(int i) {
        return this.x.getOutputBuffer(i);
    }

    @Override // defpackage.hp3
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        iu iuVar = this.y;
        synchronized (iuVar.a) {
            try {
                mediaFormat = iuVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.hp3
    public final void k() {
        this.x.detachOutputSurface();
    }

    @Override // defpackage.hp3
    public final void n(int i, long j) {
        this.x.releaseOutputBuffer(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x0040, B:23:0x0034, B:24:0x0042, B:25:0x0047), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x0040, B:23:0x0034, B:24:0x0042, B:25:0x0047), top: B:3:0x000a }] */
    @Override // defpackage.hp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o() {
        /*
            r6 = this;
            kp3 r0 = r6.z
            r0.b()
            iu r6 = r6.y
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            r6.b()     // Catch: java.lang.Throwable -> L24
            long r1 = r6.l     // Catch: java.lang.Throwable -> L24
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 > 0) goto L1e
            boolean r1 = r6.m     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L1c
            goto L1e
        L1c:
            r1 = r2
            goto L1f
        L1e:
            r1 = r3
        L1f:
            r4 = -1
            if (r1 == 0) goto L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return r4
        L24:
            r6 = move-exception
            goto L48
        L26:
            fm0 r6 = r6.d     // Catch: java.lang.Throwable -> L24
            int r1 = r6.y     // Catch: java.lang.Throwable -> L24
            int r5 = r6.z     // Catch: java.lang.Throwable -> L24
            if (r1 != r5) goto L2f
            r2 = r3
        L2f:
            if (r2 == 0) goto L32
            goto L40
        L32:
            if (r1 == r5) goto L42
            java.lang.Object r2 = r6.B     // Catch: java.lang.Throwable -> L24
            int[] r2 = (int[]) r2     // Catch: java.lang.Throwable -> L24
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L24
            int r1 = r1 + r3
            int r2 = r6.A     // Catch: java.lang.Throwable -> L24
            r1 = r1 & r2
            r6.y = r1     // Catch: java.lang.Throwable -> L24
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return r4
        L42:
            java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L24
            r6.<init>()     // Catch: java.lang.Throwable -> L24
            throw r6     // Catch: java.lang.Throwable -> L24
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu.o():int");
    }

    @Override // defpackage.hp3
    public final void release() {
        y23 y23Var;
        y23 y23Var2;
        try {
            if (this.C == 1) {
                this.z.shutdown();
                iu iuVar = this.y;
                synchronized (iuVar.a) {
                    iuVar.m = true;
                    iuVar.b.quit();
                    iuVar.a();
                }
            }
            this.C = (byte) 2;
            if (!this.B) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30 && i < 33) {
                        this.x.stop();
                    }
                    if (i >= 35 && (y23Var2 = this.A) != null) {
                        y23Var2.a0(this.x);
                    }
                    this.x.release();
                    this.B = true;
                } finally {
                }
            }
        } catch (Throwable th) {
            if (!this.B) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.x.stop();
                    }
                    if (i2 >= 35 && (y23Var = this.A) != null) {
                        y23Var.a0(this.x);
                    }
                    this.x.release();
                    this.B = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.hp3
    public final void setOutputSurface(Surface surface) {
        this.x.setOutputSurface(surface);
    }

    @Override // defpackage.hp3
    public final void setParameters(Bundle bundle) {
        this.z.setParameters(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0044, B:25:0x006b, B:29:0x0061, B:30:0x006d, B:31:0x0072), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0044, B:25:0x006b, B:29:0x0061, B:30:0x006d, B:31:0x0072), top: B:3:0x000a }] */
    @Override // defpackage.hp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int v(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            kp3 r0 = r9.z
            r0.b()
            iu r9 = r9.y
            java.lang.Object r1 = r9.a
            monitor-enter(r1)
            r9.b()     // Catch: java.lang.Throwable -> L24
            long r2 = r9.l     // Catch: java.lang.Throwable -> L24
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 > 0) goto L1e
            boolean r0 = r9.m     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            r4 = -1
            if (r0 == 0) goto L27
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r4
        L24:
            r0 = move-exception
            r9 = r0
            goto L73
        L27:
            fm0 r0 = r9.e     // Catch: java.lang.Throwable -> L24
            int r5 = r0.y     // Catch: java.lang.Throwable -> L24
            int r6 = r0.z     // Catch: java.lang.Throwable -> L24
            if (r5 != r6) goto L30
            r2 = r3
        L30:
            if (r2 == 0) goto L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r4
        L34:
            if (r5 == r6) goto L6d
            java.lang.Object r2 = r0.B     // Catch: java.lang.Throwable -> L24
            int[] r2 = (int[]) r2     // Catch: java.lang.Throwable -> L24
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L24
            int r5 = r5 + r3
            int r3 = r0.A     // Catch: java.lang.Throwable -> L24
            r3 = r3 & r5
            r0.y = r3     // Catch: java.lang.Throwable -> L24
            if (r2 < 0) goto L5e
            android.media.MediaFormat r0 = r9.h     // Catch: java.lang.Throwable -> L24
            r0.getClass()     // Catch: java.lang.Throwable -> L24
            java.util.ArrayDeque r9 = r9.f     // Catch: java.lang.Throwable -> L24
            java.lang.Object r9 = r9.remove()     // Catch: java.lang.Throwable -> L24
            android.media.MediaCodec$BufferInfo r9 = (android.media.MediaCodec.BufferInfo) r9     // Catch: java.lang.Throwable -> L24
            int r4 = r9.offset     // Catch: java.lang.Throwable -> L24
            int r5 = r9.size     // Catch: java.lang.Throwable -> L24
            long r6 = r9.presentationTimeUs     // Catch: java.lang.Throwable -> L24
            int r8 = r9.flags     // Catch: java.lang.Throwable -> L24
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L24
            goto L6b
        L5e:
            r10 = -2
            if (r2 != r10) goto L6b
            java.util.ArrayDeque r10 = r9.g     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r10.remove()     // Catch: java.lang.Throwable -> L24
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch: java.lang.Throwable -> L24
            r9.h = r10     // Catch: java.lang.Throwable -> L24
        L6b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r2
        L6d:
            java.lang.ArrayIndexOutOfBoundsException r9 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L24
            r9.<init>()     // Catch: java.lang.Throwable -> L24
            throw r9     // Catch: java.lang.Throwable -> L24
        L73:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu.v(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // defpackage.hp3
    public final void y(ve6 ve6Var) {
        iu iuVar = this.y;
        synchronized (iuVar.a) {
            iuVar.b();
            this.z.b();
            ve6Var.run();
        }
    }

    @Override // defpackage.hp3
    public final void z(int i) {
        this.x.setVideoScalingMode(i);
    }
}

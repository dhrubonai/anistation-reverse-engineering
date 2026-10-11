package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class aq3 extends pp3 {
    public static final int[] Z1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean a2;
    public static boolean b2;
    public km4 A1;
    public sq5 B1;
    public boolean C1;
    public int D1;
    public int E1;
    public long F1;
    public int G1;
    public int H1;
    public int I1;
    public sd5 J1;
    public long K1;
    public boolean L1;
    public long M1;
    public int N1;
    public long O1;
    public hv6 P1;
    public hv6 Q1;
    public int R1;
    public boolean S1;
    public int T1;
    public zp3 U1;
    public ms6 V1;
    public long W1;
    public boolean X1;
    public int Y1;
    public final Context e1;
    public final boolean f1;
    public final l33 g1;
    public final byte h1;
    public final boolean i1;
    public final ys6 j1;
    public final ss k1;
    public final v32 l1;
    public final rt3 m1;
    public final long n1;
    public final zs6 o1;
    public final PriorityQueue p1;
    public n3 q1;
    public boolean r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public gv6 v1;
    public boolean w1;
    public int x1;
    public List y1;
    public Surface z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aq3(defpackage.yp3 r8) {
        /*
            r7 = this;
            android.content.Context r0 = r8.a
            android.content.Context r1 = r0.getApplicationContext()
            r2 = 2
            t91 r3 = r8.c
            r7.<init>(r1, r2, r3)
            android.content.Context r0 = r0.getApplicationContext()
            r7.e1 = r0
            byte r1 = r8.g
            r7.h1 = r1
            r1 = 0
            r7.v1 = r1
            l33 r2 = new l33
            android.os.Handler r3 = r8.e
            lt6 r4 = r8.f
            r2.<init>(r3, r4)
            r7.g1 = r2
            gv6 r2 = r7.v1
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L2c
            r2 = r3
            goto L2d
        L2c:
            r2 = r4
        L2d:
            r7.f1 = r2
            ys6 r2 = new ys6
            short r8 = r8.d
            long r5 = (long) r8
            r2.<init>(r0, r7, r5)
            r7.j1 = r2
            ss r8 = new ss
            r8.<init>()
            r7.k1 = r8
            v32 r8 = new v32
            h5 r0 = new h5
            r2 = 26
            r0.<init>(r7, r2)
            r8.<init>(r0)
            r7.l1 = r8
            java.util.HashSet r8 = defpackage.cr3.a
            java.lang.String r8 = "NVIDIA"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r8 = r8.equals(r0)
            r7.i1 = r8
            sq5 r8 = defpackage.sq5.c
            r7.B1 = r8
            r7.D1 = r3
            r7.E1 = r4
            hv6 r8 = defpackage.hv6.d
            r7.P1 = r8
            r7.T1 = r4
            r7.Q1 = r1
            r8 = -1000(0xfffffffffffffc18, float:NaN)
            r7.R1 = r8
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.W1 = r2
            rt3 r8 = new rt3
            r0 = 5
            r8.<init>(r0)
            r7.m1 = r8
            java.util.PriorityQueue r8 = new java.util.PriorityQueue
            r8.<init>()
            r7.p1 = r8
            r2 = -15000(0xffffffffffffc568, double:NaN)
            r7.n1 = r2
            zs6 r8 = new zs6
            r8.<init>()
            r7.o1 = r8
            r7.J1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq3.<init>(yp3):void");
    }

    public static boolean G0(String str) {
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (aq3.class) {
            try {
                if (!a2) {
                    HashSet hashSet = cr3.a;
                    String str2 = Build.MODEL;
                    str2.getClass();
                    char c = 65535;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (str2.equals("AFTJMST12")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -321033677:
                            if (str2.equals("AFTKMST12")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 2006354:
                            if (str2.equals("AFTA")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 2006367:
                            if (str2.equals("AFTN")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 2006371:
                            if (str2.equals("AFTR")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1785421873:
                            if (str2.equals("AFTEU011")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1785421876:
                            if (str2.equals("AFTEU014")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 1798172390:
                            if (str2.equals("AFTSO001")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 2119412532:
                            if (str2.equals("AFTEUFF014")) {
                                c = '\b';
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                            z = true;
                            break;
                    }
                    b2 = z;
                    a2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int H0(defpackage.mp3 r11, defpackage.ea2 r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq3.H0(mp3, ea2):int");
    }

    public static List I0(Context context, ea2 ea2Var, boolean z, boolean z2) {
        List e;
        String str = ea2Var.p;
        if (str == null) {
            z62 z62Var = nw2.y;
            return o15.B;
        }
        if ("video/dolby-vision".equals(str) && !w65.w(context)) {
            String c = up3.c(ea2Var);
            if (c == null) {
                z62 z62Var2 = nw2.y;
                e = o15.B;
            } else {
                e = up3.e(c, z, z2);
            }
            if (!e.isEmpty()) {
                return e;
            }
        }
        return up3.g(ea2Var, z, z2);
    }

    public static int J0(mp3 mp3Var, ea2 ea2Var) {
        int i = ea2Var.q;
        List list = ea2Var.s;
        if (i != -1) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) list.get(i3)).length;
            }
            return ea2Var.q + i2;
        }
        return H0(mp3Var, ea2Var);
    }

    @Override // defpackage.pp3
    public final boolean A0() {
        mp3 mp3Var = this.p0;
        if (this.v1 != null && mp3Var != null) {
            String str = mp3Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.A0();
    }

    @Override // defpackage.pp3, defpackage.w30
    public final void C(float f, float f2) {
        super.C(f, f2);
        gv6 gv6Var = this.v1;
        if (gv6Var != null) {
            gv6Var.c(f);
        } else {
            this.j1.g(f);
        }
        zs6 zs6Var = this.o1;
        if (zs6Var != null) {
            zs6Var.c(f);
        }
    }

    @Override // defpackage.pp3
    public final int C0(ea2 ea2Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (!qy3.m(ea2Var.p)) {
            return w30.a(0, 0, 0, 0);
        }
        byte b = 1;
        if (ea2Var.t != null) {
            z = true;
        } else {
            z = false;
        }
        Context context = this.e1;
        List I0 = I0(context, ea2Var, z, false);
        if (z && I0.isEmpty()) {
            I0 = I0(context, ea2Var, false, false);
        }
        if (I0.isEmpty()) {
            return w30.a(1, 0, 0, 0);
        }
        int i6 = ea2Var.T;
        if (i6 != 0 && i6 != 2) {
            return w30.a(2, 0, 0, 0);
        }
        mp3 mp3Var = (mp3) I0.get(0);
        boolean e = mp3Var.e(context, ea2Var);
        if (!e) {
            for (int i7 = 1; i7 < I0.size(); i7++) {
                mp3 mp3Var2 = (mp3) I0.get(i7);
                if (mp3Var2.e(context, ea2Var)) {
                    z2 = false;
                    e = true;
                    mp3Var = mp3Var2;
                    break;
                }
            }
        }
        z2 = true;
        if (e) {
            i = 4;
        } else {
            i = 3;
        }
        if (mp3Var.f(ea2Var)) {
            i2 = 16;
        } else {
            i2 = 8;
        }
        if (mp3Var.g) {
            i3 = 64;
        } else {
            i3 = 0;
        }
        if (z2) {
            i4 = 128;
        } else {
            i4 = 0;
        }
        if ("video/dolby-vision".equals(ea2Var.p) && !w65.w(context)) {
            i4 = 256;
        }
        if (e) {
            List I02 = I0(context, ea2Var, z, true);
            if (!I02.isEmpty()) {
                HashMap hashMap = up3.a;
                ArrayList arrayList = new ArrayList(I02);
                Collections.sort(arrayList, new xq0(new qp3(context, ea2Var, b), (byte) 1));
                mp3 mp3Var3 = (mp3) arrayList.get(0);
                if (mp3Var3.e(context, ea2Var) && mp3Var3.f(ea2Var)) {
                    i5 = 32;
                }
            }
        }
        return i | i2 | i5 | i3 | i4;
    }

    @Override // defpackage.w30
    public final boolean F(long j) {
        if (this.L0 == -9223372036854775807L || j < this.K1) {
            return false;
        }
        long j2 = this.U0;
        if (j2 != -9223372036854775807L && j <= j2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.pp3
    public final s61 J(mp3 mp3Var, ea2 ea2Var, ea2 ea2Var2, boolean z) {
        int i;
        int i2;
        s61 b = mp3Var.b(ea2Var, ea2Var2);
        float f = ea2Var.B;
        float f2 = ea2Var2.B;
        int i3 = b.e;
        n3 n3Var = this.q1;
        n3Var.getClass();
        if (ea2Var2.w > n3Var.a || ea2Var2.x > n3Var.b) {
            i3 |= 256;
        }
        if (J0(mp3Var, ea2Var2) > n3Var.c) {
            i3 |= 64;
        }
        if (this.E1 != Integer.MIN_VALUE && (i2 = Build.VERSION.SDK_INT) < 31 && ((i2 != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!mp3Var.f || !z))) {
            if (Math.abs((Math.max(f2, f) / Math.min(f2, f)) - Math.round(r10)) > 0.01f) {
                i3 |= 65536;
            }
        }
        int i4 = i3;
        String str = mp3Var.a;
        if (i4 != 0) {
            i = 0;
        } else {
            i = b.d;
        }
        return new s61(str, ea2Var, ea2Var2, i, i4);
    }

    @Override // defpackage.pp3
    public final lp3 K(IllegalStateException illegalStateException, mp3 mp3Var) {
        Surface surface = this.z1;
        lp3 lp3Var = new lp3(illegalStateException, mp3Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return lp3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058  */
    /* JADX WARN: Type inference failed for: r2v4, types: [jm4, android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface K0(defpackage.mp3 r6) {
        /*
            r5 = this;
            gv6 r0 = r5.v1
            if (r0 == 0) goto L9
            android.view.Surface r5 = r0.a()
            return r5
        L9:
            android.view.Surface r0 = r5.z1
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r6.h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            boolean r0 = r5.S0(r6)
            defpackage.io3.B(r0)
            km4 r0 = r5.A1
            if (r0 == 0) goto L35
            boolean r1 = r0.x
            boolean r3 = r6.f
            if (r1 == r3) goto L35
            if (r0 == 0) goto L33
            r0.release()
            r5.A1 = r2
            goto L34
        L33:
            r2 = r0
        L34:
            r0 = r2
        L35:
            if (r0 != 0) goto Laa
            boolean r6 = r6.f
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L46
            boolean r2 = defpackage.km4.a()
            if (r2 == 0) goto L44
            goto L48
        L44:
            r2 = r1
            goto L49
        L46:
            int r2 = defpackage.km4.A
        L48:
            r2 = r0
        L49:
            defpackage.io3.B(r2)
            jm4 r2 = new jm4
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r2.<init>(r3)
            if (r6 == 0) goto L58
            int r6 = defpackage.km4.A
            goto L59
        L58:
            r6 = r1
        L59:
            r2.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r2.getLooper()
            r3.<init>(r4, r2)
            r2.y = r3
            zq1 r4 = new zq1
            r4.<init>(r3)
            r2.x = r4
            monitor-enter(r2)
            android.os.Handler r3 = r2.y     // Catch: java.lang.Throwable -> L88
            android.os.Message r6 = r3.obtainMessage(r0, r6, r1)     // Catch: java.lang.Throwable -> L88
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L88
        L78:
            km4 r6 = r2.B     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L8c
            java.lang.RuntimeException r6 = r2.A     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L8c
            java.lang.Error r6 = r2.z     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L8c
            r2.wait()     // Catch: java.lang.Throwable -> L88 java.lang.InterruptedException -> L8a
            goto L78
        L88:
            r5 = move-exception
            goto La8
        L8a:
            r1 = r0
            goto L78
        L8c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L96
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L96:
            java.lang.RuntimeException r6 = r2.A
            if (r6 != 0) goto La7
            java.lang.Error r6 = r2.z
            if (r6 != 0) goto La6
            km4 r6 = r2.B
            r6.getClass()
            r5.A1 = r6
            return r6
        La6:
            throw r6
        La7:
            throw r6
        La8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
            throw r5
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq3.K0(mp3):android.view.Surface");
    }

    public final boolean L0(mp3 mp3Var) {
        if (this.v1 == null) {
            Surface surface = this.z1;
            if (surface == null || !surface.isValid()) {
                if ((Build.VERSION.SDK_INT < 35 || !mp3Var.h) && !S0(mp3Var)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean M0(q61 q61Var) {
        if (!j() && !q61Var.d(536870912)) {
            long j = this.O;
            if (j != -9223372036854775807L && j - (q61Var.D - this.T0.c) > 100000) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void N0() {
        if (this.G1 > 0) {
            this.D.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.F1;
            int i = this.G1;
            l33 l33Var = this.g1;
            Handler handler = (Handler) l33Var.y;
            if (handler != null) {
                handler.post(new jt6(l33Var, i, j));
            }
            this.G1 = 0;
            this.F1 = elapsedRealtime;
        }
    }

    public final void O0() {
        hp3 hp3Var;
        if (this.S1 && (hp3Var = this.i0) != null) {
            this.U1 = new zp3(this, hp3Var);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                hp3Var.setParameters(bundle);
            }
        }
    }

    public final void P0(hp3 hp3Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        hp3Var.n(i, j);
        Trace.endSection();
        this.S0.e++;
        boolean z = false;
        this.H1 = 0;
        if (this.v1 == null) {
            hv6 hv6Var = this.P1;
            boolean equals = hv6Var.equals(hv6.d);
            l33 l33Var = this.g1;
            if (!equals && !hv6Var.equals(this.Q1)) {
                this.Q1 = hv6Var;
                l33Var.v(hv6Var);
            }
            ys6 ys6Var = this.j1;
            if (ys6Var.e != 3) {
                z = true;
            }
            ys6Var.e = 3;
            ys6Var.k.getClass();
            ys6Var.g = eq6.U(SystemClock.elapsedRealtime());
            if (z && (surface = this.z1) != null) {
                Handler handler = (Handler) l33Var.y;
                if (handler != null) {
                    handler.post(new c61(l33Var, surface, SystemClock.elapsedRealtime(), (byte) 2));
                }
                this.C1 = true;
            }
        }
    }

    public final void Q0(Object obj) {
        Surface surface;
        Handler handler;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            surface = null;
        }
        Surface surface2 = this.z1;
        l33 l33Var = this.g1;
        if (surface2 != surface) {
            this.z1 = surface;
            gv6 gv6Var = this.v1;
            ys6 ys6Var = this.j1;
            if (gv6Var == null) {
                ys6Var.f(surface);
            }
            boolean z = false;
            this.C1 = false;
            byte b = this.E;
            hp3 hp3Var = this.i0;
            if (hp3Var != null) {
                if (this.v1 == null) {
                    mp3 mp3Var = this.p0;
                    mp3Var.getClass();
                    if (L0(mp3Var) && !this.r1) {
                        Surface K0 = K0(mp3Var);
                        if (K0 != null) {
                            hp3Var.setOutputSurface(K0);
                        } else if (Build.VERSION.SDK_INT >= 35) {
                            hp3Var.k();
                        } else {
                            p65.l();
                            return;
                        }
                    } else {
                        q0();
                        a0();
                    }
                }
                z = true;
            }
            if (surface != null) {
                hv6 hv6Var = this.Q1;
                if (hv6Var != null) {
                    l33Var.v(hv6Var);
                }
            } else {
                this.Q1 = null;
                gv6 gv6Var2 = this.v1;
                if (gv6Var2 != null) {
                    gv6Var2.k();
                }
            }
            if (b == 2) {
                gv6 gv6Var3 = this.v1;
                if (gv6Var3 != null) {
                    gv6Var3.q(z);
                } else {
                    ys6Var.c(z);
                }
            }
            O0();
            return;
        }
        if (surface != null) {
            hv6 hv6Var2 = this.Q1;
            if (hv6Var2 != null) {
                l33Var.v(hv6Var2);
            }
            Surface surface3 = this.z1;
            if (surface3 != null && this.C1 && (handler = (Handler) l33Var.y) != null) {
                handler.post(new c61(l33Var, surface3, SystemClock.elapsedRealtime(), (byte) 2));
            }
        }
    }

    @Override // defpackage.pp3
    public final int R(q61 q61Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            if ((this.J1 != null || this.S1) && q61Var.D < this.I && !M0(q61Var)) {
                return 32;
            }
            return 0;
        }
        return 0;
    }

    public final boolean R0(long j, long j2, boolean z, boolean z2) {
        boolean z3;
        if (this.v1 != null && this.f1) {
            j2 -= -this.W1;
        }
        if (j < -500000 && !z) {
            g95 g95Var = this.F;
            g95Var.getClass();
            int t = g95Var.t(j2 - this.H);
            if (t != 0) {
                this.K1 = j2;
                if (this.j1.h != -9223372036854775807L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                PriorityQueue priorityQueue = this.p1;
                Iterator it = priorityQueue.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    if (((Long) it.next()).longValue() >= this.I && !z3) {
                        i++;
                    } else {
                        i2++;
                    }
                }
                priorityQueue.clear();
                n61 n61Var = this.S0;
                if (z2) {
                    int i3 = n61Var.d + t;
                    n61Var.f += this.I1;
                    n61Var.d = i3 + i + i2;
                } else {
                    n61Var.j++;
                    U0(t + i, this.I1);
                    this.S0.d += i2;
                }
                if (P()) {
                    a0();
                }
                gv6 gv6Var = this.v1;
                if (gv6Var != null) {
                    gv6Var.n(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pp3
    public final float S(float f, ea2 ea2Var, ea2[] ea2VarArr) {
        float f2;
        mp3 mp3Var;
        float f3 = -1.0f;
        for (ea2 ea2Var2 : ea2VarArr) {
            float f4 = ea2Var2.B;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f && this.i0 != null) {
            v32 v32Var = this.l1;
            if (v32Var.a() != -9223372036854775807L) {
                f3 = 1.0E9f / ((float) v32Var.a());
            }
        }
        if (f3 == -1.0f) {
            f2 = -1.0f;
        } else {
            f2 = f3 * f;
        }
        if (this.J1 != null && (mp3Var = this.p0) != null) {
            int i = ea2Var.w;
            int i2 = ea2Var.x;
            float f5 = -3.4028235E38f;
            if (mp3Var.i) {
                float f6 = mp3Var.l;
                if (f6 != -3.4028235E38f && mp3Var.j == i && mp3Var.k == i2) {
                    f5 = f6;
                } else {
                    f5 = 1024.0f;
                    if (!mp3Var.g(i, i2, 1024.0d)) {
                        float f7 = 0.0f;
                        while (true) {
                            float f8 = f5 - f7;
                            if (Math.abs(f8) <= 5.0f) {
                                break;
                            }
                            float f9 = (f8 / 2.0f) + f7;
                            if (mp3Var.g(i, i2, f9)) {
                                f7 = f9;
                            } else {
                                f5 = f9;
                            }
                        }
                        f5 = f7;
                    }
                    mp3Var.l = f5;
                    mp3Var.j = i;
                    mp3Var.k = i2;
                }
            }
            if (f2 != -1.0f) {
                return Math.max(f2, f5);
            }
            return f5;
        }
        return f2;
    }

    public final boolean S0(mp3 mp3Var) {
        if (!this.S1 && !G0(mp3Var.a)) {
            if (!mp3Var.f || km4.a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.pp3
    public final ArrayList T(ea2 ea2Var, boolean z) {
        boolean z2 = this.S1;
        Context context = this.e1;
        List I0 = I0(context, ea2Var, z, z2);
        HashMap hashMap = up3.a;
        ArrayList arrayList = new ArrayList(I0);
        Collections.sort(arrayList, new xq0(new qp3(context, ea2Var, (byte) 1), (byte) 1));
        return arrayList;
    }

    public final void T0(hp3 hp3Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        hp3Var.f(i);
        Trace.endSection();
        this.S0.f++;
    }

    public final void U0(int i, int i2) {
        n61 n61Var = this.S0;
        n61Var.h += i;
        int i3 = i + i2;
        n61Var.g += i3;
        this.G1 += i3;
        int i4 = this.H1 + i3;
        this.H1 = i4;
        n61Var.i = Math.max(i4, n61Var.i);
        byte b = this.h1;
        if (b > 0 && this.G1 >= b) {
            N0();
        }
    }

    public final void V0(long j) {
        n61 n61Var = this.S0;
        n61Var.k += j;
        n61Var.l++;
        this.M1 += j;
        this.N1++;
    }

    @Override // defpackage.pp3
    public final tp W(mp3 mp3Var, ea2 ea2Var, MediaCrypto mediaCrypto, float f) {
        hp0 hp0Var;
        int i;
        n3 n3Var;
        boolean z;
        int i2;
        int i3;
        Point point;
        int i4;
        int i5;
        char c;
        boolean z2;
        int i6;
        boolean z3;
        Pair c2;
        int H0;
        String str = mp3Var.c;
        ea2[] ea2VarArr = this.G;
        ea2VarArr.getClass();
        int i7 = ea2Var.w;
        float f2 = ea2Var.B;
        hp0 hp0Var2 = ea2Var.H;
        int i8 = ea2Var.x;
        int J0 = J0(mp3Var, ea2Var);
        if (ea2VarArr.length == 1) {
            if (J0 != -1 && (H0 = H0(mp3Var, ea2Var)) != -1) {
                J0 = Math.min((int) (J0 * 1.5f), H0);
            }
            n3Var = new n3(i7, i8, J0);
            hp0Var = hp0Var2;
            i = i8;
        } else {
            int length = ea2VarArr.length;
            int i9 = i7;
            int i10 = i8;
            int i11 = 0;
            boolean z4 = false;
            while (i11 < length) {
                ea2 ea2Var2 = ea2VarArr[i11];
                ea2[] ea2VarArr2 = ea2VarArr;
                if (hp0Var2 != null && ea2Var2.H == null) {
                    da2 a = ea2Var2.a();
                    a.G = hp0Var2;
                    ea2Var2 = new ea2(a);
                }
                s61 b = mp3Var.b(ea2Var, ea2Var2);
                int i12 = length;
                int i13 = ea2Var2.x;
                if (b.d != 0) {
                    int i14 = ea2Var2.w;
                    i5 = i11;
                    c = 65535;
                    if (i14 != -1 && i13 != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z4 |= z2;
                    i9 = Math.max(i9, i14);
                    i10 = Math.max(i10, i13);
                    J0 = Math.max(J0, J0(mp3Var, ea2Var2));
                } else {
                    i5 = i11;
                    c = 65535;
                }
                length = i12;
                i11 = i5 + 1;
                ea2VarArr = ea2VarArr2;
            }
            if (z4) {
                kb0.O("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i9 + "x" + i10);
                if (i8 > i7) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i2 = i8;
                } else {
                    i2 = i7;
                }
                boolean z5 = z;
                if (z) {
                    i3 = i7;
                } else {
                    i3 = i8;
                }
                float f3 = i3 / i2;
                int i15 = 0;
                while (true) {
                    hp0Var = hp0Var2;
                    if (i15 >= 9) {
                        break;
                    }
                    int i16 = Z1[i15];
                    int i17 = i15;
                    int i18 = (int) (i16 * f3);
                    if (i16 <= i2 || i18 <= i3) {
                        break;
                    }
                    if (!z5) {
                        i18 = i16;
                    }
                    if (!z5) {
                        i16 = i18;
                    }
                    int i19 = i3;
                    MediaCodecInfo.VideoCapabilities videoCapabilities = mp3Var.d.getVideoCapabilities();
                    if (videoCapabilities == null) {
                        i4 = i2;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i4 = i2;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(eq6.g(i18, widthAlignment) * widthAlignment, eq6.g(i16, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i = i8;
                        if (mp3Var.g(point.x, point.y, f2)) {
                            break;
                        }
                    } else {
                        i = i8;
                    }
                    i15 = i17 + 1;
                    i8 = i;
                    hp0Var2 = hp0Var;
                    i3 = i19;
                    i2 = i4;
                }
                i = i8;
                point = null;
                if (point != null) {
                    i9 = Math.max(i9, point.x);
                    i10 = Math.max(i10, point.y);
                    da2 a3 = ea2Var.a();
                    a3.v = i9;
                    a3.w = i10;
                    J0 = Math.max(J0, H0(mp3Var, new ea2(a3)));
                    kb0.O("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i9 + "x" + i10);
                }
            } else {
                hp0Var = hp0Var2;
                i = i8;
            }
            n3Var = new n3(i9, i10, J0);
        }
        this.q1 = n3Var;
        if (this.S1) {
            i6 = this.T1;
        } else {
            i6 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i7);
        mediaFormat.setInteger("height", i);
        m37.I(mediaFormat, ea2Var.s);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        m37.y(mediaFormat, "rotation-degrees", ea2Var.C);
        m37.x(mediaFormat, hp0Var);
        if ("video/dolby-vision".equals(ea2Var.p) && (c2 = ko0.c(ea2Var)) != null) {
            m37.y(mediaFormat, "profile", ((Integer) c2.first).intValue());
        }
        mediaFormat.setInteger("max-width", n3Var.a);
        mediaFormat.setInteger("max-height", n3Var.b);
        m37.y(mediaFormat, "max-input-size", n3Var.c);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.i1) {
            z3 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z3 = true;
        }
        if (i6 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z3);
            mediaFormat.setInteger("audio-session-id", i6);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.R1));
        }
        H(mediaFormat);
        Surface K0 = K0(mp3Var);
        if (this.v1 != null && !eq6.O(this.e1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new tp(mp3Var, mediaFormat, ea2Var, K0, mediaCrypto, null);
    }

    @Override // defpackage.pp3
    public final void X(q61 q61Var) {
        ByteBuffer byteBuffer = q61Var.E;
        if (byteBuffer != null && byteBuffer.remaining() >= 7) {
            byte b = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b3 = byteBuffer.get();
            byte b4 = byteBuffer.get();
            boolean z = false;
            byteBuffer.position(0);
            if (b == -75 && s == 60 && s2 == 1 && b3 == 4 && (b4 == 0 || b4 == 1)) {
                if (this.t1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    hp3 hp3Var = this.i0;
                    hp3Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    hp3Var.setParameters(bundle);
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT >= 37) {
                byte[] bArr2 = ko0.a;
                int remaining = byteBuffer.remaining();
                byte[] bArr3 = ko0.d;
                if (remaining >= bArr3.length) {
                    int position = byteBuffer.position();
                    for (int i = 0; i < bArr3.length; i++) {
                        if (byteBuffer.get(position + i) != bArr3[i]) {
                            return;
                        }
                    }
                    byteBuffer.position(5);
                    int remaining2 = byteBuffer.remaining();
                    byte[] bArr4 = new byte[remaining2];
                    byteBuffer.get(bArr4);
                    byteBuffer.position(0);
                    if (remaining2 > 0) {
                        z = true;
                    }
                    this.u1 = z;
                    if (z) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putByteArray("hdr-st2094-50-info", bArr4);
                        hp3 hp3Var2 = this.i0;
                        hp3Var2.getClass();
                        hp3Var2.setParameters(bundle2);
                    }
                }
            }
        }
    }

    @Override // defpackage.pp3, defpackage.w30, defpackage.kp4
    public final void c(int i, Object obj) {
        boolean z;
        boolean z2 = true;
        if (i != 1) {
            if (i != 7) {
                if (i != 10) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 13) {
                                if (i != 14) {
                                    switch (i) {
                                        case 16:
                                            obj.getClass();
                                            this.R1 = ((Integer) obj).intValue();
                                            hp3 hp3Var = this.i0;
                                            if (hp3Var != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.R1));
                                                hp3Var.setParameters(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.z1;
                                            Q0(null);
                                            obj.getClass();
                                            ((aq3) obj).c(1, surface);
                                            return;
                                        case 18:
                                            if (this.J1 != null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            sd5 sd5Var = (sd5) obj;
                                            this.J1 = sd5Var;
                                            if (sd5Var == null) {
                                                z2 = false;
                                            }
                                            if (z != z2) {
                                                D0(this.j0);
                                                return;
                                            }
                                            return;
                                        default:
                                            super.c(i, obj);
                                            return;
                                    }
                                }
                                obj.getClass();
                                sq5 sq5Var = (sq5) obj;
                                if (sq5Var.a != 0 && sq5Var.b != 0) {
                                    this.B1 = sq5Var;
                                    gv6 gv6Var = this.v1;
                                    if (gv6Var != null) {
                                        Surface surface2 = this.z1;
                                        surface2.getClass();
                                        gv6Var.t(surface2, sq5Var);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(xs6.a)) {
                                gv6 gv6Var2 = this.v1;
                                if (gv6Var2 != null && gv6Var2.isInitialized()) {
                                    this.v1.e();
                                    return;
                                }
                                return;
                            }
                            this.y1 = list;
                            gv6 gv6Var3 = this.v1;
                            if (gv6Var3 != null) {
                                gv6Var3.o(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.E1 = intValue;
                        gv6 gv6Var4 = this.v1;
                        if (gv6Var4 != null) {
                            gv6Var4.j(intValue);
                            return;
                        }
                        et6 et6Var = this.j1.b;
                        if (et6Var.i != intValue) {
                            et6Var.i = intValue;
                            et6Var.c(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.D1 = intValue2;
                    hp3 hp3Var2 = this.i0;
                    if (hp3Var2 != null) {
                        hp3Var2.z(intValue2);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.T1 != intValue3) {
                    this.T1 = intValue3;
                    if (this.S1) {
                        q0();
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            ms6 ms6Var = (ms6) obj;
            this.V1 = ms6Var;
            gv6 gv6Var5 = this.v1;
            if (gv6Var5 != null) {
                gv6Var5.s(ms6Var);
                return;
            }
            return;
        }
        Q0(obj);
    }

    @Override // defpackage.pp3
    public final boolean c0(ea2 ea2Var) {
        gv6 gv6Var = this.v1;
        if (gv6Var != null && !gv6Var.isInitialized()) {
            try {
                return this.v1.m(ea2Var);
            } catch (fv6 e) {
                throw this.d(e, ea2Var, false, 7000);
            }
        }
        return true;
    }

    @Override // defpackage.pp3
    public final void d0(Exception exc) {
        kb0.t("MediaCodecVideoRenderer", "Video codec error", exc);
        l33 l33Var = this.g1;
        Handler handler = (Handler) l33Var.y;
        if (handler != null) {
            handler.post(new sp5(l33Var, exc, (byte) 13));
        }
    }

    @Override // defpackage.pp3
    public final void e0(long j, String str, long j2) {
        String str2;
        boolean z;
        l33 l33Var = this.g1;
        Handler handler = (Handler) l33Var.y;
        if (handler != null) {
            str2 = str;
            handler.post(new hw(l33Var, str2, j, j2, (byte) 1));
        } else {
            str2 = str;
        }
        this.r1 = G0(str2);
        mp3 mp3Var = this.p0;
        mp3Var.getClass();
        boolean z2 = false;
        if ("video/x-vnd.on2.vp9".equals(mp3Var.b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mp3Var.d.profileLevels;
            if (codecProfileLevelArr == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.t1 = z;
        if (Build.VERSION.SDK_INT < 37) {
            mp3 mp3Var2 = this.p0;
            mp3Var2.getClass();
            if (mp3Var2.b.equals(MimeTypes.VIDEO_AV1)) {
                z2 = true;
            }
        }
        this.s1 = z2;
        O0();
    }

    @Override // defpackage.w30
    public final void f() {
        gv6 gv6Var = this.v1;
        if (gv6Var != null) {
            int i = this.x1;
            if (i != 0 && i != 1) {
                gv6Var.v();
                return;
            } else {
                this.x1 = 0;
                return;
            }
        }
        ys6 ys6Var = this.j1;
        if (ys6Var.e == 0) {
            ys6Var.e = 1;
        }
    }

    @Override // defpackage.pp3
    public final void f0(io0 io0Var) {
        l33 l33Var = this.g1;
        Handler handler = (Handler) l33Var.y;
        if (handler != null) {
            handler.post(new sp5(l33Var, io0Var, (byte) 14));
        }
    }

    @Override // defpackage.pp3
    public final void g0(String str) {
        l33 l33Var = this.g1;
        Handler handler = (Handler) l33Var.y;
        if (handler != null) {
            handler.post(new sp5(l33Var, str, (byte) 11));
        }
    }

    @Override // defpackage.pp3
    public final s61 h0(pz2 pz2Var) {
        s61 h0 = super.h0(pz2Var);
        this.u1 = false;
        ea2 ea2Var = (ea2) pz2Var.z;
        ea2Var.getClass();
        l33 l33Var = this.g1;
        Handler handler = (Handler) l33Var.y;
        if (handler != null) {
            handler.post(new ze((Object) l33Var, (Object) ea2Var, (Object) h0, (byte) 27));
        }
        zs6 zs6Var = this.o1;
        if (zs6Var != null) {
            zs6Var.b();
        }
        return h0;
    }

    @Override // defpackage.w30
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.pp3
    public final void i0(ea2 ea2Var, MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        int i;
        int i2;
        hp3 hp3Var = this.i0;
        if (hp3Var != null) {
            hp3Var.z(this.D1);
        }
        if (this.S1) {
            i2 = ea2Var.w;
            i = ea2Var.x;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i3 = integer;
            i = integer2;
            i2 = i3;
        }
        float f = ea2Var.E;
        int i4 = ea2Var.C;
        if (i4 == 90 || i4 == 270) {
            f = 1.0f / f;
            int i5 = i;
            i = i2;
            i2 = i5;
        }
        this.P1 = new hv6(f, i2, i);
        gv6 gv6Var = this.v1;
        if (gv6Var != null && this.X1) {
            if (i2 > 0 && i > 0) {
                da2 a = ea2Var.a();
                a.v = i2;
                a.w = i;
                a.D = f;
                ea2 ea2Var2 = new ea2(a);
                int i6 = this.x1;
                List list = this.y1;
                if (list == null) {
                    z62 z62Var = nw2.y;
                    list = o15.B;
                }
                gv6Var.u(i6, this.T0.b, ea2Var2, list);
                this.x1 = 2;
            } else {
                return;
            }
        } else {
            float f2 = ea2Var.B;
            v32 v32Var = this.l1;
            v32Var.f = f2;
            v32Var.a.c();
            v32Var.b.c();
            v32Var.c = false;
            v32Var.d = -9223372036854775807L;
            v32Var.e = 0;
            v32Var.c();
        }
        this.X1 = false;
    }

    @Override // defpackage.w30
    public final boolean k() {
        if (this.O0) {
            gv6 gv6Var = this.v1;
            if (gv6Var == null || gv6Var.d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.pp3
    public final void k0(long j) {
        super.k0(j);
        if (!this.S1) {
            this.I1--;
        }
    }

    @Override // defpackage.pp3
    public final void l0() {
        gv6 gv6Var = this.v1;
        if (gv6Var != null) {
            gv6Var.b();
            long j = this.W1;
            if (j == -9223372036854775807L) {
                j = this.T0.b;
                this.W1 = j;
            }
            this.v1.i(-j);
        } else {
            this.j1.e(2);
        }
        this.X1 = true;
        O0();
    }

    @Override // defpackage.pp3
    public final void m0(q61 q61Var) {
        ByteBuffer byteBuffer;
        int i;
        int i2;
        ByteBuffer byteBuffer2;
        boolean z;
        hp0 hp0Var;
        mp3 mp3Var = this.p0;
        mp3Var.getClass();
        String str = mp3Var.b;
        if (str.equals(MimeTypes.VIDEO_AV1) && (byteBuffer2 = q61Var.B) != null) {
            ea2 ea2Var = this.j0;
            if (ea2Var != null && (hp0Var = ea2Var.H) != null && hp0Var.e > 8) {
                z = true;
            } else {
                z = false;
            }
            if (this.u1 && !byteBuffer2.isReadOnly()) {
                tl7.Q(byteBuffer2, false);
            } else if (z && this.s1 && !byteBuffer2.isReadOnly()) {
                tl7.Q(byteBuffer2, true);
            }
            rt3 rt3Var = this.m1;
            if (rt3Var != null && q61Var.d(1)) {
                int position = byteBuffer2.position();
                int limit = byteBuffer2.limit();
                byteBuffer2.limit(Math.min(limit, position + UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE));
                ByteBuffer byteBuffer3 = (ByteBuffer) rt3Var.y;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer2);
                byteBuffer3.flip();
                byteBuffer2.position(position);
                byteBuffer2.limit(limit);
            }
        } else if (str.equals(MimeTypes.VIDEO_H265) && (byteBuffer = q61Var.B) != null && this.u1 && !byteBuffer.isReadOnly()) {
            ByteBuffer byteBuffer4 = q61Var.B;
            int position2 = byteBuffer4.position();
            int limit2 = byteBuffer4.limit();
            if (limit2 - position2 >= 4) {
                while (position2 < limit2) {
                    int R = a34.R(byteBuffer4, position2, limit2);
                    if (R == limit2 || (i = R + 3) >= limit2 || ((i2 = (byteBuffer4.get(i) & 126) >> 1) >= 0 && i2 <= 31)) {
                        break;
                    }
                    if (i2 == 39) {
                        int i3 = R + 5;
                        i = a34.R(byteBuffer4, i3, limit2);
                        int i4 = 0;
                        while (i3 < i) {
                            int i5 = 0;
                            while (true) {
                                if (i3 >= i) {
                                    break;
                                }
                                int i6 = byteBuffer4.get(i3) & 255;
                                if (i6 == 3 && i4 >= 2) {
                                    i3++;
                                    i4 = 0;
                                } else {
                                    if (i6 == 0) {
                                        i4++;
                                    } else {
                                        i4 = 0;
                                    }
                                    int i7 = i3 + 1;
                                    i5 += i6;
                                    if (i6 != 255) {
                                        if (i5 == 4) {
                                            byteBuffer4.put(i3, (byte) -2);
                                        }
                                        i3 = i7;
                                    } else {
                                        i3 = i7;
                                    }
                                }
                            }
                            if (i3 >= i) {
                                break;
                            }
                            int i8 = 0;
                            while (i3 < i) {
                                int i9 = byteBuffer4.get(i3) & 255;
                                if (i9 == 3 && i4 >= 2) {
                                    i3++;
                                    i4 = 0;
                                } else {
                                    if (i9 == 0) {
                                        i4++;
                                    } else {
                                        i4 = 0;
                                    }
                                    i3++;
                                    i8 += i9;
                                    if (i9 != 255) {
                                        break;
                                    }
                                }
                            }
                            int i10 = 0;
                            while (i10 < i8 && i3 < i) {
                                int i11 = i3 + 1;
                                int i12 = byteBuffer4.get(i3) & 255;
                                if (i12 == 3 && i4 >= 2) {
                                    i10--;
                                } else if (i12 == 0) {
                                    i4++;
                                    i10++;
                                    i3 = i11;
                                }
                                i4 = 0;
                                i10++;
                                i3 = i11;
                            }
                        }
                    }
                    position2 = i;
                }
            }
        }
        this.Y1 = 0;
        int R2 = R(q61Var);
        if ((Build.VERSION.SDK_INT < 34 || (R2 & 32) == 0) && !this.S1) {
            this.I1++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < r6.w0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @Override // defpackage.w30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() {
        /*
            r6 = this;
            ea2 r0 = r6.a0
            r1 = 1
            if (r0 == 0) goto L3a
            boolean r0 = r6.j()
            if (r0 == 0) goto Le
            boolean r0 = r6.K
            goto L17
        Le:
            g95 r0 = r6.F
            r0.getClass()
            boolean r0 = r0.isReady()
        L17:
            if (r0 != 0) goto L38
            int r0 = r6.y0
            if (r0 < 0) goto L1e
            goto L38
        L1e:
            long r2 = r6.w0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L3a
            f46 r0 = r6.D
            r0.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.w0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L3a
        L38:
            r0 = r1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            gv6 r2 = r6.v1
            if (r2 == 0) goto L44
            boolean r6 = r2.r(r0)
            return r6
        L44:
            if (r0 == 0) goto L4f
            hp3 r2 = r6.i0
            if (r2 == 0) goto L4e
            boolean r2 = r6.S1
            if (r2 == 0) goto L4f
        L4e:
            return r1
        L4f:
            ys6 r6 = r6.j1
            boolean r6 = r6.b(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq3.n():boolean");
    }

    @Override // defpackage.pp3
    public final boolean o0(long j, long j2, hp3 hp3Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ea2 ea2Var) {
        boolean z3;
        v32 v32Var;
        hp3Var.getClass();
        long j4 = j3 - this.T0.c;
        if (this.j1.h != -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.p1;
            Long l = (Long) priorityQueue.peek();
            v32Var = this.l1;
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            v32Var.b(1000 * l.longValue());
            if (l.longValue() >= this.I && !z3) {
                i4++;
            } else {
                i5++;
            }
        }
        U0(i4, 0);
        this.S0.d += i5;
        v32Var.b(j3 * 1000);
        gv6 gv6Var = this.v1;
        if (gv6Var != null) {
            if (z && !z2) {
                T0(hp3Var, i);
                return true;
            }
            return gv6Var.f(j3, new xp3(this, hp3Var, i, j4));
        }
        int a = this.j1.a(j3, j, j2, this.T0.b, z, z2, v32Var.a(), v32Var.h, this.k1);
        ss ssVar = this.k1;
        zs6 zs6Var = this.o1;
        if (zs6Var != null && a != 5 && a != 4) {
            zs6Var.a(j3, ssVar.a);
        }
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        if (a == 4 || a == 5) {
                            return false;
                        }
                        ze0.m(String.valueOf(a));
                        return false;
                    }
                    T0(hp3Var, i);
                    V0(ssVar.a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                hp3Var.f(i);
                Trace.endSection();
                U0(0, 1);
                V0(ssVar.a);
                return true;
            }
            long j5 = ssVar.b;
            long j6 = ssVar.a;
            if (j5 == this.O1) {
                T0(hp3Var, i);
            } else {
                ms6 ms6Var = this.V1;
                if (ms6Var != null) {
                    ms6Var.d(j4, j5, ea2Var, this.k0);
                }
                P0(hp3Var, i, j5);
            }
            V0(j6);
            this.O1 = j5;
            return true;
        }
        this.D.getClass();
        long nanoTime = System.nanoTime();
        ms6 ms6Var2 = this.V1;
        if (ms6Var2 != null) {
            ms6Var2.d(j4, nanoTime, ea2Var, this.k0);
        }
        P0(hp3Var, i, nanoTime);
        V0(ssVar.a);
        return true;
    }

    @Override // defpackage.pp3, defpackage.w30
    public final void p() {
        l33 l33Var = this.g1;
        this.Q1 = null;
        O0();
        this.C1 = false;
        this.U1 = null;
        this.L1 = y0();
        byte b = 1;
        try {
            super.p();
            n61 n61Var = this.S0;
            l33Var.getClass();
            synchronized (n61Var) {
            }
            Handler handler = (Handler) l33Var.y;
            if (handler != null) {
                handler.post(new kt6(l33Var, n61Var, b));
            }
            l33Var.v(hv6.d);
        } catch (Throwable th) {
            n61 n61Var2 = this.S0;
            l33Var.getClass();
            synchronized (n61Var2) {
                Handler handler2 = (Handler) l33Var.y;
                if (handler2 != null) {
                    handler2.post(new kt6(l33Var, n61Var2, b));
                }
                l33Var.v(hv6.d);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [n61, java.lang.Object] */
    @Override // defpackage.w30
    public final void q(boolean z, boolean z2) {
        boolean z3;
        gv6 gv6Var;
        this.S0 = new Object();
        x25 x25Var = this.A;
        x25Var.getClass();
        boolean z4 = x25Var.b;
        byte b = 0;
        if (z4 && this.T1 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        io3.B(z3);
        if (this.S1 != z4) {
            this.S1 = z4;
            q0();
        }
        n61 n61Var = this.S0;
        l33 l33Var = this.g1;
        Handler handler = (Handler) l33Var.y;
        if (handler != null) {
            handler.post(new kt6(l33Var, n61Var, b));
        }
        boolean z5 = this.w1;
        ys6 ys6Var = this.j1;
        if (!z5) {
            if (this.y1 != null && this.v1 == null) {
                yn4 yn4Var = new yn4(this.e1, ys6Var);
                yn4Var.d = true;
                long j = this.n1;
                long j2 = -9223372036854775807L;
                if (j != -9223372036854775807L) {
                    j2 = -j;
                }
                yn4Var.g = j2;
                f46 f46Var = this.D;
                f46Var.getClass();
                yn4Var.e = f46Var;
                io3.B(!yn4Var.f);
                if (yn4Var.c == null) {
                    yn4Var.c = new tp5();
                }
                eo4 eo4Var = new eo4(yn4Var);
                yn4Var.f = true;
                if (1 >= eo4Var.z) {
                    eo4Var.z = 1;
                }
                SparseArray sparseArray = eo4Var.c;
                if (eq6.l(sparseArray, 0)) {
                    gv6Var = (gv6) sparseArray.get(0);
                } else {
                    bo4 bo4Var = new bo4(eo4Var, eo4Var.a);
                    eo4Var.h.add(bo4Var);
                    sparseArray.put(0, bo4Var);
                    gv6Var = bo4Var;
                }
                this.v1 = gv6Var;
            }
            this.w1 = true;
        }
        gv6 gv6Var2 = this.v1;
        if (gv6Var2 != null) {
            gv6Var2.l(new wp3(this));
            ms6 ms6Var = this.V1;
            if (ms6Var != null) {
                this.v1.s(ms6Var);
            }
            if (this.z1 != null && !this.B1.equals(sq5.c)) {
                this.v1.t(this.z1, this.B1);
            }
            this.v1.j(this.E1);
            this.v1.c(this.g0);
            List list = this.y1;
            if (list != null) {
                this.v1.o(list);
            }
            this.x1 = !z2 ? 1 : 0;
            this.W0 = true;
            return;
        }
        f46 f46Var2 = this.D;
        f46Var2.getClass();
        ys6Var.k = f46Var2;
        ys6Var.e(!z2 ? 1 : 0);
    }

    @Override // defpackage.pp3, defpackage.w30
    public final void r(long j, boolean z, boolean z2) {
        gv6 gv6Var = this.v1;
        if (gv6Var != null && !z) {
            gv6Var.n(true);
        }
        if (z2) {
            this.K1 = j;
        }
        super.r(j, z, z2);
        gv6 gv6Var2 = this.v1;
        ys6 ys6Var = this.j1;
        if (gv6Var2 == null) {
            ys6Var.b.b();
            ys6Var.f = -9223372036854775807L;
            ys6Var.e = Math.min(ys6Var.e, 1);
            ys6Var.h = -9223372036854775807L;
            ys6Var.m = false;
        }
        zs6 zs6Var = this.o1;
        if (zs6Var != null) {
            zs6Var.b();
        }
        if (z) {
            gv6 gv6Var3 = this.v1;
            if (gv6Var3 != null) {
                gv6Var3.q(false);
            } else {
                ys6Var.c(false);
            }
        }
        O0();
        this.H1 = 0;
    }

    @Override // defpackage.pp3
    public final void r0() {
        gv6 gv6Var = this.v1;
        if (gv6Var != null) {
            gv6Var.b();
        } else {
            long j = this.T0.h;
        }
    }

    @Override // defpackage.w30
    public final void s() {
        gv6 gv6Var = this.v1;
        if (gv6Var != null && this.f1) {
            gv6Var.release();
        }
    }

    @Override // defpackage.w30
    public final void t() {
        try {
            try {
                this.B0 = false;
                s0();
                q0();
                qp1 qp1Var = this.d0;
                if (qp1Var != null) {
                    qp1Var.c(null);
                }
                this.d0 = null;
            } catch (Throwable th) {
                qp1 qp1Var2 = this.d0;
                if (qp1Var2 != null) {
                    qp1Var2.c(null);
                }
                this.d0 = null;
                throw th;
            }
        } finally {
            this.w1 = false;
            this.W1 = -9223372036854775807L;
            this.u1 = false;
            km4 km4Var = this.A1;
            if (km4Var != null) {
                km4Var.release();
                this.A1 = null;
            }
        }
    }

    @Override // defpackage.pp3
    public final void t0() {
        super.t0();
        this.p1.clear();
        this.I1 = 0;
        this.Y1 = 0;
        this.L1 = false;
        rt3 rt3Var = this.m1;
        if (rt3Var != null) {
            rt3Var.z = null;
            ByteBuffer byteBuffer = (ByteBuffer) rt3Var.y;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // defpackage.w30
    public final void u() {
        this.G1 = 0;
        this.D.getClass();
        this.F1 = SystemClock.elapsedRealtime();
        this.M1 = 0L;
        this.N1 = 0;
        gv6 gv6Var = this.v1;
        if (gv6Var != null) {
            gv6Var.h();
        } else {
            this.j1.d();
        }
    }

    @Override // defpackage.w30
    public final void v() {
        N0();
        int i = this.N1;
        if (i != 0) {
            long j = this.M1;
            l33 l33Var = this.g1;
            Handler handler = (Handler) l33Var.y;
            if (handler != null) {
                handler.post(new jt6(l33Var, j, i));
            }
            this.M1 = 0L;
            this.N1 = 0;
        }
        gv6 gv6Var = this.v1;
        if (gv6Var != null) {
            gv6Var.g();
        } else {
            ys6 ys6Var = this.j1;
            ys6Var.d = false;
            ys6Var.h = -9223372036854775807L;
            et6 et6Var = ys6Var.b;
            et6Var.d = false;
            at6 at6Var = et6Var.c;
            if (at6Var != null) {
                at6Var.b();
            }
            et6Var.a();
        }
        zs6 zs6Var = this.o1;
        if (zs6Var != null) {
            zs6Var.b();
        }
    }

    @Override // defpackage.pp3, defpackage.w30
    public final void w(ea2[] ea2VarArr, long j, long j2, jw3 jw3Var) {
        super.w(ea2VarArr, j, j2, jw3Var);
        zs6 zs6Var = this.o1;
        if (zs6Var != null) {
            zs6Var.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        if ((r7 + 1) < 8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        if (r7 < 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
    
        r2 = ((defpackage.qc4) r3.get(r7)).b.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        r2 = r5.position();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // defpackage.pp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x0(defpackage.q61 r15) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq3.x0(q61):boolean");
    }

    @Override // defpackage.pp3
    public final boolean y0() {
        boolean z;
        if (this.I0) {
            ea2 ea2Var = this.j0;
            long j = this.O;
            if (j != -9223372036854775807L) {
                if (this.Y0 + 1 + j <= Long.MAX_VALUE - (this.T0.c + j)) {
                    z = false;
                    if (this.J1 != null || this.L1 || this.S1 || ((ea2Var != null && ea2Var.r > 0) || z || this.T0.h != -9223372036854775807L)) {
                        return true;
                    }
                }
            }
            z = true;
            if (this.J1 != null) {
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.pp3, defpackage.w30
    public final void z(long j, long j2) {
        gv6 gv6Var = this.v1;
        if (gv6Var != null) {
            try {
                gv6Var.p(j, j2);
            } catch (fv6 e) {
                throw d(e, e.x, false, 7001);
            }
        }
        super.z(j, j2);
    }

    @Override // defpackage.pp3
    public final boolean z0(mp3 mp3Var) {
        return L0(mp3Var);
    }
}

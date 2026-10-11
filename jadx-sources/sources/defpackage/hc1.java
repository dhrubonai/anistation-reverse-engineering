package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLDisplay;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hc1 implements xs6 {
    public static final /* synthetic */ int y = 0;
    public final Context b;
    public final oe2 c;
    public final boolean d;
    public final EGLDisplay e;
    public final wz2 f;
    public final ts6 g;
    public final ws6 h;
    public final Executor i;
    public final boolean j;
    public final h32 k;
    public final ArrayList l;
    public final nv0 m;
    public final nv0 n;
    public gc1 o;
    public gc1 p;
    public boolean q;
    public final ArrayList r;
    public final Object s;
    public final hp0 t;
    public final ze0 u;
    public volatile bb2 v;
    public volatile boolean w;
    public volatile boolean x;

    static {
        cr3.a("media3.effect");
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, zp2] */
    public hc1(Context context, oe2 oe2Var, boolean z, EGLDisplay eGLDisplay, wz2 wz2Var, ts6 ts6Var, ws6 ws6Var, Executor executor, h32 h32Var, boolean z2, hp0 hp0Var, e35 e35Var) {
        ze0 ze0Var = ze0.z;
        this.b = context;
        this.c = oe2Var;
        this.d = z;
        this.e = eGLDisplay;
        this.f = wz2Var;
        this.g = ts6Var;
        this.h = ws6Var;
        this.i = executor;
        this.j = z2;
        this.r = new ArrayList();
        this.s = new Object();
        this.t = hp0Var;
        this.u = ze0Var;
        this.k = h32Var;
        this.l = new ArrayList();
        nv0 nv0Var = new nv0();
        this.m = nv0Var;
        nv0Var.f();
        nv0 nv0Var2 = new nv0();
        this.n = nv0Var2;
        nv0Var2.f();
        ?? obj = new Object();
        obj.A = this;
        obj.x = executor;
        obj.y = ws6Var;
        obj.z = ts6Var;
        h32Var.h.h();
        h32Var.w = obj;
    }

    public static void a(oe2 oe2Var, o15 o15Var, h32 h32Var, ts6 ts6Var, ws6 ws6Var, Executor executor) {
        ArrayList arrayList = new ArrayList(o15Var);
        arrayList.add(h32Var);
        int i = 0;
        while (i < arrayList.size() - 1) {
            ve2 ve2Var = (ve2) arrayList.get(i);
            i++;
            ve2 ve2Var2 = (ve2) arrayList.get(i);
            dn0 dn0Var = new dn0(oe2Var, ve2Var, ve2Var2, ts6Var);
            ve2Var.e(dn0Var);
            ve2Var.f(executor, new ac1(ws6Var, (byte) 0));
            ve2Var2.g(dn0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r8.isEmpty() == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ew2, jw2] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.o15 d(android.content.Context r10, defpackage.o15 r11, defpackage.hp0 r12, defpackage.h32 r13) {
        /*
            jw2 r0 = new jw2
            r1 = 4
            r0.<init>(r1)
            jw2 r2 = new jw2
            r2.<init>(r1)
            jw2 r3 = new jw2
            r3.<init>(r1)
            r4 = 0
        L11:
            int r5 = r11.A
            if (r4 >= r5) goto L80
            java.lang.Object r5 = r11.get(r4)
            wr1 r5 = (defpackage.wr1) r5
            boolean r6 = r5 instanceof defpackage.ne2
            java.lang.String r7 = "DefaultVideoFrameProcessor only supports GlEffects"
            defpackage.io3.m(r7, r6)
            ne2 r5 = (defpackage.ne2) r5
            boolean r6 = r5 instanceof defpackage.ko3
            if (r6 == 0) goto L2e
            ko3 r5 = (defpackage.ko3) r5
            r2.c(r5)
            goto L7d
        L2e:
            boolean r6 = defpackage.hp0.h(r12)
            o15 r7 = r2.g()
            o15 r8 = r3.g()
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L46
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L76
        L46:
            o15 r2 = defpackage.oa1.w
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L52
            r2 = 2131820546(0x7f110002, float:1.927381E38)
            goto L55
        L52:
            r2 = 2131820552(0x7f110008, float:1.9273822E38)
        L55:
            r3 = 2131820563(0x7f110013, float:1.9273844E38)
            re2 r2 = defpackage.oa1.k(r10, r3, r2)
            oa1 r3 = new oa1
            nw2 r7 = defpackage.nw2.o(r7)
            nw2 r8 = defpackage.nw2.o(r8)
            r3.<init>(r2, r7, r8, r6)
            r0.c(r3)
            jw2 r2 = new jw2
            r2.<init>(r1)
            jw2 r3 = new jw2
            r3.<init>(r1)
        L76:
            ve2 r5 = r5.a(r10, r6)
            r0.c(r5)
        L7d:
            int r4 = r4 + 1
            goto L11
        L80:
            o15 r10 = r2.g()
            o15 r11 = r3.g()
            ts6 r12 = r13.h
            r12.h()
            java.util.ArrayList r12 = r13.b
            r12.clear()
            r12.addAll(r10)
            java.util.ArrayList r10 = r13.c
            r10.clear()
            r10.addAll(r11)
            r10 = 1
            r13.x = r10
            o15 r10 = r0.g()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc1.d(android.content.Context, o15, hp0, h32):o15");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v3, types: [ew2, jw2] */
    /* JADX WARN: Type inference failed for: r12v6, types: [ew2, jw2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.gc1 r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc1.b(gc1, boolean):void");
    }

    public final void c() {
        gc1 gc1Var;
        this.g.h();
        synchronized (this.s) {
            try {
                gc1Var = this.p;
                if (gc1Var != null) {
                    this.p = null;
                } else {
                    gc1Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gc1Var != null) {
            b(gc1Var, false);
        }
    }

    public final void e() {
        boolean z;
        final byte b = 1;
        try {
            this.n.a();
            final byte b2 = 0;
            this.w = false;
            ge6 ge6Var = (ge6) this.f.j;
            if (ge6Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
            ge6Var.getClass();
            ge6Var.a();
            this.g.a();
            ge6Var.j();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            cc1 cc1Var = new cc1(countDownLatch, (byte) 0);
            synchronized (ge6Var.y) {
                ge6Var.z = cc1Var;
            }
            ts6 ts6Var = this.g;
            final h32 h32Var = this.k;
            Objects.requireNonNull(h32Var);
            ts6Var.f(new ss6() { // from class: dc1
                @Override // defpackage.ss6
                public final void run() {
                    int d;
                    byte b3 = b2;
                    h32 h32Var2 = h32Var;
                    switch (b3) {
                        case 0:
                            h32Var2.flush();
                            return;
                        default:
                            xe2 xe2Var = h32Var2.o;
                            he6 he6Var = h32Var2.l;
                            if (xe2Var != null) {
                                ArrayDeque arrayDeque = he6Var.a;
                                ArrayDeque arrayDeque2 = he6Var.b;
                                arrayDeque.addAll(arrayDeque2);
                                arrayDeque2.clear();
                                sr1 sr1Var = h32Var2.m;
                                int i = 0;
                                sr1Var.b = 0;
                                sr1Var.c = -1;
                                sr1Var.d = 0;
                                sr1 sr1Var2 = h32Var2.n;
                                sr1Var2.b = 0;
                                sr1Var2.c = -1;
                                sr1Var2.d = 0;
                                while (true) {
                                    if (h32Var2.o == null) {
                                        d = 1;
                                    } else {
                                        d = he6Var.d();
                                    }
                                    if (i < d) {
                                        h32Var2.u.h();
                                        i++;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                    }
                }
            }, true);
            countDownLatch.await();
            synchronized (ge6Var.y) {
                ge6Var.z = null;
            }
            ts6 ts6Var2 = this.g;
            final h32 h32Var2 = this.k;
            Objects.requireNonNull(h32Var2);
            ts6Var2.c(new ss6() { // from class: dc1
                @Override // defpackage.ss6
                public final void run() {
                    int d;
                    byte b3 = b;
                    h32 h32Var22 = h32Var2;
                    switch (b3) {
                        case 0:
                            h32Var22.flush();
                            return;
                        default:
                            xe2 xe2Var = h32Var22.o;
                            he6 he6Var = h32Var22.l;
                            if (xe2Var != null) {
                                ArrayDeque arrayDeque = he6Var.a;
                                ArrayDeque arrayDeque2 = he6Var.b;
                                arrayDeque.addAll(arrayDeque2);
                                arrayDeque2.clear();
                                sr1 sr1Var = h32Var22.m;
                                int i = 0;
                                sr1Var.b = 0;
                                sr1Var.c = -1;
                                sr1Var.d = 0;
                                sr1 sr1Var2 = h32Var22.n;
                                sr1Var2.b = 0;
                                sr1Var2.c = -1;
                                sr1Var2.d = 0;
                                while (true) {
                                    if (h32Var22.o == null) {
                                        d = 1;
                                    } else {
                                        d = he6Var.d();
                                    }
                                    if (i < d) {
                                        h32Var22.u.h();
                                        i++;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                    }
                }
            });
            this.g.c(new zb1(this, (byte) 2));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.i.execute(new bc1(this, e, (byte) 1));
        }
    }

    public final boolean f(Bitmap bitmap, ex0 ex0Var) {
        boolean hasGainmap;
        io3.B(!this.w);
        boolean z = false;
        if (!this.m.e() || this.x) {
            return false;
        }
        if (hp0.h(this.t)) {
            if (Build.VERSION.SDK_INT >= 34) {
                hasGainmap = bitmap.hasGainmap();
                if (hasGainmap) {
                    z = true;
                }
            }
            io3.m("VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.", z);
        }
        bb2 bb2Var = this.v;
        bb2Var.getClass();
        ge6 ge6Var = (ge6) this.f.j;
        ge6Var.getClass();
        ge6Var.e(bitmap, bb2Var, ex0Var);
        return true;
    }

    public final boolean g() {
        io3.B(!this.w);
        io3.w(this.v, "registerInputStream must be called before registering input frames");
        if (this.m.e() && !this.x) {
            ge6 ge6Var = (ge6) this.f.j;
            ge6Var.getClass();
            ge6Var.g(this.v);
            return true;
        }
        return false;
    }

    public final void h(int i, long j, ea2 ea2Var, List list) {
        ea2 ea2Var2;
        if (!this.x) {
            byte b = 1;
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                ze0.k(String.valueOf(i));
                return;
            }
            LinkedHashMap linkedHashMap = a61.a;
            synchronized (a61.class) {
            }
            float f = ea2Var.E;
            if (f > 1.0f) {
                da2 a = ea2Var.a();
                a.v = (int) (ea2Var.w * f);
                a.D = 1.0f;
                ea2Var2 = new ea2(a);
            } else if (f < 1.0f) {
                da2 a2 = ea2Var.a();
                a2.w = (int) (ea2Var.x / f);
                a2.D = 1.0f;
                ea2Var2 = new ea2(a2);
            } else {
                ea2Var2 = ea2Var;
            }
            this.v = new bb2(ea2Var2, j);
            try {
                this.m.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.i.execute(new bc1(this, e, (byte) 0));
            }
            synchronized (this.s) {
                try {
                    gc1 gc1Var = new gc1(i, j, ea2Var, list);
                    if (!this.q) {
                        this.q = true;
                        this.m.d();
                        this.g.f(new fj0(this, gc1Var, b), true);
                    } else {
                        this.p = gc1Var;
                        this.m.d();
                        ge6 ge6Var = (ge6) this.f.j;
                        ge6Var.getClass();
                        ge6Var.o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void i() {
        this.x = true;
        try {
            this.g.e(new zb1(this, (byte) 0));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    public final void j(i36 i36Var) {
        h32 h32Var = this.k;
        h32Var.getClass();
        byte b = 3;
        try {
            h32Var.h.c(new fj0(h32Var, i36Var, b));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            h32Var.i.execute(new f32(h32Var, e, b));
        }
    }

    public final void k() {
        a61.a();
        io3.B(!this.w);
        this.w = true;
        if (this.x) {
            return;
        }
        ge6 ge6Var = (ge6) this.f.j;
        ge6Var.getClass();
        ge6Var.o();
    }
}

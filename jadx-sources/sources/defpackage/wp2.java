package defpackage;

import android.content.res.TypedArray;
import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class wp2 implements v11, Closeable {
    public static final /* synthetic */ long H = qs.a.objectFieldOffset(wp2.class.getDeclaredField("closed"));
    public final ir2 A;
    public final ir2 B;
    public final ir2 C;
    public final ir2 D;
    public final mv0 E;
    public final cn7 F;
    public final zp2 G;
    private volatile /* synthetic */ int closed = 0;
    public final ie0 x;
    public final j43 y;
    public final l11 z;

    public wp2(ie0 ie0Var, zp2 zp2Var) {
        this.x = ie0Var;
        l11 l11Var = ie0Var.G;
        h95 h95Var = h95.F;
        j43 j43Var = new j43((h43) l11Var.get(h95Var));
        this.y = j43Var;
        this.z = ie0Var.G.plus(j43Var);
        this.A = new ir2(new ni1[]{ir2.i, ir2.j, ir2.k, ir2.l, ir2.m}, (byte) 1);
        byte b = 2;
        this.B = new ir2(new ni1[]{ir2.n, ir2.o, ir2.p, ir2.q, ir2.r}, b);
        ni1 ni1Var = ir2.s;
        ni1 ni1Var2 = ir2.t;
        ni1 ni1Var3 = ir2.u;
        ni1 ni1Var4 = ir2.v;
        ni1 ni1Var5 = ir2.w;
        ni1[] ni1VarArr = {ni1Var, ni1Var2, ni1Var3, ni1Var4, ni1Var5};
        byte b2 = 3;
        ir2 ir2Var = new ir2(ni1VarArr, b2);
        this.C = ir2Var;
        this.D = new ir2(new ni1[]{ir2.f, ir2.g, ir2.h}, (byte) 0);
        this.E = new mv0();
        this.F = new cn7((byte) 21);
        zp2 zp2Var2 = new zp2((byte) 0);
        this.G = zp2Var2;
        vz0 vz0Var = null;
        ir2Var.f(ni1Var4, new bq2(this, ie0Var, null));
        ir2Var.f(ni1Var5, new a7(this, vz0Var, b));
        byte b3 = 15;
        zp2Var2.C(rr2.b, new t72(b3));
        zp2Var2.C(i70.c, new t72(b3));
        zp2Var2.C(zi1.d, new t72(b3));
        byte b4 = 13;
        ((LinkedHashMap) zp2Var2.z).put("DefaultTransformers", new t72(b4));
        zp2Var2.C(ls2.b, new t72(b3));
        dn0 dn0Var = up2.b;
        zp2Var2.C(dn0Var, new t72(b3));
        zp2Var2.C(mr2.d, new t72(b3));
        ((LinkedHashMap) zp2Var2.x).putAll((LinkedHashMap) zp2Var.x);
        ((LinkedHashMap) zp2Var2.y).putAll((LinkedHashMap) zp2Var.y);
        ((LinkedHashMap) zp2Var2.z).putAll((LinkedHashMap) zp2Var.z);
        zp2Var2.C(gr2.b, new t72(b3));
        ou ouVar = ga1.a;
        zp2Var2.C(dn0Var, new f01(zp2Var2));
        Iterator it = ((LinkedHashMap) zp2Var2.x).values().iterator();
        while (it.hasNext()) {
            ((ub2) it.next()).invoke(this);
        }
        Iterator it2 = ((LinkedHashMap) zp2Var2.z).values().iterator();
        while (it2.hasNext()) {
            ((ub2) it2.next()).invoke(this);
        }
        this.B.f(ir2.n, new b9(this, vz0Var, b2));
        dq2.z.incrementAndGet(ie0Var);
        j11 j11Var = this.z.get(h95Var);
        j11Var.getClass();
        ((h43) j11Var).l0(new lz0(ie0Var, b4));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.or2 r5, defpackage.xz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.vp2
            if (r0 == 0) goto L13
            r0 = r6
            vp2 r0 = (defpackage.vp2) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            vp2 r0 = new vp2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r6)
            goto L45
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.m37.N(r6)
            cn7 r6 = r4.F
            q18 r1 = defpackage.a34.b
            r6.o(r1)
            java.lang.Object r6 = r5.d
            r0.z = r2
            ir2 r4 = r4.A
            java.lang.Object r6 = r4.a(r5, r6, r0)
            w11 r4 = defpackage.w11.x
            if (r6 != r4) goto L45
            return r4
        L45:
            r6.getClass()
            yp2 r6 = (defpackage.yp2) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp2.a(or2, xz0):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        if (!qs.a.compareAndSwapInt(this, H, 0, 1)) {
            return;
        }
        mv0 mv0Var = (mv0) this.E.b(kq2.a);
        for (ou ouVar : yo0.I0(mv0Var.c().keySet())) {
            ouVar.getClass();
            Object b = mv0Var.b(ouVar);
            if (b instanceof AutoCloseable) {
                AutoCloseable autoCloseable = (AutoCloseable) b;
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else {
                    p65.b();
                    return;
                }
            }
        }
        this.y.g0();
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.z;
    }

    public final String toString() {
        return "HttpClient[" + this.x + ']';
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dc5 {
    public final qx4 a;
    public final String b;
    public final boolean c;
    public final zk6 d;
    public final kz e;
    public final ArrayList f;
    public volatile ThreadLocal g;

    public dc5(qx4 qx4Var, String str, zk6 zk6Var, kz kzVar, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        zk6Var = (i & 8) != 0 ? null : zk6Var;
        qx4Var.getClass();
        this.a = qx4Var;
        this.b = str;
        this.c = z;
        this.d = zk6Var;
        this.e = kzVar;
        this.f = new ArrayList();
        new LinkedHashSet();
    }

    public final void a(bs bsVar) {
        if (!bsVar.isEmpty()) {
            bsVar.removeFirst();
        }
        if (bsVar.isEmpty()) {
            b().remove();
        }
    }

    public final ThreadLocal b() {
        ThreadLocal threadLocal;
        ThreadLocal threadLocal2 = this.g;
        if (threadLocal2 == null) {
            synchronized (this) {
                threadLocal = this.g;
                if (threadLocal == null) {
                    threadLocal = new ThreadLocal();
                    this.g = threadLocal;
                }
            }
            return threadLocal;
        }
        return threadLocal2;
    }

    public final bs c(li4 li4Var) {
        li4Var.getClass();
        bs bsVar = (bs) b().get();
        if (bsVar == null) {
            bsVar = new bs();
            b().set(bsVar);
        }
        bsVar.addFirst(li4Var);
        return bsVar;
    }

    public final Object d(im0 im0Var, kz5 kz5Var, li4 li4Var) {
        i18 i18Var = (i18) this.e.x;
        i18Var.getClass();
        if (zf3.B.compareTo(zf3.x) <= 0) {
            f73.a(im0Var);
            i18Var.getClass();
            long b = j04.b();
            Object f = f(kz5Var, im0Var, li4Var);
            long b2 = bf6.b(b);
            f73.a(im0Var);
            m18 m18Var = fq1.y;
            fq1.i(b2, jq1.MICROSECONDS);
            i18Var.getClass();
            return f;
        }
        return f(kz5Var, im0Var, li4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ef A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.tp r12) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc5.e(tp):java.lang.Object");
    }

    public final Object f(qx4 qx4Var, im0 im0Var, li4 li4Var) {
        kz kzVar = this.e;
        tp tpVar = new tp((i18) kzVar.x, this, im0Var, qx4Var, li4Var);
        if (li4Var == null) {
            return e(tpVar);
        }
        i18 i18Var = (i18) kzVar.x;
        i18Var.getClass();
        zf3 zf3Var = zf3.B;
        zf3 zf3Var2 = zf3.x;
        if (zf3Var.compareTo(zf3Var2) <= 0) {
            li4Var.toString();
        }
        bs c = c(li4Var);
        try {
            return e(tpVar);
        } finally {
            i18Var.getClass();
            zf3Var.compareTo(zf3Var2);
            a(c);
        }
    }

    public final String toString() {
        return h11.k(new StringBuilder("['"), this.b, "']");
    }
}

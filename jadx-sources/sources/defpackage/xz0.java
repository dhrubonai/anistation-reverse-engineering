package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class xz0 extends h30 {
    private final l11 _context;
    private transient vz0 intercepted;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xz0(defpackage.vz0 r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L7
            l11 r0 = r2.getContext()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz0.<init>(vz0):void");
    }

    @Override // defpackage.vz0
    public l11 getContext() {
        l11 l11Var = this._context;
        l11Var.getClass();
        return l11Var;
    }

    public final vz0 intercepted() {
        vz0 vz0Var;
        vz0 vz0Var2 = this.intercepted;
        if (vz0Var2 == null) {
            n11 n11Var = (n11) getContext().get(h95.B);
            if (n11Var != null) {
                vz0Var = new jh1(n11Var, this);
            } else {
                vz0Var = this;
            }
            this.intercepted = vz0Var;
            return vz0Var;
        }
        return vz0Var2;
    }

    @Override // defpackage.h30
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        qg0 qg0Var;
        vz0 vz0Var = this.intercepted;
        if (vz0Var != null && vz0Var != this) {
            j11 j11Var = getContext().get(h95.B);
            j11Var.getClass();
            jh1 jh1Var = (jh1) vz0Var;
            do {
                unsafe = qs.a;
                j = jh1.E;
            } while (unsafe.getObjectVolatile(jh1Var, j) == kh1.b);
            Object objectVolatile = unsafe.getObjectVolatile(jh1Var, j);
            if (objectVolatile instanceof qg0) {
                qg0Var = (qg0) objectVolatile;
            } else {
                qg0Var = null;
            }
            if (qg0Var != null) {
                qg0Var.o();
            }
        }
        this.intercepted = cr0.y;
    }

    public xz0(vz0 vz0Var, l11 l11Var) {
        super(vz0Var);
        this._context = l11Var;
    }
}

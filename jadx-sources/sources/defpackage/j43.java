package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class j43 extends t43 implements ar0 {
    public final boolean A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j43(h43 h43Var) {
        super(true);
        ol0 ol0Var;
        ol0 ol0Var2;
        boolean z = true;
        N(h43Var);
        Unsafe unsafe = qs.a;
        long j = t43.x;
        nl0 nl0Var = (nl0) unsafe.getObjectVolatile(this, j);
        if (nl0Var instanceof ol0) {
            ol0Var = (ol0) nl0Var;
        } else {
            ol0Var = null;
        }
        if (ol0Var != null) {
            t43 i = ol0Var.i();
            while (!i.E()) {
                nl0 nl0Var2 = (nl0) qs.a.getObjectVolatile(i, j);
                if (nl0Var2 instanceof ol0) {
                    ol0Var2 = (ol0) nl0Var2;
                } else {
                    ol0Var2 = null;
                }
                if (ol0Var2 != null) {
                    i = ol0Var2.i();
                }
            }
            this.A = z;
        }
        z = false;
        this.A = z;
    }

    @Override // defpackage.t43
    public final boolean E() {
        return this.A;
    }

    @Override // defpackage.t43
    public final boolean H() {
        return true;
    }

    public final boolean g0() {
        return Q(pn6.a);
    }
}

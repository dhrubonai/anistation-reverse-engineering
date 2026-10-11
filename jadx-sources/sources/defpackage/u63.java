package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class u63 extends x45 implements jc2 {
    public final /* synthetic */ yq6 A;
    public boolean y;
    public /* synthetic */ v61 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u63(yq6 yq6Var, vz0 vz0Var) {
        super(3, vz0Var);
        this.A = yq6Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u63 u63Var = new u63(this.A, (vz0) obj3);
        u63Var.z = (v61) obj;
        return u63Var.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        yq6 yq6Var = this.A;
        m1 m1Var = (m1) yq6Var.c;
        v61 v61Var = this.z;
        boolean z = this.y;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            byte z2 = m1Var.z();
            if (z2 == 1) {
                return yq6Var.g(true);
            }
            if (z2 == 0) {
                return yq6Var.g(false);
            }
            if (z2 == 6) {
                this.z = null;
                this.y = true;
                obj = yq6Var.e(v61Var, this);
                w11 w11Var = w11.x;
                if (obj == w11Var) {
                    return w11Var;
                }
            } else {
                if (z2 == 8) {
                    return yq6Var.d();
                }
                m1.u(m1Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (q53) obj;
    }
}

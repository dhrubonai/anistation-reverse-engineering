package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m8 extends t36 implements jc2 {
    public final /* synthetic */ r8 A;
    public boolean x;
    public /* synthetic */ a9 y;
    public final /* synthetic */ l5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(l5 l5Var, r8 r8Var, vz0 vz0Var) {
        super(3, vz0Var);
        this.z = l5Var;
        this.A = r8Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m8 m8Var = new m8(this.z, this.A, (vz0) obj3);
        m8Var.y = (a9) obj;
        return m8Var.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.x;
        byte b = 1;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            b0 b0Var = new b0(this.A, this.y, b);
            this.x = true;
            Object invoke = this.z.invoke(b0Var, this);
            w11 w11Var = w11.x;
            if (invoke == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}

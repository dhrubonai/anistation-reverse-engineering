package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class d8 extends t36 implements kc2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ e9 B;
    public final /* synthetic */ ll C;
    public boolean x;
    public /* synthetic */ a9 y;
    public /* synthetic */ y71 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(e9 e9Var, ll llVar, vz0 vz0Var) {
        super(4, vz0Var);
        this.B = e9Var;
        this.C = llVar;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        d8 d8Var = new d8(this.B, this.C, (vz0) obj4);
        d8Var.y = (a9) obj;
        d8Var.z = (y71) obj2;
        d8Var.A = obj3;
        return d8Var.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.x;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            a9 a9Var = this.y;
            y71 y71Var = this.z;
            Object obj2 = this.A;
            e9 e9Var = this.B;
            float h = e9Var.g.h();
            this.y = null;
            this.z = null;
            this.x = true;
            Object e = z51.e(e9Var, h, a9Var, y71Var, obj2, this.C, this);
            w11 w11Var = w11.x;
            if (e == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}

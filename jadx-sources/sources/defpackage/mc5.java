package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mc5 extends t36 implements ic2 {
    public final /* synthetic */ ll A;
    public final /* synthetic */ t05 B;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc5(float f, ll llVar, t05 t05Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = f;
        this.A = llVar;
        this.B = t05Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        mc5 mc5Var = new mc5(this.z, this.A, this.B, vz0Var);
        mc5Var.y = obj;
        return mc5Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((mc5) create((wc5) obj, (vz0) obj2)).invokeSuspend(pn6.a);
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
            q qVar = new q(this.B, (wc5) this.y, (byte) 29);
            this.x = true;
            Object c = nv5.c(0.0f, this.z, this.A, qVar, this, 4);
            w11 w11Var = w11.x;
            if (c == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}

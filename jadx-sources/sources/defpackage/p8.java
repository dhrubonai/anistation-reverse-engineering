package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p8 extends t36 implements jc2 {
    public final /* synthetic */ t05 A;
    public final /* synthetic */ float B;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ r8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(r8 r8Var, t05 t05Var, float f, vz0 vz0Var) {
        super(3, vz0Var);
        this.z = r8Var;
        this.A = t05Var;
        this.B = f;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t05 t05Var = this.A;
        float f = this.B;
        p8 p8Var = new p8(this.z, t05Var, f, (vz0) obj3);
        p8Var.y = (a9) obj;
        return p8Var.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        t05 t05Var;
        boolean z = this.x;
        if (z) {
            if (z) {
                t05Var = (t05) this.y;
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            r8 r8Var = this.z;
            o8 o8Var = new o8(r8Var, (a9) this.y, (byte) 0);
            i42 i42Var = r8Var.i0;
            if (i42Var != null) {
                t05 t05Var2 = this.A;
                this.y = t05Var2;
                this.x = true;
                obj = i42Var.a(o8Var, this.B, this);
                w11 w11Var = w11.x;
                if (obj == w11Var) {
                    return w11Var;
                }
                t05Var = t05Var2;
            } else {
                a34.s0("resolvedFlingBehavior");
                throw null;
            }
        }
        t05Var.x = ((Number) obj).floatValue();
        return pn6.a;
    }
}

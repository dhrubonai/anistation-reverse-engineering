package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class co5 extends t36 implements kc2 {
    public /* synthetic */ eo5 A;
    public final /* synthetic */ do5 B;
    public final /* synthetic */ float C;
    public final /* synthetic */ j32 D;
    public boolean x;
    public /* synthetic */ z8 y;
    public /* synthetic */ cn3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co5(do5 do5Var, float f, j32 j32Var, vz0 vz0Var) {
        super(4, vz0Var);
        this.B = do5Var;
        this.C = f;
        this.D = j32Var;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.C;
        j32 j32Var = this.D;
        co5 co5Var = new co5(this.B, f, j32Var, (vz0) obj4);
        co5Var.y = (z8) obj;
        co5Var.z = (cn3) obj2;
        co5Var.A = (eo5) obj3;
        return co5Var.invokeSuspend(pn6.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [t05, java.lang.Object] */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        float h;
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
            z8 z8Var = this.y;
            float d = this.z.d(this.A);
            if (!Float.isNaN(d)) {
                ?? obj2 = new Object();
                do5 do5Var = this.B;
                if (Float.isNaN(do5Var.e.i.h())) {
                    h = 0.0f;
                } else {
                    h = do5Var.e.i.h();
                }
                float f = h;
                obj2.x = f;
                b8 b8Var = new b8(z8Var, obj2, b);
                this.y = null;
                this.z = null;
                this.x = true;
                Object a = nv5.a(f, d, this.C, this.D, b8Var, this);
                w11 w11Var = w11.x;
                if (a == w11Var) {
                    return w11Var;
                }
            }
        }
        return pn6.a;
    }
}

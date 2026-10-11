package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c8 extends t36 implements kc2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ d9 B;
    public final /* synthetic */ float C;
    public boolean x;
    public /* synthetic */ z8 y;
    public /* synthetic */ cn3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(d9 d9Var, float f, vz0 vz0Var) {
        super(4, vz0Var);
        this.B = d9Var;
        this.C = f;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        c8 c8Var = new c8(this.B, this.C, (vz0) obj4);
        c8Var.y = (z8) obj;
        c8Var.z = (cn3) obj2;
        c8Var.A = obj3;
        return c8Var.invokeSuspend(pn6.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [t05, java.lang.Object] */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        float h;
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
            z8 z8Var = this.y;
            float d = this.z.d(this.A);
            if (!Float.isNaN(d)) {
                ?? obj2 = new Object();
                d9 d9Var = this.B;
                if (Float.isNaN(d9Var.i.h())) {
                    h = 0.0f;
                } else {
                    h = d9Var.i.h();
                }
                obj2.x = h;
                j32 j32Var = ((do5) d9Var.c.y).d;
                b8 b8Var = new b8(z8Var, obj2, (byte) 0);
                this.y = null;
                this.z = null;
                this.x = true;
                Object a = nv5.a(h, d, this.C, j32Var, b8Var, this);
                w11 w11Var = w11.x;
                if (a == w11Var) {
                    return w11Var;
                }
            }
        }
        return pn6.a;
    }
}

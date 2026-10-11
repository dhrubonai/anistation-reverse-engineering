package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z7 extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x = 0;
    public boolean y;
    public /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(d9 d9Var, float f, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = d9Var;
        this.z = f;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.A;
        switch (b) {
            case 0:
                return new z7((d9) obj2, this.z, vz0Var);
            default:
                z7 z7Var = new z7((nt0) obj2, vz0Var);
                z7Var.z = ((Number) obj).floatValue();
                return z7Var;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((z7) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((z7) create(Float.valueOf(((Number) obj).floatValue()), (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        w11 w11Var = w11.x;
        Object obj2 = this.A;
        Object obj3 = null;
        switch (b) {
            case 0:
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
                    float f = this.z;
                    this.y = true;
                    if (((d9) obj2).h(f, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6.a;
            default:
                nt0 nt0Var = (nt0) obj2;
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    float f2 = this.z;
                    Object g = nt0Var.a.d.x.g(oh5.e);
                    if (g != null) {
                        obj3 = g;
                    }
                    ic2 ic2Var = (ic2) obj3;
                    if (ic2Var != null) {
                        xc4 xc4Var = new xc4((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                        this.y = true;
                        obj = ic2Var.invoke(xc4Var, this);
                        if (obj == w11Var) {
                            return w11Var;
                        }
                    } else {
                        throw h11.e("Required value was null.");
                    }
                }
                return new Float(Float.intBitsToFloat((int) (((xc4) obj).a & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(nt0 nt0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = nt0Var;
    }
}

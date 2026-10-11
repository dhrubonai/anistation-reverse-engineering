package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oc5 extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ float y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc5(float f, w44 w44Var, pi4 pi4Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = f;
        this.z = w44Var;
        this.A = pi4Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.A;
        float f = this.y;
        switch (b) {
            case 0:
                oc5 oc5Var = new oc5((t05) obj2, f, vz0Var);
                oc5Var.z = obj;
                return oc5Var;
            default:
                return new oc5(f, (w44) this.z, (pi4) obj2, vz0Var);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((oc5) create((wc5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((oc5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        float f = this.y;
        Object obj2 = this.A;
        switch (b) {
            case 0:
                m37.N(obj);
                ((t05) obj2).x = ((wc5) this.z).a(f);
                return pn6Var;
            default:
                m37.N(obj);
                if (!s07.e((w44) this.z)) {
                    pi4 pi4Var = (pi4) obj2;
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                    pi4Var.i(f);
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc5(t05 t05Var, float f, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = t05Var;
        this.y = f;
    }
}

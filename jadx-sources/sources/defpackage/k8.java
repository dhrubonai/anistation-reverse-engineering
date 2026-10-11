package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k8 extends t36 implements ic2 {
    public final /* synthetic */ sb2 A;
    public final /* synthetic */ ic2 B;
    public final /* synthetic */ byte x;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8(sb2 sb2Var, ic2 ic2Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = sb2Var;
        this.B = ic2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                k8 k8Var = new k8(this.A, this.B, vz0Var, (byte) 0);
                k8Var.z = obj;
                return k8Var;
            default:
                k8 k8Var2 = new k8(this.A, this.B, vz0Var, (byte) 1);
                k8Var2.z = obj;
                return k8Var2;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((k8) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((k8) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, w05] */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ic2 ic2Var = this.B;
        sb2 sb2Var = this.A;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                v11 v11Var = (v11) this.z;
                ?? obj2 = new Object();
                mx0 j = wt5.j(sb2Var);
                j8 j8Var = new j8(obj2, v11Var, ic2Var, (byte) 0);
                this.y = true;
                if (j.collect(j8Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                v11 v11Var2 = (v11) this.z;
                ?? obj3 = new Object();
                mx0 j2 = wt5.j(sb2Var);
                j8 j8Var2 = new j8(obj3, v11Var2, ic2Var, (byte) 1);
                this.y = true;
                if (j2.collect(j8Var2, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}

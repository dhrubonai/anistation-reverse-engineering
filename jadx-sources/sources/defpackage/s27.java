package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s27 extends t36 implements ic2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ boolean B;
    public boolean x;
    public final /* synthetic */ v27 y;
    public final /* synthetic */ Integer z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s27(v27 v27Var, Integer num, long j, boolean z, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = v27Var;
        this.z = num;
        this.A = j;
        this.B = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new s27(this.y, this.z, this.A, this.B, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((s27) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
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
            m18 m18Var = fq1.y;
            long W = w65.W(100L, jq1.MILLISECONDS);
            this.x = true;
            Object v = x97.v(W, this);
            w11 w11Var = w11.x;
            if (v == w11Var) {
                return w11Var;
            }
        }
        v27.w(this.y, this.z.intValue(), new Long(this.A), false, Boolean.valueOf(this.B), 48);
        return pn6.a;
    }
}

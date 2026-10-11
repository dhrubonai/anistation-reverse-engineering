package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z2 extends t36 implements ic2 {
    public final /* synthetic */ float A;
    public boolean x;
    public final /* synthetic */ jd5 y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(jd5 jd5Var, float f, float f2, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = jd5Var;
        this.z = f;
        this.A = f2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new z2(this.y, this.z, this.A, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((z2) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
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
            this.x = true;
            Object b = fd5.b(this.y.o0, (Float.floatToRawIntBits(this.z) << 32) | (Float.floatToRawIntBits(this.A) & 4294967295L), this);
            w11 w11Var = w11.x;
            if (b == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}

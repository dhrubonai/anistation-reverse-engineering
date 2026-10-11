package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ma1 implements kd5 {
    public final ub2 a;
    public final la1 b = new la1(this);
    public final i54 c = new i54();
    public final ti4 d;
    public final ti4 e;
    public final ti4 f;

    public ma1(ub2 ub2Var) {
        this.a = ub2Var;
        Boolean bool = Boolean.FALSE;
        this.d = xt5.g(bool);
        this.e = xt5.g(bool);
        this.f = xt5.g(bool);
    }

    @Override // defpackage.kd5
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.kd5
    public final Object d(c54 c54Var, ic2 ic2Var, xz0 xz0Var) {
        Object K = db.K(new e0((Object) this, (Object) c54Var, (Object) ic2Var, (vz0) null, (byte) 14), xz0Var);
        if (K == w11.x) {
            return K;
        }
        return pn6.a;
    }

    @Override // defpackage.kd5
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}

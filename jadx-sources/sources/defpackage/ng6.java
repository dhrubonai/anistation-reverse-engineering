package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ng6 {
    public final i54 a;
    public final y44 b = new y44(Boolean.FALSE);
    public qg0 c;

    public ng6(i54 i54Var) {
        this.a = i54Var;
    }

    public final void a() {
        this.b.z.setValue(Boolean.FALSE);
    }

    public final boolean b() {
        y44 y44Var = this.b;
        if (!((Boolean) y44Var.y.getValue()).booleanValue() && !((Boolean) y44Var.z.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public final Object c(c54 c54Var, t36 t36Var) {
        vz0 vz0Var = null;
        mg6 mg6Var = new mg6(this, new id0(this, vz0Var, (byte) 5), c54Var, null);
        i54 i54Var = this.a;
        i54Var.getClass();
        Object K = db.K(new d23(c54Var, i54Var, mg6Var, vz0Var, (byte) 1), t36Var);
        if (K == w11.x) {
            return K;
        }
        return pn6.a;
    }
}

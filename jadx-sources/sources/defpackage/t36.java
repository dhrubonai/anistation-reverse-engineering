package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class t36 extends xz0 implements sc2 {
    private final int arity;

    public t36(int i, vz0 vz0Var) {
        super(vz0Var);
        this.arity = i;
    }

    @Override // defpackage.sc2
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.h30
    public String toString() {
        if (getCompletion() == null) {
            z05.a.getClass();
            return a15.a(this);
        }
        return super.toString();
    }
}

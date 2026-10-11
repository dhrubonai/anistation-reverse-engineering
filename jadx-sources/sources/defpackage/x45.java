package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class x45 extends w45 implements sc2 {
    public final byte x;

    /* JADX WARN: Multi-variable type inference failed */
    public x45(int i, vz0 vz0Var) {
        super(vz0Var);
        this.x = i;
    }

    @Override // defpackage.sc2
    public final int getArity() {
        return this.x;
    }

    @Override // defpackage.h30
    public final String toString() {
        if (getCompletion() == null) {
            z05.a.getClass();
            return a15.a(this);
        }
        return super.toString();
    }
}

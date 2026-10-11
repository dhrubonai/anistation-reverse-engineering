package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class w45 extends h30 {
    public w45(vz0 vz0Var) {
        super(vz0Var);
        if (vz0Var != null && vz0Var.getContext() != it1.x) {
            ze0.k("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    @Override // defpackage.vz0
    public final l11 getContext() {
        return it1.x;
    }
}

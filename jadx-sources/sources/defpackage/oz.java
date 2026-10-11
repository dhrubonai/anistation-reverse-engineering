package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oz {
    public final m74 a;
    public final wd4 b;

    /* JADX WARN: Multi-variable type inference failed */
    public oz(m74 m74Var, wd4 wd4Var) {
        this.a = m74Var;
        this.b = wd4Var;
        if ((m74Var == null ? wd4Var : m74Var) != null) {
            return;
        }
        ze0.k("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }
}

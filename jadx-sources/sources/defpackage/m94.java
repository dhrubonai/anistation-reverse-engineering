package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m94 {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ n94 c;

    public m94(n94 n94Var, m71 m71Var, Executor executor) {
        this.c = n94Var;
        this.a = new WeakReference(m71Var);
        this.b = executor;
    }
}

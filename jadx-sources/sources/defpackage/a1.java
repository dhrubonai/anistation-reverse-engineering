package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a1 {
    public static final a1 d = new a1();
    public final Runnable a;
    public final Executor b;
    public a1 c;

    public a1() {
        this.a = null;
        this.b = null;
    }

    public a1(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}

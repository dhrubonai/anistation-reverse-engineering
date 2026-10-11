package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z78 {
    public static final z78 d = new z78();
    public final Runnable a;
    public final Executor b;
    public z78 c;

    public z78() {
        this.a = null;
        this.b = null;
    }

    public z78(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}

package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o88 {
    public int a;
    public final int b;
    public o88 c;
    public final HashMap d = new HashMap(0);

    public o88(int i, int i2) {
        if (i <= i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
            return;
        }
        p65.b();
        throw null;
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return h11.g(identityHashCode, "Node", new StringBuilder(String.valueOf(identityHashCode).length() + 4));
    }
}

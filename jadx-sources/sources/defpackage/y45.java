package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y45 implements Serializable {
    public final Throwable x;

    public y45(Throwable th) {
        th.getClass();
        this.x = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y45) {
            if (a34.i(this.x, ((y45) obj).x)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.x + ')';
    }
}

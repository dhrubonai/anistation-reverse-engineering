package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ne6 implements k11 {
    public final ThreadLocal x;

    public ne6(ThreadLocal threadLocal) {
        this.x = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ne6) && a34.i(this.x, ((ne6) obj).x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.x + ')';
    }
}

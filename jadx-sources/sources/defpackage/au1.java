package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class au1 {
    public final String a;

    public au1(String str) {
        if (str != null) {
            this.a = str;
        } else {
            qi2.m("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au1)) {
            return false;
        }
        return this.a.equals(((au1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return h11.k(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}

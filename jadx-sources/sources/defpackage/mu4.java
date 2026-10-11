package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class mu4 {
    public final int a;

    public mu4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mu4)) {
            return false;
        }
        if (this.a != ((mu4) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}

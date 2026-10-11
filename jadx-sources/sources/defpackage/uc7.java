package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uc7 {
    public final String a;

    public uc7(String str) {
        ce7 ce7Var = ce7.b;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uc7) {
            ce7 ce7Var = ce7.b;
            if (this.a.equals(((uc7) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ce7.b.hashCode();
    }
}

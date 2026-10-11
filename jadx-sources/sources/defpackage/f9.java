package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f9 extends iv5 {
    public final int a;

    public f9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof f9) && ((f9) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}

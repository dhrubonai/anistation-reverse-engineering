package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class al0 extends yk0 {
    public final char x;
    public final char y;

    public al0(char c, char c2) {
        this.x = c;
        this.y = c2;
    }

    @Override // defpackage.cl0
    public final boolean b(char c) {
        if (c != this.x && c != this.y) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + cl0.d(this.x) + cl0.d(this.y) + "\")";
    }
}

package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c67 implements b67 {
    public final String b;
    public final lz2 c;
    public final lz2 d;

    public c67(String str) {
        this.b = str;
        this.c = new lz2(str);
        this.d = new lz2(str.concat(" maximum"));
    }

    public final String toString() {
        return this.b;
    }
}

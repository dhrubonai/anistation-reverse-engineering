package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w86 extends o86 {
    public final String b;
    public final int c;
    public final ub2 d;

    public w86(Object obj, String str, int i, ub2 ub2Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = ub2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return zo5.k(this.c, ")", sb);
    }
}

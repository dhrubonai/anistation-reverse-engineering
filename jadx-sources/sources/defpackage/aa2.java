package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class aa2 implements Comparable {
    public final String A;
    public final int x;
    public final int y;
    public final String z;

    public aa2(String str, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        this.x = i;
        this.y = i2;
        this.z = str;
        this.A = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        aa2 aa2Var = (aa2) obj;
        aa2Var.getClass();
        int i = this.x - aa2Var.x;
        if (i == 0) {
            return this.y - aa2Var.y;
        }
        return i;
    }
}

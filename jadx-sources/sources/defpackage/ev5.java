package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ev5 implements r12 {
    public final lv2 a;
    public final String b;
    public final p41 c;

    public ev5(lv2 lv2Var, String str, p41 p41Var) {
        this.a = lv2Var;
        this.b = str;
        this.c = p41Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ev5) {
                ev5 ev5Var = (ev5) obj;
                if (!a34.i(this.a, ev5Var.a) || !a34.i(this.b, ev5Var.b) || this.c != ev5Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ")";
    }
}

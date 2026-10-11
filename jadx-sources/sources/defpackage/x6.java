package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x6 {
    public final /* synthetic */ byte a;
    public final String b;
    public final boolean c;

    public /* synthetic */ x6(String str, boolean z, byte b) {
        this.a = b;
        this.b = str;
        this.c = z;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String str = this.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.c);
                return sb.toString();
            default:
                return super.toString();
        }
    }
}

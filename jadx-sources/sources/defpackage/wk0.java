package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wk0 extends yk0 {
    public final String x;
    public final /* synthetic */ byte y;
    public static final wk0 z = new wk0("CharMatcher.any()", (byte) 0);
    public static final wk0 A = new wk0("CharMatcher.ascii()", (byte) 1);
    public static final wk0 B = new wk0("CharMatcher.javaIsoControl()", (byte) 2);
    public static final wk0 C = new wk0("CharMatcher.none()", (byte) 3);

    public wk0(String str, byte b) {
        this.y = b;
        this.x = str;
    }

    @Override // defpackage.cl0
    public final boolean b(char c) {
        switch (this.y) {
            case 0:
                return true;
            case 1:
                if (c <= 127) {
                    return true;
                }
                return false;
            case 2:
                if (c > 31 && (c < 127 || c > 159)) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.yk0, defpackage.cl0
    public cl0 c() {
        switch (this.y) {
            case 0:
                return C;
            case 3:
                return z;
            default:
                return super.c();
        }
    }

    public final String toString() {
        return this.x;
    }
}

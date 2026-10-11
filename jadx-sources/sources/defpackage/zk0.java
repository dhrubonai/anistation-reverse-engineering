package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zk0 extends yk0 {
    public final /* synthetic */ byte x;
    public final char y;

    public /* synthetic */ zk0(char c, byte b) {
        this.x = b;
        this.y = c;
    }

    @Override // defpackage.cl0
    public final boolean b(char c) {
        switch (this.x) {
            case 0:
                if (c == this.y) {
                    return true;
                }
                return false;
            default:
                if (c != this.y) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.yk0, defpackage.cl0
    public final cl0 c() {
        switch (this.x) {
            case 0:
                return new zk0(this.y, (byte) 1);
            default:
                return new zk0(this.y, (byte) 0);
        }
    }

    public final String toString() {
        byte b = this.x;
        char c = this.y;
        switch (b) {
            case 0:
                return "CharMatcher.is('" + cl0.d(c) + "')";
            default:
                return "CharMatcher.isNot('" + cl0.d(c) + "')";
        }
    }
}

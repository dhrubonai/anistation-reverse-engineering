package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class qa0 {
    public final /* synthetic */ byte x = 0;
    public int y;

    public qa0(int i) {
        this.y = i;
    }

    public static String c(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void b(int i) {
        this.y = i | this.y;
    }

    public boolean d(int i) {
        if ((this.y & i) == i) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.x) {
            case 1:
                return c(this.y);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ qa0() {
    }
}

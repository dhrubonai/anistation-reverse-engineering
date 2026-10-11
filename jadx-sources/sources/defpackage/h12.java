package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h12 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;

    public h12(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                return;
            default:
                this.b = 0;
                this.c = 0;
                return;
        }
    }

    public int a() {
        int i = this.c;
        if (i != 2) {
            if (i != 5) {
                if (i != 29) {
                    if (i != 42) {
                        if (i != 22) {
                            if (i != 23) {
                                return 0;
                            }
                            return 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    public int b(int i) {
        if (i >= 0 && i <= this.b) {
            h98.Z(i, this.c, i);
        }
        return i;
    }

    public int c(int i) {
        if (i >= 0 && i <= this.c) {
            h98.a0(i, this.b, i);
        }
        return i;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder("MutableRange(start=");
                sb.append(this.b);
                sb.append(", end=");
                return qx1.o(sb, this.c, ')');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h12(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }
}

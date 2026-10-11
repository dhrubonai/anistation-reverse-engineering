package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gj3 {
    public final byte a;
    public final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public gj3(int i, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        this.a = i;
        this.b = (int) j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gj3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public gj3(int i) {
        this.a = (byte) 2;
        this.b = i;
    }
}

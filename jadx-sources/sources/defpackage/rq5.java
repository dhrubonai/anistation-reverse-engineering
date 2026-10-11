package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class rq5 {
    public static final byte[] a;

    static {
        int i;
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            if (i2 < 10) {
                i = 48;
            } else {
                i = 87;
            }
            bArr[i2] = (byte) (i + i2);
        }
        a = bArr;
    }
}

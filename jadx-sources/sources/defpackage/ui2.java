package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ui2 {
    public static final byte[] f = {0, 0, 1};
    public boolean a;
    public byte b;
    public int c;
    public int d;
    public byte[] e;

    public final void a(byte[] bArr, int i, int i2) {
        if (!this.a) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        int i4 = this.c + i3;
        if (length < i4) {
            bArr2 = Arrays.copyOf(bArr2, i4 * 2);
            this.e = bArr2;
        }
        System.arraycopy(bArr, i, bArr2, this.c, i3);
        this.c += i3;
    }
}

package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class si2 {
    public static final byte[] e = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public byte[] d;

    public final void a(byte[] bArr, int i, int i2) {
        if (!this.a) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i4 = this.b + i3;
        if (length < i4) {
            bArr2 = Arrays.copyOf(bArr2, i4 * 2);
            this.d = bArr2;
        }
        System.arraycopy(bArr, i, bArr2, this.b, i3);
        this.b += i3;
    }
}

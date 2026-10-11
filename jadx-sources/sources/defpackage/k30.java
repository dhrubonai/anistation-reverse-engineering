package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k30 extends m30 {
    public final char[] f;

    public k30(j30 j30Var) {
        super(j30Var, (Character) null);
        boolean z;
        this.f = new char[512];
        char[] cArr = j30Var.b;
        if (cArr.length == 16) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.m30
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        io3.y(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}

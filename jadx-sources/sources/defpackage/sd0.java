package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sd0 extends xd0 {
    public final int B;
    public final int C;

    public sd0(byte[] bArr, int i, int i2) {
        super(bArr);
        xd0.c(i, i + i2, bArr.length);
        this.B = i;
        this.C = i2;
    }

    @Override // defpackage.xd0
    public final byte b(int i) {
        int i2 = this.C;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(qx1.h(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(zo5.m("Index > length: ", ", ", i, i2));
        }
        return this.y[this.B + i];
    }

    @Override // defpackage.xd0
    public final void f(int i, byte[] bArr) {
        System.arraycopy(this.y, this.B, bArr, 0, i);
    }

    @Override // defpackage.xd0
    public final int g() {
        return this.B;
    }

    @Override // defpackage.xd0
    public final byte h(int i) {
        return this.y[this.B + i];
    }

    @Override // defpackage.xd0
    public final int size() {
        return this.C;
    }
}

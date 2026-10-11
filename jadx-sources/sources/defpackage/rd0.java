package defpackage;

import com.google.protobuf.ByteString;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rd0 extends wd0 {
    public final int y;
    public final int z;

    public rd0(byte[] bArr, int i, int i2) {
        super(bArr);
        ByteString.checkRange(i, i + i2, bArr.length);
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.wd0, com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        ByteString.checkIndex(i, this.z);
        return this.x[this.y + i];
    }

    @Override // defpackage.wd0
    public final int c() {
        return this.y;
    }

    @Override // defpackage.wd0, com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.x, this.y + i, bArr, i2, i3);
    }

    @Override // defpackage.wd0, com.google.protobuf.l, com.google.protobuf.ByteString
    public final byte internalByteAt(int i) {
        return this.x[this.y + i];
    }

    @Override // defpackage.wd0, com.google.protobuf.ByteString
    public final int size() {
        return this.z;
    }
}

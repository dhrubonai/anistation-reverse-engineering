package com.google.protobuf;

import defpackage.qi2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i extends k {
    public int x = 0;
    public final int y;
    public final /* synthetic */ ByteString z;

    public i(ByteString byteString) {
        this.z = byteString;
        this.y = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.x < this.y) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        int i = this.x;
        if (i < this.y) {
            this.x = i + 1;
            return this.z.internalByteAt(i);
        }
        qi2.e();
        return (byte) 0;
    }
}

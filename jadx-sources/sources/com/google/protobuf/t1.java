package com.google.protobuf;

import com.google.protobuf.ByteString;
import defpackage.k75;
import defpackage.qi2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t1 extends k {
    public final k75 x;
    public ByteString.ByteIterator y = a();

    public t1(u1 u1Var) {
        this.x = new k75(u1Var);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.protobuf.ByteString$ByteIterator] */
    public final ByteString.ByteIterator a() {
        k75 k75Var = this.x;
        if (k75Var.hasNext()) {
            return k75Var.next().iterator2();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.y != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        ByteString.ByteIterator byteIterator = this.y;
        if (byteIterator != null) {
            byte nextByte = byteIterator.nextByte();
            if (!this.y.hasNext()) {
                this.y = a();
            }
            return nextByte;
        }
        qi2.e();
        return (byte) 0;
    }
}

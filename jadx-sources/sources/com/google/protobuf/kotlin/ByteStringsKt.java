package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ByteStringsKt {
    public static final byte get(ByteString byteString, int i) {
        byteString.getClass();
        return byteString.byteAt(i);
    }

    public static final boolean isNotEmpty(ByteString byteString) {
        byteString.getClass();
        return !byteString.isEmpty();
    }

    public static final ByteString plus(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        ByteString concat = byteString.concat(byteString2);
        concat.getClass();
        return concat;
    }

    public static final ByteString toByteString(byte[] bArr) {
        bArr.getClass();
        ByteString copyFrom = ByteString.copyFrom(bArr);
        copyFrom.getClass();
        return copyFrom;
    }

    public static final ByteString toByteStringUtf8(String str) {
        str.getClass();
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(str);
        copyFromUtf8.getClass();
        return copyFromUtf8;
    }

    public static final ByteString toByteString(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteString copyFrom = ByteString.copyFrom(byteBuffer);
        copyFrom.getClass();
        return copyFrom;
    }
}

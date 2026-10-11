package com.unity3d.ads.core.extensions;

import android.util.Base64;
import com.google.protobuf.ByteString;
import defpackage.kl0;
import defpackage.ze0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ProtobufExtensionsKt {
    private static final int URL_SAFE_AND_NO_WRAP = 10;

    public static final ByteString fromBase64(String str, boolean z) {
        int i;
        str.getClass();
        if (z) {
            i = 10;
        } else {
            i = 2;
        }
        ByteString copyFrom = ByteString.copyFrom(Base64.decode(str, i));
        copyFrom.getClass();
        return copyFrom;
    }

    public static /* synthetic */ ByteString fromBase64$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return fromBase64(str, z);
    }

    public static final String toBase64(ByteString byteString, boolean z) {
        int i;
        byteString.getClass();
        if (z) {
            i = 10;
        } else {
            i = 2;
        }
        String encodeToString = Base64.encodeToString(byteString.toByteArray(), i);
        encodeToString.getClass();
        return encodeToString;
    }

    public static /* synthetic */ String toBase64$default(ByteString byteString, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toBase64(byteString, z);
    }

    public static final ByteString toByteString(UUID uuid) {
        uuid.getClass();
        ByteString copyFrom = ByteString.copyFrom(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        copyFrom.getClass();
        return copyFrom;
    }

    public static final ByteString toISO8859ByteString(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(kl0.b);
        bytes.getClass();
        ByteString copyFrom = ByteString.copyFrom(bytes);
        copyFrom.getClass();
        return copyFrom;
    }

    public static final String toISO8859String(ByteString byteString) {
        byteString.getClass();
        String byteString2 = byteString.toString(kl0.b);
        byteString2.getClass();
        return byteString2;
    }

    public static final UUID toUUID(ByteString byteString) {
        byteString.getClass();
        ByteBuffer asReadOnlyByteBuffer = byteString.asReadOnlyByteBuffer();
        asReadOnlyByteBuffer.getClass();
        if (asReadOnlyByteBuffer.remaining() == 36) {
            UUID fromString = UUID.fromString(byteString.toStringUtf8());
            fromString.getClass();
            return fromString;
        }
        if (asReadOnlyByteBuffer.remaining() == 16) {
            return new UUID(asReadOnlyByteBuffer.getLong(), asReadOnlyByteBuffer.getLong());
        }
        ze0.k("Expected 16 byte ByteString or UUID string");
        return null;
    }
}

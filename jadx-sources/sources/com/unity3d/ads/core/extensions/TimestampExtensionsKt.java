package com.unity3d.ads.core.extensions;

import com.google.protobuf.Timestamp;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class TimestampExtensionsKt {
    public static final long duration(long j) {
        return System.nanoTime() - j;
    }

    public static final Timestamp fromMillis(long j) {
        Timestamp build = Timestamp.newBuilder().setSeconds(j / 1000).setNanos((int) ((j % 1000) * 1000000)).build();
        build.getClass();
        return build;
    }
}

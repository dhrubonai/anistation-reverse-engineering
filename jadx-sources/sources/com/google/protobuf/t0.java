package com.google.protobuf;

import com.google.protobuf.WireFormat;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class t0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WireFormat.JavaType.values().length];
        a = iArr;
        try {
            iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[WireFormat.JavaType.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

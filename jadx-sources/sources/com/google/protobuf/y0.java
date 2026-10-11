package com.google.protobuf;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y0 implements Internal.MapAdapter.Converter {
    public final /* synthetic */ Internal.EnumLiteMap a;
    public final /* synthetic */ Internal.EnumLite b;

    public y0(Internal.EnumLiteMap enumLiteMap, Internal.EnumLite enumLite) {
        this.a = enumLiteMap;
        this.b = enumLite;
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doBackward(Object obj) {
        return Integer.valueOf(((Internal.EnumLite) obj).getNumber());
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doForward(Object obj) {
        Internal.EnumLite findValueByNumber = this.a.findValueByNumber(((Integer) obj).intValue());
        if (findValueByNumber == null) {
            return this.b;
        }
        return findValueByNumber;
    }
}

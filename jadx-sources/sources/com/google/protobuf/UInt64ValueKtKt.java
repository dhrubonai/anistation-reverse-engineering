package com.google.protobuf;

import com.google.protobuf.UInt64Value;
import com.google.protobuf.UInt64ValueKt;
import defpackage.ub2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class UInt64ValueKtKt {
    /* renamed from: -initializeuInt64Value, reason: not valid java name */
    public static final UInt64Value m26initializeuInt64Value(ub2 ub2Var) {
        ub2Var.getClass();
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder newBuilder = UInt64Value.newBuilder();
        newBuilder.getClass();
        UInt64ValueKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final UInt64Value copy(UInt64Value uInt64Value, ub2 ub2Var) {
        uInt64Value.getClass();
        ub2Var.getClass();
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder builder = uInt64Value.toBuilder();
        builder.getClass();
        UInt64ValueKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}

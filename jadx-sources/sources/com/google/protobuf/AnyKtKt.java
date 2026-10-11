package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.AnyKt;
import defpackage.ub2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AnyKtKt {
    /* renamed from: -initializeany, reason: not valid java name */
    public static final Any m2initializeany(ub2 ub2Var) {
        ub2Var.getClass();
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder newBuilder = Any.newBuilder();
        newBuilder.getClass();
        AnyKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final Any copy(Any any, ub2 ub2Var) {
        any.getClass();
        ub2Var.getClass();
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder builder = any.toBuilder();
        builder.getClass();
        AnyKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}

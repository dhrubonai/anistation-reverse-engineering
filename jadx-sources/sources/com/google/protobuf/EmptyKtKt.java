package com.google.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.EmptyKt;
import defpackage.ub2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class EmptyKtKt {
    /* renamed from: -initializeempty, reason: not valid java name */
    public static final Empty m8initializeempty(ub2 ub2Var) {
        ub2Var.getClass();
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder newBuilder = Empty.newBuilder();
        newBuilder.getClass();
        EmptyKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final Empty copy(Empty empty, ub2 ub2Var) {
        empty.getClass();
        ub2Var.getClass();
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builder = empty.toBuilder();
        builder.getClass();
        EmptyKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}

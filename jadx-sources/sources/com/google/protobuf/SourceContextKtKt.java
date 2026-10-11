package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContextKt;
import defpackage.ub2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class SourceContextKtKt {
    /* renamed from: -initializesourceContext, reason: not valid java name */
    public static final SourceContext m20initializesourceContext(ub2 ub2Var) {
        ub2Var.getClass();
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder newBuilder = SourceContext.newBuilder();
        newBuilder.getClass();
        SourceContextKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final SourceContext copy(SourceContext sourceContext, ub2 ub2Var) {
        sourceContext.getClass();
        ub2Var.getClass();
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builder = sourceContext.toBuilder();
        builder.getClass();
        SourceContextKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}

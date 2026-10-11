package com.google.protobuf;

import com.google.protobuf.Type;
import com.google.protobuf.TypeKt;
import defpackage.ub2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class TypeKtKt {
    /* renamed from: -initializetype, reason: not valid java name */
    public static final Type m24initializetype(ub2 ub2Var) {
        ub2Var.getClass();
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder newBuilder = Type.newBuilder();
        newBuilder.getClass();
        TypeKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final Type copy(Type type, ub2 ub2Var) {
        type.getClass();
        ub2Var.getClass();
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder builder = type.toBuilder();
        builder.getClass();
        TypeKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(TypeOrBuilder typeOrBuilder) {
        typeOrBuilder.getClass();
        if (typeOrBuilder.hasSourceContext()) {
            return typeOrBuilder.getSourceContext();
        }
        return null;
    }
}

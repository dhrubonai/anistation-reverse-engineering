package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.FieldKt;
import defpackage.ub2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class FieldKtKt {
    /* renamed from: -initializefield, reason: not valid java name */
    public static final Field m11initializefield(ub2 ub2Var) {
        ub2Var.getClass();
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder newBuilder = Field.newBuilder();
        newBuilder.getClass();
        FieldKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final Field copy(Field field, ub2 ub2Var) {
        field.getClass();
        ub2Var.getClass();
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builder = field.toBuilder();
        builder.getClass();
        FieldKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}

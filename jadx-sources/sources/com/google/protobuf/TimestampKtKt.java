package com.google.protobuf;

import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampKt;
import defpackage.ub2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class TimestampKtKt {
    /* renamed from: -initializetimestamp, reason: not valid java name */
    public static final Timestamp m23initializetimestamp(ub2 ub2Var) {
        ub2Var.getClass();
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder newBuilder = Timestamp.newBuilder();
        newBuilder.getClass();
        TimestampKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final Timestamp copy(Timestamp timestamp, ub2 ub2Var) {
        timestamp.getClass();
        ub2Var.getClass();
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builder = timestamp.toBuilder();
        builder.getClass();
        TimestampKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}

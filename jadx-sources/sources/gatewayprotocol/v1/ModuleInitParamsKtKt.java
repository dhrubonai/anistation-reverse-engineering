package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.ModuleInitParamsKt;
import gatewayprotocol.v1.ModuleInitParamsOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ModuleInitParamsKtKt {
    /* renamed from: -initializemoduleInitParams, reason: not valid java name */
    public static final ModuleInitParamsOuterClass.ModuleInitParams m115initializemoduleInitParams(ub2 ub2Var) {
        ub2Var.getClass();
        ModuleInitParamsKt.Dsl.Companion companion = ModuleInitParamsKt.Dsl.Companion;
        ModuleInitParamsOuterClass.ModuleInitParams.Builder newBuilder = ModuleInitParamsOuterClass.ModuleInitParams.newBuilder();
        newBuilder.getClass();
        ModuleInitParamsKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final ModuleInitParamsOuterClass.ModuleInitParams copy(ModuleInitParamsOuterClass.ModuleInitParams moduleInitParams, ub2 ub2Var) {
        moduleInitParams.getClass();
        ub2Var.getClass();
        ModuleInitParamsKt.Dsl.Companion companion = ModuleInitParamsKt.Dsl.Companion;
        ModuleInitParamsOuterClass.ModuleInitParams.Builder builder = moduleInitParams.toBuilder();
        builder.getClass();
        ModuleInitParamsKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}

package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.ModuleKt;
import gatewayprotocol.v1.ModuleOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ModuleKtKt {
    /* renamed from: -initializemodule, reason: not valid java name */
    public static final ModuleOuterClass.Module m116initializemodule(ub2 ub2Var) {
        ub2Var.getClass();
        ModuleKt.Dsl.Companion companion = ModuleKt.Dsl.Companion;
        ModuleOuterClass.Module.Builder newBuilder = ModuleOuterClass.Module.newBuilder();
        newBuilder.getClass();
        ModuleKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final ModuleOuterClass.Module copy(ModuleOuterClass.Module module, ub2 ub2Var) {
        module.getClass();
        ub2Var.getClass();
        ModuleKt.Dsl.Companion companion = ModuleKt.Dsl.Companion;
        ModuleOuterClass.Module.Builder builder = module.toBuilder();
        builder.getClass();
        ModuleKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}

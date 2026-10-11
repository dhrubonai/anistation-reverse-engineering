package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.InstallReferrerKt;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class InstallReferrerKtKt {
    /* renamed from: -initializeinstallReferrer, reason: not valid java name */
    public static final InitializationRequestOuterClass.InstallReferrer m111initializeinstallReferrer(ub2 ub2Var) {
        ub2Var.getClass();
        InstallReferrerKt.Dsl.Companion companion = InstallReferrerKt.Dsl.Companion;
        InitializationRequestOuterClass.InstallReferrer.Builder newBuilder = InitializationRequestOuterClass.InstallReferrer.newBuilder();
        newBuilder.getClass();
        InstallReferrerKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InstallReferrer copy(InitializationRequestOuterClass.InstallReferrer installReferrer, ub2 ub2Var) {
        installReferrer.getClass();
        ub2Var.getClass();
        InstallReferrerKt.Dsl.Companion companion = InstallReferrerKt.Dsl.Companion;
        InitializationRequestOuterClass.InstallReferrer.Builder builder = installReferrer.toBuilder();
        builder.getClass();
        InstallReferrerKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}

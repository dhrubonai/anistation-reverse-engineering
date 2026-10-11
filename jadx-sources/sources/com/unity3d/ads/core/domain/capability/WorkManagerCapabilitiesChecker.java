package com.unity3d.ads.core.domain.capability;

import android.content.ComponentName;
import android.content.Context;
import defpackage.ai3;
import defpackage.q71;
import defpackage.te4;
import defpackage.ub2;
import defpackage.uc2;
import defpackage.y45;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WorkManagerCapabilitiesChecker implements CapabilitiesChecker {
    public static final Companion Companion = new Companion(null);
    private static final int NO_MATCH_FLAGS = 0;
    public static final String STARTUP_PROVIDER_CLASS = "androidx.startup.InitializationProvider";
    public static final String WORK_DATABASE_IMPL = "androidx.work.impl.WorkDatabase_Impl";
    public static final String WORK_MANAGER = "androidx.work.WorkManager";
    private final Context context;
    private final ub2 isClassPresent;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.unity3d.ads.core.domain.capability.WorkManagerCapabilitiesChecker$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass1 extends uc2 implements ub2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, CapabilitiesCheckerKt.class, "isClassResolvable", "isClassResolvable(Ljava/lang/String;)Z", 1);
        }

        @Override // defpackage.ub2
        public final Boolean invoke(String str) {
            str.getClass();
            return Boolean.valueOf(CapabilitiesCheckerKt.isClassResolvable(str));
        }
    }

    public WorkManagerCapabilitiesChecker(Context context, ub2 ub2Var) {
        context.getClass();
        ub2Var.getClass();
        this.context = context;
        this.isClassPresent = ub2Var;
    }

    private final boolean isStartupProviderRegistered() {
        Object y45Var;
        try {
            y45Var = this.context.getPackageManager().getProviderInfo(new ComponentName(this.context.getPackageName(), STARTUP_PROVIDER_CLASS), 0);
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        return !(y45Var instanceof y45);
    }

    @Override // com.unity3d.ads.core.domain.capability.CapabilitiesChecker
    public List<InitializationRequestOuterClass.QuickCapabilities.Android.Capability> invoke() {
        ai3 y = te4.y();
        if (((Boolean) this.isClassPresent.invoke(WORK_MANAGER)).booleanValue()) {
            y.add(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_WORK_MANAGER);
        }
        if (((Boolean) this.isClassPresent.invoke(WORK_DATABASE_IMPL)).booleanValue()) {
            y.add(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_WORK_MANAGER_DATABASE_IMPL);
        }
        if (isStartupProviderRegistered()) {
            y.add(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_ANDROIDX_STARTUP_PROVIDER);
        }
        return te4.r(y);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ WorkManagerCapabilitiesChecker(Context context, ub2 ub2Var, int i, q71 q71Var) {
        this(context, (i & 2) != 0 ? AnonymousClass1.INSTANCE : ub2Var);
    }
}

package com.unity3d.ads.core.domain.capability;

import com.unity3d.ads.core.domain.IsCronetFallbackAvailable;
import defpackage.ai4;
import defpackage.q71;
import defpackage.te4;
import defpackage.ub2;
import defpackage.uc2;
import defpackage.zo0;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ClassPresenceCapabilitiesChecker implements CapabilitiesChecker {
    public static final Companion Companion = new Companion(null);
    private static final List<ai4> PROBES = te4.I(new ai4(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_CRONET, "org.chromium.net.CronetEngine"), new ai4(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_CRONET_FALLBACK_PROVIDER, IsCronetFallbackAvailable.FALLBACK_PROVIDER_CLASS), new ai4(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_OKHTTP3, "okhttp3.OkHttpClient"), new ai4(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_PLAY_SERVICES_BASE, "com.google.android.gms.common.GoogleApiAvailability"), new ai4(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_OMID, "com.iab.omid.library.unity3d.Omid"), new ai4(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_INSTALL_REFERRER, "com.android.installreferrer.api.InstallReferrerClient"), new ai4(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_APP_SET_ID, "com.google.android.gms.appset.AppSet"), new ai4(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_FIREBASE_INSTALLATIONS, "com.google.firebase.installations.FirebaseInstallations"), new ai4(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_BILLING_CLIENT, "com.android.billingclient.api.BillingClient"), new ai4(InitializationRequestOuterClass.QuickCapabilities.Android.Capability.CAPABILITY_AD_QUALITY, "com.ironsource.adqualitysdk.sdk.IronSourceAdQuality"));
    private final ub2 isClassPresent;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.unity3d.ads.core.domain.capability.ClassPresenceCapabilitiesChecker$1, reason: invalid class name */
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

    public /* synthetic */ ClassPresenceCapabilitiesChecker(ub2 ub2Var, int i, q71 q71Var) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : ub2Var);
    }

    @Override // com.unity3d.ads.core.domain.capability.CapabilitiesChecker
    public List<InitializationRequestOuterClass.QuickCapabilities.Android.Capability> invoke() {
        List<ai4> list = PROBES;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) this.isClassPresent.invoke((String) ((ai4) obj).y)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(zo0.V(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add((InitializationRequestOuterClass.QuickCapabilities.Android.Capability) ((ai4) obj2).x);
        }
        return arrayList2;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final List<ai4> getPROBES() {
            return ClassPresenceCapabilitiesChecker.PROBES;
        }

        private Companion() {
        }
    }

    public ClassPresenceCapabilitiesChecker(ub2 ub2Var) {
        ub2Var.getClass();
        this.isClassPresent = ub2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClassPresenceCapabilitiesChecker() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

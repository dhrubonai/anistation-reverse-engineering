package com.unity3d.ads.core.domain.capability;

import com.google.protobuf.kotlin.DslList;
import defpackage.d46;
import defpackage.dp0;
import defpackage.rb3;
import defpackage.y7;
import defpackage.yo0;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.QuickCapabilitiesKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AndroidGatherQuickCapabilities implements GatherQuickCapabilities {
    private final rb3 capabilities$delegate;
    private final List<CapabilitiesChecker> checkers;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidGatherQuickCapabilities(List<? extends CapabilitiesChecker> list) {
        list.getClass();
        this.checkers = list;
        this.capabilities$delegate = new d46(new y7(this, (byte) 7));
    }

    public static final InitializationRequestOuterClass.QuickCapabilities.Android capabilities_delegate$lambda$2(AndroidGatherQuickCapabilities androidGatherQuickCapabilities) {
        QuickCapabilitiesKt quickCapabilitiesKt = QuickCapabilitiesKt.INSTANCE;
        QuickCapabilitiesKt.AndroidKt.Dsl.Companion companion = QuickCapabilitiesKt.AndroidKt.Dsl.Companion;
        InitializationRequestOuterClass.QuickCapabilities.Android.Builder newBuilder = InitializationRequestOuterClass.QuickCapabilities.Android.newBuilder();
        newBuilder.getClass();
        QuickCapabilitiesKt.AndroidKt.Dsl _create = companion._create(newBuilder);
        DslList capabilities = _create.getCapabilities();
        List<CapabilitiesChecker> list = androidGatherQuickCapabilities.checkers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            dp0.Y(((CapabilitiesChecker) it.next()).invoke(), arrayList);
        }
        _create.addAllCapabilities(capabilities, yo0.I0(yo0.M0(arrayList)));
        return _create._build();
    }

    private final InitializationRequestOuterClass.QuickCapabilities.Android getCapabilities() {
        return (InitializationRequestOuterClass.QuickCapabilities.Android) this.capabilities$delegate.getValue();
    }

    @Override // com.unity3d.ads.core.domain.capability.GatherQuickCapabilities
    public InitializationRequestOuterClass.QuickCapabilities.Android invoke() {
        return getCapabilities();
    }
}

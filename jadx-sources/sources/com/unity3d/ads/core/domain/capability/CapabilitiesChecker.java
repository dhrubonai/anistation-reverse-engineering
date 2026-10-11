package com.unity3d.ads.core.domain.capability;

import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface CapabilitiesChecker {
    List<InitializationRequestOuterClass.QuickCapabilities.Android.Capability> invoke();
}

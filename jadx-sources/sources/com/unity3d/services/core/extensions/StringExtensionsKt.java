package com.unity3d.services.core.extensions;

import com.unity3d.services.UnityAdsConstants;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class StringExtensionsKt {
    public static final String toUnityMessage(String str) {
        if (str != null && str.length() != 0) {
            return zo5.l(UnityAdsConstants.Messages.MSG_UNITY_BASE, str);
        }
        return "[Unity Ads] Internal error";
    }
}

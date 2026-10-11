package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.extensions.StringExtensionsKt;
import defpackage.uz5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class GetAssetFileName {
    public final String invoke(String str) {
        str.getClass();
        String p0 = uz5.p0(str, '?');
        String n0 = uz5.n0('.', uz5.n0('/', p0, p0), "");
        if (!uz5.V(n0)) {
            return StringExtensionsKt.getSHA256Hash(str) + '.' + n0;
        }
        return StringExtensionsKt.getSHA256Hash(str);
    }
}

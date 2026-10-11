package com.unity3d.ads.core.domain;

import android.net.Uri;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    public String invoke(String str) {
        str.getClass();
        String uri = Uri.parse(str).buildUpon().clearQuery().build().toString();
        uri.getClass();
        return uri;
    }
}

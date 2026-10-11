package com.unity3d.ads.core.domain;

import defpackage.uz5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(RemoveUrlQuery removeUrlQuery) {
        removeUrlQuery.getClass();
        this.removeUrlQuery = removeUrlQuery;
    }

    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    public String invoke(String str) {
        str.getClass();
        String invoke = this.removeUrlQuery.invoke(str);
        if (invoke != null) {
            String n0 = uz5.n0('/', invoke, invoke);
            if (uz5.N(n0, '.')) {
                String n02 = uz5.n0('.', n0, n0);
                if (n02.length() != 0) {
                    return n02;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}

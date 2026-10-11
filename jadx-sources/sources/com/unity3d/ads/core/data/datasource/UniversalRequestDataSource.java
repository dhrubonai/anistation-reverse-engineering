package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import defpackage.i52;
import defpackage.pn6;
import defpackage.sw0;
import defpackage.vz0;
import defpackage.w11;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class UniversalRequestDataSource {
    private final UniversalRequestDataStoreProvider universalRequestStoreProvider;

    public UniversalRequestDataSource(UniversalRequestDataStoreProvider universalRequestDataStoreProvider) {
        universalRequestDataStoreProvider.getClass();
        this.universalRequestStoreProvider = universalRequestDataStoreProvider;
    }

    public final Object get(vz0 vz0Var) {
        return sw0.p(new i52(this.universalRequestStoreProvider.invoke().getData(), new UniversalRequestDataSource$get$2(null), (byte) 1), vz0Var);
    }

    public final Object remove(String str, vz0 vz0Var) {
        Object a = this.universalRequestStoreProvider.invoke().a(new UniversalRequestDataSource$remove$2(str, null), vz0Var);
        if (a == w11.x) {
            return a;
        }
        return pn6.a;
    }

    public final Object set(String str, ByteString byteString, vz0 vz0Var) {
        Object a = this.universalRequestStoreProvider.invoke().a(new UniversalRequestDataSource$set$2(str, byteString, null), vz0Var);
        if (a == w11.x) {
            return a;
        }
        return pn6.a;
    }
}

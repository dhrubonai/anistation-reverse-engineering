package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import defpackage.i41;
import defpackage.pn6;
import defpackage.vz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class FetchGLInfoDataMigration implements i41 {
    private final GetOpenGLRendererInfo getOpenGLRendererInfo;

    public FetchGLInfoDataMigration(GetOpenGLRendererInfo getOpenGLRendererInfo) {
        getOpenGLRendererInfo.getClass();
        this.getOpenGLRendererInfo = getOpenGLRendererInfo;
    }

    private final ByteString gatherOpenGLRendererInfo() {
        return this.getOpenGLRendererInfo.invoke();
    }

    @Override // defpackage.i41
    public Object cleanUp(vz0 vz0Var) {
        return pn6.a;
    }

    @Override // defpackage.i41
    public Object migrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, vz0 vz0Var) {
        ByteString byteString;
        try {
            byteString = gatherOpenGLRendererInfo();
        } catch (Exception unused) {
            byteString = ByteString.EMPTY;
            byteString.getClass();
        }
        ByteStringStoreOuterClass.ByteStringStore build = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(byteString).build();
        build.getClass();
        return build;
    }

    @Override // defpackage.i41
    public Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, vz0 vz0Var) {
        return Boolean.valueOf(byteStringStore.getData().isEmpty());
    }
}

package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import defpackage.b06;
import defpackage.jc2;
import defpackage.vz0;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidLocalCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    public AndroidLocalCacheDataSource(CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl) {
        createFile.getClass();
        getFileExtensionFromUrl.getClass();
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
    }

    public final CreateFile getCreateFile() {
        return this.createFile;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, int i, jc2 jc2Var, vz0 vz0Var) {
        String str3;
        String str4;
        String str5;
        int i2;
        File invoke = this.createFile.invoke(file, str);
        if (invoke.exists()) {
            String name = invoke.getName();
            name.getClass();
            if (!b06.A(name, ".part", false)) {
                if (str2 != null && str2.length() != 0) {
                    str3 = this.getFileExtensionFromUrl.invoke(str2);
                } else {
                    str3 = null;
                }
                if (str2 == null) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (str3 == null) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                long length = invoke.length();
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                return new CacheResult.Success(new CachedFile(str4, str, invoke, str5, length, null, i2, 32, null), CacheSource.LOCAL);
            }
        }
        return new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL, null, 4, null);
    }

    public final GetFileExtensionFromUrl getGetFileExtensionFromUrl() {
        return this.getFileExtensionFromUrl;
    }
}

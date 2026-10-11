package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CachedFile;
import defpackage.jc2;
import defpackage.ov3;
import defpackage.vz0;
import org.json.JSONArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface CacheRepository {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i, int i2, jc2 jc2Var, vz0 vz0Var, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 2) != 0) {
                    jSONArray = null;
                }
                if ((i3 & 4) != 0) {
                    i = 0;
                }
                if ((i3 & 8) != 0) {
                    i2 = Integer.MAX_VALUE;
                }
                if ((i3 & 16) != 0) {
                    jc2Var = null;
                }
                return cacheRepository.getFile(str, jSONArray, i, i2, jc2Var, vz0Var);
            }
            ov3.g("Super calls with default arguments not supported in this target, function: getFile");
            return null;
        }

        public static /* synthetic */ Object getWebviewFile$default(CacheRepository cacheRepository, String str, String str2, boolean z, vz0 vz0Var, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                return cacheRepository.getWebviewFile(str, str2, z, vz0Var);
            }
            ov3.g("Super calls with default arguments not supported in this target, function: getWebviewFile");
            return null;
        }
    }

    Object clearCache(vz0 vz0Var);

    Object doesFileExist(String str, vz0 vz0Var);

    Object getCacheSize(vz0 vz0Var);

    Object getFile(String str, JSONArray jSONArray, int i, int i2, jc2 jc2Var, vz0 vz0Var);

    Object getWebviewFile(String str, String str2, boolean z, vz0 vz0Var);

    Object getWebviewFileFromDisk(String str, String str2, vz0 vz0Var);

    boolean removeFile(CachedFile cachedFile);

    Object retrieveFile(String str, vz0 vz0Var);
}

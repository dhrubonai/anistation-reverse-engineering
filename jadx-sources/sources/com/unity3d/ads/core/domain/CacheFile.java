package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import defpackage.jc2;
import defpackage.ov3;
import defpackage.vz0;
import org.json.JSONArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface CacheFile {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(CacheFile cacheFile, String str, AdObject adObject, JSONArray jSONArray, int i, int i2, jc2 jc2Var, vz0 vz0Var, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 16) != 0) {
                    i2 = Integer.MAX_VALUE;
                }
                int i4 = i2;
                if ((i3 & 32) != 0) {
                    jc2Var = null;
                }
                return cacheFile.invoke(str, adObject, jSONArray, i, i4, jc2Var, vz0Var);
            }
            ov3.g("Super calls with default arguments not supported in this target, function: invoke");
            return null;
        }
    }

    Object invoke(String str, AdObject adObject, JSONArray jSONArray, int i, int i2, jc2 jc2Var, vz0 vz0Var);
}

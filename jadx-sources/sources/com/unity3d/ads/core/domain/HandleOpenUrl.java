package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import defpackage.ov3;
import defpackage.vz0;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface HandleOpenUrl {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(HandleOpenUrl handleOpenUrl, AdObject adObject, String str, String str2, String str3, Map map, boolean z, vz0 vz0Var, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    str3 = "android.intent.action.VIEW";
                }
                String str4 = str3;
                if ((i & 16) != 0) {
                    map = null;
                }
                Map map2 = map;
                if ((i & 32) != 0) {
                    z = false;
                }
                return handleOpenUrl.invoke(adObject, str, str2, str4, map2, z, vz0Var);
            }
            ov3.g("Super calls with default arguments not supported in this target, function: invoke");
            return null;
        }
    }

    Object invoke(AdObject adObject, String str, String str2, String str3, Map<String, ? extends Object> map, boolean z, vz0 vz0Var);
}

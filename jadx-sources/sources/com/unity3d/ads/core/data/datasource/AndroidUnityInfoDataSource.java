package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.preferences.AndroidPreferences;
import defpackage.sb2;
import defpackage.uz5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidUnityInfoDataSource {
    private final sb2 contextProvider;

    public AndroidUnityInfoDataSource(sb2 sb2Var) {
        sb2Var.getClass();
        this.contextProvider = sb2Var;
    }

    private final String getPlayerPrefId(String str) {
        String packageName;
        String string;
        Context context = (Context) this.contextProvider.invoke();
        if (context == null || (packageName = context.getPackageName()) == null || (string = AndroidPreferences.getString(packageName.concat(".v2.playerprefs"), str)) == null || uz5.V(string)) {
            return null;
        }
        return string;
    }

    public final String getUnityInstallationId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_INSTALLATION_ID);
    }

    public final String getUnityMegaSessionId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_MEGA_SESSION_ID);
    }
}

package com.unity3d.ads.core.configuration;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidManifestStringPropertyReader {
    private final Context context;

    public AndroidManifestStringPropertyReader(Context context) {
        context.getClass();
        this.context = context;
    }

    public final String getPropertyByName(String str) {
        str.getClass();
        try {
            return this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData.getString(str);
        } catch (Exception unused) {
            return null;
        }
    }
}

package com.unity3d.ads.core.configuration;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidManifestIntPropertyReader {
    private final Context context;

    public AndroidManifestIntPropertyReader(Context context) {
        context.getClass();
        this.context = context;
    }

    public final Integer getPropertyByName(String str) {
        Bundle bundle;
        Integer valueOf;
        str.getClass();
        try {
            bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            valueOf = Integer.valueOf(bundle.getInt(str));
        } catch (Exception unused) {
        }
        if (!bundle.containsKey(str)) {
            return null;
        }
        return valueOf;
    }
}

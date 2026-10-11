package com.unity3d.services.core.network.core;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CronetEngineBuilderFactory {
    public final CronetEngine.Builder createCronetEngineBuilder(Context context) {
        context.getClass();
        return new CronetEngine.Builder(context);
    }
}

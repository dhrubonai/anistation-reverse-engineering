package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.WebviewConfigurationStore;
import defpackage.i52;
import defpackage.pn6;
import defpackage.sw0;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w41;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WebviewConfigurationDataSource {
    private final w41 webviewConfigurationStore;

    public WebviewConfigurationDataSource(w41 w41Var) {
        w41Var.getClass();
        this.webviewConfigurationStore = w41Var;
    }

    public final Object get(vz0 vz0Var) {
        return sw0.p(new i52(this.webviewConfigurationStore.getData(), new WebviewConfigurationDataSource$get$2(null), (byte) 1), vz0Var);
    }

    public final Object set(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, vz0 vz0Var) {
        Object a = this.webviewConfigurationStore.a(new WebviewConfigurationDataSource$set$2(webViewConfigurationStore, null), vz0Var);
        if (a == w11.x) {
            return a;
        }
        return pn6.a;
    }
}

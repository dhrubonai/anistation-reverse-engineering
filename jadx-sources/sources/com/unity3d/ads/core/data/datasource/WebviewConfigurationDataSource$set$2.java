package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.WebviewConfigurationStore;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebviewConfigurationDataSource$set$2 extends t36 implements ic2 {
    final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewConfigurationDataSource$set$2(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, vz0 vz0Var) {
        super(2, vz0Var);
        this.$data = webViewConfigurationStore;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new WebviewConfigurationDataSource$set$2(this.$data, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, vz0 vz0Var) {
        return ((WebviewConfigurationDataSource$set$2) create(webViewConfigurationStore, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            return this.$data;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

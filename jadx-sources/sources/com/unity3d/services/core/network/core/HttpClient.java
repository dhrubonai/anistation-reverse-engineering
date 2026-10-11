package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import defpackage.ov3;
import defpackage.vz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface HttpClient {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object execute$default(HttpClient httpClient, HttpRequest httpRequest, boolean z, vz0 vz0Var, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return httpClient.execute(httpRequest, z, vz0Var);
            }
            ov3.g("Super calls with default arguments not supported in this target, function: execute");
            return null;
        }
    }

    Object execute(HttpRequest httpRequest, boolean z, vz0 vz0Var);

    HttpResponse executeBlocking(HttpRequest httpRequest);
}

package com.unity3d.ads.core.domain.adload;

import com.unity3d.ads.core.data.model.AdObject;
import defpackage.ic2;
import defpackage.v11;
import defpackage.vz0;
import gatewayprotocol.v1.AdResponseOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface PreShowWebViewStrategy {
    Object acquireForShow(v11 v11Var, AdObject adObject, vz0 vz0Var);

    Object onAdExpired(AdObject adObject, vz0 vz0Var);

    Object onLoadSuccess(AdObject adObject, String str, AdResponseOuterClass.AdResponse adResponse, v11 v11Var, ic2 ic2Var, vz0 vz0Var);

    Object onShowComplete(AdObject adObject, vz0 vz0Var);
}

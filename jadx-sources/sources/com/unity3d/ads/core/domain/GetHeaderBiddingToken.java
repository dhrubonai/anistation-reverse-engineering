package com.unity3d.ads.core.domain;

import com.unity3d.ads.TokenConfiguration;
import defpackage.ov3;
import defpackage.vz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface GetHeaderBiddingToken {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetHeaderBiddingToken getHeaderBiddingToken, int i, TokenConfiguration tokenConfiguration, vz0 vz0Var, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    tokenConfiguration = null;
                }
                return getHeaderBiddingToken.invoke(i, tokenConfiguration, vz0Var);
            }
            ov3.g("Super calls with default arguments not supported in this target, function: invoke");
            return null;
        }
    }

    Object invoke(int i, TokenConfiguration tokenConfiguration, vz0 vz0Var);
}

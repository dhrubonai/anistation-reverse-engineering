package com.unity3d.ads.core.domain;

import defpackage.ov3;
import defpackage.vz0;
import defpackage.ye6;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface InitializeBoldSDK {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(InitializeBoldSDK initializeBoldSDK, String str, ye6 ye6Var, vz0 vz0Var, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    ye6Var = null;
                }
                return initializeBoldSDK.invoke(str, ye6Var, vz0Var);
            }
            ov3.g("Super calls with default arguments not supported in this target, function: invoke");
            return null;
        }
    }

    Object invoke(String str, ye6 ye6Var, vz0 vz0Var);
}

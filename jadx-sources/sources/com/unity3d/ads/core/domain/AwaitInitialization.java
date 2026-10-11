package com.unity3d.ads.core.domain;

import defpackage.ov3;
import defpackage.vz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface AwaitInitialization {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(AwaitInitialization awaitInitialization, long j, vz0 vz0Var, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    j = Long.MAX_VALUE;
                }
                return awaitInitialization.invoke(j, vz0Var);
            }
            ov3.g("Super calls with default arguments not supported in this target, function: invoke");
            return null;
        }
    }

    Object invoke(long j, vz0 vz0Var);
}

package com.unity3d.ads.core.extensions;

import defpackage.ic2;
import defpackage.it1;
import defpackage.pj0;
import defpackage.ta0;
import defpackage.w42;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class FlowExtensionsKt {
    public static final <T> w42 timeoutAfter(w42 w42Var, long j, boolean z, ic2 ic2Var) {
        w42Var.getClass();
        ic2Var.getClass();
        return new pj0(new FlowExtensionsKt$timeoutAfter$1(j, z, ic2Var, w42Var, null), it1.x, -2, ta0.x, (byte) 0);
    }

    public static /* synthetic */ w42 timeoutAfter$default(w42 w42Var, long j, boolean z, ic2 ic2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return timeoutAfter(w42Var, j, z, ic2Var);
    }
}

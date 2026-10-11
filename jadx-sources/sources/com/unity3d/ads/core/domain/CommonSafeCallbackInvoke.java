package com.unity3d.ads.core.domain;

import defpackage.db;
import defpackage.n11;
import defpackage.sb2;
import defpackage.tl7;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonSafeCallbackInvoke implements SafeCallbackInvoke {
    private final n11 mainDispatcher;

    public CommonSafeCallbackInvoke(n11 n11Var) {
        n11Var.getClass();
        this.mainDispatcher = n11Var;
    }

    @Override // com.unity3d.ads.core.domain.SafeCallbackInvoke
    public void invoke(sb2 sb2Var) {
        sb2Var.getClass();
        tl7.z(db.b(this.mainDispatcher), null, null, new CommonSafeCallbackInvoke$invoke$1(sb2Var, null), 3);
    }
}

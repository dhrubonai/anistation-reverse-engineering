package com.unity3d.ads.adplayer;

import defpackage.db;
import defpackage.l11;
import defpackage.n11;
import defpackage.p11;
import defpackage.v11;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AdPlayerScope implements v11 {
    private final /* synthetic */ v11 $$delegate_0;
    private final n11 defaultDispatcher;
    private final p11 sdkErrorHandler;

    public AdPlayerScope(n11 n11Var, p11 p11Var) {
        n11Var.getClass();
        p11Var.getClass();
        this.$$delegate_0 = db.b(n11Var.plus(p11Var));
        this.defaultDispatcher = n11Var;
        this.sdkErrorHandler = p11Var;
    }

    @Override // defpackage.v11
    public l11 getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}

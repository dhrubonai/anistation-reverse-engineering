package com.unity3d.ads.core.utils;

import defpackage.ar0;
import defpackage.db;
import defpackage.h43;
import defpackage.iv5;
import defpackage.n11;
import defpackage.q26;
import defpackage.sb2;
import defpackage.tl7;
import defpackage.v11;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonCoroutineTimer implements CoroutineTimer {
    private final n11 dispatcher;
    private final ar0 job;
    private final v11 scope;

    public CommonCoroutineTimer(n11 n11Var) {
        n11Var.getClass();
        this.dispatcher = n11Var;
        q26 a = iv5.a();
        this.job = a;
        this.scope = db.b(n11Var.plus(a));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    public h43 start(long j, long j2, sb2 sb2Var) {
        sb2Var.getClass();
        return tl7.z(this.scope, this.dispatcher, null, new CommonCoroutineTimer$start$1(j, sb2Var, j2, null), 2);
    }
}

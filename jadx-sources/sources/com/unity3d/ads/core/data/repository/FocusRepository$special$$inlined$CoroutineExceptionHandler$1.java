package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.log.Logger;
import defpackage.l11;
import defpackage.o11;
import defpackage.p11;
import defpackage.t0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class FocusRepository$special$$inlined$CoroutineExceptionHandler$1 extends t0 implements p11 {
    final /* synthetic */ FocusRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusRepository$special$$inlined$CoroutineExceptionHandler$1(o11 o11Var, FocusRepository focusRepository) {
        super(o11Var);
        this.this$0 = focusRepository;
    }

    @Override // defpackage.p11
    public void handleException(l11 l11Var, Throwable th) {
        Logger logger;
        logger = this.this$0.logger;
        logger.error("Unity Ads failed to observe the focus state", th);
    }
}

package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy;
import com.unity3d.ads.core.log.Logger;
import defpackage.bx5;
import defpackage.db;
import defpackage.h43;
import defpackage.h98;
import defpackage.iv5;
import defpackage.n11;
import defpackage.o11;
import defpackage.om0;
import defpackage.p11;
import defpackage.pn6;
import defpackage.tl7;
import defpackage.v11;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CleanUpWhenOpportunityExpires {
    private final p11 coroutineExceptionHandler;
    private final v11 coroutineScope;
    private final Logger logger;
    private final PreShowWebViewStrategy preShowStrategy;

    public CleanUpWhenOpportunityExpires(n11 n11Var, Logger logger, PreShowWebViewStrategy preShowWebViewStrategy) {
        n11Var.getClass();
        logger.getClass();
        preShowWebViewStrategy.getClass();
        this.logger = logger;
        this.preShowStrategy = preShowWebViewStrategy;
        CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 = new CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(o11.x, this);
        this.coroutineExceptionHandler = cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineScope = db.b(tl7.L(iv5.a(), n11Var).plus(cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pn6 invoke$lambda$2(h43 h43Var, Throwable th) {
        h43Var.l(null);
        return pn6.a;
    }

    public final void invoke(AdObject adObject) {
        v11 adScope;
        adObject.getClass();
        if (adObject.getAdScope() != null) {
            bx5 z = tl7.z(this.coroutineScope, null, null, new CleanUpWhenOpportunityExpires$invoke$job$1(adObject, this, null), 3);
            AdPlayer adPlayer = adObject.getAdPlayer();
            if (adPlayer == null || (adScope = adPlayer.getScope()) == null) {
                adScope = adObject.getAdScope();
            }
            h98.w(adScope.getCoroutineContext()).l0(new om0(z, (byte) 0));
            return;
        }
        ze0.k("AdObject does not have an adScope.");
    }
}

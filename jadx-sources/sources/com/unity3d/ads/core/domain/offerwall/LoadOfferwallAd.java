package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import defpackage.pn6;
import defpackage.vz0;
import defpackage.w11;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class LoadOfferwallAd {
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(OfferwallManager offerwallManager) {
        offerwallManager.getClass();
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, vz0 vz0Var) {
        Object loadAd = this.offerwallManager.loadAd(str, vz0Var);
        if (loadAd == w11.x) {
            return loadAd;
        }
        return pn6.a;
    }
}

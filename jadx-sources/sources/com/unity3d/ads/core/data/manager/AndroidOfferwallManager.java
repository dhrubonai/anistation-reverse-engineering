package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import defpackage.e16;
import defpackage.l5;
import defpackage.mx0;
import defpackage.vz0;
import defpackage.w42;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidOfferwallManager implements OfferwallManager {
    private final Logger logger;
    private final OfferwallAdapterBridge offerwallBridge;

    public AndroidOfferwallManager(OfferwallAdapterBridge offerwallAdapterBridge, Logger logger) {
        offerwallAdapterBridge.getClass();
        logger.getClass();
        this.offerwallBridge = offerwallAdapterBridge;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object getVersion(vz0 vz0Var) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isAdReady(String str, vz0 vz0Var) {
        return Boolean.valueOf(this.offerwallBridge.isAdReady(str));
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isConnected(vz0 vz0Var) {
        return Boolean.valueOf(this.offerwallBridge.isConnected());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadAd(java.lang.String r6, defpackage.vz0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = (com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.m37.N(r7)
            goto L62
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r3
        L2c:
            defpackage.m37.N(r7)
            com.unity3d.ads.core.log.Logger r7 = r5.logger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Offerwall Manager - loadAd: "
            r1.<init>(r4)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r7.debug(r1)
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r7 = r5.offerwallBridge
            fn5 r7 = r7.getOfferwallEventFlow()
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2 r1 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2
            r1.<init>(r5, r6, r3)
            e16 r5 = new e16
            r5.<init>(r7, r1)
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3 r7 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3
            r7.<init>(r6, r3)
            r0.label = r2
            java.lang.Object r7 = defpackage.sw0.q(r5, r7, r0)
            w11 r5 = defpackage.w11.x
            if (r7 != r5) goto L62
            return r5
        L62:
            r5 = r7
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r5 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r5
            com.unity3d.services.ads.offerwall.OfferwallEvent r5 = r5.getOfferwallEvent()
            com.unity3d.services.ads.offerwall.OfferwallEvent r6 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS
            if (r5 == r6) goto L6e
            r3 = r7
        L6e:
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r3 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r3
            if (r3 == 0) goto L9c
            com.unity3d.ads.core.data.model.exception.LoadException r5 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.Integer r6 = r3.getErrorCode()
            if (r6 == 0) goto L7f
            int r6 = r6.intValue()
            goto L80
        L7f:
            r6 = 0
        L80:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Error loading offerwall ad: "
            r7.<init>(r0)
            java.lang.String r0 = r3.getErrorMessage()
            if (r0 != 0) goto L91
            com.unity3d.services.ads.offerwall.OfferwallEvent r0 = r3.getOfferwallEvent()
        L91:
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r5.<init>(r6, r7)
            throw r5
        L9c:
            pn6 r5 = defpackage.pn6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd(java.lang.String, vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public w42 showAd(String str) {
        str.getClass();
        this.logger.debug("Offerwall Manager - showAd: ".concat(str));
        return new mx0(new l5(new e16(this.offerwallBridge.getOfferwallEventFlow(), new AndroidOfferwallManager$showAd$1(this, str, null)), new AndroidOfferwallManager$showAd$2(null), null, (byte) 10), (byte) 5);
    }
}

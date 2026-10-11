package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import defpackage.iv;
import defpackage.k52;
import defpackage.l0;
import defpackage.pn6;
import defpackage.sx5;
import defpackage.tx5;
import defpackage.v11;
import defpackage.x44;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AdRevenueObserver {
    private final AdRevenueRepository adRevenueRepository;
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final x44 isRunning;
    private final Logger logger;
    private final v11 scope;

    public AdRevenueObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, v11 v11Var, AdRevenueRepository adRevenueRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, Logger logger) {
        getUniversalRequestForPayLoad.getClass();
        v11Var.getClass();
        adRevenueRepository.getClass();
        gatewayClient.getClass();
        getRequestPolicy.getClass();
        logger.getClass();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = v11Var;
        this.adRevenueRepository = adRevenueRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.logger = logger;
        this.isRunning = tx5.a(Boolean.FALSE);
    }

    public static final pn6 invoke$lambda$1(AdRevenueObserver adRevenueObserver, Throwable th) {
        x44 x44Var = adRevenueObserver.isRunning;
        Boolean bool = Boolean.FALSE;
        sx5 sx5Var = (sx5) x44Var;
        sx5Var.getClass();
        sx5Var.l(null, bool);
        return pn6.a;
    }

    public final void invoke() {
        sx5 sx5Var;
        Object value;
        Boolean bool;
        x44 x44Var = this.isRunning;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!sx5Var.j(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        iv.G(new k52(this.adRevenueRepository.getAdRevenueEvents(), new AdRevenueObserver$invoke$2(this, null), (byte) 2), this.scope).l0(new l0(this, (byte) 3));
    }
}

package com.unity3d.ads.core.data.datasource;

import android.os.Bundle;
import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.data.model.AdRevenueOrigin;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.log.Logger;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$onMessageReceived$2", f = "MaxAdRevenueListener.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MaxAdRevenueListener$onMessageReceived$2 extends t36 implements ic2 {
    final /* synthetic */ Bundle $messageData;
    Object L$0;
    int label;
    final /* synthetic */ MaxAdRevenueListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxAdRevenueListener$onMessageReceived$2(MaxAdRevenueListener maxAdRevenueListener, Bundle bundle, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = maxAdRevenueListener;
        this.$messageData = bundle;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new MaxAdRevenueListener$onMessageReceived$2(this.this$0, this.$messageData, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((MaxAdRevenueListener$onMessageReceived$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        AdRevenueData parseRevenueBundle;
        Logger logger2;
        HandleAdRevenueEvent handleAdRevenueEvent;
        Logger logger3;
        int i = this.label;
        try {
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.trace("Failed to process ad revenue event", e);
        }
        if (i != 0) {
            if (i == 1) {
                parseRevenueBundle = (AdRevenueData) this.L$0;
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            parseRevenueBundle = this.this$0.parseRevenueBundle(this.$messageData);
            MaxAdRevenueListener maxAdRevenueListener = this.this$0;
            if (parseRevenueBundle != null) {
                handleAdRevenueEvent = maxAdRevenueListener.handleAdRevenueEvent;
                ClientInfoOuterClass.MediationProvider mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
                AdRevenueOrigin adRevenueOrigin = AdRevenueOrigin.AUTOMATIC_COLLECTION;
                this.L$0 = parseRevenueBundle;
                this.label = 1;
                Object invoke = handleAdRevenueEvent.invoke(parseRevenueBundle, mediationProvider, adRevenueOrigin, this);
                w11 w11Var = w11.x;
                if (invoke == w11Var) {
                    return w11Var;
                }
            } else {
                logger2 = maxAdRevenueListener.logger;
                Logger.DefaultImpls.trace$default(logger2, "Failed to parse revenue event", null, 2, null);
                return pn6.a;
            }
        }
        logger3 = this.this$0.logger;
        Logger.DefaultImpls.trace$default(logger3, "Ad revenue event sent: revenue=" + parseRevenueBundle.getRevenue() + ", network=" + parseRevenueBundle.getNetworkName(), null, 2, null);
        return pn6.a;
    }
}

package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pg0;
import defpackage.pn6;
import defpackage.qg0;
import defpackage.sx5;
import defpackage.t36;
import defpackage.tx5;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.wc7;
import defpackage.x44;
import defpackage.ze0;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransactionEventManager$invoke$1 extends t36 implements ic2 {
    Object L$0;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEventManager$invoke$1(TransactionEventManager transactionEventManager, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = transactionEventManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new TransactionEventManager$invoke$1(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((TransactionEventManager$invoke$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        BillingClientAdapter billingClientAdapter;
        BillingClientAdapter billingClientAdapter2;
        SessionRepository sessionRepository;
        BillingClientAdapter billingClientAdapter3;
        BillingClientAdapter billingClientAdapter4;
        int i = this.label;
        final byte b = 1;
        try {
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.trace(TransactionEventManager.BILLING_SERVICE_UNAVAILABLE, e);
        }
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            billingClientAdapter = this.this$0.billingClientAdapter;
            if (!billingClientAdapter.isInitialized()) {
                final TransactionEventManager transactionEventManager = this.this$0;
                this.L$0 = transactionEventManager;
                this.label = 1;
                final qg0 qg0Var = new qg0(1, wc7.z(this));
                qg0Var.t();
                billingClientAdapter2 = transactionEventManager.billingClientAdapter;
                billingClientAdapter2.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                    private final x44 hasBeenResumed = tx5.a(Boolean.FALSE);

                    private final void tryResume() {
                        sx5 sx5Var;
                        Object value;
                        Boolean bool;
                        if (pg0.this.isActive()) {
                            x44 x44Var = this.hasBeenResumed;
                            do {
                                sx5Var = (sx5) x44Var;
                                value = sx5Var.getValue();
                                bool = (Boolean) value;
                                bool.getClass();
                            } while (!sx5Var.j(value, Boolean.TRUE));
                            if (!bool.booleanValue()) {
                                pg0.this.resumeWith(pn6.a);
                            }
                        }
                    }

                    private final void tryResumeWithException(Exception exc) {
                        sx5 sx5Var;
                        Object value;
                        Boolean bool;
                        if (pg0.this.isActive()) {
                            x44 x44Var = this.hasBeenResumed;
                            do {
                                sx5Var = (sx5) x44Var;
                                value = sx5Var.getValue();
                                bool = (Boolean) value;
                                bool.getClass();
                            } while (!sx5Var.j(value, Boolean.TRUE));
                            if (!bool.booleanValue()) {
                                pg0.this.resumeWith(m37.l(exc));
                            }
                        }
                    }

                    public final x44 getHasBeenResumed() {
                        return this.hasBeenResumed;
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingServiceDisconnected() {
                        tryResumeWithException(new TransactionException("Billing service disconnected"));
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingSetupFinished(BillingResultBridge billingResultBridge) {
                        billingResultBridge.getClass();
                        if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK) {
                            tryResumeWithException(new TransactionException("Billing setup failed"));
                        } else {
                            tryResume();
                        }
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                    public void onIsAlreadyInitialized() {
                        tryResume();
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                    public void onPurchaseUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
                        billingResultBridge.getClass();
                        transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
                    }
                });
                Object r = qg0Var.r();
                w11 w11Var = w11.x;
                if (r == w11Var) {
                    return w11Var;
                }
            }
            return pn6.a;
        }
        sessionRepository = this.this$0.sessionRepository;
        if (sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
            billingClientAdapter3 = this.this$0.billingClientAdapter;
            final TransactionEventManager transactionEventManager2 = this.this$0;
            final byte b2 = 0;
            billingClientAdapter3.queryPurchasesAsync("inapp", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                    byte b3 = b2;
                    TransactionEventManager transactionEventManager3 = transactionEventManager2;
                    switch (b3) {
                        case 0:
                            TransactionEventManager$invoke$1.invokeSuspend$lambda$1(transactionEventManager3, billingResultBridge, list);
                            return;
                        default:
                            TransactionEventManager$invoke$1.invokeSuspend$lambda$2(transactionEventManager3, billingResultBridge, list);
                            return;
                    }
                }
            });
            billingClientAdapter4 = this.this$0.billingClientAdapter;
            final TransactionEventManager transactionEventManager3 = this.this$0;
            billingClientAdapter4.queryPurchasesAsync("subs", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                    byte b3 = b;
                    TransactionEventManager transactionEventManager32 = transactionEventManager3;
                    switch (b3) {
                        case 0:
                            TransactionEventManager$invoke$1.invokeSuspend$lambda$1(transactionEventManager32, billingResultBridge, list);
                            return;
                        default:
                            TransactionEventManager$invoke$1.invokeSuspend$lambda$2(transactionEventManager32, billingResultBridge, list);
                            return;
                    }
                }
            });
        }
        return pn6.a;
    }
}

package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.gatewayclient.GatewayClient;
import defpackage.iv;
import defpackage.k52;
import defpackage.sx5;
import defpackage.tx5;
import defpackage.v11;
import defpackage.x44;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class TransactionEventObserver {
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ByteStringDataSource iapTransactionStore;
    private final x44 isRunning;
    private final v11 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final TransactionEventRepository transactionEventRepository;

    public TransactionEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, v11 v11Var, TransactionEventRepository transactionEventRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, ByteStringDataSource byteStringDataSource, SendDiagnosticEvent sendDiagnosticEvent) {
        getUniversalRequestForPayLoad.getClass();
        v11Var.getClass();
        transactionEventRepository.getClass();
        gatewayClient.getClass();
        getRequestPolicy.getClass();
        byteStringDataSource.getClass();
        sendDiagnosticEvent.getClass();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = v11Var;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = byteStringDataSource;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.isRunning = tx5.a(Boolean.FALSE);
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
        iv.G(new k52(this.transactionEventRepository.getTransactionEvents(), new TransactionEventObserver$invoke$2(this, null), (byte) 2), this.scope);
    }
}

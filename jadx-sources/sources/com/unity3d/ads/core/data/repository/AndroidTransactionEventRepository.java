package com.unity3d.ads.core.data.repository;

import defpackage.fn5;
import defpackage.h41;
import defpackage.in5;
import defpackage.jn5;
import defpackage.t44;
import defpackage.ta0;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidTransactionEventRepository implements TransactionEventRepository {
    private final t44 _transactionEvents;
    private final fn5 transactionEvents;

    public AndroidTransactionEventRepository() {
        in5 a = jn5.a(10, 10, ta0.y);
        this._transactionEvents = a;
        this.transactionEvents = h41.c(a);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
        transactionEventRequest.getClass();
        this._transactionEvents.d(transactionEventRequest);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public fn5 getTransactionEvents() {
        return this.transactionEvents;
    }
}

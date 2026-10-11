package com.unity3d.ads.core.extensions;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class TransactionStateExtensionsKt {
    public static final TransactionEventRequestOuterClass.TransactionState fromPurchaseState(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return TransactionEventRequestOuterClass.TransactionState.UNRECOGNIZED;
                    }
                    return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_DEFERRED;
                }
                return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PENDING;
            }
            return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_CANCELED;
        }
        return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PURCHASED;
    }
}

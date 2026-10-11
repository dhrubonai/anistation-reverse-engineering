package com.unity3d.ads.core.domain.events;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransactionEventObserver$invoke$2 extends t36 implements ic2 {
    long J$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransactionEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEventObserver$invoke$2(TransactionEventObserver transactionEventObserver, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = transactionEventObserver;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        TransactionEventObserver$invoke$2 transactionEventObserver$invoke$2 = new TransactionEventObserver$invoke$2(this.this$0, vz0Var);
        transactionEventObserver$invoke$2.L$0 = obj;
        return transactionEventObserver$invoke$2;
    }

    @Override // defpackage.ic2
    public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, vz0 vz0Var) {
        return ((TransactionEventObserver$invoke$2) create(transactionEventRequest, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:2)|(1:(1:(1:(5:7|8|9|10|11)(2:14|15))(9:16|17|18|19|(1:21)|31|9|10|11))(4:32|33|34|35))(5:43|44|45|(1:47)|23)|36|37|(2:39|23)|19|(0)|31|9|10|11|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c0, code lost:
    
        if (r0.set(r1, r17) == r10) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
    
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0113, code lost:
    
        r1 = r0.getClass().getSimpleName();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[Catch: UnityAdsNetworkException -> 0x00c3, TRY_LEAVE, TryCatch #0 {UnityAdsNetworkException -> 0x00c3, blocks: (B:19:0x0095, B:21:0x009d, B:37:0x0070), top: B:36:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v17, types: [long] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [long] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

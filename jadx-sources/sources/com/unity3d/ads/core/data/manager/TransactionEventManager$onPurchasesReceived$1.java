package com.unity3d.ads.core.data.manager;

import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", l = {131, 134, 147, 150}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransactionEventManager$onPurchasesReceived$1 extends t36 implements ic2 {
    final /* synthetic */ List<PurchaseBridge> $purchases;
    final /* synthetic */ TransactionEventRequestOuterClass.TransactionOrigin $transactionOrigin;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransactionEventManager$onPurchasesReceived$1(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, vz0 vz0Var) {
        super(2, vz0Var);
        this.$purchases = list;
        this.this$0 = transactionEventManager;
        this.$transactionOrigin = transactionOrigin;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new TransactionEventManager$onPurchasesReceived$1(this.$purchases, this.this$0, this.$transactionOrigin, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((TransactionEventManager$onPurchasesReceived$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:19|(3:20|21|22)|23|24|(1:26)|27|28|29|30|31|32|33|34|(2:36|(19:38|39|40|41|42|43|44|(1:46)|(2:89|90)(1:48)|49|(1:51)(1:88)|(2:57|(5:59|60|61|62|(6:65|66|67|68|69|(13:71|23|24|(0)|27|28|29|30|31|32|33|34|(2:99|(1:101)(1:103))(0)))(10:64|27|28|29|30|31|32|33|34|(0)(0))))|82|83|84|32|33|34|(0)(0))(2:97|98))(0)|18) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:38|(1:39)|40|41|42|43|44|(1:46)|(2:89|90)(1:48)|49|(1:51)(1:88)|(2:57|(5:59|60|61|62|(6:65|66|67|68|69|(13:71|23|24|(0)|27|28|29|30|31|32|33|34|(2:99|(1:101)(1:103))(0)))(10:64|27|28|29|30|31|32|33|34|(0)(0))))|82|83|84|32|33|34|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:38|39|40|41|42|43|44|(1:46)|(2:89|90)(1:48)|49|(1:51)(1:88)|(2:57|(5:59|60|61|62|(6:65|66|67|68|69|(13:71|23|24|(0)|27|28|29|30|31|32|33|34|(2:99|(1:101)(1:103))(0)))(10:64|27|28|29|30|31|32|33|34|(0)(0))))|82|83|84|32|33|34|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:65)|66|67|68|69|(13:71|23|24|(0)|27|28|29|30|31|32|33|34|(2:99|(1:101)(1:103))(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0230, code lost:
    
        if (r2 == r9) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0255, code lost:
    
        if (r1 == r9) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b0, code lost:
    
        r12 = r14;
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b3, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d2, code lost:
    
        r15 = r1;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cf, code lost:
    
        r4 = r16;
        r6 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019b A[Catch: Exception -> 0x01ad, TryCatch #2 {Exception -> 0x01ad, blocks: (B:24:0x0195, B:26:0x019b, B:27:0x01ba), top: B:23:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01b7 -> B:27:0x01ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0192 -> B:23:0x0195). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01e8 -> B:31:0x01c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01d8 -> B:32:0x01e3). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

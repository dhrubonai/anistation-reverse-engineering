package com.unity3d.services.ads.offerwall;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1", f = "OfferwallAdapterBridge.kt", l = {80, 86}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$1 extends t36 implements ic2 {
    final /* synthetic */ boolean $placementAvailable;
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$1(boolean z, OfferwallAdapterBridge offerwallAdapterBridge, String str, vz0 vz0Var) {
        super(2, vz0Var);
        this.$placementAvailable = z;
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(this.$placementAvailable, this.this$0, this.$placementName, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r13.emit(r5, r12) == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r13.emit(r5, r12) == r4) goto L28;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L12
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r12)
            r12 = 0
            return r12
        L12:
            defpackage.m37.N(r13)
            goto L71
        L16:
            defpackage.m37.N(r13)
            boolean r13 = r12.$placementAvailable
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r0 = r12.this$0
            java.lang.String r3 = ""
            w11 r4 = defpackage.w11.x
            if (r13 == 0) goto L43
            t44 r13 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$get_offerwallEventFlow$p(r0)
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r5 = new com.unity3d.ads.core.domain.offerwall.OfferwallEventData
            com.unity3d.services.ads.offerwall.OfferwallEvent r6 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS
            java.lang.String r0 = r12.$placementName
            if (r0 != 0) goto L31
            r7 = r3
            goto L32
        L31:
            r7 = r0
        L32:
            r10 = 12
            r11 = 0
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.label = r2
            java.lang.Object r12 = r13.emit(r5, r12)
            if (r12 != r4) goto L71
            goto L70
        L43:
            java.util.HashMap r13 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$getPlacementsMap$p(r0)
            java.lang.String r0 = r12.$placementName
            if (r0 != 0) goto L4c
            r0 = r3
        L4c:
            r13.remove(r0)
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r13 = r12.this$0
            t44 r13 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$get_offerwallEventFlow$p(r13)
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r5 = new com.unity3d.ads.core.domain.offerwall.OfferwallEventData
            com.unity3d.services.ads.offerwall.OfferwallEvent r6 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_FAILED
            java.lang.String r0 = r12.$placementName
            if (r0 != 0) goto L5f
            r7 = r3
            goto L60
        L5f:
            r7 = r0
        L60:
            r10 = 12
            r11 = 0
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.label = r1
            java.lang.Object r12 = r13.emit(r5, r12)
            if (r12 != r4) goto L71
        L70:
            return r4
        L71:
            pn6 r12 = defpackage.pn6.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import defpackage.ic2;
import defpackage.mc2;
import defpackage.pn6;
import defpackage.sb2;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {202, 208, 209}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LegacyShowUseCase$invoke$2 extends t36 implements ic2 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ NativeConfigurationOuterClass.NativeStartMode $nativeStartMode;
    final /* synthetic */ String $placement;
    final /* synthetic */ mc2 $reportShowError;
    final /* synthetic */ boolean $useTimeout;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$invoke$2(NativeConfigurationOuterClass.NativeStartMode nativeStartMode, LegacyShowUseCase legacyShowUseCase, AdObject adObject, boolean z, mc2 mc2Var, String str, vz0 vz0Var) {
        super(2, vz0Var);
        this.$nativeStartMode = nativeStartMode;
        this.this$0 = legacyShowUseCase;
        this.$adObject = adObject;
        this.$useTimeout = z;
        this.$reportShowError = mc2Var;
        this.$placement = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        LegacyShowUseCase$invoke$2 legacyShowUseCase$invoke$2 = new LegacyShowUseCase$invoke$2(this.$nativeStartMode, this.this$0, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, vz0Var);
        legacyShowUseCase$invoke$2.L$0 = obj;
        return legacyShowUseCase$invoke$2;
    }

    @Override // defpackage.ic2
    public final Object invoke(sb2 sb2Var, vz0 vz0Var) {
        return ((LegacyShowUseCase$invoke$2) create(sb2Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (r14.terminate(r4, r13) == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r14 == r5) goto L34;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            pn6 r1 = defpackage.pn6.a
            r2 = 3
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r0 == 0) goto L32
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L21
            if (r0 != r2) goto L1a
            java.lang.Object r13 = r13.L$0
            sb2 r13 = (defpackage.sb2) r13
            defpackage.m37.N(r14)
            goto Lc0
        L1a:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r13)
            r13 = 0
            return r13
        L21:
            java.lang.Object r0 = r13.L$0
            sb2 r0 = (defpackage.sb2) r0
            defpackage.m37.N(r14)
            goto L9b
        L2a:
            java.lang.Object r0 = r13.L$0
            sb2 r0 = (defpackage.sb2) r0
            defpackage.m37.N(r14)
            goto L84
        L32:
            defpackage.m37.N(r14)
            java.lang.Object r14 = r13.L$0
            r0 = r14
            sb2 r0 = (defpackage.sb2) r0
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeStartMode r14 = r13.$nativeStartMode
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeStartMode r6 = gatewayprotocol.v1.NativeConfigurationOuterClass.NativeStartMode.NATIVE_START_MODE_ON_SHOW
            if (r14 == r6) goto L47
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeStartMode r6 = gatewayprotocol.v1.NativeConfigurationOuterClass.NativeStartMode.NATIVE_START_MODE_ON_DISPLAY
            if (r14 != r6) goto L45
            goto L47
        L45:
            r14 = r4
            goto L48
        L47:
            r14 = r3
        L48:
            com.unity3d.ads.core.domain.LegacyShowUseCase r6 = r13.this$0
            x44 r6 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getStartedCount$p(r6)
            sx5 r6 = (defpackage.sx5) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 >= r14) goto Lc3
            com.unity3d.ads.core.domain.LegacyShowUseCase r14 = r13.this$0
            x44 r14 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getTimeoutCancellationRequested$p(r14)
            sx5 r14 = (defpackage.sx5) r14
            java.lang.Object r14 = r14.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L71
            goto Lc3
        L71:
            com.unity3d.ads.core.domain.LegacyShowUseCase r14 = r13.this$0
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r6 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT
            com.unity3d.ads.core.data.model.AdObject r7 = r13.$adObject
            r13.L$0 = r0
            r13.label = r4
            java.lang.String r4 = "timeout"
            java.lang.Object r14 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$sendOperativeError(r14, r6, r4, r7, r13)
            if (r14 != r5) goto L84
            goto Lbe
        L84:
            boolean r14 = r13.$useTimeout
            if (r14 == 0) goto Lc3
            com.unity3d.ads.core.domain.LegacyShowUseCase r14 = r13.this$0
            com.unity3d.ads.core.domain.Show r14 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getShow$p(r14)
            com.unity3d.ads.core.data.model.AdObject r4 = r13.$adObject
            r13.L$0 = r0
            r13.label = r3
            java.lang.Object r14 = r14.terminate(r4, r13)
            if (r14 != r5) goto L9b
            goto Lbe
        L9b:
            mc2 r6 = r13.$reportShowError
            com.unity3d.ads.UnityAds$UnityAdsShowError r8 = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r3 = "[UnityAds] Timeout while trying to show "
            r14.<init>(r3)
            java.lang.String r3 = r13.$placement
            r14.append(r3)
            java.lang.String r9 = r14.toString()
            r13.L$0 = r0
            r13.label = r2
            java.lang.String r7 = "timeout"
            r10 = 0
            r11 = 0
            r12 = r13
            java.lang.Object r13 = r6.invoke(r7, r8, r9, r10, r11, r12)
            if (r13 != r5) goto Lbf
        Lbe:
            return r5
        Lbf:
            r13 = r0
        Lc0:
            r13.invoke()
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

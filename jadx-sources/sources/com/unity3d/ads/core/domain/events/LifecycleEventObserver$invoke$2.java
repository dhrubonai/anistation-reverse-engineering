package com.unity3d.ads.core.domain.events;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.events.LifecycleEventObserver$invoke$2", f = "LifecycleEventObserver.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LifecycleEventObserver$invoke$2 extends t36 implements ic2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ LifecycleEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleEventObserver$invoke$2(LifecycleEventObserver lifecycleEventObserver, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = lifecycleEventObserver;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        LifecycleEventObserver$invoke$2 lifecycleEventObserver$invoke$2 = new LifecycleEventObserver$invoke$2(this.this$0, vz0Var);
        lifecycleEventObserver$invoke$2.Z$0 = ((Boolean) obj).booleanValue();
        return lifecycleEventObserver$invoke$2;
    }

    public final Object invoke(boolean z, vz0 vz0Var) {
        return ((LifecycleEventObserver$invoke$2) create(Boolean.valueOf(z), vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(1:2)|(1:(1:(1:(3:7|8|9)(2:11|12))(5:13|14|15|16|17))(2:23|24))(5:28|(1:30)(1:36)|31|32|(2:34|19)(1:35))|25|(2:27|19)|14|15|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e2, code lost:
    
        if (com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r6, null, r8, r9, r10, r11, 1, null) != r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e5, code lost:
    
        r14 = r11.this$0.logger;
        com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(r14, "Failed to send lifecycle event, likely due to network issues. Event will be dropped.", null, 2, null);
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.LifecycleEventObserver$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ic2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (vz0) obj2);
    }
}

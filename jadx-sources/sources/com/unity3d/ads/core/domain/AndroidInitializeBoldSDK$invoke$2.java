package com.unity3d.ads.core.domain;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ye6;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", l = {82, 85, 111}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidInitializeBoldSDK$invoke$2 extends t36 implements ic2 {
    final /* synthetic */ ye6 $publicApiEntry;
    final /* synthetic */ String $source;
    int I$0;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ AndroidInitializeBoldSDK this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", l = {86, 93, 99, 100}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ic2 {
        final /* synthetic */ boolean $isRetry;
        final /* synthetic */ String $source;
        long J$0;
        int label;
        final /* synthetic */ AndroidInitializeBoldSDK this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z, vz0 vz0Var) {
            super(2, vz0Var);
            this.this$0 = androidInitializeBoldSDK;
            this.$source = str;
            this.$isRetry = z;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, vz0Var);
        }

        @Override // defpackage.ic2
        public final Object invoke(v11 v11Var, vz0 vz0Var) {
            return ((AnonymousClass1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00cf, code lost:
        
            if (r1.invoke((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r0, r22) == r9) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
        
            if (r0 != r9) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
        
            if (r0 == r9) goto L29;
         */
        @Override // defpackage.h30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r5 = r22
                int r0 = r5.label
                r8 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                w11 r9 = defpackage.w11.x
                if (r0 == 0) goto L33
                if (r0 == r3) goto L2f
                if (r0 == r2) goto L27
                if (r0 == r1) goto L20
                if (r0 != r8) goto L19
                defpackage.m37.N(r23)
                goto Ld2
            L19:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ze0.m(r0)
                r0 = 0
                return r0
            L20:
                defpackage.m37.N(r23)
                r0 = r23
                goto Lc1
            L27:
                long r2 = r5.J$0
                defpackage.m37.N(r23)
                r0 = r23
                goto L7b
            L2f:
                defpackage.m37.N(r23)
                goto L46
            L33:
                defpackage.m37.N(r23)
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0 = r5.this$0
                java.lang.String r4 = r5.$source
                boolean r6 = r5.$isRetry
                r5.label = r3
                java.lang.Object r0 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationStart(r0, r4, r6, r5)
                if (r0 != r9) goto L46
                goto Ld1
            L46:
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0 = r5.this$0
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$checkCanInitialize(r0)
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0 = r5.this$0
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$warmStaticDeviceInfo(r0)
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0 = r5.this$0
                com.unity3d.ads.core.domain.ShouldUseFastInit r0 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getShouldUseFastInit$p(r0)
                boolean r0 = r0.invoke()
                if (r0 == 0) goto L65
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0 = r5.this$0
                com.unity3d.ads.core.domain.WarmNonInitSignals r0 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getWarmNonInitSignals$p(r0)
                r0.invoke()
            L65:
                long r3 = defpackage.j04.b()
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0 = r5.this$0
                com.unity3d.ads.core.domain.GetInitializationRequest r0 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetInitializeRequest$p(r0)
                r5.J$0 = r3
                r5.label = r2
                java.lang.Object r0 = r0.invoke(r5)
                if (r0 != r9) goto L7a
                goto Ld1
            L7a:
                r2 = r3
            L7b:
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r0 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r0
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r4 = r5.this$0
                com.unity3d.ads.core.domain.SendDiagnosticEvent r10 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getSendDiagnosticEvent$p(r4)
                double r2 = defpackage.h11.c(r2)
                java.lang.Double r12 = new java.lang.Double
                r12.<init>(r2)
                r19 = 252(0xfc, float:3.53E-43)
                r20 = 0
                java.lang.String r11 = "native_init_payload_build_time"
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r2 = r5.this$0
                com.unity3d.ads.core.domain.GetRequestPolicy r2 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetRequestPolicy$p(r2)
                com.unity3d.ads.gatewayclient.RequestPolicy r3 = r2.invoke()
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r2 = r5.this$0
                com.unity3d.ads.gatewayclient.GatewayClient r2 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGatewayClient$p(r2)
                com.unity3d.ads.core.data.model.OperationType r4 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION
                r5.label = r1
                r1 = 0
                r6 = 1
                r7 = 0
                r21 = r2
                r2 = r0
                r0 = r21
                java.lang.Object r0 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto Lc1
                goto Ld1
            Lc1:
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r0 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r0
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r1 = r5.this$0
                com.unity3d.ads.core.domain.HandleGatewayInitializationResponse r1 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getHandleGatewayInitializationResponse$p(r1)
                r5.label = r8
                java.lang.Object r0 = r1.invoke(r0, r5)
                if (r0 != r9) goto Ld2
            Ld1:
                return r9
            Ld2:
                pn6 r0 = defpackage.pn6.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInitializeBoldSDK$invoke$2(ye6 ye6Var, AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, vz0 vz0Var) {
        super(2, vz0Var);
        this.$publicApiEntry = ye6Var;
        this.this$0 = androidInitializeBoldSDK;
        this.$source = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidInitializeBoldSDK$invoke$2(this.$publicApiEntry, this.this$0, this.$source, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidInitializeBoldSDK$invoke$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [ye6] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ye6] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

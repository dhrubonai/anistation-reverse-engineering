package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import defpackage.ic2;
import defpackage.iv;
import defpackage.k52;
import defpackage.m37;
import defpackage.pn6;
import defpackage.sx5;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.x44;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2", f = "DiagnosticEventObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DiagnosticEventObserver$invoke$2 extends t36 implements ic2 {
    int label;
    final /* synthetic */ DiagnosticEventObserver this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2", f = "DiagnosticEventObserver.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends t36 implements ic2 {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DiagnosticEventObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DiagnosticEventObserver diagnosticEventObserver, vz0 vz0Var) {
            super(2, vz0Var);
            this.this$0 = diagnosticEventObserver;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, vz0Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.ic2
        public final Object invoke(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, vz0 vz0Var) {
            return ((AnonymousClass2) create(list, vz0Var)).invokeSuspend(pn6.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:1|(1:(1:(1:(3:6|7|8)(2:10|11))(6:12|13|14|15|7|8))(1:21))(1:29)|22|23|24|(4:26|15|7|8)|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00dc, code lost:
        
            if (r9.invoke(r3, r0, r8) == r5) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
        
            r3 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
        
            if (r9 == r5) goto L27;
         */
        @Override // defpackage.h30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                w11 r5 = defpackage.w11.x
                if (r0 == 0) goto L2b
                if (r0 == r4) goto L27
                if (r0 == r3) goto L1b
                if (r0 != r2) goto L15
                defpackage.m37.N(r9)
                goto Ldf
            L15:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ze0.m(r8)
                return r1
            L1b:
                java.lang.Object r0 = r8.L$1
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r3 = r8.L$0
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r3 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r3
                defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> Lc2
                goto L8e
            L27:
                defpackage.m37.N(r9)
                goto L62
            L2b:
                defpackage.m37.N(r9)
                java.lang.Object r9 = r8.L$0
                java.util.List r9 = (java.util.List) r9
                gatewayprotocol.v1.UniversalRequestKt r0 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
                com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0 = r8.this$0
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r6 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r7 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
                r7.getClass()
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r6 = r6._create(r7)
                com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest r0 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getGetDiagnosticEventBatchRequest$p(r0)
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequest r9 = r0.invoke(r9)
                r6.setDiagnosticEventRequest(r9)
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r9 = r6._build()
                com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0 = r8.this$0
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r0 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getGetUniversalRequestForPayLoad$p(r0)
                r8.label = r4
                java.lang.Object r9 = r0.invoke(r9, r8)
                if (r9 != r5) goto L62
                goto Lde
            L62:
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r9 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r9
                java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> Lc1
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc1
                r0.getClass()     // Catch: java.lang.Throwable -> Lc1
                com.unity3d.ads.core.domain.events.DiagnosticEventObserver r4 = r8.this$0     // Catch: java.lang.Throwable -> Lc1
                com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r4 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getUniversalRequestDataSource$p(r4)     // Catch: java.lang.Throwable -> Lc1
                byte[] r6 = r9.toByteArray()     // Catch: java.lang.Throwable -> Lc1
                r6.getClass()     // Catch: java.lang.Throwable -> Lc1
                com.google.protobuf.ByteString r6 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r6)     // Catch: java.lang.Throwable -> Lc1
                r8.L$0 = r9     // Catch: java.lang.Throwable -> Lc1
                r8.L$1 = r0     // Catch: java.lang.Throwable -> Lc1
                r8.label = r3     // Catch: java.lang.Throwable -> Lc1
                java.lang.Object r3 = r4.set(r0, r6, r8)     // Catch: java.lang.Throwable -> Lc1
                if (r3 != r5) goto L8d
                goto Lde
            L8d:
                r3 = r9
            L8e:
                com.unity3d.ads.core.domain.work.UniversalRequestWorkerData r9 = new com.unity3d.ads.core.domain.work.UniversalRequestWorkerData     // Catch: java.lang.Throwable -> Lc2
                r9.<init>(r0)     // Catch: java.lang.Throwable -> Lc2
                com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0 = r8.this$0     // Catch: java.lang.Throwable -> Lc2
                com.unity3d.ads.core.domain.work.BackgroundWorker r0 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getBackgroundWorker$p(r0)     // Catch: java.lang.Throwable -> Lc2
                pe4 r4 = new pe4     // Catch: java.lang.Throwable -> Lc2
                java.lang.Class<com.unity3d.ads.core.domain.work.DiagnosticEventJob> r6 = com.unity3d.ads.core.domain.work.DiagnosticEventJob.class
                r7 = 0
                r4.<init>(r6, r7)     // Catch: java.lang.Throwable -> Lc2
                e41 r9 = r9.invoke()     // Catch: java.lang.Throwable -> Lc2
                r9.getClass()     // Catch: java.lang.Throwable -> Lc2
                z77 r6 = r4.c     // Catch: java.lang.Throwable -> Lc2
                r6.e = r9     // Catch: java.lang.Throwable -> Lc2
                java.lang.String r9 = "UnityAdsBackgroundWorker"
                java.util.Set r6 = r4.d     // Catch: java.lang.Throwable -> Lc2
                r6.add(r9)     // Catch: java.lang.Throwable -> Lc2
                w77 r9 = r4.a()     // Catch: java.lang.Throwable -> Lc2
                qe4 r9 = (defpackage.qe4) r9     // Catch: java.lang.Throwable -> Lc2
                k77 r0 = r0.getWorkManager()     // Catch: java.lang.Throwable -> Lc2
                r0.a(r9)     // Catch: java.lang.Throwable -> Lc2
                goto Ldf
            Lc1:
                r3 = r9
            Lc2:
                com.unity3d.ads.core.domain.events.DiagnosticEventObserver r9 = r8.this$0
                com.unity3d.ads.core.domain.events.UniversalRequestEventSender r9 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getUniversalRequestEventSender$p(r9)
                com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0 = r8.this$0
                com.unity3d.ads.core.domain.GetRequestPolicy r0 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getDiagnosticRequestPolicy$p(r0)
                com.unity3d.ads.gatewayclient.RequestPolicy r0 = r0.invoke()
                r8.L$0 = r1
                r8.L$1 = r1
                r8.label = r2
                java.lang.Object r8 = r9.invoke(r3, r0, r8)
                if (r8 != r5) goto Ldf
            Lde:
                return r5
            Ldf:
                pn6 r8 = defpackage.pn6.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventObserver$invoke$2(DiagnosticEventObserver diagnosticEventObserver, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = diagnosticEventObserver;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new DiagnosticEventObserver$invoke$2(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((DiagnosticEventObserver$invoke$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        x44 x44Var;
        sx5 sx5Var;
        Object value;
        Boolean bool;
        DiagnosticEventRepository diagnosticEventRepository;
        v11 v11Var;
        if (this.label == 0) {
            m37.N(obj);
            x44Var = this.this$0.isRunning;
            do {
                sx5Var = (sx5) x44Var;
                value = sx5Var.getValue();
                bool = (Boolean) value;
                bool.getClass();
            } while (!sx5Var.j(value, Boolean.TRUE));
            boolean booleanValue = bool.booleanValue();
            pn6 pn6Var = pn6.a;
            if (!booleanValue) {
                diagnosticEventRepository = this.this$0.diagnosticEventRepository;
                k52 k52Var = new k52(diagnosticEventRepository.getDiagnosticEvents(), new AnonymousClass2(this.this$0, null), (byte) 2);
                v11Var = this.this$0.scope;
                iv.G(k52Var, v11Var);
                return pn6Var;
            }
            return pn6Var;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

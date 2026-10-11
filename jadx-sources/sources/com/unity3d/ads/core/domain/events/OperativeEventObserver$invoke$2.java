package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.OperativeEventRepository;
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
import gatewayprotocol.v1.OperativeEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2", f = "OperativeEventObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OperativeEventObserver$invoke$2 extends t36 implements ic2 {
    int label;
    final /* synthetic */ OperativeEventObserver this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2", f = "OperativeEventObserver.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends t36 implements ic2 {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ OperativeEventObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OperativeEventObserver operativeEventObserver, vz0 vz0Var) {
            super(2, vz0Var);
            this.this$0 = operativeEventObserver;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, vz0Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.ic2
        public final Object invoke(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, vz0 vz0Var) {
            return ((AnonymousClass2) create(operativeEventRequest, vz0Var)).invokeSuspend(pn6.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:1|(1:(1:(1:(3:6|7|8)(2:10|11))(6:12|13|14|15|7|8))(1:21))(1:29)|22|23|24|(4:26|15|7|8)|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00ed, code lost:
        
            if (r1.invoke(r4, r5, r18) == r6) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
        
            r4 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        
            if (r1 == r6) goto L27;
         */
        @Override // defpackage.h30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventObserver$invoke$2(OperativeEventObserver operativeEventObserver, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = operativeEventObserver;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new OperativeEventObserver$invoke$2(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((OperativeEventObserver$invoke$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        x44 x44Var;
        sx5 sx5Var;
        Object value;
        Boolean bool;
        OperativeEventRepository operativeEventRepository;
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
                operativeEventRepository = this.this$0.operativeEventRepository;
                k52 k52Var = new k52(operativeEventRepository.getOperativeEvents(), new AnonymousClass2(this.this$0, null), (byte) 2);
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

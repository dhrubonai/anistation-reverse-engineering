package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1", f = "CleanUpWhenOpportunityExpires.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CleanUpWhenOpportunityExpires$invoke$job$1 extends t36 implements ic2 {
    final /* synthetic */ AdObject $adObject;
    int label;
    final /* synthetic */ CleanUpWhenOpportunityExpires this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1", f = "CleanUpWhenOpportunityExpires.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ic2 {
        final /* synthetic */ AdObject $adObject;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CleanUpWhenOpportunityExpires this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires, vz0 vz0Var) {
            super(2, vz0Var);
            this.$adObject = adObject;
            this.this$0 = cleanUpWhenOpportunityExpires;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, vz0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.ic2
        public final Object invoke(v11 v11Var, vz0 vz0Var) {
            return ((AnonymousClass1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            if (r6.destroy(r5) == r4) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
        
            if (r6.onAdExpired(r0, r5) == r4) goto L19;
         */
        @Override // defpackage.h30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 0
                r2 = 2
                r3 = 1
                w11 r4 = defpackage.w11.x
                if (r0 == 0) goto L1b
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.m37.N(r6)
                goto L5a
            L11:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ze0.m(r5)
                return r1
            L17:
                defpackage.m37.N(r6)     // Catch: java.lang.Throwable -> L40
                goto L40
            L1b:
                defpackage.m37.N(r6)
                java.lang.Object r6 = r5.L$0
                v11 r6 = (defpackage.v11) r6
                com.unity3d.ads.core.data.model.AdObject r6 = r5.$adObject
                x44 r6 = r6.getState()
                com.unity3d.ads.core.data.model.AdObjectState r0 = com.unity3d.ads.core.data.model.AdObjectState.EXPIRED
                sx5 r6 = (defpackage.sx5) r6
                r6.k(r0)
                com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires r6 = r5.this$0
                com.unity3d.ads.core.data.model.AdObject r0 = r5.$adObject
                com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy r6 = com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.access$getPreShowStrategy$p(r6)     // Catch: java.lang.Throwable -> L40
                r5.label = r3     // Catch: java.lang.Throwable -> L40
                java.lang.Object r6 = r6.onAdExpired(r0, r5)     // Catch: java.lang.Throwable -> L40
                if (r6 != r4) goto L40
                goto L50
            L40:
                com.unity3d.ads.core.data.model.AdObject r6 = r5.$adObject
                com.unity3d.ads.adplayer.AdPlayer r6 = r6.getAdPlayer()
                if (r6 == 0) goto L51
                r5.label = r2
                java.lang.Object r5 = r6.destroy(r5)
                if (r5 != r4) goto L5a
            L50:
                return r4
            L51:
                com.unity3d.ads.core.data.model.AdObject r5 = r5.$adObject
                v11 r5 = r5.getAdScope()
                defpackage.db.t(r5, r1)
            L5a:
                pn6 r5 = defpackage.pn6.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanUpWhenOpportunityExpires$invoke$job$1(AdObject adObject, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires, vz0 vz0Var) {
        super(2, vz0Var);
        this.$adObject = adObject;
        this.this$0 = cleanUpWhenOpportunityExpires;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new CleanUpWhenOpportunityExpires$invoke$job$1(this.$adObject, this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((CleanUpWhenOpportunityExpires$invoke$job$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (defpackage.tl7.V(r9, r0, r8) == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (defpackage.x97.v(r6, r8) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        if (r9 == r5) goto L26;
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
            if (r0 == 0) goto L22
            if (r0 == r4) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L14
            defpackage.m37.N(r9)
            goto L7e
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r1
        L1a:
            defpackage.m37.N(r9)
            goto L5a
        L1e:
            defpackage.m37.N(r9)
            goto L4e
        L22:
            defpackage.m37.N(r9)
            com.unity3d.ads.core.data.model.AdObject r9 = r8.$adObject
            x44 r9 = r9.getTtl()
            sx5 r9 = (defpackage.sx5) r9
            java.lang.Object r9 = r9.getValue()
            fq1 r9 = (defpackage.fq1) r9
            if (r9 == 0) goto L38
        L35:
            long r6 = r9.x
            goto L51
        L38:
            com.unity3d.ads.core.data.model.AdObject r9 = r8.$adObject
            x44 r9 = r9.getTtl()
            in r0 = new in
            r6 = 8
            r0.<init>(r9, r6)
            r8.label = r4
            java.lang.Object r9 = defpackage.sw0.p(r0, r8)
            if (r9 != r5) goto L4e
            goto L7d
        L4e:
            fq1 r9 = (defpackage.fq1) r9
            goto L35
        L51:
            r8.label = r3
            java.lang.Object r9 = defpackage.x97.v(r6, r8)
            if (r9 != r5) goto L5a
            goto L7d
        L5a:
            com.unity3d.ads.core.data.model.AdObject r9 = r8.$adObject
            x44 r9 = r9.getState()
            sx5 r9 = (defpackage.sx5) r9
            java.lang.Object r9 = r9.getValue()
            com.unity3d.ads.core.data.model.AdObjectState r0 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
            if (r9 == r0) goto L7e
            la4 r9 = defpackage.la4.x
            com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1 r0 = new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1
            com.unity3d.ads.core.data.model.AdObject r3 = r8.$adObject
            com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires r4 = r8.this$0
            r0.<init>(r3, r4, r1)
            r8.label = r2
            java.lang.Object r8 = defpackage.tl7.V(r9, r0, r8)
            if (r8 != r5) goto L7e
        L7d:
            return r5
        L7e:
            pn6 r8 = defpackage.pn6.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

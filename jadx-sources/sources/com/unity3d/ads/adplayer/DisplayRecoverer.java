package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import defpackage.iv;
import defpackage.k52;
import defpackage.pn6;
import defpackage.q71;
import defpackage.t44;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.x42;
import defpackage.xz0;
import defpackage.y45;
import defpackage.z45;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DisplayRecoverer {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_MAX_BACKGROUND_AGE_MS = 30000;
    public static final String EXTRA_RECOVERY_REATTACH = "isRecoveryReattach";
    private static final long RECOVERY_TIMEOUT_MS = 5000;
    private final AdObject adObject;
    private final Context context;
    private final AtomicLong displayHiddenAtMs;
    private final FocusRepository focusRepository;
    private final AtomicBoolean incidentInProgress;
    private final String opportunityId;
    private final OrientationRepository orientationRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final AndroidShowOptions showOptions;

    public DisplayRecoverer(String str, AdObject adObject, SessionRepository sessionRepository, FocusRepository focusRepository, SendDiagnosticEvent sendDiagnosticEvent, Context context, OrientationRepository orientationRepository, AndroidShowOptions androidShowOptions) {
        str.getClass();
        sessionRepository.getClass();
        focusRepository.getClass();
        sendDiagnosticEvent.getClass();
        context.getClass();
        orientationRepository.getClass();
        androidShowOptions.getClass();
        this.opportunityId = str;
        this.adObject = adObject;
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.orientationRepository = orientationRepository;
        this.showOptions = androidShowOptions;
        this.incidentInProgress = new AtomicBoolean(false);
        this.displayHiddenAtMs = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        if (r1 == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009f, code lost:
    
        if (r1 == r9) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object attemptDisplayRecovery(boolean r22, defpackage.vz0 r23) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.DisplayRecoverer.attemptDisplayRecovery(boolean, vz0):java.lang.Object");
    }

    private final void fail(String str) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Map singletonMap = Collections.singletonMap("reason", str);
        singletonMap.getClass();
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_show_display_recovery_failure", (Double) null, singletonMap, (Map) null, this.adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 234, (Object) null);
    }

    private final Intent getIntent(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map<String, Object> unityAdsShowOptions = this.showOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(i);
        intent.putExtra("orientation", ((Number) this.orientationRepository.getResumedActivityOrientation().getValue()).intValue());
        intent.putExtra(EXTRA_RECOVERY_REATTACH, true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: launchDisplay-IoAF18A, reason: not valid java name */
    public final Object m29launchDisplayIoAF18A(Context context) {
        int i;
        Object y45Var;
        Object obj = pn6.a;
        int overwriteIntentFlagActivity = this.sessionRepository.getNativeConfiguration().getOverwriteIntentFlagActivity();
        Integer valueOf = Integer.valueOf(overwriteIntentFlagActivity);
        if (overwriteIntentFlagActivity == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = 268500992;
        }
        try {
            context.startActivity(getIntent(context, i));
            y45Var = obj;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        Throwable b = z45.b(y45Var);
        if (b != null) {
            try {
            } catch (Throwable th2) {
                obj = new y45(th2);
            }
            if (i != 268500992) {
                context.startActivity(getIntent(context, 268500992));
                return obj;
            }
            throw b;
        }
        return y45Var;
    }

    private final long maxBackgroundAgeMs() {
        Integer valueOf = Integer.valueOf(this.sessionRepository.getFeatureFlags().getRecoverFullscreenDisplayMaxBackgroundAgeMs());
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return DEFAULT_MAX_BACKGROUND_AGE_MS;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(11:5|6|7|(1:(1:10)(2:25|26))(2:27|(2:29|30)(7:31|(3:33|34|(1:36))|24|(1:15)|16|17|(2:19|20)(1:22)))|11|(5:13|(0)|16|17|(0)(0))|24|(0)|16|17|(0)(0)))|41|6|7|(0)(0)|11|(0)|24|(0)|16|17|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        r0 = new defpackage.y45(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: all -> 0x0081, CancellationException -> 0x0090, TryCatch #2 {CancellationException -> 0x0090, all -> 0x0081, blocks: (B:10:0x0026, B:11:0x0069, B:15:0x0075, B:16:0x007c, B:31:0x003f, B:33:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleExternalDestroy(boolean r18, defpackage.vz0 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.unity3d.ads.adplayer.DisplayRecoverer$handleExternalDestroy$1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.adplayer.DisplayRecoverer$handleExternalDestroy$1 r2 = (com.unity3d.ads.adplayer.DisplayRecoverer$handleExternalDestroy$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.adplayer.DisplayRecoverer$handleExternalDestroy$1 r2 = new com.unity3d.ads.adplayer.DisplayRecoverer$handleExternalDestroy$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L31
            if (r3 != r5) goto L2a
            defpackage.m37.N(r1)     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
            goto L69
        L2a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            r0 = 0
            return r0
        L31:
            defpackage.m37.N(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.incidentInProgress
            boolean r1 = r1.compareAndSet(r4, r5)
            if (r1 != 0) goto L3f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L3f:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r6 = access$getSendDiagnosticEvent$p(r0)     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
            java.lang.String r7 = "native_show_display_external_destroy"
            com.unity3d.ads.core.data.model.AdObject r11 = access$getAdObject$p(r0)     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
            r15 = 238(0xee, float:3.34E-43)
            r16 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
            com.unity3d.ads.adplayer.AdTaskRemovalDetectionService$Companion r1 = com.unity3d.ads.adplayer.AdTaskRemovalDetectionService.Companion     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
            boolean r1 = r1.consumeTaskRemoved()     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
            if (r18 != 0) goto L72
            r2.label = r5     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
            java.lang.Object r1 = access$attemptDisplayRecovery(r0, r1, r2)     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
            w11 r2 = defpackage.w11.x
            if (r1 != r2) goto L69
            return r2
        L69:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
            if (r1 == 0) goto L72
            goto L73
        L72:
            r5 = r4
        L73:
            if (r5 == 0) goto L7c
            java.util.concurrent.atomic.AtomicBoolean r0 = access$getIncidentInProgress$p(r0)     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
            r0.set(r4)     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
        L7c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L81 java.util.concurrent.CancellationException -> L90
            goto L88
        L81:
            r0 = move-exception
            y45 r1 = new y45
            r1.<init>(r0)
            r0 = r1
        L88:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof defpackage.y45
            if (r2 == 0) goto L8f
            r0 = r1
        L8f:
            return r0
        L90:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.DisplayRecoverer.handleExternalDestroy(boolean, vz0):java.lang.Object");
    }

    public final void start(v11 v11Var) {
        v11Var.getClass();
        final t44 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
        final w42 w42Var = new w42() { // from class: com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filterIsInstance$1

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filterIsInstance$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filterIsInstance$1$2", f = "DisplayRecoverer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(vz0 vz0Var) {
                        super(vz0Var);
                    }

                    @Override // defpackage.h30
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(x42 x42Var) {
                    this.$this_unsafeFlow = x42Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // defpackage.x42
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.vz0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filterIsInstance$1$2$1 r0 = (com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filterIsInstance$1$2$1 r0 = new com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filterIsInstance$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L40
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        boolean r6 = r5 instanceof com.unity3d.ads.adplayer.DisplayMessage.VisibilityChanged
                        if (r6 == 0) goto L40
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L40
                        return r5
                    L40:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
                }
            }

            @Override // defpackage.w42
            public Object collect(x42 x42Var, vz0 vz0Var) {
                Object collect = w42.this.collect(new AnonymousClass2(x42Var), vz0Var);
                if (collect == w11.x) {
                    return collect;
                }
                return pn6.a;
            }
        };
        iv.G(new k52(new w42() { // from class: com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filter$1

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;
                final /* synthetic */ DisplayRecoverer this$0;

                @w51(c = "com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filter$1$2", f = "DisplayRecoverer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(vz0 vz0Var) {
                        super(vz0Var);
                    }

                    @Override // defpackage.h30
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(x42 x42Var, DisplayRecoverer displayRecoverer) {
                    this.$this_unsafeFlow = x42Var;
                    this.this$0 = displayRecoverer;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // defpackage.x42
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.vz0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L4f
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r6 = r4.$this_unsafeFlow
                        r1 = r5
                        com.unity3d.ads.adplayer.DisplayMessage$VisibilityChanged r1 = (com.unity3d.ads.adplayer.DisplayMessage.VisibilityChanged) r1
                        java.lang.String r1 = r1.getOpportunityId()
                        com.unity3d.ads.adplayer.DisplayRecoverer r4 = r4.this$0
                        java.lang.String r4 = com.unity3d.ads.adplayer.DisplayRecoverer.access$getOpportunityId$p(r4)
                        boolean r4 = defpackage.a34.i(r1, r4)
                        if (r4 == 0) goto L4f
                        r0.label = r2
                        java.lang.Object r4 = r6.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L4f
                        return r5
                    L4f:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.DisplayRecoverer$start$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
                }
            }

            @Override // defpackage.w42
            public Object collect(x42 x42Var, vz0 vz0Var) {
                Object collect = w42.this.collect(new AnonymousClass2(x42Var, this), vz0Var);
                if (collect == w11.x) {
                    return collect;
                }
                return pn6.a;
            }
        }, new DisplayRecoverer$start$2(this, null), (byte) 2), v11Var);
    }

    public final void stop() {
        AdTaskRemovalDetectionService.Companion.stop(this.context);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }
}

package com.unity3d.ads.adplayer;

import android.util.Base64;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.OnOfferwallEvent;
import com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent;
import com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent;
import com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent;
import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEventInfo;
import defpackage.db;
import defpackage.e96;
import defpackage.fn5;
import defpackage.h41;
import defpackage.h98;
import defpackage.ic2;
import defpackage.in;
import defpackage.iv;
import defpackage.k52;
import defpackage.l62;
import defpackage.mz6;
import defpackage.n11;
import defpackage.pn6;
import defpackage.pp2;
import defpackage.q37;
import defpackage.r11;
import defpackage.sb2;
import defpackage.sx5;
import defpackage.t44;
import defpackage.tl7;
import defpackage.tx5;
import defpackage.ub2;
import defpackage.uc2;
import defpackage.v11;
import defpackage.vf;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.x42;
import defpackage.x44;
import defpackage.xz0;
import defpackage.y52;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WebViewAdPlayer implements AdPlayer {
    private final WebViewBridge bridge;
    private final DeviceInfoRepository deviceInfoRepository;
    private final n11 dispatcher;
    private final x44 isCompletedManually;
    private final w42 onBroadcastEvents;
    private final w42 onLoadEvent;
    private final w42 onOfferwallEvent;
    private final fn5 onShowEvent;
    private final v11 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final x44 shouldTriggerShowEventStarted;
    private final ub2 storageEventCallback;
    private final WebViewContainer webViewContainer;

    public WebViewAdPlayer(WebViewBridge webViewBridge, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, n11 n11Var, SendDiagnosticEvent sendDiagnosticEvent, WebViewContainer webViewContainer, v11 v11Var) {
        webViewBridge.getClass();
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        n11Var.getClass();
        sendDiagnosticEvent.getClass();
        webViewContainer.getClass();
        v11Var.getClass();
        this.bridge = webViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.dispatcher = n11Var;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        Boolean bool = Boolean.FALSE;
        sx5 a = tx5.a(bool);
        this.isCompletedManually = a;
        final sx5 a2 = tx5.a(bool);
        this.shouldTriggerShowEventStarted = a2;
        final byte b = 1;
        ub2 ub2Var = new ub2(this) { // from class: r37
            public final /* synthetic */ WebViewAdPlayer y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                pn6 _init_$lambda$11;
                pn6 storageEventCallback$lambda$0;
                byte b2 = b;
                WebViewAdPlayer webViewAdPlayer = this.y;
                switch (b2) {
                    case 0:
                        _init_$lambda$11 = WebViewAdPlayer._init_$lambda$11(webViewAdPlayer, (Throwable) obj);
                        return _init_$lambda$11;
                    default:
                        storageEventCallback$lambda$0 = WebViewAdPlayer.storageEventCallback$lambda$0(webViewAdPlayer, (StorageEventInfo) obj);
                        return storageEventCallback$lambda$0;
                }
            }
        };
        this.storageEventCallback = ub2Var;
        this.scope = db.g0(db.g0(v11Var, n11Var), new r11("WebViewAdPlayer"));
        final fn5 onInvocation = webViewBridge.getOnInvocation();
        final w42 w42Var = new w42() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1
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
                        x42 r4 = r4.$this_unsafeFlow
                        r6 = r5
                        com.unity3d.ads.adplayer.Invocation r6 = (com.unity3d.ads.adplayer.Invocation) r6
                        java.lang.String r1 = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"
                        java.lang.String[] r1 = new java.lang.String[]{r1}
                        java.lang.String r6 = r6.getLocation()
                        boolean r6 = defpackage.ms.t0(r1, r6)
                        if (r6 == 0) goto L4f
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L4f
                        return r5
                    L4f:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
        this.onOfferwallEvent = new w42() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
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
                /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                @Override // defpackage.x42
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.vz0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 0
                        r3 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r3) goto L26
                        defpackage.m37.N(r6)
                        goto L4c
                    L26:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        return r2
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r5 = (com.unity3d.ads.adplayer.Invocation) r5
                        java.lang.String r6 = r5.getLocation()
                        java.lang.String r1 = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"
                        boolean r6 = defpackage.a34.i(r6, r1)
                        if (r6 == 0) goto L4f
                        com.unity3d.ads.core.data.model.OfferwallShowEvent$Show r5 = com.unity3d.ads.core.data.model.OfferwallShowEvent.Show.INSTANCE
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L4c
                        return r5
                    L4c:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    L4f:
                        java.lang.String r4 = "Unexpected location: "
                        java.lang.String r5 = r5.getLocation()
                        defpackage.ov3.q(r5, r4)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
        final fn5 onInvocation2 = webViewBridge.getOnInvocation();
        final w42 w42Var2 = new w42() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L4d
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        r6 = r5
                        com.unity3d.ads.adplayer.Invocation r6 = (com.unity3d.ads.adplayer.Invocation) r6
                        java.lang.String[] r1 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getSHOW_EVENTS$p()
                        java.lang.String r6 = r6.getLocation()
                        boolean r6 = defpackage.ms.t0(r1, r6)
                        if (r6 == 0) goto L4d
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L4d
                        return r5
                    L4d:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
        l62 l62Var = new l62(new w42() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
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

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to find 'out' block for switch in B:16:0x003c. Please report as an issue. */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00eb A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                @Override // defpackage.x42
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, defpackage.vz0 r12) {
                    /*
                        Method dump skipped, instructions count: 280
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
        }, a, new WebViewAdPlayer$onShowEvent$3(null));
        final w42 w42Var3 = new w42() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L45
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        r6 = r5
                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                        boolean r6 = r6.booleanValue()
                        if (r6 == 0) goto L45
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L45
                        return r5
                    L45:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
        final byte b2 = 0;
        this.onShowEvent = h41.Z(y52.a(l62Var, new w42() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
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
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L43
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        r5.getClass()
                        com.unity3d.ads.core.data.model.ShowEvent$Started r5 = com.unity3d.ads.core.data.model.ShowEvent.Started.INSTANCE
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L43
                        return r5
                    L43:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
        }), getScope(), 10);
        final fn5 onInvocation3 = webViewBridge.getOnInvocation();
        final w42 w42Var4 = new w42() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L4d
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        r6 = r5
                        com.unity3d.ads.adplayer.Invocation r6 = (com.unity3d.ads.adplayer.Invocation) r6
                        java.lang.String[] r1 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getLOAD_EVENTS$p()
                        java.lang.String r6 = r6.getLocation()
                        boolean r6 = defpackage.ms.t0(r1, r6)
                        if (r6 == 0) goto L4d
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L4d
                        return r5
                    L4d:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
        this.onLoadEvent = new in(h41.Z(new w42() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
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
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L6e
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r5 = (com.unity3d.ads.adplayer.Invocation) r5
                        java.lang.String r6 = r5.getLocation()
                        java.lang.String r1 = "com.unity3d.services.ads.api.AdViewer.loadError"
                        boolean r6 = defpackage.a34.i(r6, r1)
                        if (r6 == 0) goto L61
                        java.lang.Object[] r5 = r5.getParameters()
                        java.lang.Object r5 = defpackage.ms.I0(r5)
                        r5.getClass()
                        org.json.JSONObject r5 = (org.json.JSONObject) r5
                        java.lang.String r6 = "code"
                        int r6 = r5.optInt(r6)
                        java.lang.String r1 = "message"
                        java.lang.String r5 = r5.optString(r1)
                        com.unity3d.ads.adplayer.model.LoadEvent$Error r1 = new com.unity3d.ads.adplayer.model.LoadEvent$Error
                        r5.getClass()
                        r1.<init>(r5, r6)
                        goto L63
                    L61:
                        com.unity3d.ads.adplayer.model.LoadEvent$Completed r1 = com.unity3d.ads.adplayer.model.LoadEvent.Completed.INSTANCE
                    L63:
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r1, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L6e
                        return r5
                    L6e:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
        }, getScope(), 1), (byte) 7);
        final fn5 onInvocation4 = webViewBridge.getOnInvocation();
        final w42 w42Var5 = new w42() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L4b
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        r6 = r5
                        com.unity3d.ads.adplayer.Invocation r6 = (com.unity3d.ads.adplayer.Invocation) r6
                        java.lang.String r6 = r6.getLocation()
                        java.lang.String r1 = "com.unity3d.services.ads.api.AdViewer.broadcastEvent"
                        boolean r6 = defpackage.a34.i(r6, r1)
                        if (r6 == 0) goto L4b
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L4b
                        return r5
                    L4b:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
        w42 w42Var6 = new w42() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
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
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L4a
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r5 = (com.unity3d.ads.adplayer.Invocation) r5
                        java.lang.Object[] r5 = r5.getParameters()
                        java.lang.Object r5 = defpackage.ms.I0(r5)
                        java.lang.String r5 = r5.toString()
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L4a
                        return r5
                    L4a:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
        this.onBroadcastEvents = w42Var6;
        Storage.Companion.addStorageEventCallback(ub2Var);
        h98.w(v11Var.getCoroutineContext()).l0(new ub2(this) { // from class: r37
            public final /* synthetic */ WebViewAdPlayer y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                pn6 _init_$lambda$11;
                pn6 storageEventCallback$lambda$0;
                byte b22 = b2;
                WebViewAdPlayer webViewAdPlayer = this.y;
                switch (b22) {
                    case 0:
                        _init_$lambda$11 = WebViewAdPlayer._init_$lambda$11(webViewAdPlayer, (Throwable) obj);
                        return _init_$lambda$11;
                    default:
                        storageEventCallback$lambda$0 = WebViewAdPlayer.storageEventCallback$lambda$0(webViewAdPlayer, (StorageEventInfo) obj);
                        return storageEventCallback$lambda$0;
                }
            }
        });
        AdPlayer.Companion companion = AdPlayer.Companion;
        iv.G(new k52(w42Var6, new AnonymousClass2(companion.getBroadcastEventChannel()), (byte) 2), getScope());
        iv.G(new k52(companion.getBroadcastEventChannel(), new AnonymousClass3(this), (byte) 2), getScope());
    }

    public static final pn6 _init_$lambda$11(WebViewAdPlayer webViewAdPlayer, Throwable th) {
        Storage.Companion.removeStorageEventCallback(webViewAdPlayer.storageEventCallback);
        return pn6.a;
    }

    public static final WebViewEvent onAllowedPiiChange$lambda$24(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 2);
        encodeToString.getClass();
        return new OnAllowedPiiChangeEvent(encodeToString);
    }

    public static final WebViewEvent onBroadcastEvent$lambda$23(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("eventType");
        String optString = jSONObject.optString("data");
        string.getClass();
        return new OnBroadcastEvent(string, optString);
    }

    public static final WebViewEvent sendActivityDestroyed$lambda$19() {
        return new OnActivityDestroyedEvent();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r1 == r8) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendEvent(defpackage.sb2 r21, defpackage.vz0 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = (com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = new com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            pn6 r5 = defpackage.pn6.a
            r6 = 2
            r7 = 1
            w11 r8 = defpackage.w11.x
            if (r3 == 0) goto L3f
            if (r3 == r7) goto L37
            if (r3 != r6) goto L31
            defpackage.m37.N(r1)
            return r5
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r4
        L37:
            java.lang.Object r3 = r2.L$0
            sb2 r3 = (defpackage.sb2) r3
            defpackage.m37.N(r1)
            goto L53
        L3f:
            defpackage.m37.N(r1)
            w42 r1 = r0.getOnLoadEvent()
            r3 = r21
            r2.L$0 = r3
            r2.label = r7
            java.lang.Object r1 = defpackage.sw0.H(r1, r2)
            if (r1 != r8) goto L53
            goto Lac
        L53:
            com.unity3d.ads.adplayer.model.LoadEvent r1 = (com.unity3d.ads.adplayer.model.LoadEvent) r1
            boolean r7 = r1 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error
            if (r7 == 0) goto L9a
            com.unity3d.ads.core.domain.SendDiagnosticEvent r9 = r0.sendDiagnosticEvent
            ai4 r0 = new ai4
            java.lang.String r2 = "reason"
            java.lang.String r3 = "adviewer"
            r0.<init>(r2, r3)
            com.unity3d.ads.adplayer.model.LoadEvent$Error r1 = (com.unity3d.ads.adplayer.model.LoadEvent.Error) r1
            java.lang.String r2 = r1.getMessage()
            ai4 r3 = new ai4
            java.lang.String r4 = "reason_debug"
            r3.<init>(r4, r2)
            int r1 = r1.getErrorCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            ai4 r2 = new ai4
            java.lang.String r4 = "reason_code"
            r2.<init>(r4, r1)
            ai4[] r0 = new defpackage.ai4[]{r0, r3, r2}
            java.util.Map r12 = defpackage.vn3.T(r0)
            r18 = 250(0xfa, float:3.5E-43)
            r19 = 0
            java.lang.String r10 = "bridge_send_event_failed"
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r5
        L9a:
            java.lang.Object r1 = r3.invoke()
            com.unity3d.ads.adplayer.model.WebViewEvent r1 = (com.unity3d.ads.adplayer.model.WebViewEvent) r1
            com.unity3d.ads.adplayer.WebViewBridge r0 = r0.bridge
            r2.L$0 = r4
            r2.label = r6
            java.lang.Object r0 = r0.sendEvent(r1, r2)
            if (r0 != r8) goto Lad
        Lac:
            return r8
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent(sb2, vz0):java.lang.Object");
    }

    public static final WebViewEvent sendFocusChange$lambda$18(boolean z) {
        return new OnFocusChangeEvent(z);
    }

    public static final WebViewEvent sendMuteChange$lambda$16(boolean z) {
        return new OnMuteChangeEvent(z);
    }

    public static final WebViewEvent sendOfferwallEvent$lambda$15(OfferwallEvent offerwallEvent) {
        return new OnOfferwallEvent(offerwallEvent);
    }

    public static final WebViewEvent sendPrivacyFsmChange$lambda$22(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 2);
        encodeToString.getClass();
        return new OnPrivacyFsmChangeEvent(encodeToString);
    }

    public static final WebViewEvent sendUserConsentChange$lambda$21(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 2);
        encodeToString.getClass();
        return new OnUserConsentChangeEvent(encodeToString);
    }

    public static final WebViewEvent sendVisibilityChange$lambda$17(boolean z) {
        return new OnVisibilityChangeEvent(z);
    }

    public static final WebViewEvent sendVolumeChange$lambda$20(double d) {
        return new OnVolumeChangeEvent(d);
    }

    public static final pn6 storageEventCallback$lambda$0(WebViewAdPlayer webViewAdPlayer, StorageEventInfo storageEventInfo) {
        storageEventInfo.getClass();
        tl7.z(webViewAdPlayer.getScope(), null, null, new WebViewAdPlayer$storageEventCallback$1$1(webViewAdPlayer, storageEventInfo, null), 3);
        return pn6.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object destroy(vz0 vz0Var) {
        return AdPlayer.DefaultImpls.destroy(this, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        x44 x44Var = this.isCompletedManually;
        Boolean bool = Boolean.TRUE;
        sx5 sx5Var = (sx5) x44Var;
        sx5Var.getClass();
        sx5Var.l(null, bool);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public w42 getOnLoadEvent() {
        return this.onLoadEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public w42 getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public v11 getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, vz0 vz0Var) {
        Object sendEvent = sendEvent(new q37(bArr, (byte) 2), vz0Var);
        if (sendEvent == w11.x) {
            return sendEvent;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, vz0 vz0Var) {
        Object sendEvent = sendEvent(new vf(str, (byte) 5), vz0Var);
        if (sendEvent == w11.x) {
            return sendEvent;
        }
        return pn6.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0188, code lost:
    
        if (r12.bridge.request("webview", "show", new java.lang.Object[]{r8}, r0) != r7) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object requestShow(java.util.Map<java.lang.String, ? extends java.lang.Object> r13, defpackage.vz0 r14) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.requestShow(java.util.Map, vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(vz0 vz0Var) {
        Object sendEvent = sendEvent(new mz6((byte) 4), vz0Var);
        if (sendEvent == w11.x) {
            return sendEvent;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z, vz0 vz0Var) {
        Object sendEvent = sendEvent(new pp2((byte) 2, z), vz0Var);
        if (sendEvent == w11.x) {
            return sendEvent;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z, vz0 vz0Var) {
        Object sendEvent = sendEvent(new pp2((byte) 4, z), vz0Var);
        if (sendEvent == w11.x) {
            return sendEvent;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, vz0 vz0Var) {
        Object sendEvent = sendEvent(new e96(offerwallEvent, (byte) 9), vz0Var);
        if (sendEvent == w11.x) {
            return sendEvent;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, vz0 vz0Var) {
        Object sendEvent = sendEvent(new q37(bArr, (byte) 1), vz0Var);
        if (sendEvent == w11.x) {
            return sendEvent;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, vz0 vz0Var) {
        Object sendEvent = sendEvent(new q37(bArr, (byte) 0), vz0Var);
        if (sendEvent == w11.x) {
            return sendEvent;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z, vz0 vz0Var) {
        Object sendEvent = sendEvent(new pp2((byte) 3, z), vz0Var);
        if (sendEvent == w11.x) {
            return sendEvent;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(final double d, vz0 vz0Var) {
        Object sendEvent = sendEvent(new sb2() { // from class: s37
            @Override // defpackage.sb2
            public final Object invoke() {
                WebViewEvent sendVolumeChange$lambda$20;
                sendVolumeChange$lambda$20 = WebViewAdPlayer.sendVolumeChange$lambda$20(d);
                return sendVolumeChange$lambda$20;
            }
        }, vz0Var);
        if (sendEvent == w11.x) {
            return sendEvent;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public fn5 getOnShowEvent() {
        return this.onShowEvent;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2 */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass2 extends uc2 implements ic2 {
        public AnonymousClass2(Object obj) {
            super(2, obj, t44.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.ic2
        public final Object invoke(String str, vz0 vz0Var) {
            return ((t44) this.receiver).emit(str, vz0Var);
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$3 */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass3 extends uc2 implements ic2 {
        public AnonymousClass3(Object obj) {
            super(2, obj, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.ic2
        public final Object invoke(String str, vz0 vz0Var) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, vz0Var);
        }
    }
}

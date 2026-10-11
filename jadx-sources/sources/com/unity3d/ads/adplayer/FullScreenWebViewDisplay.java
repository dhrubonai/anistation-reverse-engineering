package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.adplayer.AdTaskRemovalDetectionService;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import defpackage.a34;
import defpackage.bx7;
import defpackage.d46;
import defpackage.db;
import defpackage.e16;
import defpackage.fq3;
import defpackage.h98;
import defpackage.iv;
import defpackage.jf3;
import defpackage.k52;
import defpackage.oi4;
import defpackage.pn6;
import defpackage.qg0;
import defpackage.rb3;
import defpackage.rd4;
import defpackage.sb2;
import defpackage.t72;
import defpackage.tl7;
import defpackage.u4;
import defpackage.v11;
import defpackage.v71;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.w57;
import defpackage.wc7;
import defpackage.wd4;
import defpackage.x42;
import defpackage.xz0;
import defpackage.y4;
import defpackage.y45;
import defpackage.yr0;
import defpackage.yu5;
import defpackage.z05;
import defpackage.z4;
import defpackage.zz;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class FullScreenWebViewDisplay extends yr0 implements IServiceComponent {
    private final rb3 adObject$delegate;
    private final rb3 dispatchers$delegate;
    private boolean finishRequestedBySdk;
    private boolean isRecoveryReattach;
    private String opportunityId = "";
    private final rb3 recoverFullscreenDisplayEnabled$delegate;
    private final rb3 sendDiagnosticEvent$delegate;
    private final rb3 sessionRepository$delegate;
    private Map<String, ? extends Object> showOptions;
    private final z4 startForResult;

    public FullScreenWebViewDisplay() {
        final String str = "";
        sb2 sb2Var = new sb2() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // defpackage.sb2
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, z05.a(SendDiagnosticEvent.class));
            }
        };
        jf3 jf3Var = jf3.z;
        this.sendDiagnosticEvent$delegate = bx7.B(jf3Var, sb2Var);
        final byte b = 0;
        this.adObject$delegate = new d46(new sb2(this) { // from class: pb2
            public final /* synthetic */ FullScreenWebViewDisplay y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                AdObject adObject_delegate$lambda$2;
                boolean recoverFullscreenDisplayEnabled_delegate$lambda$3;
                byte b2 = b;
                FullScreenWebViewDisplay fullScreenWebViewDisplay = this.y;
                switch (b2) {
                    case 0:
                        adObject_delegate$lambda$2 = FullScreenWebViewDisplay.adObject_delegate$lambda$2(fullScreenWebViewDisplay);
                        return adObject_delegate$lambda$2;
                    default:
                        recoverFullscreenDisplayEnabled_delegate$lambda$3 = FullScreenWebViewDisplay.recoverFullscreenDisplayEnabled_delegate$lambda$3(fullScreenWebViewDisplay);
                        return Boolean.valueOf(recoverFullscreenDisplayEnabled_delegate$lambda$3);
                }
            }
        });
        this.dispatchers$delegate = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.unity3d.services.core.domain.ISDKDispatchers] */
            @Override // defpackage.sb2
            public final ISDKDispatchers invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, z05.a(ISDKDispatchers.class));
            }
        });
        this.sessionRepository$delegate = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.data.repository.SessionRepository, java.lang.Object] */
            @Override // defpackage.sb2
            public final SessionRepository invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, z05.a(SessionRepository.class));
            }
        });
        final byte b2 = 1;
        this.recoverFullscreenDisplayEnabled$delegate = new d46(new sb2(this) { // from class: pb2
            public final /* synthetic */ FullScreenWebViewDisplay y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                AdObject adObject_delegate$lambda$2;
                boolean recoverFullscreenDisplayEnabled_delegate$lambda$3;
                byte b22 = b2;
                FullScreenWebViewDisplay fullScreenWebViewDisplay = this.y;
                switch (b22) {
                    case 0:
                        adObject_delegate$lambda$2 = FullScreenWebViewDisplay.adObject_delegate$lambda$2(fullScreenWebViewDisplay);
                        return adObject_delegate$lambda$2;
                    default:
                        recoverFullscreenDisplayEnabled_delegate$lambda$3 = FullScreenWebViewDisplay.recoverFullscreenDisplayEnabled_delegate$lambda$3(fullScreenWebViewDisplay);
                        return Boolean.valueOf(recoverFullscreenDisplayEnabled_delegate$lambda$3);
                }
            }
        });
        z4 registerForActivityResult = registerForActivityResult(new y4((byte) 3), new v71((byte) 29));
        registerForActivityResult.getClass();
        this.startForResult = registerForActivityResult;
    }

    public static final AdObject adObject_delegate$lambda$2(final FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        Object y45Var;
        final String str = "";
        try {
            AdRepository adObject_delegate$lambda$2$lambda$0 = adObject_delegate$lambda$2$lambda$0(bx7.B(jf3.z, new sb2() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject_delegate$lambda$2$$inlined$inject$default$1
                /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.data.repository.AdRepository, java.lang.Object] */
                @Override // defpackage.sb2
                public final AdRepository invoke() {
                    IServiceComponent iServiceComponent = IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str, z05.a(AdRepository.class));
                }
            }));
            UUID fromString = UUID.fromString(fullScreenWebViewDisplay.opportunityId);
            fromString.getClass();
            y45Var = adObject_delegate$lambda$2$lambda$0.getAd(ProtobufExtensionsKt.toByteString(fromString));
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (y45Var instanceof y45) {
            y45Var = null;
        }
        return (AdObject) y45Var;
    }

    private static final AdRepository adObject_delegate$lambda$2$lambda$0(rb3 rb3Var) {
        return (AdRepository) rb3Var.getValue();
    }

    public final void finishBySdk() {
        this.finishRequestedBySdk = true;
        finish();
    }

    public final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    public final ISDKDispatchers getDispatchers() {
        return (ISDKDispatchers) this.dispatchers$delegate.getValue();
    }

    private final boolean getRecoverFullscreenDisplayEnabled() {
        return ((Boolean) this.recoverFullscreenDisplayEnabled$delegate.getValue()).booleanValue();
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent$delegate.getValue();
    }

    private final SessionRepository getSessionRepository() {
        return (SessionRepository) this.sessionRepository$delegate.getValue();
    }

    private final void hideSystemNavBar() {
        w57 w57Var;
        Window window = getWindow();
        fq3 fq3Var = new fq3(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            w57Var = new w57(window, fq3Var, (byte) 1);
        } else if (i >= 30) {
            w57Var = new w57(window, fq3Var, (byte) 1);
        } else {
            w57Var = new w57(window, fq3Var, (byte) 0);
        }
        w57Var.c(2);
        w57Var.g();
    }

    public final Object listenToAdPlayerEvents(vz0 vz0Var) {
        qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        final e16 e16Var = new e16(AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this, qg0Var, null));
        iv.G(new k52(new w42() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;
                final /* synthetic */ FullScreenWebViewDisplay this$0;

                @w51(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2", f = "FullScreenWebViewDisplay.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(x42 x42Var, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
                    this.$this_unsafeFlow = x42Var;
                    this.this$0 = fullScreenWebViewDisplay;
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
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2$1
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
                        com.unity3d.ads.adplayer.DisplayMessage r1 = (com.unity3d.ads.adplayer.DisplayMessage) r1
                        java.lang.String r1 = r1.getOpportunityId()
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay r4 = r4.this$0
                        java.lang.String r4 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getOpportunityId$p(r4)
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
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
                }
            }

            @Override // defpackage.w42
            public Object collect(x42 x42Var, vz0 vz0Var2) {
                Object collect = w42.this.collect(new AnonymousClass2(x42Var, this), vz0Var2);
                if (collect == w11.x) {
                    return collect;
                }
                return pn6.a;
            }
        }, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this, null), (byte) 2), oi4.u(this));
        Object r = qg0Var.r();
        if (r == w11.x) {
            return r;
        }
        return pn6.a;
    }

    public final void loadWebView(WebView webView) {
        tl7.z(db.b(getDispatchers().getMain()), null, null, new FullScreenWebViewDisplay$loadWebView$1(webView, this, null), 3);
    }

    public static final pn6 onCreate$lambda$8(rd4 rd4Var) {
        rd4Var.getClass();
        return pn6.a;
    }

    public final void openUrl(String str, Intent intent, boolean z) {
        Object y45Var;
        try {
            if (z) {
                this.startForResult.a(intent);
            } else {
                intent.setFlags(268435456);
                startActivity(intent);
            }
            y45Var = pn6.a;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        tl7.z(oi4.u(this), getDispatchers().getDefault(), null, new FullScreenWebViewDisplay$openUrl$1(str, !(y45Var instanceof y45), null), 2);
    }

    public static /* synthetic */ void openUrl$default(FullScreenWebViewDisplay fullScreenWebViewDisplay, String str, Intent intent, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        fullScreenWebViewDisplay.openUrl(str, intent, z);
    }

    public static final boolean recoverFullscreenDisplayEnabled_delegate$lambda$3(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        return fullScreenWebViewDisplay.getSessionRepository().getFeatureFlags().getRecoverFullscreenDisplayEnabled();
    }

    private final void updateTaskRemovalDetection(boolean z) {
        if (!getRecoverFullscreenDisplayEnabled()) {
            return;
        }
        if (z) {
            AdTaskRemovalDetectionService.Companion companion = AdTaskRemovalDetectionService.Companion;
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            companion.stop(applicationContext);
            return;
        }
        AdTaskRemovalDetectionService.Companion companion2 = AdTaskRemovalDetectionService.Companion;
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        companion2.start(applicationContext2);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // defpackage.yr0, defpackage.xr0, android.app.Activity
    public void onCreate(Bundle bundle) {
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        AdPlayer adPlayer;
        v11 scope;
        Object y45Var;
        Map<String, ? extends Object> map;
        super.onCreate(bundle);
        yu5.k(getWindow(), false);
        hideSystemNavBar();
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            stringExtra = "not_provided";
        }
        this.opportunityId = stringExtra;
        AdObject adObject = getAdObject();
        if (adObject != null) {
            webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData();
        } else {
            webViewLessLoadingRequiredData = null;
        }
        if (webViewLessLoadingRequiredData != null && bundle == null) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_webview_less_ad_activity_launched", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 254, (Object) null);
        }
        if (a34.i(this.opportunityId, "not_provided")) {
            setResult(0);
            tl7.z(db.b(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onCreate$1(this, null), 3);
            finishBySdk();
            return;
        }
        AdObject adObject2 = getAdObject();
        if (adObject2 != null) {
            adPlayer = adObject2.getAdPlayer();
        } else {
            adPlayer = null;
        }
        if (adPlayer != null && (scope = adPlayer.getScope()) != null && db.W(scope)) {
            boolean hasExtra = getIntent().hasExtra("orientation");
            Boolean valueOf = Boolean.valueOf(hasExtra);
            if (!hasExtra) {
                valueOf = null;
            }
            if (valueOf != null) {
                setRequestedOrientation(getIntent().getIntExtra("orientation", -1));
            }
            String stringExtra2 = getIntent().getStringExtra("showOptions");
            if (stringExtra2 != null) {
                try {
                    y45Var = JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(stringExtra2));
                } catch (Throwable th) {
                    y45Var = new y45(th);
                }
                if (y45Var instanceof y45) {
                    y45Var = null;
                }
                map = (Map) y45Var;
            } else {
                map = null;
            }
            this.showOptions = map;
            boolean booleanExtra = getIntent().getBooleanExtra(DisplayRecoverer.EXTRA_RECOVERY_REATTACH, false);
            this.isRecoveryReattach = booleanExtra;
            if (booleanExtra) {
                tl7.z(oi4.u(this), null, null, new FullScreenWebViewDisplay$onCreate$6(h98.w(adPlayer.getScope().getCoroutineContext()), this, null), 3);
            }
            tl7.z(oi4.u(this), null, null, new FullScreenWebViewDisplay$onCreate$7(this, null), 3);
            wd4 onBackPressedDispatcher = getOnBackPressedDispatcher();
            onBackPressedDispatcher.getClass();
            zz.i(onBackPressedDispatcher, this, new t72((byte) 1));
            return;
        }
        setResult(0);
        tl7.z(db.b(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onCreate$2(this, null), 3);
        finishBySdk();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            tl7.z(db.b(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onDestroy$1(this, null), 3);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        tl7.z(db.b(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onPause$1(this, null), 3);
        if (isFinishing()) {
            tl7.z(db.b(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onPause$2(this, null), 3);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        tl7.z(db.b(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onResume$1(this, null), 3);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            hideSystemNavBar();
        }
        updateTaskRemovalDetection(z);
        tl7.z(db.b(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onWindowFocusChanged$1(this, z, null), 3);
    }

    public static final void startForResult$lambda$12(u4 u4Var) {
    }
}

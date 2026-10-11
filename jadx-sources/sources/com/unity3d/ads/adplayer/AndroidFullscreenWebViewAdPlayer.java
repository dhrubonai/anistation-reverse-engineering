package com.unity3d.ads.adplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.datasource.CurrentActivityDataSource;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.properties.ClientProperties;
import defpackage.d46;
import defpackage.db;
import defpackage.e16;
import defpackage.fn5;
import defpackage.h43;
import defpackage.h98;
import defpackage.iv;
import defpackage.jn5;
import defpackage.k52;
import defpackage.l0;
import defpackage.la4;
import defpackage.pn6;
import defpackage.q71;
import defpackage.rb3;
import defpackage.t44;
import defpackage.tl7;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.x42;
import defpackage.xz0;
import defpackage.y45;
import defpackage.y7;
import defpackage.ze0;
import defpackage.zq0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {
    public static final Companion Companion = new Companion(null);
    private static final t44 displayMessages = jn5.b(0, 0, null, 7);
    private final rb3 adObject$delegate;
    private final AdRepository adRepository;
    private final Context context;
    private final CurrentActivityDataSource currentActivityDataSource;
    private final DeviceInfoRepository deviceInfoRepository;
    private final DisplayRecovererFactory displayRecovererFactory;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final OrientationRepository orientationRepository;
    private DisplayRecoverer recoverer;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final AtomicBoolean wasDestroyed;
    private final WebViewAdPlayer webViewAdPlayer;
    private final WebViewContainer webViewContainer;

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String str, WebViewContainer webViewContainer, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository, OfferwallManager offerwallManager, SendDiagnosticEvent sendDiagnosticEvent, AdRepository adRepository, OrientationRepository orientationRepository, Context context, CurrentActivityDataSource currentActivityDataSource, DisplayRecovererFactory displayRecovererFactory) {
        webViewAdPlayer.getClass();
        str.getClass();
        webViewContainer.getClass();
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        openMeasurementRepository.getClass();
        offerwallManager.getClass();
        sendDiagnosticEvent.getClass();
        adRepository.getClass();
        orientationRepository.getClass();
        context.getClass();
        currentActivityDataSource.getClass();
        displayRecovererFactory.getClass();
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = str;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.offerwallManager = offerwallManager;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.adRepository = adRepository;
        this.orientationRepository = orientationRepository;
        this.context = context;
        this.currentActivityDataSource = currentActivityDataSource;
        this.displayRecovererFactory = displayRecovererFactory;
        this.adObject$delegate = new d46(new y7(this, (byte) 6));
        this.wasDestroyed = new AtomicBoolean(false);
    }

    public static final AdObject adObject_delegate$lambda$1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        Object y45Var;
        try {
            AdRepository adRepository = androidFullscreenWebViewAdPlayer.adRepository;
            UUID fromString = UUID.fromString(androidFullscreenWebViewAdPlayer.opportunityId);
            fromString.getClass();
            y45Var = adRepository.getAd(ProtobufExtensionsKt.toByteString(fromString));
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (y45Var instanceof y45) {
            y45Var = null;
        }
        return (AdObject) y45Var;
    }

    public static /* synthetic */ pn6 b(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Throwable th) {
        return show$lambda$7(androidFullscreenWebViewAdPlayer, th);
    }

    private final h43 displayEventsRouter(DisplayMessage displayMessage) {
        return tl7.z(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(displayMessage, this, null), 3);
    }

    public final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    public final Intent getIntent(Context context, AndroidShowOptions androidShowOptions, int i) {
        Intent intent = new Intent(context, (Class<?>) FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map<String, Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(i);
        intent.putExtra("orientation", ((Number) this.orientationRepository.getResumedActivityOrientation().getValue()).intValue());
        return intent;
    }

    public final Object handleSessionChange(SessionChange sessionChange, vz0 vz0Var) {
        boolean z = sessionChange instanceof SessionChange.UserConsentChange;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        if (z) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            byteArray.getClass();
            Object sendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, vz0Var);
            if (sendUserConsentChange == w11Var) {
                return sendUserConsentChange;
            }
            return pn6Var;
        }
        if (sessionChange instanceof SessionChange.PrivacyFsmChange) {
            WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
            byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
            byteArray2.getClass();
            Object sendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, vz0Var);
            if (sendPrivacyFsmChange == w11Var) {
                return sendPrivacyFsmChange;
            }
            return pn6Var;
        }
        ze0.l();
        return null;
    }

    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, vz0 vz0Var) {
        boolean z = volumeSettingsChange instanceof VolumeSettingsChange.MuteChange;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        if (z) {
            Object sendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), vz0Var);
            if (sendMuteChange == w11Var) {
                return sendMuteChange;
            }
            return pn6Var;
        }
        if (volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange) {
            Object sendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), vz0Var);
            if (sendVolumeChange == w11Var) {
                return sendVolumeChange;
            }
            return pn6Var;
        }
        ze0.l();
        return null;
    }

    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, vz0 vz0Var) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return pn6.a;
    }

    public static final pn6 show$lambda$7(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Throwable th) {
        if (th != null) {
            tl7.z(db.b(androidFullscreenWebViewAdPlayer.getScope().getCoroutineContext().plus(la4.x)), null, null, new AndroidFullscreenWebViewAdPlayer$show$10$1(androidFullscreenWebViewAdPlayer, null), 3);
        }
        return pn6.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (r10.destroy(r0) == r7) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (defpackage.x97.u(1000, r0) == r7) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r10.emit(r1, r0) == r7) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object destroy(defpackage.vz0 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            pn6 r2 = defpackage.pn6.a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            w11 r7 = defpackage.w11.x
            if (r1 == 0) goto L46
            if (r1 == r6) goto L42
            if (r1 == r5) goto L3e
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L33
            defpackage.m37.N(r10)
            goto L9f
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            r9 = 0
            return r9
        L3a:
            defpackage.m37.N(r10)
            goto L8f
        L3e:
            defpackage.m37.N(r10)
            goto L82
        L42:
            defpackage.m37.N(r10)
            goto L69
        L46:
            defpackage.m37.N(r10)
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.wasDestroyed
            boolean r10 = r10.getAndSet(r6)
            if (r10 == 0) goto L52
            return r2
        L52:
            com.unity3d.ads.adplayer.WebViewAdPlayer r10 = r9.webViewAdPlayer
            r10.dispatchShowCompleted()
            t44 r10 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.displayMessages
            com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest r1 = new com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest
            java.lang.String r8 = r9.opportunityId
            r1.<init>(r8)
            r0.label = r6
            java.lang.Object r10 = r10.emit(r1, r0)
            if (r10 != r7) goto L69
            goto L9e
        L69:
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r10 = r9.openMeasurementRepository
            java.lang.String r1 = r9.opportunityId
            com.google.protobuf.ByteString r1 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r1)
            boolean r10 = r10.hasSessionFinished(r1)
            if (r10 == 0) goto L82
            r0.label = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = defpackage.x97.u(r5, r0)
            if (r10 != r7) goto L82
            goto L9e
        L82:
            com.unity3d.ads.adplayer.WebViewContainer r10 = r9.getWebViewContainer()
            r0.label = r4
            java.lang.Object r10 = r10.destroy(r0)
            if (r10 != r7) goto L8f
            goto L9e
        L8f:
            com.unity3d.ads.adplayer.DisplayRecoverer r10 = r9.recoverer
            if (r10 == 0) goto L96
            r10.stop()
        L96:
            r0.label = r3
            java.lang.Object r9 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r9, r0)
            if (r9 != r7) goto L9f
        L9e:
            return r7
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy(vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public w42 getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public w42 getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public w42 getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public v11 getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, vz0 vz0Var) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, vz0 vz0Var) {
        return this.webViewAdPlayer.onBroadcastEvent(str, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, vz0 vz0Var) {
        return this.webViewAdPlayer.requestShow(map, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(vz0 vz0Var) {
        return this.webViewAdPlayer.sendActivityDestroyed(vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z, vz0 vz0Var) {
        return this.webViewAdPlayer.sendFocusChange(z, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z, vz0 vz0Var) {
        return this.webViewAdPlayer.sendMuteChange(z, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, vz0 vz0Var) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, vz0 vz0Var) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, vz0 vz0Var) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z, vz0 vz0Var) {
        return this.webViewAdPlayer.sendVisibilityChange(z, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d, vz0 vz0Var) {
        return this.webViewAdPlayer.sendVolumeChange(d, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        WeakReference<Activity> weakReference;
        Activity activity;
        boolean z;
        int i;
        Context context;
        showOptions.getClass();
        if (showOptions instanceof AndroidShowOptions) {
            AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
            this.recoverer = this.displayRecovererFactory.create(this.opportunityId, getAdObject(), androidShowOptions, getScope());
            boolean isOfferwallAd = androidShowOptions.isOfferwallAd();
            zq0 c = tl7.c();
            final e16 e16Var = new e16(displayMessages, new AndroidFullscreenWebViewAdPlayer$show$1(c, null));
            iv.G(new k52(new w42() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

                /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2<T> implements x42 {
                    final /* synthetic */ x42 $this_unsafeFlow;
                    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                    @w51(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {50}, m = "emit")
                    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(x42 x42Var, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                        this.$this_unsafeFlow = x42Var;
                        this.this$0 = androidFullscreenWebViewAdPlayer;
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
                            boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1
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
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = r4.this$0
                            java.lang.String r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOpportunityId$p(r4)
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
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
            }, new AndroidFullscreenWebViewAdPlayer$show$3(this), (byte) 2), getScope());
            iv.G(new k52(this.deviceInfoRepository.getVolumeSettingsChange(), new AndroidFullscreenWebViewAdPlayer$show$4(this), (byte) 2), getScope());
            final fn5 onShowEvent = this.webViewAdPlayer.getOnShowEvent();
            iv.G(new k52(new w42() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

                /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2<T> implements x42 {
                    final /* synthetic */ x42 $this_unsafeFlow;

                    @w51(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {50}, m = "emit")
                    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
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
                            boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            int r1 = r0.label
                            r2 = 1
                            if (r1 == 0) goto L2c
                            if (r1 != r2) goto L25
                            defpackage.m37.N(r6)
                            goto L47
                        L25:
                            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                            defpackage.ze0.m(r4)
                            r4 = 0
                            return r4
                        L2c:
                            defpackage.m37.N(r6)
                            x42 r4 = r4.$this_unsafeFlow
                            r6 = r5
                            com.unity3d.ads.core.data.model.ShowEvent r6 = (com.unity3d.ads.core.data.model.ShowEvent) r6
                            boolean r1 = r6 instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed
                            if (r1 != 0) goto L3c
                            boolean r6 = r6 instanceof com.unity3d.ads.core.data.model.ShowEvent.Error
                            if (r6 == 0) goto L47
                        L3c:
                            r0.label = r2
                            java.lang.Object r4 = r4.emit(r5, r0)
                            w11 r5 = defpackage.w11.x
                            if (r4 != r5) goto L47
                            return r5
                        L47:
                            pn6 r4 = defpackage.pn6.a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
            }, new AndroidFullscreenWebViewAdPlayer$show$6(this, null), (byte) 2), getScope());
            final fn5 onShowEvent2 = this.webViewAdPlayer.getOnShowEvent();
            iv.G(new k52(new w42() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3

                /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2<T> implements x42 {
                    final /* synthetic */ x42 $this_unsafeFlow;

                    @w51(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {50}, m = "emit")
                    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2$1, reason: invalid class name */
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
                            boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2$1
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
                            r6 = r5
                            com.unity3d.ads.core.data.model.ShowEvent r6 = (com.unity3d.ads.core.data.model.ShowEvent) r6
                            boolean r6 = r6 instanceof com.unity3d.ads.core.data.model.ShowEvent.Started
                            if (r6 == 0) goto L43
                            r0.label = r2
                            java.lang.Object r4 = r4.emit(r5, r0)
                            w11 r5 = defpackage.w11.x
                            if (r4 != r5) goto L43
                            return r5
                        L43:
                            pn6 r4 = defpackage.pn6.a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
            }, new AndroidFullscreenWebViewAdPlayer$show$8(this, null), (byte) 2), getScope());
            iv.G(new k52(this.sessionRepository.getOnChange(), new AndroidFullscreenWebViewAdPlayer$show$9(this), (byte) 2), getScope());
            h98.w(getScope().getCoroutineContext()).l0(new l0(this, (byte) 11));
            AdObject adObject = getAdObject();
            if (adObject != null) {
                weakReference = adObject.getActivity();
            } else {
                weakReference = null;
            }
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            if (activity != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ClientProperties.setActivity(activity);
            }
            if (weakReference != null && !z) {
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_activity_not_available", (Double) null, (Map) null, (Map) null, getAdObject(), (Integer) null, (ByteString) null, (MediationInfo) null, 238, (Object) null);
            }
            if (!isOfferwallAd) {
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", (Double) null, (Map) null, (Map) null, getAdObject(), (Integer) null, (ByteString) null, (MediationInfo) null, 238, (Object) null);
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
                if (z) {
                    activity.getClass();
                    context = activity;
                } else {
                    context = this.context;
                }
                tl7.z(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$show$11(c, i, 268500992, this, context, showOptions, getIntent(context, androidShowOptions, i), null), 3);
                return;
            }
            tl7.z(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$show$12(c, this, showOptions, null), 3);
            return;
        }
        ze0.k("Failed requirement.");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final t44 getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }

        private Companion() {
        }
    }
}

package com.unity3d.ads.core.data.model;

import android.app.Activity;
import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import defpackage.a34;
import defpackage.q71;
import defpackage.v11;
import defpackage.x44;
import defpackage.zo5;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AdObject {
    private WeakReference<Activity> activity;
    private final AdPlayer adPlayer;
    private final v11 adScope;
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private LoadConfiguration loadConfiguration;
    private final UnityAdsLoadOptions loadOptions;
    private String offerwallPlacementName;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private ShowConfiguration showConfiguration;
    private x44 state;
    private ByteString trackingToken;
    private x44 ttl;
    private WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AdObject(defpackage.v11 r21, com.google.protobuf.ByteString r22, java.lang.String r23, com.google.protobuf.ByteString r24, boolean r25, java.lang.String r26, com.unity3d.ads.adplayer.AdPlayer r27, java.lang.String r28, com.unity3d.ads.UnityAdsLoadOptions r29, boolean r30, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r31, defpackage.x44 r32, defpackage.x44 r33, com.unity3d.ads.LoadConfiguration r34, com.unity3d.ads.ShowConfiguration r35, java.lang.ref.WeakReference r36, com.unity3d.ads.core.data.model.AdObject.WebViewLessLoadingRequiredData r37, int r38, defpackage.q71 r39) {
        /*
            r20 = this;
            r0 = r38
            r1 = r0 & 16
            if (r1 == 0) goto L9
            r1 = 0
            r7 = r1
            goto Lb
        L9:
            r7 = r25
        Lb:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L12
            r8 = r2
            goto L14
        L12:
            r8 = r26
        L14:
            r1 = r0 & 64
            if (r1 == 0) goto L1a
            r9 = r2
            goto L1c
        L1a:
            r9 = r27
        L1c:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L22
            r10 = r2
            goto L24
        L22:
            r10 = r28
        L24:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L2e
            sx5 r1 = defpackage.tx5.a(r2)
            r14 = r1
            goto L30
        L2e:
            r14 = r32
        L30:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L3c
            com.unity3d.ads.core.data.model.AdObjectState r1 = com.unity3d.ads.core.data.model.AdObjectState.INIT
            sx5 r1 = defpackage.tx5.a(r1)
            r15 = r1
            goto L3e
        L3c:
            r15 = r33
        L3e:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L45
            r16 = r2
            goto L47
        L45:
            r16 = r34
        L47:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L4e
            r17 = r2
            goto L50
        L4e:
            r17 = r35
        L50:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L59
            r18 = r2
            goto L5b
        L59:
            r18 = r36
        L5b:
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L73
            r19 = r2
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r11 = r29
            r12 = r30
            r13 = r31
            r2 = r20
            goto L85
        L73:
            r19 = r37
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r11 = r29
            r12 = r30
            r13 = r31
        L85:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.AdObject.<init>(v11, com.google.protobuf.ByteString, java.lang.String, com.google.protobuf.ByteString, boolean, java.lang.String, com.unity3d.ads.adplayer.AdPlayer, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, boolean, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, x44, x44, com.unity3d.ads.LoadConfiguration, com.unity3d.ads.ShowConfiguration, java.lang.ref.WeakReference, com.unity3d.ads.core.data.model.AdObject$WebViewLessLoadingRequiredData, int, q71):void");
    }

    public static /* synthetic */ AdObject copy$default(AdObject adObject, v11 v11Var, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, AdPlayer adPlayer, String str3, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, x44 x44Var, x44 x44Var2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, int i, Object obj) {
        v11 v11Var2;
        ByteString byteString3;
        String str4;
        ByteString byteString4;
        boolean z3;
        String str5;
        AdPlayer adPlayer2;
        String str6;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        boolean z4;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        x44 x44Var3;
        x44 x44Var4;
        LoadConfiguration loadConfiguration2;
        ShowConfiguration showConfiguration2;
        WeakReference weakReference2;
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData2;
        WeakReference weakReference3;
        v11 v11Var3;
        AdObject adObject2;
        ShowConfiguration showConfiguration3;
        ByteString byteString5;
        String str7;
        ByteString byteString6;
        boolean z5;
        String str8;
        AdPlayer adPlayer3;
        String str9;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        boolean z6;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        x44 x44Var5;
        x44 x44Var6;
        LoadConfiguration loadConfiguration3;
        if ((i & 1) != 0) {
            v11Var2 = adObject.adScope;
        } else {
            v11Var2 = v11Var;
        }
        if ((i & 2) != 0) {
            byteString3 = adObject.opportunityId;
        } else {
            byteString3 = byteString;
        }
        if ((i & 4) != 0) {
            str4 = adObject.placementId;
        } else {
            str4 = str;
        }
        if ((i & 8) != 0) {
            byteString4 = adObject.trackingToken;
        } else {
            byteString4 = byteString2;
        }
        if ((i & 16) != 0) {
            z3 = adObject.isOfferwallAd;
        } else {
            z3 = z;
        }
        if ((i & 32) != 0) {
            str5 = adObject.offerwallPlacementName;
        } else {
            str5 = str2;
        }
        if ((i & 64) != 0) {
            adPlayer2 = adObject.adPlayer;
        } else {
            adPlayer2 = adPlayer;
        }
        if ((i & 128) != 0) {
            str6 = adObject.playerServerId;
        } else {
            str6 = str3;
        }
        if ((i & 256) != 0) {
            unityAdsLoadOptions2 = adObject.loadOptions;
        } else {
            unityAdsLoadOptions2 = unityAdsLoadOptions;
        }
        if ((i & 512) != 0) {
            z4 = adObject.isHeaderBidding;
        } else {
            z4 = z2;
        }
        if ((i & 1024) != 0) {
            diagnosticAdType2 = adObject.adType;
        } else {
            diagnosticAdType2 = diagnosticAdType;
        }
        if ((i & 2048) != 0) {
            x44Var3 = adObject.ttl;
        } else {
            x44Var3 = x44Var;
        }
        if ((i & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
            x44Var4 = adObject.state;
        } else {
            x44Var4 = x44Var2;
        }
        if ((i & 8192) != 0) {
            loadConfiguration2 = adObject.loadConfiguration;
        } else {
            loadConfiguration2 = loadConfiguration;
        }
        v11 v11Var4 = v11Var2;
        if ((i & 16384) != 0) {
            showConfiguration2 = adObject.showConfiguration;
        } else {
            showConfiguration2 = showConfiguration;
        }
        if ((i & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            weakReference2 = adObject.activity;
        } else {
            weakReference2 = weakReference;
        }
        if ((i & 65536) != 0) {
            weakReference3 = weakReference2;
            webViewLessLoadingRequiredData2 = adObject.webViewLessLoadingRequiredData;
            showConfiguration3 = showConfiguration2;
            byteString5 = byteString3;
            str7 = str4;
            byteString6 = byteString4;
            z5 = z3;
            str8 = str5;
            adPlayer3 = adPlayer2;
            str9 = str6;
            unityAdsLoadOptions3 = unityAdsLoadOptions2;
            z6 = z4;
            diagnosticAdType3 = diagnosticAdType2;
            x44Var5 = x44Var3;
            x44Var6 = x44Var4;
            loadConfiguration3 = loadConfiguration2;
            v11Var3 = v11Var4;
            adObject2 = adObject;
        } else {
            webViewLessLoadingRequiredData2 = webViewLessLoadingRequiredData;
            weakReference3 = weakReference2;
            v11Var3 = v11Var4;
            adObject2 = adObject;
            showConfiguration3 = showConfiguration2;
            byteString5 = byteString3;
            str7 = str4;
            byteString6 = byteString4;
            z5 = z3;
            str8 = str5;
            adPlayer3 = adPlayer2;
            str9 = str6;
            unityAdsLoadOptions3 = unityAdsLoadOptions2;
            z6 = z4;
            diagnosticAdType3 = diagnosticAdType2;
            x44Var5 = x44Var3;
            x44Var6 = x44Var4;
            loadConfiguration3 = loadConfiguration2;
        }
        return adObject2.copy(v11Var3, byteString5, str7, byteString6, z5, str8, adPlayer3, str9, unityAdsLoadOptions3, z6, diagnosticAdType3, x44Var5, x44Var6, loadConfiguration3, showConfiguration3, weakReference3, webViewLessLoadingRequiredData2);
    }

    public final v11 component1() {
        return this.adScope;
    }

    public final boolean component10() {
        return this.isHeaderBidding;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component11() {
        return this.adType;
    }

    public final x44 component12() {
        return this.ttl;
    }

    public final x44 component13() {
        return this.state;
    }

    public final LoadConfiguration component14() {
        return this.loadConfiguration;
    }

    public final ShowConfiguration component15() {
        return this.showConfiguration;
    }

    public final WeakReference<Activity> component16() {
        return this.activity;
    }

    public final WebViewLessLoadingRequiredData component17() {
        return this.webViewLessLoadingRequiredData;
    }

    public final ByteString component2() {
        return this.opportunityId;
    }

    public final String component3() {
        return this.placementId;
    }

    public final ByteString component4() {
        return this.trackingToken;
    }

    public final boolean component5() {
        return this.isOfferwallAd;
    }

    public final String component6() {
        return this.offerwallPlacementName;
    }

    public final AdPlayer component7() {
        return this.adPlayer;
    }

    public final String component8() {
        return this.playerServerId;
    }

    public final UnityAdsLoadOptions component9() {
        return this.loadOptions;
    }

    public final AdObject copy(v11 v11Var, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, AdPlayer adPlayer, String str3, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, x44 x44Var, x44 x44Var2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference<Activity> weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        v11Var.getClass();
        byteString.getClass();
        str.getClass();
        byteString2.getClass();
        unityAdsLoadOptions.getClass();
        diagnosticAdType.getClass();
        x44Var.getClass();
        x44Var2.getClass();
        return new AdObject(v11Var, byteString, str, byteString2, z, str2, adPlayer, str3, unityAdsLoadOptions, z2, diagnosticAdType, x44Var, x44Var2, loadConfiguration, showConfiguration, weakReference, webViewLessLoadingRequiredData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        if (a34.i(this.adScope, adObject.adScope) && a34.i(this.opportunityId, adObject.opportunityId) && a34.i(this.placementId, adObject.placementId) && a34.i(this.trackingToken, adObject.trackingToken) && this.isOfferwallAd == adObject.isOfferwallAd && a34.i(this.offerwallPlacementName, adObject.offerwallPlacementName) && a34.i(this.adPlayer, adObject.adPlayer) && a34.i(this.playerServerId, adObject.playerServerId) && a34.i(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && a34.i(this.ttl, adObject.ttl) && a34.i(this.state, adObject.state) && a34.i(this.loadConfiguration, adObject.loadConfiguration) && a34.i(this.showConfiguration, adObject.showConfiguration) && a34.i(this.activity, adObject.activity) && a34.i(this.webViewLessLoadingRequiredData, adObject.webViewLessLoadingRequiredData)) {
            return true;
        }
        return false;
    }

    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final v11 getAdScope() {
        return this.adScope;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    public final x44 getState() {
        return this.state;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    public final x44 getTtl() {
        return this.ttl;
    }

    public final WebViewLessLoadingRequiredData getWebViewLessLoadingRequiredData() {
        return this.webViewLessLoadingRequiredData;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int g = zo5.g((this.trackingToken.hashCode() + zo5.i(this.placementId, (this.opportunityId.hashCode() + (this.adScope.hashCode() * 31)) * 31, 31)) * 31, 31, this.isOfferwallAd);
        String str = this.offerwallPlacementName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (g + hashCode) * 31;
        AdPlayer adPlayer = this.adPlayer;
        if (adPlayer == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = adPlayer.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.playerServerId;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode7 = (this.state.hashCode() + ((this.ttl.hashCode() + ((this.adType.hashCode() + zo5.g((this.loadOptions.hashCode() + ((i3 + hashCode3) * 31)) * 31, 31, this.isHeaderBidding)) * 31)) * 31)) * 31;
        LoadConfiguration loadConfiguration = this.loadConfiguration;
        if (loadConfiguration == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = loadConfiguration.hashCode();
        }
        int i4 = (hashCode7 + hashCode4) * 31;
        ShowConfiguration showConfiguration = this.showConfiguration;
        if (showConfiguration == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = showConfiguration.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        WeakReference<Activity> weakReference = this.activity;
        if (weakReference == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = weakReference.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = this.webViewLessLoadingRequiredData;
        if (webViewLessLoadingRequiredData != null) {
            i = webViewLessLoadingRequiredData.hashCode();
        }
        return i6 + i;
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final void setActivity(WeakReference<Activity> weakReference) {
        this.activity = weakReference;
    }

    public final void setLoadConfiguration(LoadConfiguration loadConfiguration) {
        this.loadConfiguration = loadConfiguration;
    }

    public final void setOfferwallAd(boolean z) {
        this.isOfferwallAd = z;
    }

    public final void setOfferwallPlacementName(String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final void setShowConfiguration(ShowConfiguration showConfiguration) {
        this.showConfiguration = showConfiguration;
    }

    public final void setState(x44 x44Var) {
        x44Var.getClass();
        this.state = x44Var;
    }

    public final void setTrackingToken(ByteString byteString) {
        byteString.getClass();
        this.trackingToken = byteString;
    }

    public final void setTtl(x44 x44Var) {
        x44Var.getClass();
        this.ttl = x44Var;
    }

    public final void setWebViewLessLoadingRequiredData(WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }

    public String toString() {
        return "AdObject(adScope=" + this.adScope + ", opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ", loadConfiguration=" + this.loadConfiguration + ", showConfiguration=" + this.showConfiguration + ", activity=" + this.activity + ", webViewLessLoadingRequiredData=" + this.webViewLessLoadingRequiredData + ')';
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class WebViewLessLoadingRequiredData {
        private AdRefreshState adRefreshState;
        private AdResponseOuterClass.AdResponse adResponse;
        private final String webviewUrl;

        public WebViewLessLoadingRequiredData(String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState) {
            str.getClass();
            adResponse.getClass();
            this.webviewUrl = str;
            this.adResponse = adResponse;
            this.adRefreshState = adRefreshState;
        }

        public static /* synthetic */ WebViewLessLoadingRequiredData copy$default(WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = webViewLessLoadingRequiredData.webviewUrl;
            }
            if ((i & 2) != 0) {
                adResponse = webViewLessLoadingRequiredData.adResponse;
            }
            if ((i & 4) != 0) {
                adRefreshState = webViewLessLoadingRequiredData.adRefreshState;
            }
            return webViewLessLoadingRequiredData.copy(str, adResponse, adRefreshState);
        }

        public final String component1() {
            return this.webviewUrl;
        }

        public final AdResponseOuterClass.AdResponse component2() {
            return this.adResponse;
        }

        public final AdRefreshState component3() {
            return this.adRefreshState;
        }

        public final WebViewLessLoadingRequiredData copy(String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState) {
            str.getClass();
            adResponse.getClass();
            return new WebViewLessLoadingRequiredData(str, adResponse, adRefreshState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewLessLoadingRequiredData)) {
                return false;
            }
            WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = (WebViewLessLoadingRequiredData) obj;
            if (a34.i(this.webviewUrl, webViewLessLoadingRequiredData.webviewUrl) && a34.i(this.adResponse, webViewLessLoadingRequiredData.adResponse) && this.adRefreshState == webViewLessLoadingRequiredData.adRefreshState) {
                return true;
            }
            return false;
        }

        public final AdRefreshState getAdRefreshState() {
            return this.adRefreshState;
        }

        public final AdResponseOuterClass.AdResponse getAdResponse() {
            return this.adResponse;
        }

        public final String getWebviewUrl() {
            return this.webviewUrl;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (this.adResponse.hashCode() + (this.webviewUrl.hashCode() * 31)) * 31;
            AdRefreshState adRefreshState = this.adRefreshState;
            if (adRefreshState == null) {
                hashCode = 0;
            } else {
                hashCode = adRefreshState.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final void setAdRefreshState(AdRefreshState adRefreshState) {
            this.adRefreshState = adRefreshState;
        }

        public final void setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
            adResponse.getClass();
            this.adResponse = adResponse;
        }

        public String toString() {
            return "WebViewLessLoadingRequiredData(webviewUrl=" + this.webviewUrl + ", adResponse=" + this.adResponse + ", adRefreshState=" + this.adRefreshState + ')';
        }

        public /* synthetic */ WebViewLessLoadingRequiredData(String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i, q71 q71Var) {
            this(str, adResponse, (i & 4) != 0 ? null : adRefreshState);
        }
    }

    public AdObject(v11 v11Var, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, AdPlayer adPlayer, String str3, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, x44 x44Var, x44 x44Var2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference<Activity> weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        v11Var.getClass();
        byteString.getClass();
        str.getClass();
        byteString2.getClass();
        unityAdsLoadOptions.getClass();
        diagnosticAdType.getClass();
        x44Var.getClass();
        x44Var2.getClass();
        this.adScope = v11Var;
        this.opportunityId = byteString;
        this.placementId = str;
        this.trackingToken = byteString2;
        this.isOfferwallAd = z;
        this.offerwallPlacementName = str2;
        this.adPlayer = adPlayer;
        this.playerServerId = str3;
        this.loadOptions = unityAdsLoadOptions;
        this.isHeaderBidding = z2;
        this.adType = diagnosticAdType;
        this.ttl = x44Var;
        this.state = x44Var2;
        this.loadConfiguration = loadConfiguration;
        this.showConfiguration = showConfiguration;
        this.activity = weakReference;
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }
}

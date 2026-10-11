package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import defpackage.ai4;
import defpackage.an3;
import defpackage.bf6;
import defpackage.j04;
import defpackage.ms;
import defpackage.n;
import defpackage.pn6;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.w11;
import defpackage.y7;
import defpackage.zo5;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    private boolean didAwaitInit;
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    private final GetInitializationState getInitializationState;
    private IUnityAdsTokenListener listener;
    private final Logger logger;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private InitializationState startState;
    private final long startTime;

    public CommonInitAwaitingGetHeaderBiddingToken(GetHeaderBiddingToken getHeaderBiddingToken, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke, Logger logger) {
        getHeaderBiddingToken.getClass();
        sendDiagnosticEvent.getClass();
        getInitializationState.getClass();
        sessionRepository.getClass();
        safeCallbackInvoke.getClass();
        logger.getClass();
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        this.startTime = j04.b();
    }

    public static /* synthetic */ pn6 a(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, String str) {
        return tokenSuccess$lambda$0(commonInitAwaitingGetHeaderBiddingToken, str);
    }

    public static /* synthetic */ pn6 b(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken) {
        return tokenFailure$lambda$4(commonInitAwaitingGetHeaderBiddingToken);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:24|25))(4:26|27|28|(1:30))|12|13|14|(2:16|17)(2:(1:20)(1:22)|21)))|33|6|7|(0)(0)|12|13|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        r7 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r7, 0, 1, null);
        r0 = "uncaught_exception";
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchToken(int r5, com.unity3d.ads.TokenConfiguration r6, defpackage.vz0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.TokenConfiguration r6 = (com.unity3d.ads.TokenConfiguration) r6
            defpackage.m37.N(r7)     // Catch: java.lang.Exception -> L2c
            goto L48
        L2c:
            r7 = move-exception
            goto L4e
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r3
        L34:
            defpackage.m37.N(r7)
            com.unity3d.ads.core.domain.GetHeaderBiddingToken r7 = r4.getHeaderBiddingToken     // Catch: java.lang.Exception -> L2c
            r0.L$0 = r6     // Catch: java.lang.Exception -> L2c
            r0.I$0 = r5     // Catch: java.lang.Exception -> L2c
            r0.label = r2     // Catch: java.lang.Exception -> L2c
            java.lang.Object r7 = r7.invoke(r5, r6, r0)     // Catch: java.lang.Exception -> L2c
            w11 r0 = defpackage.w11.x
            if (r7 != r0) goto L48
            return r0
        L48:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L2c
            r0 = r3
            r3 = r7
            r7 = r0
            goto L55
        L4e:
            r0 = 0
            java.lang.String r7 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r7, r0, r2, r3)
            java.lang.String r0 = "uncaught_exception"
        L55:
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r4.sessionRepository
            boolean r1 = r1.getShouldInitialize()
            pn6 r2 = defpackage.pn6.a
            if (r1 != 0) goto L67
            java.lang.String r7 = "gateway"
            java.lang.String r0 = "!sessionRepository.shouldInitialize"
            r4.tokenFailure(r5, r7, r0, r6)
            return r2
        L67:
            if (r3 != 0) goto L6d
            r4.tokenFailure(r5, r0, r7, r6)
            goto L70
        L6d:
            r4.tokenSuccess(r5, r3, r6)
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken(int, com.unity3d.ads.TokenConfiguration, vz0):java.lang.Object");
    }

    private final void tokenFailure(int i, String str, String str2, TokenConfiguration tokenConfiguration) {
        MediationInfo mediationInfo;
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_FAILURE_TIME;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(new bf6(this.startTime)));
        an3 an3Var = new an3();
        an3Var.put("sync", "false");
        an3Var.put("state", String.valueOf(this.startState));
        boolean z = false;
        an3Var.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        an3Var.put("awaited_init", String.valueOf(this.didAwaitInit));
        if (tokenConfiguration != null) {
            z = tokenConfiguration.isNewApi();
        }
        an3Var.put("new_api", String.valueOf(z));
        if (str != null) {
        }
        if (str2 != null) {
            an3Var.put("reason_debug", str2);
        }
        an3 b = an3Var.b();
        Integer valueOf2 = Integer.valueOf(i);
        if (tokenConfiguration != null) {
            mediationInfo = tokenConfiguration.getMediationInfo();
        } else {
            mediationInfo = null;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, b, (Map) null, (AdObject) null, valueOf2, (ByteString) null, mediationInfo, 88, (Object) null);
        Logger.DefaultImpls.error$default(this.logger, zo5.l("Returned nil token due to: ", str), null, 2, null);
        this.safeCallbackInvoke.invoke(new y7(this, (byte) 27));
    }

    public static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i, String str, String str2, TokenConfiguration tokenConfiguration, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i, str, str2, tokenConfiguration);
    }

    public static final pn6 tokenFailure$lambda$4(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken) {
        IUnityAdsTokenListener iUnityAdsTokenListener = commonInitAwaitingGetHeaderBiddingToken.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
        }
        return pn6.a;
    }

    private final void tokenStart(int i, TokenConfiguration tokenConfiguration) {
        this.logger.info("Token generation started");
        boolean z = false;
        MediationInfo mediationInfo = null;
        this.startState = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED;
        an3 an3Var = new an3();
        an3Var.put("sync", "false");
        an3Var.put("state", String.valueOf(this.startState));
        if (tokenConfiguration != null) {
            z = tokenConfiguration.isNewApi();
        }
        an3Var.put("new_api", String.valueOf(z));
        an3 b = an3Var.b();
        Integer valueOf = Integer.valueOf(i);
        if (tokenConfiguration != null) {
            mediationInfo = tokenConfiguration.getMediationInfo();
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, (Double) null, b, (Map) null, (AdObject) null, valueOf, (ByteString) null, mediationInfo, 90, (Object) null);
    }

    private final void tokenSuccess(int i, String str, TokenConfiguration tokenConfiguration) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_SUCCESS_TIME;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(new bf6(this.startTime)));
        ai4 ai4Var = new ai4("sync", "false");
        ai4 ai4Var2 = new ai4("state", String.valueOf(this.startState));
        boolean z = false;
        MediationInfo mediationInfo = null;
        ai4 ai4Var3 = new ai4("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        ai4 ai4Var4 = new ai4("awaited_init", String.valueOf(this.didAwaitInit));
        if (tokenConfiguration != null) {
            z = tokenConfiguration.isNewApi();
        }
        Map T = vn3.T(ai4Var, ai4Var2, ai4Var3, ai4Var4, new ai4("new_api", String.valueOf(z)));
        Integer valueOf2 = Integer.valueOf(i);
        if (tokenConfiguration != null) {
            mediationInfo = tokenConfiguration.getMediationInfo();
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, T, (Map) null, (AdObject) null, valueOf2, (ByteString) null, mediationInfo, 88, (Object) null);
        this.logger.info("Generated a valid token.");
        this.safeCallbackInvoke.invoke(new n(this, str, (byte) 26));
    }

    public static final pn6 tokenSuccess$lambda$0(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, String str) {
        IUnityAdsTokenListener iUnityAdsTokenListener = commonInitAwaitingGetHeaderBiddingToken.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(str);
        }
        return pn6.a;
    }

    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* renamed from: getStartTime-z9LOYto */
    public final long m58getStartTimez9LOYto() {
        return this.startTime;
    }

    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    public Object invoke(int i, TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, vz0 vz0Var) {
        this.listener = iUnityAdsTokenListener;
        tokenStart(i, tokenConfiguration);
        pn6 pn6Var = pn6.a;
        if (iUnityAdsTokenListener == null) {
            tokenFailure(i, "listener_null", "IUnityAdsTokenListener is null", tokenConfiguration);
            return pn6Var;
        }
        if (!this.sessionRepository.getShouldInitialize()) {
            tokenFailure(i, "gateway", "!sessionRepository.shouldInitialize", tokenConfiguration);
            return pn6Var;
        }
        this.didAwaitInit = ms.t0(new InitializationState[]{InitializationState.NOT_INITIALIZED, InitializationState.INITIALIZING}, this.startState);
        Object fetchToken = fetchToken(i, tokenConfiguration, vz0Var);
        if (fetchToken == w11.x) {
            return fetchToken;
        }
        return pn6Var;
    }

    public final void setListener(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}

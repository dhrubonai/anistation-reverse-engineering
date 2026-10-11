package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import defpackage.jd4;
import defpackage.k54;
import defpackage.m21;
import defpackage.m54;
import defpackage.os7;
import defpackage.pg0;
import defpackage.q23;
import defpackage.qg0;
import defpackage.v78;
import defpackage.vz0;
import defpackage.wc7;
import defpackage.zd4;
import java.util.Collections;
import java.util.Map;
import org.chromium.net.CronetEngine;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private HttpClient cachedClient;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final IsCronetFallbackAvailable isCronetFallbackAvailable;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final k54 mutex;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidHttpClientProvider(ISDKDispatchers iSDKDispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context, CronetEngineBuilderFactory cronetEngineBuilderFactory, MediationTraitsMetadataReader mediationTraitsMetadataReader, IsCronetFallbackAvailable isCronetFallbackAvailable) {
        iSDKDispatchers.getClass();
        sendDiagnosticEvent.getClass();
        context.getClass();
        cronetEngineBuilderFactory.getClass();
        mediationTraitsMetadataReader.getClass();
        isCronetFallbackAvailable.getClass();
        this.dispatchers = iSDKDispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.isCronetFallbackAvailable = isCronetFallbackAvailable;
        this.mutex = new m54();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, final HttpClientSelection httpClientSelection, vz0 vz0Var) {
        final qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        v78 a = m21.a(context);
        a.b.m(new os7(q23.e(iSDKDispatchers.getIo()), new zd4() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // defpackage.zd4
            public final void onComplete(Task task) {
                SendDiagnosticEvent sendDiagnosticEvent;
                CronetEngineBuilderFactory cronetEngineBuilderFactory;
                SendDiagnosticEvent sendDiagnosticEvent2;
                String message;
                task.getClass();
                boolean d = task.d();
                AndroidHttpClientProvider androidHttpClientProvider = AndroidHttpClientProvider.this;
                String str = "Errored without message.";
                if (d) {
                    try {
                        cronetEngineBuilderFactory = androidHttpClientProvider.cronetEngineBuilderFactory;
                        CronetEngine.Builder createCronetEngineBuilder = cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                        if (httpClientSelection == HttpClientSelection.CRONET_WITH_QUIC) {
                            createCronetEngineBuilder.enableQuic(true);
                            createCronetEngineBuilder.addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443);
                            createCronetEngineBuilder.addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443);
                        }
                        CronetEngine build = createCronetEngineBuilder.build();
                        pg0 pg0Var = qg0Var;
                        build.getClass();
                        pg0Var.resumeWith(new CronetClient(build, iSDKDispatchers));
                        return;
                    } catch (Throwable th) {
                        sendDiagnosticEvent = AndroidHttpClientProvider.this.sendDiagnosticEvent;
                        String message2 = th.getMessage();
                        if (message2 != null) {
                            str = message2;
                        }
                        Map singletonMap = Collections.singletonMap("reason", str);
                        singletonMap.getClass();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_engine_error", (Double) null, singletonMap, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 250, (Object) null);
                        qg0Var.resumeWith(AndroidHttpClientProvider.this.getOkHttp3Client());
                        return;
                    }
                }
                sendDiagnosticEvent2 = androidHttpClientProvider.sendDiagnosticEvent;
                Exception b = task.b();
                if (b != null && (message = b.getMessage()) != null) {
                    str = message;
                }
                Map singletonMap2 = Collections.singletonMap("reason", str);
                singletonMap2.getClass();
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_install_error", (Double) null, singletonMap2, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 250, (Object) null);
                qg0Var.resumeWith(AndroidHttpClientProvider.this.getOkHttp3Client());
            }
        }));
        a.j();
        return qg0Var.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0060, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createHttpClient(defpackage.vz0 r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.createHttpClient(vz0):java.lang.Object");
    }

    public final OkHttp3Client getOkHttp3Client() {
        return new OkHttp3Client(this.dispatchers, new jd4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004d, code lost:
    
        if (r8.a(r0) == r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058 A[Catch: all -> 0x006e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x006e, blocks: (B:25:0x0050, B:29:0x0058), top: B:24:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(defpackage.vz0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L40
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r0 = r0.L$0
            k54 r0 = (defpackage.k54) r0
            defpackage.m37.N(r8)     // Catch: java.lang.Throwable -> L2f
            goto L66
        L2f:
            r7 = move-exception
            goto L70
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r4
        L37:
            java.lang.Object r1 = r0.L$0
            k54 r1 = (defpackage.k54) r1
            defpackage.m37.N(r8)
            r8 = r1
            goto L50
        L40:
            defpackage.m37.N(r8)
            k54 r8 = r7.mutex
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r1 = r8.a(r0)
            if (r1 != r5) goto L50
            goto L62
        L50:
            com.unity3d.services.core.network.core.HttpClient r1 = r7.cachedClient     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L58
            r8.l(r4)
            return r1
        L58:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L6e
            r0.label = r2     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r7.createHttpClient(r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != r5) goto L63
        L62:
            return r5
        L63:
            r6 = r0
            r0 = r8
            r8 = r6
        L66:
            com.unity3d.services.core.network.core.HttpClient r8 = (com.unity3d.services.core.network.core.HttpClient) r8     // Catch: java.lang.Throwable -> L2f
            r7.cachedClient = r8     // Catch: java.lang.Throwable -> L2f
            r0.l(r4)
            return r8
        L6e:
            r7 = move-exception
            r0 = r8
        L70:
            r0.l(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(vz0):java.lang.Object");
    }
}

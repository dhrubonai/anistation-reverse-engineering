package com.unity3d.ads.core.configuration;

import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.misc.JsonStorage;
import defpackage.q71;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MediationTraitsMetadataReader extends MetadataReader<JSONObject> {
    public static final String ASYNC_TOKEN_SIGNALS = "asyncTokenSignals";
    public static final String BOLD_SDK_ENABLED = "boldSdkEnabled";
    public static final Companion Companion = new Companion(null);
    public static final String HTTP_CLIENT_FETCH_TIMEOUT_MS = "httpClientFetchTimeoutMs";
    public static final String LAZY_STATIC_DEVICE_INFO = "lazyStaticDeviceInfo";
    public static final String MEDIATION_TRAITS = "mediation.traits.value";
    public static final String REPORT_CAPABILITIES = "reportCapabilities";
    public static final String USE_FAST_INIT = "useFastInit";
    public static final String USE_HTTP_CLIENT = "useHttpClient";
    private final SessionRepository sessionRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationTraitsMetadataReader(JsonStorage jsonStorage, SessionRepository sessionRepository) {
        super(jsonStorage, MEDIATION_TRAITS);
        jsonStorage.getClass();
        sessionRepository.getClass();
        this.sessionRepository = sessionRepository;
    }

    private final String extra(String str) {
        Map<String, String> extras;
        InitializationConfigurationInternal initializationConfiguration = this.sessionRepository.getInitializationConfiguration();
        if (initializationConfiguration != null && (extras = initializationConfiguration.getExtras()) != null) {
            return extras.get(str);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r3 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean getBooleanTrait(java.lang.String r4) {
        /*
            r3 = this;
            r4.getClass()
            java.lang.String r0 = r3.extra(r4)
            r1 = 0
            if (r0 == 0) goto L25
            java.lang.String r2 = "true"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L15
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L21
        L15:
            java.lang.String r2 = "false"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L20
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L21
        L20:
            r0 = r1
        L21:
            if (r0 != 0) goto L24
            goto L25
        L24:
            return r0
        L25:
            com.unity3d.services.core.misc.JsonStorage r0 = r3.getJsonStorage()
            java.lang.String r3 = r3.getKey()
            java.lang.Object r3 = r0.get(r3)
            if (r3 == 0) goto L3b
            boolean r0 = r3 instanceof org.json.JSONObject
            if (r0 == 0) goto L38
            goto L39
        L38:
            r3 = r1
        L39:
            if (r3 != 0) goto L3c
        L3b:
            r3 = r1
        L3c:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            if (r3 == 0) goto L53
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L47
            goto L48
        L47:
            r3 = r1
        L48:
            if (r3 == 0) goto L53
            boolean r3 = r3.optBoolean(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.MediationTraitsMetadataReader.getBooleanTrait(java.lang.String):java.lang.Boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r2 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long getLongTrait(java.lang.String r3) {
        /*
            r2 = this;
            r3.getClass()
            java.lang.String r0 = r2.extra(r3)
            if (r0 == 0) goto L11
            java.lang.Long r0 = defpackage.b06.L(r0)
            if (r0 != 0) goto L10
            goto L11
        L10:
            return r0
        L11:
            com.unity3d.services.core.misc.JsonStorage r0 = r2.getJsonStorage()
            java.lang.String r2 = r2.getKey()
            java.lang.Object r2 = r0.get(r2)
            r0 = 0
            if (r2 == 0) goto L28
            boolean r1 = r2 instanceof org.json.JSONObject
            if (r1 == 0) goto L25
            goto L26
        L25:
            r2 = r0
        L26:
            if (r2 != 0) goto L29
        L28:
            r2 = r0
        L29:
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            if (r2 == 0) goto L40
            boolean r1 = r2.has(r3)
            if (r1 == 0) goto L34
            goto L35
        L34:
            r2 = r0
        L35:
            if (r2 == 0) goto L40
            long r2 = r2.optLong(r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            return r2
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.MediationTraitsMetadataReader.getLongTrait(java.lang.String):java.lang.Long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r2 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getStringTrait(java.lang.String r3) {
        /*
            r2 = this;
            r3.getClass()
            java.lang.String r0 = r2.extra(r3)
            if (r0 != 0) goto L34
            com.unity3d.services.core.misc.JsonStorage r0 = r2.getJsonStorage()
            java.lang.String r2 = r2.getKey()
            java.lang.Object r2 = r0.get(r2)
            r0 = 0
            if (r2 == 0) goto L20
            boolean r1 = r2 instanceof org.json.JSONObject
            if (r1 == 0) goto L1d
            goto L1e
        L1d:
            r2 = r0
        L1e:
            if (r2 != 0) goto L21
        L20:
            r2 = r0
        L21:
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            if (r2 == 0) goto L34
            boolean r1 = r2.has(r3)
            if (r1 == 0) goto L2c
            goto L2d
        L2c:
            r2 = r0
        L2d:
            if (r2 == 0) goto L34
            java.lang.String r2 = r2.optString(r3)
            return r2
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.MediationTraitsMetadataReader.getStringTrait(java.lang.String):java.lang.String");
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

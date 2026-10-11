package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class u37 {
    public static final dp a;
    public static final dp b;
    public static final dp c;

    static {
        new dp("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", (byte) 0);
        new dp("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", (byte) 0);
        new dp("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", (byte) 3);
        new dp("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", (byte) 1);
        new dp("START_SAFE_BROWSING", "START_SAFE_BROWSING", (byte) 4);
        new dp("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", (byte) 4);
        new dp("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", (byte) 4);
        new dp("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", (byte) 4);
        new dp("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", (byte) 4);
        new dp("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", (byte) 4);
        new dp("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", (byte) 1);
        new dp("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", (byte) 1);
        new dp("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", (byte) 1);
        new dp("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", (byte) 1);
        new dp("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", (byte) 1);
        new dp("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", (byte) 1);
        new dp("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", (byte) 0);
        new dp("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", (byte) 0);
        new dp("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", (byte) 1);
        new dp("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", (byte) 4);
        new dp("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", (byte) 1);
        a = new dp("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", (byte) 0);
        b = new dp("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", (byte) 0);
        new dp("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", (byte) 4);
        new dp("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", (byte) 4);
        c = new dp("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", (byte) 4);
        new dp("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", (byte) 0);
        new dp("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", (byte) 0);
        new dp("WEB_MESSAGE_GET_MESSAGE_PAYLOAD", "WEB_MESSAGE_GET_MESSAGE_PAYLOAD", (byte) 2);
        new dp("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", (byte) 0);
        new dp("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", (byte) 0);
        new dp("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", (byte) 0);
        new dp("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", (byte) 0);
        new dp("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", (byte) 3);
        new dp("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", (byte) 3);
        new dp("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", (byte) 6);
        new dp("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", (byte) 6);
        new dp("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", (byte) 5);
        nx5.a.add(new Object());
        new dp("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", (byte) 6);
        new dp("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING", (byte) 7);
        Pattern.compile("\\A\\d+");
        new dp("PROXY_OVERRIDE", "PROXY_OVERRIDE:3", (byte) 2);
        new dp("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE", (byte) 2);
        new dp("MULTI_PROCESS", "MULTI_PROCESS_QUERY", (byte) 2);
        new dp("FORCE_DARK", "FORCE_DARK", (byte) 6);
        new dp("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR", (byte) 2);
        new dp("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER", (byte) 2);
        new dp("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1", (byte) 2);
        new dp("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS", (byte) 2);
        new dp("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER", (byte) 2);
        new dp("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", (byte) 2);
        new dp("GET_COOKIE_INFO", "GET_COOKIE_INFO", (byte) 2);
        new dp("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST", (byte) 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L17;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0041. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:1: B:15:0x0032->B:35:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r6) {
        /*
            java.util.HashSet r0 = defpackage.dp.d
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()
            dp r2 = (defpackage.dp) r2
            java.lang.String r3 = r2.a
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto Lf
            r1.add(r2)
            goto Lf
        L27:
            boolean r0 = r1.isEmpty()
            r2 = 0
            if (r0 != 0) goto L7f
            java.util.Iterator r6 = r1.iterator()
        L32:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r6.next()
            dp r0 = (defpackage.dp) r0
            byte r1 = r0.c
            r3 = 1
            switch(r1) {
                case 0: goto L4a;
                case 1: goto L4a;
                case 2: goto L4c;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L4a;
                default: goto L44;
            }
        L44:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r1 < r4) goto L4c
        L4a:
            r1 = r3
            goto L4d
        L4c:
            r1 = r2
        L4d:
            if (r1 != 0) goto L7d
            java.util.HashSet r1 = defpackage.cp.a
            java.lang.String r0 = r0.b
            boolean r4 = r1.contains(r0)
            if (r4 != 0) goto L7a
            java.lang.String r4 = android.os.Build.TYPE
            java.lang.String r5 = "eng"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L6b
            java.lang.String r5 = "userdebug"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L78
        L6b:
            java.lang.String r4 = ":dev"
            java.lang.String r0 = r0.concat(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L78
            goto L7a
        L78:
            r0 = r2
            goto L7b
        L7a:
            r0 = r3
        L7b:
            if (r0 == 0) goto L32
        L7d:
            return r3
        L7e:
            return r2
        L7f:
            java.lang.String r0 = "Unknown feature "
            java.lang.String r6 = r0.concat(r6)
            defpackage.v71.i(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u37.a(java.lang.String):boolean");
    }
}

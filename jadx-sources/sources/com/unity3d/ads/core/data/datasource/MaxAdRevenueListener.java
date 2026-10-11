package com.unity3d.ads.core.data.datasource;

import android.os.Bundle;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.log.Logger;
import defpackage.h11;
import defpackage.lz0;
import defpackage.q71;
import defpackage.tl7;
import defpackage.uz5;
import defpackage.v11;
import defpackage.va1;
import defpackage.yo0;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MaxAdRevenueListener {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_AD_FORMAT = "ad_format";
    private static final String KEY_COUNTRY_CODE = "country_code";
    private static final String KEY_MAX_AD_UNIT_ID = "max_ad_unit_id";
    private static final String KEY_NETWORK_NAME = "network_name";
    private static final String KEY_REVENUE = "revenue";
    private static final String KEY_THIRD_PARTY_AD_PLACEMENT_ID = "third_party_ad_placement_id";
    private static final int MAX_STRING_LENGTH = 500;
    private final HandleAdRevenueEvent handleAdRevenueEvent;
    private final Logger logger;
    private final v11 scope;

    public MaxAdRevenueListener(HandleAdRevenueEvent handleAdRevenueEvent, v11 v11Var, Logger logger) {
        handleAdRevenueEvent.getClass();
        v11Var.getClass();
        logger.getClass();
        this.handleAdRevenueEvent = handleAdRevenueEvent;
        this.scope = v11Var;
        this.logger = logger;
    }

    public static /* synthetic */ CharSequence a(Bundle bundle, String str) {
        return bundleToTraceString$lambda$1(bundle, str);
    }

    public static /* synthetic */ String b(MaxAdRevenueListener maxAdRevenueListener, Bundle bundle) {
        return onMessageReceived$lambda$0(maxAdRevenueListener, bundle);
    }

    private final String bundleToTraceString(Bundle bundle) {
        try {
            if (bundle.isEmpty()) {
                return "{}";
            }
            Set<String> keySet = bundle.keySet();
            keySet.getClass();
            return yo0.q0(keySet, null, "{", "}", new lz0(bundle, (byte) 29), 25);
        } catch (Throwable unused) {
            return "<error serializing bundle>";
        }
    }

    public static final CharSequence bundleToTraceString$lambda$1(Bundle bundle, String str) {
        String obj;
        StringBuilder sb;
        try {
            Object obj2 = bundle.get(str);
            if (obj2 == null) {
                obj = "null";
            } else if (obj2 instanceof String) {
                if (((String) obj2).length() <= 500) {
                    sb = new StringBuilder("\"");
                    sb.append((String) obj2);
                    sb.append('\"');
                } else {
                    sb = new StringBuilder("\"");
                    sb.append(uz5.u0(500, (String) obj2));
                    sb.append("...\"");
                }
                obj = sb.toString();
            } else {
                obj = obj2.toString();
            }
            return str + '=' + obj;
        } catch (Throwable unused) {
            return h11.j(str, "=<error>");
        }
    }

    public static final String onMessageReceived$lambda$0(MaxAdRevenueListener maxAdRevenueListener, Bundle bundle) {
        return "Ad revenue subscribed event (raw): " + maxAdRevenueListener.bundleToTraceString(bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r1.equals("REWARDED_INTERSTITIAL") == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return com.unity3d.ads.core.data.model.AdRevenueAdFormat.REWARDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r1.equals("REWARDED_INTER") == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r1.equals("REWARDED") == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r1.equals("INTER") == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        return com.unity3d.ads.core.data.model.AdRevenueAdFormat.INTERSTITIAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r1.equals("INTERSTITIAL") == false) goto L87;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.unity3d.ads.core.data.model.AdRevenueAdFormat parseMaxAdFormatString(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L78
            boolean r1 = defpackage.uz5.V(r2)
            if (r1 == 0) goto La
            goto L78
        La:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r2.toUpperCase(r1)
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1999289321: goto L66;
                case -1372958932: goto L5a;
                case 2374915: goto L4e;
                case 69823676: goto L45;
                case 543046670: goto L39;
                case 1654540619: goto L30;
                case 1854800829: goto L27;
                case 1951953708: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L6e
        L1b:
            java.lang.String r0 = "BANNER"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L24
            goto L6e
        L24:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r1 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.BANNER
            return r1
        L27:
            java.lang.String r0 = "REWARDED_INTERSTITIAL"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L42
            goto L6e
        L30:
            java.lang.String r0 = "REWARDED_INTER"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L42
            goto L6e
        L39:
            java.lang.String r0 = "REWARDED"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L42
            goto L6e
        L42:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r1 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.REWARDED
            return r1
        L45:
            java.lang.String r0 = "INTER"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L63
            goto L6e
        L4e:
            java.lang.String r0 = "MREC"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L57
            goto L6e
        L57:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r1 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.MREC
            return r1
        L5a:
            java.lang.String r0 = "INTERSTITIAL"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L63
            goto L6e
        L63:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r1 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.INTERSTITIAL
            return r1
        L66:
            java.lang.String r0 = "NATIVE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L75
        L6e:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat$Companion r1 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.Companion
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r1 = r1.fromString(r2)
            return r1
        L75:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r1 = com.unity3d.ads.core.data.model.AdRevenueAdFormat.NATIVE
            return r1
        L78:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener.parseMaxAdFormatString(java.lang.String):com.unity3d.ads.core.data.model.AdRevenueAdFormat");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x004b, B:9:0x0053, B:10:0x005a, B:12:0x0062, B:13:0x0069, B:15:0x0071, B:16:0x0078, B:18:0x0080, B:19:0x0087, B:27:0x001c, B:29:0x0026, B:31:0x0033, B:32:0x0039), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x004b, B:9:0x0053, B:10:0x005a, B:12:0x0062, B:13:0x0069, B:15:0x0071, B:16:0x0078, B:18:0x0080, B:19:0x0087, B:27:0x001c, B:29:0x0026, B:31:0x0033, B:32:0x0039), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x004b, B:9:0x0053, B:10:0x005a, B:12:0x0062, B:13:0x0069, B:15:0x0071, B:16:0x0078, B:18:0x0080, B:19:0x0087, B:27:0x001c, B:29:0x0026, B:31:0x0033, B:32:0x0039), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x004b, B:9:0x0053, B:10:0x005a, B:12:0x0062, B:13:0x0069, B:15:0x0071, B:16:0x0078, B:18:0x0080, B:19:0x0087, B:27:0x001c, B:29:0x0026, B:31:0x0033, B:32:0x0039), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.unity3d.ads.core.data.model.AdRevenueData parseRevenueBundle(android.os.Bundle r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "revenue"
            java.lang.String r3 = "Invalid or missing revenue in revenue event: "
            r4 = 0
            boolean r5 = r0.containsKey(r2)     // Catch: java.lang.Exception -> L19
            r6 = 2
            if (r5 != 0) goto L1c
            com.unity3d.ads.core.log.Logger r2 = r1.logger     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = "Missing revenue key in revenue event"
            com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(r2, r3, r4, r6, r4)     // Catch: java.lang.Exception -> L19
        L17:
            r9 = r4
            goto L4b
        L19:
            r0 = move-exception
            goto L9b
        L1c:
            double r7 = r0.getDouble(r2)     // Catch: java.lang.Exception -> L19
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 < 0) goto L39
            double r9 = java.lang.Math.abs(r7)     // Catch: java.lang.Exception -> L19
            r11 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 > 0) goto L39
            java.lang.Double r2 = java.lang.Double.valueOf(r7)     // Catch: java.lang.Exception -> L19
            r9 = r2
            goto L4b
        L39:
            com.unity3d.ads.core.log.Logger r2 = r1.logger     // Catch: java.lang.Exception -> L19
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L19
            r5.<init>(r3)     // Catch: java.lang.Exception -> L19
            r5.append(r7)     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> L19
            com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(r2, r3, r4, r6, r4)     // Catch: java.lang.Exception -> L19
            goto L17
        L4b:
            java.lang.String r2 = "country_code"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L59
            java.lang.String r2 = r1.validateString(r2)     // Catch: java.lang.Exception -> L19
            r10 = r2
            goto L5a
        L59:
            r10 = r4
        L5a:
            java.lang.String r2 = "network_name"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L68
            java.lang.String r2 = r1.validateString(r2)     // Catch: java.lang.Exception -> L19
            r11 = r2
            goto L69
        L68:
            r11 = r4
        L69:
            java.lang.String r2 = "max_ad_unit_id"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L77
            java.lang.String r2 = r1.validateString(r2)     // Catch: java.lang.Exception -> L19
            r12 = r2
            goto L78
        L77:
            r12 = r4
        L78:
            java.lang.String r2 = "third_party_ad_placement_id"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L86
            java.lang.String r2 = r1.validateString(r2)     // Catch: java.lang.Exception -> L19
            r13 = r2
            goto L87
        L86:
            r13 = r4
        L87:
            java.lang.String r2 = "ad_format"
            java.lang.String r0 = r0.getString(r2)     // Catch: java.lang.Exception -> L19
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r14 = r1.parseMaxAdFormatString(r0)     // Catch: java.lang.Exception -> L19
            com.unity3d.ads.core.data.model.AdRevenueData r7 = new com.unity3d.ads.core.data.model.AdRevenueData     // Catch: java.lang.Exception -> L19
            r15 = 1
            r16 = 0
            r8 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L19
            return r7
        L9b:
            com.unity3d.ads.core.log.Logger r1 = r1.logger
            java.lang.String r2 = "Failed to parse revenue Bundle"
            r1.trace(r2, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.MaxAdRevenueListener.parseRevenueBundle(android.os.Bundle):com.unity3d.ads.core.data.model.AdRevenueData");
    }

    private final String validateString(String str) {
        if (!uz5.V(str) && str.length() <= 500) {
            return str;
        }
        return null;
    }

    public final void onMessageReceived(Bundle bundle) {
        bundle.getClass();
        this.logger.trace(new va1(this, bundle, (byte) 19));
        tl7.z(this.scope, null, null, new MaxAdRevenueListener$onMessageReceived$2(this, bundle, null), 3);
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

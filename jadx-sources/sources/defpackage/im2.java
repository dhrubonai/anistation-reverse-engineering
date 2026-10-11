package defpackage;

import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class im2 implements fj4 {
    public final fm2 x;
    public final bm2 y;
    public static final Pattern z = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern A = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern B = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern C = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern D = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern E = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern G = Pattern.compile("SAMPLE-RATE=(\\d+)\\b");
    public static final Pattern H = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern I = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern J = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern K = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern L = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern M = Pattern.compile("SCORE=([\\d\\.]+)\\b");
    public static final Pattern N = Pattern.compile("SERVER-URI=\"((?:.|\f)+?)\"");
    public static final Pattern O = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern P = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern Q = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern R = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern S = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern T = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern U = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern V = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern W = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern X = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern Y = a("CAN-SKIP-DATERANGES");
    public static final Pattern Z = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern a0 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern b0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern c0 = a("CAN-BLOCK-RELOAD");
    public static final Pattern d0 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern e0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern f0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern g0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern h0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern i0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern j0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern k0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern l0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern m0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern n0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern o0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern p0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern q0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern s0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern t0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern u0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern v0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern w0 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern x0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern y0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern z0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern A0 = a("AUTOSELECT");
    public static final Pattern B0 = a("DEFAULT");
    public static final Pattern C0 = a("FORCED");
    public static final Pattern D0 = a("INDEPENDENT");
    public static final Pattern E0 = a("GAP");
    public static final Pattern F0 = a("PRECISE");
    public static final Pattern G0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern I0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern J0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern K0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern L0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern M0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern N0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern O0 = a("END-ON-NEXT");
    public static final Pattern P0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern Q0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern R0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern S0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern T0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern U0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern V0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern W0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern X0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern Y0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern Z0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern a1 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern b1 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern c1 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public im2(fm2 fm2Var, bm2 bm2Var) {
        this.x = fm2Var;
        this.y = bm2Var;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static op1 b(String str, np1[] np1VarArr) {
        np1[] np1VarArr2 = new np1[np1VarArr.length];
        for (int i = 0; i < np1VarArr.length; i++) {
            np1 np1Var = np1VarArr[i];
            np1VarArr2[i] = new np1(np1Var.y, np1Var.z, np1Var.A, null);
        }
        return new op1(str, true, np1VarArr2);
    }

    public static np1 c(String str, String str2, HashMap hashMap, qb2 qb2Var) {
        String k = k(str, p0, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, hashMap, qb2Var);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = q0;
        if (equals) {
            String l = l(str, pattern, hashMap, qb2Var);
            return new np1(ce0.e, null, "video/mp4", Base64.decode(l.substring(l.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = ce0.e;
            String str3 = eq6.a;
            return new np1(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(k)) {
            return null;
        }
        String l2 = l(str, pattern, hashMap, qb2Var);
        byte[] decode = Base64.decode(l2.substring(l2.indexOf(44)), 0);
        UUID uuid2 = ce0.f;
        return new np1(uuid2, null, "video/mp4", tl7.l(uuid2, decode));
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0a2c, code lost:
    
        if (r5.equals(r13) != false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0a10, code lost:
    
        if (r13.equals("POINT") != false) goto L358;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0c21  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0c5f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0c7e  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0ca3  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0cdc  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0ce4  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0d24  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0e02  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0e16  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0e2c  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0e42  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0e61  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0e7e  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0da5  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0bf7  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x10e0  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x10e3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bm2 e(defpackage.fm2 r140, defpackage.bm2 r141, defpackage.st3 r142, android.net.Uri r143, defpackage.qb2 r144) {
        /*
            Method dump skipped, instructions count: 4502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im2.e(fm2, bm2, st3, android.net.Uri, qb2):bm2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0210, code lost:
    
        if (r7.equals("db1p") == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0220, code lost:
    
        if (r7.equals("db2g") == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x022e, code lost:
    
        if (r7.startsWith("db4") == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x030b, code lost:
    
        if (r3 > 0) goto L136;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:191:0x059e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0291  */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fm2 f(defpackage.st3 r51, android.net.Uri r52, defpackage.qb2 r53) {
        /*
            Method dump skipped, instructions count: 1962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im2.f(st3, android.net.Uri, qb2):fm2");
    }

    public static boolean g(String str, Pattern pattern, qb2 qb2Var) {
        int i = qb2.y;
        Matcher a = qb2Var.a(pattern, str);
        if (a.find()) {
            return "YES".equals(a.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern, double d, qb2 qb2Var) {
        int i = qb2.y;
        Matcher a = qb2Var.a(pattern, str);
        if (a.find()) {
            String group = a.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return d;
    }

    public static int i(String str, Pattern pattern, qb2 qb2Var) {
        int i = qb2.y;
        Matcher a = qb2Var.a(pattern, str);
        if (a.find()) {
            String group = a.group(1);
            group.getClass();
            return Integer.parseInt(group);
        }
        return -1;
    }

    public static long j(String str, Pattern pattern, qb2 qb2Var) {
        int i = qb2.y;
        Matcher a = qb2Var.a(pattern, str);
        if (a.find()) {
            String group = a.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String k(String str, Pattern pattern, String str2, Map map, qb2 qb2Var) {
        int i = qb2.y;
        Matcher a = qb2Var.a(pattern, str);
        if (a.find()) {
            str2 = a.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return m(str2, map, qb2Var);
        }
        return str2;
    }

    public static String l(String str, Pattern pattern, Map map, qb2 qb2Var) {
        String k = k(str, pattern, null, map, qb2Var);
        if (k != null) {
            return k;
        }
        throw bj4.b("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String m(String str, Map map, qb2 qb2Var) {
        int i = qb2.y;
        Matcher a = qb2Var.a(b1, str);
        StringBuffer stringBuffer = new StringBuffer();
        while (a.find()) {
            String group = a.group(1);
            if (map.containsKey(group)) {
                a.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        a.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void n(String str, HashMap hashMap) {
        if (!hashMap.containsKey(str)) {
            return;
        }
        throw bj4.b("duplicate variable name \"" + str + "\"");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
    
        r2 = r0.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        if (r2 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        r2 = r2.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
    
        if (r2.isEmpty() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r2.startsWith("#EXT-X-STREAM-INF") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        if (r2.startsWith("#EXT-X-TARGETDURATION") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (r2.startsWith("#EXT-X-MEDIA-SEQUENCE") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        if (r2.startsWith("#EXTINF") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (r2.startsWith("#EXT-X-KEY") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        if (r2.startsWith("#EXT-X-BYTERANGE") != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        if (r2.equals("#EXT-X-DISCONTINUITY") != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        if (r2.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        if (r2.equals("#EXT-X-ENDLIST") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00de, code lost:
    
        r9.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
    
        r9.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f5, code lost:
    
        return e(r7.x, r7.y, new defpackage.st3(r9, r0), r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
    
        r9.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009a, code lost:
    
        return f(new defpackage.st3(r9, r0), r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f6, code lost:
    
        defpackage.eq6.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        throw defpackage.bj4.b("Failed to parse the playlist, could not identify any tags.");
     */
    @Override // defpackage.fj4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.net.Uri r8, defpackage.t41 r9) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im2.d(android.net.Uri, t41):java.lang.Object");
    }

    public im2() {
        this(fm2.o, null);
    }
}

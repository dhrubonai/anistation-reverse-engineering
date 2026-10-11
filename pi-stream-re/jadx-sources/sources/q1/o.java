package q1;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import c1.p0;
import c1.q0;
import c1.r0;
import c1.u;
import c1.v;
import f1.b0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r6.h0;
import r6.o0;

/* loaded from: classes.dex */
public final class o implements z1.q {

    /* renamed from: a, reason: collision with root package name */
    public final l f9075a;

    /* renamed from: b, reason: collision with root package name */
    public final i f9076b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f9051c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f9053d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f9055e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f9057f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f9072x = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f9073y = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f9074z = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern A = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern B = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern C = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern E = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern F = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern H = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern I = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern J = a("CAN-SKIP-DATERANGES");
    public static final Pattern K = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern L = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern M = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern N = a("CAN-BLOCK-RELOAD");
    public static final Pattern O = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern P = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern Q = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern R = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern S = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern T = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern U = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern V = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern W = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern X = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern Y = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern Z = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f9049a0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f9050b0 = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: c0, reason: collision with root package name */
    public static final Pattern f9052c0 = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: d0, reason: collision with root package name */
    public static final Pattern f9054d0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f9056e0 = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f9058f0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f9059g0 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f9060h0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f9061i0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: j0, reason: collision with root package name */
    public static final Pattern f9062j0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f9063k0 = a("AUTOSELECT");

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f9064l0 = a("DEFAULT");

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f9065m0 = a("FORCED");

    /* renamed from: n0, reason: collision with root package name */
    public static final Pattern f9066n0 = a("INDEPENDENT");

    /* renamed from: o0, reason: collision with root package name */
    public static final Pattern f9067o0 = a("GAP");

    /* renamed from: p0, reason: collision with root package name */
    public static final Pattern f9068p0 = a("PRECISE");

    /* renamed from: q0, reason: collision with root package name */
    public static final Pattern f9069q0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: r0, reason: collision with root package name */
    public static final Pattern f9070r0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: s0, reason: collision with root package name */
    public static final Pattern f9071s0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public o(l lVar, i iVar) {
        this.f9075a = lVar;
        this.f9076b = iVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static c1.p b(String str, c1.o[] oVarArr) {
        c1.o[] oVarArr2 = new c1.o[oVarArr.length];
        for (int i10 = 0; i10 < oVarArr.length; i10++) {
            c1.o oVar = oVarArr[i10];
            oVarArr2[i10] = new c1.o(oVar.f1868b, oVar.f1869c, oVar.f1870d, null);
        }
        return new c1.p(str, true, oVarArr2);
    }

    public static c1.o c(String str, String str2, HashMap hashMap) {
        String k10 = k(str, f9049a0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f9050b0;
        if (equals) {
            String l10 = l(str, pattern, hashMap);
            return new c1.o(c1.j.f1726d, null, "video/mp4", Base64.decode(l10.substring(l10.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new c1.o(c1.j.f1726d, null, "hls", b0.G(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(k10)) {
            return null;
        }
        String l11 = l(str, pattern, hashMap);
        byte[] decode = Base64.decode(l11.substring(l11.indexOf(44)), 0);
        UUID uuid = c1.j.f1727e;
        return new c1.o(uuid, null, "video/mp4", w7.b.d(uuid, null, decode));
    }

    public static int d(String str, Pattern pattern) {
        return Integer.parseInt(l(str, pattern, Collections.emptyMap()));
    }

    public static i e(l lVar, i iVar, f.c cVar, String str) {
        boolean z9;
        List list;
        long j4;
        long j10;
        long j11;
        HashMap hashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        boolean z10;
        int i10;
        String str4;
        ArrayList arrayList3;
        int i11;
        String hexString;
        long j12;
        HashMap hashMap5;
        long j13;
        boolean z11;
        c1.p pVar;
        f fVar;
        String hexString2;
        boolean z12;
        long j14;
        String hexString3;
        long j15;
        String str5;
        String str6;
        boolean z13 = lVar.f9048c;
        HashMap hashMap6 = new HashMap();
        HashMap hashMap7 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        h hVar = new h(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, false);
        TreeMap treeMap = new TreeMap();
        String str7 = "";
        i iVar2 = iVar;
        l lVar2 = lVar;
        boolean z14 = z13;
        h hVar2 = hVar;
        String str8 = "";
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        long j22 = 0;
        long j23 = 0;
        long j24 = -1;
        int i12 = 0;
        long j25 = -9223372036854775807L;
        boolean z15 = false;
        boolean z16 = false;
        int i13 = 0;
        int i14 = 1;
        long j26 = -9223372036854775807L;
        long j27 = -9223372036854775807L;
        boolean z17 = false;
        c1.p pVar2 = null;
        c1.p pVar3 = null;
        boolean z18 = false;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        int i15 = 0;
        boolean z19 = false;
        f fVar2 = null;
        ArrayList arrayList8 = arrayList5;
        d dVar = null;
        while (cVar.r()) {
            String u9 = cVar.u();
            if (u9.startsWith("#EXT")) {
                arrayList7.add(u9);
            }
            if (u9.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String l10 = l(u9, H, hashMap6);
                if ("VOD".equals(l10)) {
                    i12 = 1;
                } else if ("EVENT".equals(l10)) {
                    i12 = 2;
                }
            } else if (u9.equals("#EXT-X-I-FRAMES-ONLY")) {
                z19 = true;
            } else if (u9.startsWith("#EXT-X-START")) {
                double parseDouble = Double.parseDouble(l(u9, T, Collections.emptyMap()));
                z15 = g(u9, f9068p0);
                j25 = (long) (parseDouble * 1000000.0d);
                i12 = i12;
            } else {
                int i16 = i12;
                if (u9.startsWith("#EXT-X-SERVER-CONTROL")) {
                    double i17 = i(u9, I);
                    if (i17 == -9.223372036854776E18d) {
                        j4 = -9223372036854775807L;
                    } else {
                        j4 = (long) (i17 * 1000000.0d);
                    }
                    boolean g10 = g(u9, J);
                    double i18 = i(u9, L);
                    if (i18 == -9.223372036854776E18d) {
                        j10 = -9223372036854775807L;
                    } else {
                        j10 = (long) (i18 * 1000000.0d);
                    }
                    double i19 = i(u9, M);
                    if (i19 == -9.223372036854776E18d) {
                        j11 = -9223372036854775807L;
                    } else {
                        j11 = (long) (i19 * 1000000.0d);
                    }
                    hVar2 = new h(j4, j10, j11, g10, g(u9, N));
                } else if (u9.startsWith("#EXT-X-PART-INF")) {
                    j27 = (long) (Double.parseDouble(l(u9, F, Collections.emptyMap())) * 1000000.0d);
                } else {
                    boolean startsWith = u9.startsWith("#EXT-X-MAP");
                    Pattern pattern = V;
                    arrayList2 = arrayList7;
                    Pattern pattern2 = f9050b0;
                    if (startsWith) {
                        String l11 = l(u9, pattern2, hashMap6);
                        String k10 = k(u9, pattern, null, hashMap6);
                        if (k10 != null) {
                            int i20 = b0.f3799a;
                            String[] split = k10.split("@", -1);
                            j24 = Long.parseLong(split[0]);
                            if (split.length > 1) {
                                j18 = Long.parseLong(split[1]);
                            }
                        }
                        if (j24 == -1) {
                            j18 = 0;
                        }
                        if (str10 != null && str9 == null) {
                            throw r0.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        fVar2 = new f(l11, j18, j24, str10, str9);
                        if (j24 != -1) {
                            j18 += j24;
                        }
                        i12 = i16;
                        j24 = -1;
                        arrayList7 = arrayList2;
                    } else {
                        HashMap hashMap8 = hashMap7;
                        d dVar2 = dVar;
                        if (u9.startsWith("#EXT-X-TARGETDURATION")) {
                            j26 = d(u9, D) * 1000000;
                        } else if (u9.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            j17 = Long.parseLong(l(u9, O, Collections.emptyMap()));
                            arrayList = arrayList6;
                            str2 = str7;
                            j19 = j17;
                            str3 = str11;
                            dVar = dVar2;
                            hashMap = hashMap8;
                            hashMap2 = hashMap;
                            arrayList6 = arrayList;
                            str11 = str3;
                            i12 = i16;
                            arrayList7 = arrayList2;
                            hashMap7 = hashMap2;
                            str7 = str2;
                        } else if (u9.startsWith("#EXT-X-VERSION")) {
                            i14 = d(u9, G);
                        } else {
                            if (u9.startsWith("#EXT-X-DEFINE")) {
                                String k11 = k(u9, f9070r0, null, hashMap6);
                                if (k11 != null) {
                                    String str12 = (String) lVar2.f9044l.get(k11);
                                    if (str12 != null) {
                                        hashMap6.put(k11, str12);
                                    }
                                } else {
                                    hashMap6.put(l(u9, f9059g0, hashMap6), l(u9, f9069q0, hashMap6));
                                }
                                hashMap3 = hashMap6;
                                arrayList = arrayList6;
                                str2 = str7;
                                str3 = str11;
                                hashMap4 = hashMap8;
                            } else if (u9.startsWith("#EXTINF")) {
                                j22 = new BigDecimal(l(u9, P, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                str8 = k(u9, Q, str7, hashMap6);
                            } else {
                                if (u9.startsWith("#EXT-X-SKIP")) {
                                    int d10 = d(u9, K);
                                    if (iVar2 != null && arrayList4.isEmpty()) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    w7.b.u(z10);
                                    int i21 = b0.f3799a;
                                    int i22 = (int) (j17 - iVar2.f9015k);
                                    int i23 = d10 + i22;
                                    if (i22 >= 0 && i23 <= iVar2.f9021r.size()) {
                                        while (i22 < i23) {
                                            f fVar3 = (f) iVar2.f9021r.get(i22);
                                            String str13 = str7;
                                            if (j17 != iVar2.f9015k) {
                                                int i24 = (iVar2.f9014j - i13) + fVar3.f8997d;
                                                ArrayList arrayList9 = new ArrayList();
                                                long j28 = j21;
                                                int i25 = 0;
                                                while (true) {
                                                    o0 o0Var = fVar3.D;
                                                    i10 = i23;
                                                    if (i25 >= o0Var.size()) {
                                                        break;
                                                    }
                                                    d dVar3 = (d) o0Var.get(i25);
                                                    arrayList9.add(new d(dVar3.f8994a, dVar3.f8995b, dVar3.f8996c, i24, j28, dVar3.f8999f, dVar3.f9000x, dVar3.f9001y, dVar3.f9002z, dVar3.A, dVar3.B, dVar3.C, dVar3.D));
                                                    j28 += dVar3.f8996c;
                                                    i25++;
                                                    i23 = i10;
                                                    str13 = str13;
                                                    arrayList6 = arrayList6;
                                                }
                                                str4 = str13;
                                                arrayList3 = arrayList6;
                                                fVar3 = new f(fVar3.f8994a, fVar3.f8995b, fVar3.C, fVar3.f8996c, i24, j21, fVar3.f8999f, fVar3.f9000x, fVar3.f9001y, fVar3.f9002z, fVar3.A, fVar3.B, arrayList9);
                                            } else {
                                                i10 = i23;
                                                str4 = str13;
                                                arrayList3 = arrayList6;
                                            }
                                            arrayList4.add(fVar3);
                                            j21 += fVar3.f8996c;
                                            long j29 = fVar3.A;
                                            if (j29 != -1) {
                                                j18 = fVar3.f9002z + j29;
                                            }
                                            String str14 = fVar3.f9001y;
                                            if (str14 == null || !str14.equals(Long.toHexString(j19))) {
                                                str9 = str14;
                                            }
                                            j19++;
                                            i22++;
                                            int i26 = fVar3.f8997d;
                                            f fVar4 = fVar3.f8995b;
                                            c1.p pVar4 = fVar3.f8999f;
                                            iVar2 = iVar;
                                            i15 = i26;
                                            str10 = fVar3.f9000x;
                                            fVar2 = fVar4;
                                            pVar3 = pVar4;
                                            i23 = i10;
                                            j20 = j21;
                                            str7 = str4;
                                            arrayList6 = arrayList3;
                                        }
                                        str2 = str7;
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        arrayList = arrayList6;
                                        str3 = str11;
                                        dVar = dVar2;
                                        hashMap2 = hashMap8;
                                    } else {
                                        throw new n();
                                    }
                                } else {
                                    ArrayList arrayList10 = arrayList6;
                                    str2 = str7;
                                    if (u9.startsWith("#EXT-X-KEY")) {
                                        String l12 = l(u9, Y, hashMap6);
                                        String k12 = k(u9, Z, "identity", hashMap6);
                                        if ("NONE".equals(l12)) {
                                            treeMap.clear();
                                            str5 = null;
                                        } else {
                                            String k13 = k(u9, f9052c0, null, hashMap6);
                                            if ("identity".equals(k12)) {
                                                if ("AES-128".equals(l12)) {
                                                    str10 = l(u9, pattern2, hashMap6);
                                                    str9 = k13;
                                                    lVar2 = lVar;
                                                    iVar2 = iVar;
                                                    i12 = i16;
                                                    arrayList7 = arrayList2;
                                                    hashMap7 = hashMap8;
                                                    dVar = dVar2;
                                                    str7 = str2;
                                                    arrayList6 = arrayList10;
                                                }
                                            } else {
                                                String str15 = str11;
                                                if (str15 == null) {
                                                    if (!"SAMPLE-AES-CENC".equals(l12) && !"SAMPLE-AES-CTR".equals(l12)) {
                                                        str6 = "cbcs";
                                                    } else {
                                                        str6 = "cenc";
                                                    }
                                                    str11 = str6;
                                                } else {
                                                    str11 = str15;
                                                }
                                                c1.o c6 = c(u9, k12, hashMap6);
                                                if (c6 != null) {
                                                    treeMap.put(k12, c6);
                                                    str5 = k13;
                                                }
                                            }
                                            str9 = k13;
                                            str10 = null;
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            i12 = i16;
                                            arrayList7 = arrayList2;
                                            hashMap7 = hashMap8;
                                            dVar = dVar2;
                                            str7 = str2;
                                            arrayList6 = arrayList10;
                                        }
                                        str9 = str5;
                                        pVar3 = null;
                                        str10 = null;
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        i12 = i16;
                                        arrayList7 = arrayList2;
                                        hashMap7 = hashMap8;
                                        dVar = dVar2;
                                        str7 = str2;
                                        arrayList6 = arrayList10;
                                    } else {
                                        str3 = str11;
                                        if (u9.startsWith("#EXT-X-BYTERANGE")) {
                                            String l13 = l(u9, U, hashMap6);
                                            int i27 = b0.f3799a;
                                            String[] split2 = l13.split("@", -1);
                                            j24 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j18 = Long.parseLong(split2[1]);
                                            }
                                        } else if (u9.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i13 = Integer.parseInt(u9.substring(u9.indexOf(58) + 1));
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            dVar = dVar2;
                                            arrayList = arrayList10;
                                            z16 = true;
                                            hashMap2 = hashMap8;
                                        } else if (u9.equals("#EXT-X-DISCONTINUITY")) {
                                            i15++;
                                        } else {
                                            if (u9.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j16 == 0) {
                                                    j16 = b0.O(b0.R(u9.substring(u9.indexOf(58) + 1))) - j21;
                                                } else {
                                                    arrayList = arrayList10;
                                                }
                                            } else if (u9.equals("#EXT-X-GAP")) {
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                                dVar = dVar2;
                                                arrayList = arrayList10;
                                                z18 = true;
                                                hashMap2 = hashMap8;
                                            } else if (u9.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                                dVar = dVar2;
                                                arrayList = arrayList10;
                                                z14 = true;
                                                hashMap2 = hashMap8;
                                            } else if (u9.equals("#EXT-X-ENDLIST")) {
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                                dVar = dVar2;
                                                arrayList = arrayList10;
                                                z17 = true;
                                                hashMap2 = hashMap8;
                                            } else if (u9.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long j30 = j(u9, R);
                                                Matcher matcher = S.matcher(u9);
                                                if (matcher.find()) {
                                                    String group = matcher.group(1);
                                                    group.getClass();
                                                    i11 = Integer.parseInt(group);
                                                } else {
                                                    i11 = -1;
                                                }
                                                e eVar = new e(Uri.parse(j5.a.Z(str, l(u9, pattern2, hashMap6))), j30, i11);
                                                arrayList = arrayList10;
                                                arrayList.add(eVar);
                                            } else {
                                                arrayList = arrayList10;
                                                if (u9.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                    if (dVar2 == null && "PART".equals(l(u9, f9056e0, hashMap6))) {
                                                        String l14 = l(u9, pattern2, hashMap6);
                                                        long j31 = j(u9, W);
                                                        long j32 = j(u9, X);
                                                        if (str10 == null) {
                                                            hexString3 = null;
                                                        } else if (str9 != null) {
                                                            hexString3 = str9;
                                                        } else {
                                                            hexString3 = Long.toHexString(j19);
                                                        }
                                                        if (pVar3 == null && !treeMap.isEmpty()) {
                                                            c1.o[] oVarArr = (c1.o[]) treeMap.values().toArray(new c1.o[0]);
                                                            c1.p pVar5 = new c1.p(str3, true, oVarArr);
                                                            if (pVar2 == null) {
                                                                pVar2 = b(str3, oVarArr);
                                                            }
                                                            pVar3 = pVar5;
                                                        }
                                                        if (j31 != -1 && j32 == -1) {
                                                            dVar = dVar2;
                                                        } else {
                                                            if (j31 != -1) {
                                                                j15 = j31;
                                                            } else {
                                                                j15 = 0;
                                                            }
                                                            dVar = new d(l14, fVar2, 0L, i15, j20, pVar3, str10, hexString3, j15, j32, false, false, true);
                                                        }
                                                        lVar2 = lVar;
                                                        iVar2 = iVar;
                                                        hashMap2 = hashMap8;
                                                    }
                                                } else if (u9.startsWith("#EXT-X-PART")) {
                                                    if (str10 == null) {
                                                        hexString2 = null;
                                                    } else if (str9 != null) {
                                                        hexString2 = str9;
                                                    } else {
                                                        hexString2 = Long.toHexString(j19);
                                                    }
                                                    String l15 = l(u9, pattern2, hashMap6);
                                                    long parseDouble2 = (long) (Double.parseDouble(l(u9, E, Collections.emptyMap())) * 1000000.0d);
                                                    boolean g11 = g(u9, f9066n0);
                                                    if (z14 && arrayList8.isEmpty()) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    boolean z20 = g11 | z12;
                                                    boolean g12 = g(u9, f9067o0);
                                                    String k14 = k(u9, pattern, null, hashMap6);
                                                    if (k14 != null) {
                                                        int i28 = b0.f3799a;
                                                        String[] split3 = k14.split("@", -1);
                                                        j14 = Long.parseLong(split3[0]);
                                                        if (split3.length > 1) {
                                                            j23 = Long.parseLong(split3[1]);
                                                        }
                                                    } else {
                                                        j14 = -1;
                                                    }
                                                    if (j14 == -1) {
                                                        j23 = 0;
                                                    }
                                                    if (pVar3 == null && !treeMap.isEmpty()) {
                                                        c1.o[] oVarArr2 = (c1.o[]) treeMap.values().toArray(new c1.o[0]);
                                                        c1.p pVar6 = new c1.p(str3, true, oVarArr2);
                                                        if (pVar2 == null) {
                                                            pVar2 = b(str3, oVarArr2);
                                                        }
                                                        pVar3 = pVar6;
                                                    }
                                                    arrayList8.add(new d(l15, fVar2, parseDouble2, i15, j20, pVar3, str10, hexString2, j23, j14, g12, z20, false));
                                                    j20 += parseDouble2;
                                                    if (j14 != -1) {
                                                        j23 += j14;
                                                    }
                                                    lVar2 = lVar;
                                                    iVar2 = iVar;
                                                    arrayList6 = arrayList;
                                                    str11 = str3;
                                                    i12 = i16;
                                                    arrayList7 = arrayList2;
                                                    hashMap7 = hashMap8;
                                                    dVar = dVar2;
                                                    str7 = str2;
                                                } else if (!u9.startsWith("#")) {
                                                    if (str10 == null) {
                                                        hexString = null;
                                                    } else if (str9 != null) {
                                                        hexString = str9;
                                                    } else {
                                                        hexString = Long.toHexString(j19);
                                                    }
                                                    long j33 = j19 + 1;
                                                    String m5 = m(u9, hashMap6);
                                                    f fVar5 = (f) hashMap8.get(m5);
                                                    if (j24 == -1) {
                                                        j12 = 0;
                                                    } else {
                                                        if (z19 && fVar2 == null && fVar5 == null) {
                                                            fVar5 = new f(m5, 0L, j18, null, null);
                                                            hashMap8.put(m5, fVar5);
                                                        }
                                                        j12 = j18;
                                                    }
                                                    if (pVar3 == null && !treeMap.isEmpty()) {
                                                        hashMap5 = hashMap6;
                                                        j13 = j33;
                                                        z11 = false;
                                                        c1.o[] oVarArr3 = (c1.o[]) treeMap.values().toArray(new c1.o[0]);
                                                        pVar = new c1.p(str3, true, oVarArr3);
                                                        if (pVar2 == null) {
                                                            pVar2 = b(str3, oVarArr3);
                                                        }
                                                    } else {
                                                        hashMap5 = hashMap6;
                                                        j13 = j33;
                                                        z11 = false;
                                                        pVar = pVar3;
                                                    }
                                                    if (fVar2 != null) {
                                                        fVar = fVar2;
                                                    } else {
                                                        fVar = fVar5;
                                                    }
                                                    arrayList4.add(new f(m5, fVar, str8, j22, i15, j21, pVar, str10, hexString, j12, j24, z18, arrayList8));
                                                    j20 = j21 + j22;
                                                    arrayList8 = new ArrayList();
                                                    if (j24 != -1) {
                                                        j12 += j24;
                                                    }
                                                    j18 = j12;
                                                    lVar2 = lVar;
                                                    iVar2 = iVar;
                                                    z18 = z11;
                                                    str11 = str3;
                                                    pVar3 = pVar;
                                                    hashMap7 = hashMap8;
                                                    i12 = i16;
                                                    j22 = 0;
                                                    j24 = -1;
                                                    j21 = j20;
                                                    hashMap6 = hashMap5;
                                                    j19 = j13;
                                                    arrayList7 = arrayList2;
                                                    dVar = dVar2;
                                                    str7 = str2;
                                                    str8 = str7;
                                                    arrayList6 = arrayList;
                                                }
                                            }
                                            hashMap3 = hashMap6;
                                            hashMap4 = hashMap8;
                                        }
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        dVar = dVar2;
                                        arrayList = arrayList10;
                                        hashMap2 = hashMap8;
                                    }
                                }
                                arrayList6 = arrayList;
                                str11 = str3;
                                i12 = i16;
                                arrayList7 = arrayList2;
                                hashMap7 = hashMap2;
                                str7 = str2;
                            }
                            lVar2 = lVar;
                            iVar2 = iVar;
                            arrayList6 = arrayList;
                            str11 = str3;
                            hashMap7 = hashMap4;
                            i12 = i16;
                            hashMap6 = hashMap3;
                            arrayList7 = arrayList2;
                            dVar = dVar2;
                            str7 = str2;
                        }
                        arrayList = arrayList6;
                        str2 = str7;
                        str3 = str11;
                        dVar = dVar2;
                        hashMap = hashMap8;
                        hashMap2 = hashMap;
                        arrayList6 = arrayList;
                        str11 = str3;
                        i12 = i16;
                        arrayList7 = arrayList2;
                        hashMap7 = hashMap2;
                        str7 = str2;
                    }
                }
                hashMap = hashMap7;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                str2 = str7;
                str3 = str11;
                hashMap2 = hashMap;
                arrayList6 = arrayList;
                str11 = str3;
                i12 = i16;
                arrayList7 = arrayList2;
                hashMap7 = hashMap2;
                str7 = str2;
            }
        }
        int i29 = i12;
        d dVar4 = dVar;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList7;
        HashMap hashMap9 = new HashMap();
        for (int i30 = 0; i30 < arrayList11.size(); i30++) {
            e eVar2 = (e) arrayList11.get(i30);
            long j34 = eVar2.f8992b;
            if (j34 == -1) {
                j34 = (j17 + arrayList4.size()) - (arrayList8.isEmpty() ? 1L : 0L);
            }
            int i31 = eVar2.f8993c;
            if (i31 == -1 && j27 != -9223372036854775807L) {
                if (arrayList8.isEmpty()) {
                    list = ((f) h0.X(arrayList4)).D;
                } else {
                    list = arrayList8;
                }
                i31 = list.size() - 1;
                Uri uri = eVar2.f8991a;
                hashMap9.put(uri, new e(uri, j34, i31));
            }
            Uri uri2 = eVar2.f8991a;
            hashMap9.put(uri2, new e(uri2, j34, i31));
        }
        if (dVar4 != null) {
            arrayList8.add(dVar4);
        }
        if (j16 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        return new i(i29, str, arrayList12, j25, z15, j16, z16, i13, j17, i14, j26, j27, z14, z17, z9, pVar2, arrayList4, arrayList8, hVar2, hashMap9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    public static l f(f.c cVar, String str) {
        ArrayList arrayList;
        String str2;
        int i10;
        int i11;
        Uri c02;
        char c6;
        v vVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        k kVar;
        String str3;
        ArrayList arrayList4;
        v vVar2;
        ArrayList arrayList5;
        int parseInt;
        String str4;
        k kVar2;
        String str5;
        k kVar3;
        HashSet hashSet;
        HashMap hashMap;
        boolean z9;
        int i12;
        ArrayList arrayList6;
        int i13;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        int i14;
        int i15;
        ArrayList arrayList10;
        float f10;
        Uri c03;
        HashMap hashMap2;
        int i16;
        String str6;
        String str7 = str;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            boolean r8 = cVar.r();
            Pattern pattern = f9050b0;
            String str8 = "application/x-mpegURL";
            boolean z12 = z10;
            Pattern pattern2 = f9059g0;
            if (r8) {
                String u9 = cVar.u();
                ArrayList arrayList19 = arrayList15;
                if (u9.startsWith("#EXT")) {
                    arrayList18.add(u9);
                }
                boolean startsWith = u9.startsWith("#EXT-X-I-FRAME-STREAM-INF");
                ArrayList arrayList20 = arrayList18;
                if (u9.startsWith("#EXT-X-DEFINE")) {
                    hashMap4.put(l(u9, pattern2, hashMap4), l(u9, f9069q0, hashMap4));
                } else if (u9.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z10 = true;
                    arrayList10 = arrayList16;
                    arrayList9 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList7 = arrayList14;
                    arrayList6 = arrayList17;
                    hashMap2 = hashMap3;
                    hashMap3 = hashMap2;
                    arrayList15 = arrayList19;
                    arrayList18 = arrayList20;
                    arrayList17 = arrayList6;
                    arrayList14 = arrayList7;
                    arrayList13 = arrayList8;
                    arrayList12 = arrayList9;
                    arrayList16 = arrayList10;
                } else if (u9.startsWith("#EXT-X-MEDIA")) {
                    arrayList16.add(u9);
                } else if (u9.startsWith("#EXT-X-SESSION-KEY")) {
                    c1.o c10 = c(u9, k(u9, Z, "identity", hashMap4), hashMap4);
                    if (c10 != null) {
                        String l10 = l(u9, Y, hashMap4);
                        if (!"SAMPLE-AES-CENC".equals(l10) && !"SAMPLE-AES-CTR".equals(l10)) {
                            str6 = "cbcs";
                        } else {
                            str6 = "cenc";
                        }
                        arrayList17.add(new c1.p(str6, true, c10));
                    }
                } else if (u9.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    boolean contains = z11 | u9.contains("CLOSED-CAPTIONS=NONE");
                    if (startsWith) {
                        i12 = 16384;
                    } else {
                        i12 = 0;
                    }
                    int d10 = d(u9, f9073y);
                    Matcher matcher = f9051c.matcher(u9);
                    if (matcher.find()) {
                        arrayList6 = arrayList17;
                        String group = matcher.group(1);
                        group.getClass();
                        i13 = Integer.parseInt(group);
                    } else {
                        arrayList6 = arrayList17;
                        i13 = -1;
                    }
                    arrayList7 = arrayList14;
                    String k10 = k(u9, A, null, hashMap4);
                    arrayList8 = arrayList13;
                    String k11 = k(u9, B, null, hashMap4);
                    if (k11 != null) {
                        int i17 = b0.f3799a;
                        arrayList9 = arrayList12;
                        String[] split = k11.split("x", -1);
                        int parseInt2 = Integer.parseInt(split[0]);
                        i15 = Integer.parseInt(split[1]);
                        if (parseInt2 > 0 && i15 > 0) {
                            i16 = parseInt2;
                        } else {
                            i15 = -1;
                            i16 = -1;
                        }
                        i14 = i16;
                    } else {
                        arrayList9 = arrayList12;
                        i14 = -1;
                        i15 = -1;
                    }
                    arrayList10 = arrayList16;
                    String k12 = k(u9, C, null, hashMap4);
                    if (k12 != null) {
                        f10 = Float.parseFloat(k12);
                    } else {
                        f10 = -1.0f;
                    }
                    HashMap hashMap5 = hashMap3;
                    String k13 = k(u9, f9053d, null, hashMap4);
                    String k14 = k(u9, f9055e, null, hashMap4);
                    String k15 = k(u9, f9057f, null, hashMap4);
                    String k16 = k(u9, f9072x, null, hashMap4);
                    if (startsWith) {
                        c03 = j5.a.c0(str7, l(u9, pattern, hashMap4));
                    } else if (cVar.r()) {
                        c03 = j5.a.c0(str7, m(cVar.u(), hashMap4));
                    } else {
                        throw r0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                    }
                    u uVar = new u();
                    uVar.c(arrayList11.size());
                    uVar.b("application/x-mpegURL");
                    uVar.f1905i = k10;
                    uVar.f1903g = i13;
                    uVar.f1904h = d10;
                    uVar.f1912q = i14;
                    uVar.f1913r = i15;
                    uVar.f1914s = f10;
                    uVar.f1902f = i12;
                    arrayList11.add(new k(c03, new v(uVar), k13, k14, k15, k16));
                    hashMap2 = hashMap5;
                    ArrayList arrayList21 = (ArrayList) hashMap2.get(c03);
                    if (arrayList21 == null) {
                        arrayList21 = new ArrayList();
                        hashMap2.put(c03, arrayList21);
                    }
                    arrayList21.add(new p1.u(i13, d10, k13, k14, k15, k16));
                    z10 = z12;
                    z11 = contains;
                    hashMap3 = hashMap2;
                    arrayList15 = arrayList19;
                    arrayList18 = arrayList20;
                    arrayList17 = arrayList6;
                    arrayList14 = arrayList7;
                    arrayList13 = arrayList8;
                    arrayList12 = arrayList9;
                    arrayList16 = arrayList10;
                }
                z10 = z12;
                arrayList10 = arrayList16;
                arrayList9 = arrayList12;
                arrayList8 = arrayList13;
                arrayList7 = arrayList14;
                arrayList6 = arrayList17;
                hashMap2 = hashMap3;
                hashMap3 = hashMap2;
                arrayList15 = arrayList19;
                arrayList18 = arrayList20;
                arrayList17 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
            } else {
                ArrayList arrayList22 = arrayList16;
                ArrayList arrayList23 = arrayList12;
                ArrayList arrayList24 = arrayList13;
                ArrayList arrayList25 = arrayList14;
                ArrayList arrayList26 = arrayList15;
                ArrayList arrayList27 = arrayList18;
                ArrayList arrayList28 = arrayList17;
                HashMap hashMap6 = hashMap3;
                ArrayList arrayList29 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i18 = 0;
                while (i18 < arrayList11.size()) {
                    k kVar4 = (k) arrayList11.get(i18);
                    if (hashSet2.add(kVar4.f9029a)) {
                        v vVar3 = kVar4.f9030b;
                        if (vVar3.f1933k == null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        w7.b.u(z9);
                        ArrayList arrayList30 = (ArrayList) hashMap6.get(kVar4.f9029a);
                        arrayList30.getClass();
                        hashSet = hashSet2;
                        p0 p0Var = new p0(new p1.v(null, null, arrayList30));
                        u uVar2 = new u(vVar3);
                        uVar2.f1906j = p0Var;
                        hashMap = hashMap6;
                        arrayList29.add(new k(kVar4.f9029a, new v(uVar2), kVar4.f9031c, kVar4.f9032d, kVar4.f9033e, kVar4.f9034f));
                    } else {
                        hashSet = hashSet2;
                        hashMap = hashMap6;
                    }
                    i18++;
                    hashSet2 = hashSet;
                    hashMap6 = hashMap;
                }
                int i19 = 0;
                ArrayList arrayList31 = null;
                v vVar4 = null;
                while (i19 < arrayList22.size()) {
                    String str9 = (String) arrayList22.get(i19);
                    String l11 = l(str9, f9060h0, hashMap4);
                    String l12 = l(str9, pattern2, hashMap4);
                    u uVar3 = new u();
                    StringBuilder sb = new StringBuilder();
                    sb.append(l11);
                    Pattern pattern3 = pattern2;
                    sb.append(":");
                    sb.append(l12);
                    uVar3.f1897a = sb.toString();
                    uVar3.f1898b = l12;
                    uVar3.b(str8);
                    boolean g10 = g(str9, f9064l0);
                    boolean z13 = g10;
                    if (g(str9, f9065m0)) {
                        z13 = (g10 ? 1 : 0) | 2;
                    }
                    ?? r42 = z13;
                    if (g(str9, f9063k0)) {
                        r42 = (z13 ? 1 : 0) | 4;
                    }
                    uVar3.f1901e = r42;
                    String k17 = k(str9, f9061i0, null, hashMap4);
                    if (TextUtils.isEmpty(k17)) {
                        str2 = str8;
                        i11 = 0;
                    } else {
                        int i20 = b0.f3799a;
                        str2 = str8;
                        String[] split2 = k17.split(",", -1);
                        if (b0.j(split2, "public.accessibility.describes-video")) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        if (b0.j(split2, "public.accessibility.transcribes-spoken-dialog")) {
                            i10 |= 4096;
                        }
                        if (b0.j(split2, "public.accessibility.describes-music-and-sound")) {
                            i10 |= 1024;
                        }
                        if (b0.j(split2, "public.easy-to-read")) {
                            i11 = i10 | 8192;
                        } else {
                            i11 = i10;
                        }
                    }
                    uVar3.f1902f = i11;
                    uVar3.f1900d = k(str9, f9058f0, null, hashMap4);
                    String k18 = k(str9, pattern, null, hashMap4);
                    if (k18 == null) {
                        c02 = null;
                    } else {
                        c02 = j5.a.c0(str7, k18);
                    }
                    Pattern pattern4 = pattern;
                    p0 p0Var2 = new p0(new p1.v(l11, l12, Collections.emptyList()));
                    String l13 = l(str9, f9054d0, hashMap4);
                    switch (l13.hashCode()) {
                        case -959297733:
                            if (l13.equals("SUBTITLES")) {
                                c6 = 0;
                                break;
                            }
                            break;
                        case -333210994:
                            if (l13.equals("CLOSED-CAPTIONS")) {
                                c6 = 1;
                                break;
                            }
                            break;
                        case 62628790:
                            if (l13.equals("AUDIO")) {
                                c6 = 2;
                                break;
                            }
                            break;
                        case 81665115:
                            if (l13.equals("VIDEO")) {
                                c6 = 3;
                                break;
                            }
                            break;
                    }
                    c6 = 65535;
                    if (c6 != 0) {
                        if (c6 != 1) {
                            if (c6 != 2) {
                                if (c6 == 3) {
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < arrayList11.size()) {
                                            kVar3 = (k) arrayList11.get(i21);
                                            if (!l11.equals(kVar3.f9031c)) {
                                                i21++;
                                            }
                                        } else {
                                            kVar3 = null;
                                        }
                                    }
                                    if (kVar3 != null) {
                                        v vVar5 = kVar3.f9030b;
                                        String s9 = b0.s(2, vVar5.f1932j);
                                        uVar3.f1905i = s9;
                                        uVar3.e(q0.e(s9));
                                        uVar3.f1912q = vVar5.f1939r;
                                        uVar3.f1913r = vVar5.f1940s;
                                        uVar3.f1914s = vVar5.f1941t;
                                    }
                                    if (c02 != null) {
                                        uVar3.f1906j = p0Var2;
                                        arrayList3 = arrayList23;
                                        arrayList3.add(new j(c02, new v(uVar3), l12));
                                        vVar = vVar4;
                                        arrayList4 = arrayList25;
                                        arrayList2 = arrayList24;
                                    }
                                }
                                arrayList3 = arrayList23;
                                vVar = vVar4;
                                arrayList4 = arrayList25;
                                arrayList2 = arrayList24;
                            } else {
                                arrayList3 = arrayList23;
                                int i22 = 0;
                                while (true) {
                                    if (i22 < arrayList11.size()) {
                                        kVar2 = (k) arrayList11.get(i22);
                                        vVar2 = vVar4;
                                        if (!l11.equals(kVar2.f9032d)) {
                                            i22++;
                                            vVar4 = vVar2;
                                        }
                                    } else {
                                        vVar2 = vVar4;
                                        kVar2 = null;
                                    }
                                }
                                if (kVar2 != null) {
                                    String s10 = b0.s(1, kVar2.f9030b.f1932j);
                                    uVar3.f1905i = s10;
                                    str5 = q0.e(s10);
                                } else {
                                    str5 = null;
                                }
                                String k19 = k(str9, f9074z, null, hashMap4);
                                if (k19 != null) {
                                    int i23 = b0.f3799a;
                                    uVar3.f1920y = Integer.parseInt(k19.split("/", 2)[0]);
                                    if ("audio/eac3".equals(str5) && k19.endsWith("/JOC")) {
                                        uVar3.f1905i = "ec+3";
                                        str5 = "audio/eac3-joc";
                                    }
                                }
                                uVar3.e(str5);
                                if (c02 != null) {
                                    uVar3.f1906j = p0Var2;
                                    j jVar = new j(c02, new v(uVar3), l12);
                                    arrayList5 = arrayList24;
                                    arrayList5.add(jVar);
                                } else {
                                    arrayList5 = arrayList24;
                                    if (kVar2 != null) {
                                        vVar2 = new v(uVar3);
                                    }
                                }
                            }
                        } else {
                            vVar2 = vVar4;
                            arrayList5 = arrayList24;
                            arrayList3 = arrayList23;
                            String l14 = l(str9, f9062j0, hashMap4);
                            if (l14.startsWith("CC")) {
                                parseInt = Integer.parseInt(l14.substring(2));
                                str4 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(l14.substring(7));
                                str4 = "application/cea-708";
                            }
                            if (arrayList31 == null) {
                                arrayList31 = new ArrayList();
                            }
                            uVar3.e(str4);
                            uVar3.D = parseInt;
                            arrayList31.add(new v(uVar3));
                        }
                        arrayList2 = arrayList5;
                        vVar4 = vVar2;
                        arrayList4 = arrayList25;
                        i19++;
                        str7 = str;
                        arrayList24 = arrayList2;
                        arrayList25 = arrayList4;
                        arrayList23 = arrayList3;
                        pattern2 = pattern3;
                        str8 = str2;
                        pattern = pattern4;
                    } else {
                        vVar = vVar4;
                        arrayList2 = arrayList24;
                        arrayList3 = arrayList23;
                        int i24 = 0;
                        while (true) {
                            if (i24 < arrayList11.size()) {
                                kVar = (k) arrayList11.get(i24);
                                if (!l11.equals(kVar.f9033e)) {
                                    i24++;
                                }
                            } else {
                                kVar = null;
                            }
                        }
                        if (kVar != null) {
                            String s11 = b0.s(3, kVar.f9030b.f1932j);
                            uVar3.f1905i = s11;
                            str3 = q0.e(s11);
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = "text/vtt";
                        }
                        uVar3.e(str3);
                        uVar3.f1906j = p0Var2;
                        if (c02 != null) {
                            arrayList4 = arrayList25;
                            arrayList4.add(new j(c02, new v(uVar3), l12));
                        } else {
                            arrayList4 = arrayList25;
                            f1.o.f("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                        }
                    }
                    vVar4 = vVar;
                    i19++;
                    str7 = str;
                    arrayList24 = arrayList2;
                    arrayList25 = arrayList4;
                    arrayList23 = arrayList3;
                    pattern2 = pattern3;
                    str8 = str2;
                    pattern = pattern4;
                }
                v vVar6 = vVar4;
                ArrayList arrayList32 = arrayList25;
                ArrayList arrayList33 = arrayList24;
                ArrayList arrayList34 = arrayList23;
                if (z11) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = arrayList31;
                }
                return new l(str, arrayList27, arrayList29, arrayList34, arrayList33, arrayList32, arrayList26, vVar6, arrayList, z12, hashMap4, arrayList28);
            }
        }
    }

    public static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return -9.223372036854776E18d;
    }

    public static long j(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String k(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return m(str2, map);
        }
        return str2;
    }

    public static String l(String str, Pattern pattern, Map map) {
        String k10 = k(str, pattern, null, map);
        if (k10 != null) {
            return k10;
        }
        throw r0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String m(String str, Map map) {
        Matcher matcher = f9071s0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[Catch: all -> 0x003b, LOOP:0: B:13:0x006c->B:38:0x006c, LOOP_START, TryCatch #2 {all -> 0x003b, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x006c, B:15:0x0072, B:18:0x007d, B:57:0x0085, B:20:0x0096, B:22:0x009e, B:24:0x00a6, B:26:0x00ae, B:28:0x00b6, B:30:0x00be, B:32:0x00c6, B:34:0x00ce, B:36:0x00d7, B:41:0x00db, B:69:0x0101, B:70:0x0107, B:74:0x0030, B:76:0x0036, B:81:0x0042, B:83:0x004b, B:88:0x0054, B:90:0x005a, B:92:0x0060, B:94:0x0065), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0101 A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #2 {all -> 0x003b, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x006c, B:15:0x0072, B:18:0x007d, B:57:0x0085, B:20:0x0096, B:22:0x009e, B:24:0x00a6, B:26:0x00ae, B:28:0x00b6, B:30:0x00be, B:32:0x00c6, B:34:0x00ce, B:36:0x00d7, B:41:0x00db, B:69:0x0101, B:70:0x0107, B:74:0x0030, B:76:0x0036, B:81:0x0042, B:83:0x004b, B:88:0x0054, B:90:0x005a, B:92:0x0060, B:94:0x0065), top: B:2:0x000f }] */
    @Override // z1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.net.Uri r7, h1.j r8) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.o.h(android.net.Uri, h1.j):java.lang.Object");
    }
}

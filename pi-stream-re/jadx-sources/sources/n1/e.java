package n1;

import android.net.Uri;
import android.text.TextUtils;
import c1.r0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import f1.b0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import msr.pistream.app.download.PiStreamDownloadService;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p7.a0;

/* loaded from: classes.dex */
public final class e extends DefaultHandler implements z1.q {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f7930b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f7931c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f7932d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f7933e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f7934a;

    public e() {
        try {
            this.f7934a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long a(ArrayList arrayList, long j4, long j10, int i10, long j11) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = b0.f3799a;
            i11 = (int) ((((j11 - j4) + j10) - 1) / j10);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(new q(j4, j10));
            j4 += j10;
        }
        return j4;
    }

    public static void b(XmlPullParser xmlPullParser) {
        boolean z9;
        if (!a0.K(xmlPullParser)) {
            return;
        }
        int i10 = 1;
        while (i10 != 0) {
            xmlPullParser.next();
            if (a0.K(xmlPullParser)) {
                i10++;
            } else {
                if (xmlPullParser.getEventType() == 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i10--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        if (r0 == 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
    
        if (r0.equals("4000") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0102, code lost:
    
        if (r0 < 33) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.e.d(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long e(XmlPullParser xmlPullParser, long j4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j4;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList f(XmlPullParser xmlPullParser, List list, boolean z9) {
        int i10;
        int i11;
        boolean z10;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else if (z9) {
            i10 = 1;
        } else {
            i10 = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i11 = Integer.parseInt(attributeValue2);
        } else {
            i11 = 1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!a0.H(xmlPullParser, "BaseURL"));
        if (str2 != null && j5.a.C(str2)[0] != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (attributeValue3 == null) {
                attributeValue3 = str2;
            }
            return com.bumptech.glide.c.N(new b(str2, i10, i11, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = (b) list.get(i12);
            String Z = j5.a.Z(bVar.f7904a, str2);
            if (attributeValue3 == null) {
                str = Z;
            } else {
                str = attributeValue3;
            }
            if (z9) {
                i10 = bVar.f7906c;
                i11 = bVar.f7907d;
                str = bVar.f7905b;
            }
            arrayList.add(new b(Z, i10, i11, str));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair g(org.xmlpull.v1.XmlPullParser r14) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.e.g(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int i(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (!TextUtils.isEmpty(attributeValue)) {
            if ("audio".equals(attributeValue)) {
                return 1;
            }
            if ("video".equals(attributeValue)) {
                return 2;
            }
            if ("text".equals(attributeValue)) {
                return 3;
            }
            if ("image".equals(attributeValue)) {
                return 4;
            }
        }
        return -1;
    }

    public static f j(XmlPullParser xmlPullParser, String str) {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, PiStreamDownloadService.EXTRA_ID);
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!a0.H(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long k(XmlPullParser xmlPullParser, String str, long j4) {
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j4;
        }
        Matcher matcher = b0.f3807i.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d15 = 0.0d;
            if (group != null) {
                d10 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d10 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d11 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d11 = 0.0d;
            }
            double d16 = d10 + d11;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d12 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d12 = 0.0d;
            }
            double d17 = d16 + d12;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d13 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d13 = 0.0d;
            }
            double d18 = d17 + d13;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d14 = Double.parseDouble(group5) * 60.0d;
            } else {
                d14 = 0.0d;
            }
            double d19 = d18 + d14;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d15 = Double.parseDouble(group6);
            }
            long j10 = (long) ((d19 + d15) * 1000.0d);
            if (isEmpty) {
                return -j10;
            }
            return j10;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static float l(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f7930b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                if (!TextUtils.isEmpty(matcher.group(2))) {
                    return parseInt / Integer.parseInt(r2);
                }
                return parseInt;
            }
            return f10;
        }
        return f10;
    }

    public static int m(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Integer.parseInt(attributeValue);
        }
        return i10;
    }

    public static long n(XmlPullParser xmlPullParser, String str, long j4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Long.parseLong(attributeValue);
        }
        return j4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0866, code lost:
    
        if ("audio/eac3-joc".equals(r0) != false) goto L273;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:624:0x0f73. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0e72 A[LOOP:5: B:151:0x039e->B:159:0x0e72, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0cdb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0dda A[LOOP:9: B:192:0x0da5->B:206:0x0dda, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0dd6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0b47 A[LOOP:11: B:310:0x05b7->B:319:0x0b47, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x08a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x123d A[LOOP:1: B:34:0x00d3->B:42:0x123d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x1207 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0ae4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n1.c o(org.xmlpull.v1.XmlPullParser r163, android.net.Uri r164) {
        /*
            Method dump skipped, instructions count: 4730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.e.o(org.xmlpull.v1.XmlPullParser, android.net.Uri):n1.c");
    }

    public static j p(XmlPullParser xmlPullParser, String str, String str2) {
        long j4;
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j4 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j10 = (Long.parseLong(split[1]) - j4) + 1;
                return new j(attributeValue, j4, j10);
            }
        } else {
            j4 = 0;
        }
        j10 = -1;
        return new j(attributeValue, j4, j10);
    }

    public static int q(String str) {
        if (str == null) {
            return 0;
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c6 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c6 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c6 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c6 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c6 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c6 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c6 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c6 = '\f';
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case zzaja.zze.zzg /* 7 */:
                return 1;
            case '\b':
                return 256;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    public static int r(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (j5.a.s("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).f7935a)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    public static r s(XmlPullParser xmlPullParser, r rVar) {
        long j4;
        long j10;
        long j11;
        long j12;
        long j13;
        if (rVar != null) {
            j4 = rVar.f7981b;
        } else {
            j4 = 1;
        }
        long n9 = n(xmlPullParser, "timescale", j4);
        long j14 = 0;
        if (rVar != null) {
            j10 = rVar.f7982c;
        } else {
            j10 = 0;
        }
        long n10 = n(xmlPullParser, "presentationTimeOffset", j10);
        if (rVar != null) {
            j11 = rVar.f7978d;
        } else {
            j11 = 0;
        }
        if (rVar != null) {
            j14 = rVar.f7979e;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j12 = (Long.parseLong(split[1]) - parseLong) + 1;
            j13 = parseLong;
        } else {
            j12 = j14;
            j13 = j11;
        }
        if (rVar != null) {
            jVar = rVar.f7980a;
        }
        do {
            xmlPullParser.next();
            if (a0.L(xmlPullParser, "Initialization")) {
                jVar = p(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!a0.H(xmlPullParser, "SegmentBase"));
        return new r(jVar, n9, n10, j13, j12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    public static o t(XmlPullParser xmlPullParser, o oVar, long j4, long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        ArrayList arrayList;
        long j19 = 1;
        if (oVar != null) {
            j14 = oVar.f7981b;
        } else {
            j14 = 1;
        }
        long n9 = n(xmlPullParser, "timescale", j14);
        if (oVar != null) {
            j15 = oVar.f7982c;
        } else {
            j15 = 0;
        }
        long n10 = n(xmlPullParser, "presentationTimeOffset", j15);
        if (oVar != null) {
            j16 = oVar.f7967e;
        } else {
            j16 = -9223372036854775807L;
        }
        long n11 = n(xmlPullParser, "duration", j16);
        if (oVar != null) {
            j19 = oVar.f7966d;
        }
        long n12 = n(xmlPullParser, "startNumber", j19);
        if (j12 == -9223372036854775807L) {
            j17 = j11;
        } else {
            j17 = j12;
        }
        if (j17 == Long.MAX_VALUE) {
            j18 = -9223372036854775807L;
        } else {
            j18 = j17;
        }
        ArrayList arrayList2 = null;
        j jVar = null;
        List list = null;
        do {
            xmlPullParser.next();
            if (a0.L(xmlPullParser, "Initialization")) {
                jVar = p(xmlPullParser, "sourceURL", "range");
            } else if (a0.L(xmlPullParser, "SegmentTimeline")) {
                list = v(xmlPullParser, n9, j10);
            } else if (a0.L(xmlPullParser, "SegmentURL")) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(p(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!a0.H(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f7980a;
            }
            if (list == null) {
                list = oVar.f7968f;
            }
            if (arrayList2 == null) {
                arrayList = oVar.f7972j;
                return new o(jVar, n9, n10, n12, n11, list, j18, arrayList, b0.O(j13), b0.O(j4));
            }
        }
        arrayList = arrayList2;
        return new o(jVar, n9, n10, n12, n11, list, j18, arrayList, b0.O(j13), b0.O(j4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    public static p u(XmlPullParser xmlPullParser, p pVar, List list, long j4, long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        f.c cVar;
        f.c cVar2;
        j jVar;
        ArrayList arrayList;
        long j20 = 1;
        if (pVar != null) {
            j14 = pVar.f7981b;
        } else {
            j14 = 1;
        }
        long n9 = n(xmlPullParser, "timescale", j14);
        if (pVar != null) {
            j15 = pVar.f7982c;
        } else {
            j15 = 0;
        }
        long n10 = n(xmlPullParser, "presentationTimeOffset", j15);
        if (pVar != null) {
            j16 = pVar.f7967e;
        } else {
            j16 = -9223372036854775807L;
        }
        long n11 = n(xmlPullParser, "duration", j16);
        if (pVar != null) {
            j20 = pVar.f7966d;
        }
        long n12 = n(xmlPullParser, "startNumber", j20);
        int i10 = 0;
        while (true) {
            if (i10 < list.size()) {
                f fVar = (f) list.get(i10);
                if (j5.a.s("http://dashif.org/guidelines/last-segment-number", fVar.f7935a)) {
                    j17 = Long.parseLong(fVar.f7936b);
                    break;
                }
                i10++;
            } else {
                j17 = -1;
                break;
            }
        }
        long j21 = j17;
        if (j12 == -9223372036854775807L) {
            j18 = j11;
        } else {
            j18 = j12;
        }
        if (j18 == Long.MAX_VALUE) {
            j19 = -9223372036854775807L;
        } else {
            j19 = j18;
        }
        j jVar2 = null;
        if (pVar != null) {
            cVar = pVar.f7974k;
        } else {
            cVar = null;
        }
        f.c w9 = w(xmlPullParser, "media", cVar);
        if (pVar != null) {
            cVar2 = pVar.f7973j;
        } else {
            cVar2 = null;
        }
        f.c w10 = w(xmlPullParser, "initialization", cVar2);
        ArrayList arrayList2 = null;
        do {
            xmlPullParser.next();
            if (a0.L(xmlPullParser, "Initialization")) {
                jVar2 = p(xmlPullParser, "sourceURL", "range");
            } else if (a0.L(xmlPullParser, "SegmentTimeline")) {
                arrayList2 = v(xmlPullParser, n9, j10);
            } else {
                b(xmlPullParser);
            }
        } while (!a0.H(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar2 == null) {
                jVar2 = pVar.f7980a;
            }
            if (arrayList2 == null) {
                arrayList = pVar.f7968f;
                jVar = jVar2;
                return new p(jVar, n9, n10, n12, j21, n11, arrayList, j19, w10, w9, b0.O(j13), b0.O(j4));
            }
        }
        jVar = jVar2;
        arrayList = arrayList2;
        return new p(jVar, n9, n10, n12, j21, n11, arrayList, j19, w10, w9, b0.O(j13), b0.O(j4));
    }

    public static ArrayList v(XmlPullParser xmlPullParser, long j4, long j10) {
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        long j12 = -9223372036854775807L;
        boolean z9 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (a0.L(xmlPullParser, "S")) {
                long n9 = n(xmlPullParser, "t", -9223372036854775807L);
                if (z9) {
                    j11 = a(arrayList, j11, j12, i10, n9);
                }
                if (n9 == -9223372036854775807L) {
                    n9 = j11;
                }
                long n10 = n(xmlPullParser, "d", -9223372036854775807L);
                i10 = m(xmlPullParser, "r", 0);
                z9 = true;
                j12 = n10;
                j11 = n9;
            } else {
                b(xmlPullParser);
            }
        } while (!a0.H(xmlPullParser, "SegmentTimeline"));
        if (z9) {
            a(arrayList, j11, j12, i10, b0.V(j10, j4, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ff. Please report as an issue. */
    public static f.c w(XmlPullParser xmlPullParser, String str, f.c cVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add("");
            int i10 = 0;
            while (i10 < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i10);
                char c6 = 65535;
                if (indexOf == -1) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i10));
                    i10 = attributeValue.length();
                } else if (indexOf != i10) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i10, indexOf));
                    i10 = indexOf;
                } else if (attributeValue.startsWith("$$", i10)) {
                    arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                    i10 += 2;
                } else {
                    arrayList3.add("");
                    int i11 = i10 + 1;
                    int indexOf2 = attributeValue.indexOf("$", i11);
                    String substring = attributeValue.substring(i11, indexOf2);
                    if (substring.equals("RepresentationID")) {
                        arrayList2.add(1);
                    } else {
                        int indexOf3 = substring.indexOf("%0");
                        if (indexOf3 != -1) {
                            str2 = substring.substring(indexOf3);
                            if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                                str2 = str2.concat("d");
                            }
                            substring = substring.substring(0, indexOf3);
                        } else {
                            str2 = "%01d";
                        }
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1950496919:
                                if (substring.equals("Number")) {
                                    c6 = 0;
                                    break;
                                }
                                break;
                            case 2606829:
                                if (substring.equals("Time")) {
                                    c6 = 1;
                                    break;
                                }
                                break;
                            case 38199441:
                                if (substring.equals("Bandwidth")) {
                                    c6 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c6) {
                            case 0:
                                arrayList2.add(2);
                                break;
                            case 1:
                                arrayList2.add(4);
                                break;
                            case 2:
                                arrayList2.add(3);
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                        }
                        arrayList3.set(arrayList2.size() - 1, str2);
                    }
                    arrayList.add("");
                    i10 = indexOf2 + 1;
                }
            }
            return new f.c(arrayList, arrayList2, arrayList3, 7, 0);
        }
        return cVar;
    }

    @Override // z1.q
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final c h(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f7934a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return o(newPullParser, uri);
            }
            throw r0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw r0.b(null, e10);
        }
    }
}

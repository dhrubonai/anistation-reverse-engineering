package e3;

import android.text.Layout;
import f.r0;
import f1.b0;
import f1.o;
import g0.x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p7.a0;
import y2.l;

/* loaded from: classes.dex */
public final class e implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3423b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3424c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f3425d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f3426e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f3427f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f3428x = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f3429y = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: z, reason: collision with root package name */
    public static final d f3430z = new d(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f3431a;

    public e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f3431a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static g a(g gVar) {
        if (gVar == null) {
            return new g();
        }
        return gVar;
    }

    public static boolean b(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static Layout.Alignment c(String str) {
        String g02 = j5.a.g0(str);
        g02.getClass();
        char c6 = 65535;
        switch (g02.hashCode()) {
            case -1364013995:
                if (g02.equals("center")) {
                    c6 = 0;
                    break;
                }
                break;
            case 100571:
                if (g02.equals("end")) {
                    c6 = 1;
                    break;
                }
                break;
            case 3317767:
                if (g02.equals("left")) {
                    c6 = 2;
                    break;
                }
                break;
            case 108511772:
                if (g02.equals("right")) {
                    c6 = 3;
                    break;
                }
                break;
            case 109757538:
                if (g02.equals("start")) {
                    c6 = 4;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static int d(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f3429y.matcher(attributeValue);
        if (!matcher.matches()) {
            o.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z9 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z9 = false;
            }
            w7.b.f("Invalid cell resolution " + parseInt + " " + parseInt2, z9);
            return parseInt2;
        } catch (NumberFormatException unused) {
            o.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void e(String str, g gVar) {
        Matcher matcher;
        int i10 = b0.f3799a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f3425d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            o.f("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new y2.f("Invalid number of entries for fontSize: " + split.length + ".");
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            group.hashCode();
            char c6 = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c6 = 2;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    gVar.f3451j = 3;
                    break;
                case 1:
                    gVar.f3451j = 2;
                    break;
                case 2:
                    gVar.f3451j = 1;
                    break;
                default:
                    throw new y2.f(r.f.e("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            gVar.f3452k = Float.parseFloat(group2);
            return;
        }
        throw new y2.f(r.f.e("Invalid expression for fontSize: '", str, "'."));
    }

    public static d g(XmlPullParser xmlPullParser) {
        int i10;
        float f10;
        int i11;
        boolean z9;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i12 = b0.f3799a;
            if (attributeValue2.split(" ", -1).length == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            w7.b.f("frameRateMultiplier doesn't have 2 parts", z9);
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        d dVar = f3430z;
        int i13 = dVar.f3421b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i13 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        } else {
            i11 = dVar.f3422c;
        }
        return new d(i10 * f10, i13, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0223, code lost:
    
        if (p7.a0.L(r19, "metadata") != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0225, code lost:
    
        r19.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022e, code lost:
    
        if (p7.a0.L(r19, "image") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
    
        r6 = p7.a0.t(r19, msr.pistream.app.download.PiStreamDownloadService.EXTRA_ID);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0234, code lost:
    
        if (r6 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0236, code lost:
    
        r24.put(r6, r19.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0246, code lost:
    
        if (p7.a0.H(r19, "metadata") == false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(org.xmlpull.v1.XmlPullParser r19, java.util.HashMap r20, int r21, g0.x r22, java.util.HashMap r23, java.util.HashMap r24) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.e.h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, g0.x, java.util.HashMap, java.util.HashMap):void");
    }

    public static c i(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, d dVar) {
        long j4;
        long j10;
        char c6;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        g j11 = j(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c6 = 5;
                        break;
                    }
                    break;
            }
            c6 = 65535;
            if (c6 != 0) {
                if (c6 != 1) {
                    if (c6 != 2) {
                        if (c6 != 3) {
                            if (c6 != 4) {
                                if (c6 == 5 && attributeValue.startsWith("#")) {
                                    str = attributeValue.substring(1);
                                }
                            } else {
                                String trim = attributeValue.trim();
                                if (trim.isEmpty()) {
                                    split = new String[0];
                                } else {
                                    int i11 = b0.f3799a;
                                    split = trim.split("\\s+", -1);
                                }
                                if (split.length > 0) {
                                    strArr = split;
                                }
                            }
                        } else {
                            j12 = l(attributeValue, dVar);
                        }
                    } else {
                        j13 = l(attributeValue, dVar);
                    }
                } else {
                    j14 = l(attributeValue, dVar);
                }
            } else if (hashMap.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
        }
        if (cVar != null) {
            long j15 = cVar.f3410d;
            j4 = -9223372036854775807L;
            if (j15 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L) {
                    j12 += j15;
                }
                if (j13 != -9223372036854775807L) {
                    j13 += j15;
                }
            }
        } else {
            j4 = -9223372036854775807L;
        }
        if (j13 == j4) {
            if (j14 != j4) {
                j10 = j12 + j14;
            } else if (cVar != null) {
                long j16 = cVar.f3411e;
                if (j16 != j4) {
                    j10 = j16;
                }
            }
            return new c(xmlPullParser.getName(), null, j12, j10, j11, strArr, str2, str, cVar);
        }
        j10 = j13;
        return new c(xmlPullParser.getName(), null, j12, j10, j11, strArr, str2, str, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0370, code lost:
    
        switch(r4) {
            case 0: goto L232;
            case 1: goto L231;
            case 2: goto L230;
            case 3: goto L229;
            case 4: goto L232;
            case 5: goto L229;
            default: goto L306;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0375, code lost:
    
        r15 = a(r15);
        r15.f3454m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x037d, code lost:
    
        r15 = a(r15);
        r15.f3454m = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0385, code lost:
    
        r15 = a(r15);
        r15.f3454m = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x038d, code lost:
    
        r15 = a(r15);
        r15.f3454m = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03f6, code lost:
    
        switch(r4) {
            case 0: goto L261;
            case 1: goto L260;
            case 2: goto L259;
            case 3: goto L258;
            default: goto L307;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03fa, code lost:
    
        r15 = a(r15);
        r15.f3447f = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0401, code lost:
    
        r15 = a(r15);
        r15.f3447f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0408, code lost:
    
        r15 = a(r15);
        r15.f3448g = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x040f, code lost:
    
        r15 = a(r15);
        r15.f3448g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e5, code lost:
    
        if (r3.equals("auto") != false) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e3.g j(org.xmlpull.v1.XmlPullParser r14, e3.g r15) {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.e.j(org.xmlpull.v1.XmlPullParser, e3.g):e3.g");
    }

    public static long l(String str, d dVar) {
        double d10;
        double d11;
        double d12;
        double d13;
        Matcher matcher = f3423b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            double d14 = 0.0d;
            if (group2 != null) {
                d12 = Double.parseDouble(group2);
            } else {
                d12 = 0.0d;
            }
            double d15 = parseLong3 + d12;
            String group3 = matcher.group(5);
            if (group3 != null) {
                d13 = ((float) Long.parseLong(group3)) / dVar.f3420a;
            } else {
                d13 = 0.0d;
            }
            double d16 = d15 + d13;
            if (matcher.group(6) != null) {
                d14 = (Long.parseLong(r13) / dVar.f3421b) / dVar.f3420a;
            }
            return (long) ((d16 + d14) * 1000000.0d);
        }
        Matcher matcher2 = f3424c.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            double parseDouble = Double.parseDouble(group4);
            String group5 = matcher2.group(2);
            group5.getClass();
            group5.hashCode();
            char c6 = 65535;
            switch (group5.hashCode()) {
                case 102:
                    if (group5.equals("f")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 104:
                    if (group5.equals("h")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 109:
                    if (group5.equals("m")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (group5.equals("t")) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 3494:
                    if (group5.equals("ms")) {
                        c6 = 4;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    d10 = dVar.f3420a;
                    parseDouble /= d10;
                    break;
                case 1:
                    d11 = 3600.0d;
                    break;
                case 2:
                    d11 = 60.0d;
                    break;
                case 3:
                    d10 = dVar.f3422c;
                    parseDouble /= d10;
                    break;
                case 4:
                    d10 = 1000.0d;
                    parseDouble /= d10;
                    break;
            }
            parseDouble *= d11;
            return (long) (parseDouble * 1000000.0d);
        }
        throw new y2.f(r.f.d("Malformed time expression: ", str));
    }

    public static x m(XmlPullParser xmlPullParser) {
        String t9 = a0.t(xmlPullParser, "extent");
        if (t9 == null) {
            return null;
        }
        Matcher matcher = f3428x.matcher(t9);
        if (!matcher.matches()) {
            o.f("TtmlParser", "Ignoring non-pixel tts extent: ".concat(t9));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new x(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            o.f("TtmlParser", "Ignoring malformed tts extent: ".concat(t9));
            return null;
        }
    }

    @Override // y2.l
    public final /* synthetic */ void f() {
    }

    @Override // y2.l
    public final /* synthetic */ void k(byte[] bArr, r0 r0Var, w.f fVar) {
        r.f.a(this, bArr, r0Var, fVar);
    }

    @Override // y2.l
    public final void o(byte[] bArr, int i10, int i11, r0 r0Var, f1.c cVar) {
        a0.b0(r(bArr, i10, i11), r0Var, cVar);
    }

    @Override // y2.l
    public final y2.d r(byte[] bArr, int i10, int i11) {
        d dVar;
        try {
            XmlPullParser newPullParser = this.f3431a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            x xVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVar2 = f3430z;
            int i12 = 15;
            h hVar = null;
            int i13 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i13 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVar2 = g(newPullParser);
                            i12 = d(newPullParser);
                            xVar = m(newPullParser);
                        }
                        x xVar2 = xVar;
                        d dVar3 = dVar2;
                        int i14 = i12;
                        if (!b(name)) {
                            o.e("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i13++;
                            dVar2 = dVar3;
                        } else {
                            if ("head".equals(name)) {
                                dVar = dVar3;
                                h(newPullParser, hashMap, i14, xVar2, hashMap2, hashMap3);
                            } else {
                                dVar = dVar3;
                                try {
                                    c i15 = i(newPullParser, cVar, hashMap2, dVar);
                                    arrayDeque.push(i15);
                                    if (cVar != null) {
                                        if (cVar.f3419m == null) {
                                            cVar.f3419m = new ArrayList();
                                        }
                                        cVar.f3419m.add(i15);
                                    }
                                } catch (y2.f e10) {
                                    o.g("TtmlParser", "Suppressing parser error", e10);
                                    i13++;
                                }
                            }
                            dVar2 = dVar;
                        }
                        xVar = xVar2;
                        i12 = i14;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a10 = c.a(newPullParser.getText());
                        if (cVar.f3419m == null) {
                            cVar.f3419m = new ArrayList();
                        }
                        cVar.f3419m.add(a10);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            hVar = new h(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i13++;
                } else if (eventType == 3) {
                    i13--;
                }
                newPullParser.next();
            }
            hVar.getClass();
            return hVar;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // y2.l
    public final int x() {
        return 1;
    }
}

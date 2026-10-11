package defpackage;

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

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pk6 implements y16 {
    public final XmlPullParserFactory x;
    public static final Pattern y = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern z = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern A = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern B = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern C = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern D = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern E = Pattern.compile("^(\\d+) (\\d+)$");
    public static final ok6 F = new ok6(30.0f, 1, 1);

    public pk6() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.x = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            ov3.k("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    public static rk6 a(rk6 rk6Var) {
        if (rk6Var == null) {
            return new rk6();
        }
        return rk6Var;
    }

    public static boolean b(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = E.matcher(attributeValue);
        if (!matcher.matches()) {
            kb0.O("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z2 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z2 = false;
            }
            io3.j(parseInt, parseInt2, "Invalid cell resolution %s %s", z2);
            return parseInt2;
        } catch (NumberFormatException unused) {
            kb0.O("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, rk6 rk6Var) {
        Matcher matcher;
        String str2 = eq6.a;
        char c = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = A;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            kb0.O("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(zo5.k(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                    if (group.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    rk6Var.j = 3;
                    break;
                case 1:
                    rk6Var.j = 2;
                    break;
                case 2:
                    rk6Var.j = 1;
                    break;
                default:
                    throw new Exception(qx1.m("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            rk6Var.k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(qx1.m("Invalid expression for fontSize: '", str, "'."));
    }

    public static ok6 e(XmlPullParser xmlPullParser) {
        int i;
        float f;
        boolean z2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = eq6.a;
            if (attributeValue2.split(" ", -1).length == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            io3.m("frameRateMultiplier doesn't have 2 parts", z2);
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        ok6 ok6Var = F;
        int i2 = ok6Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = ok6Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new ok6(i * f, i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0252, code lost:
    
        if (defpackage.ez5.h(r21, "metadata") != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0254, code lost:
    
        r21.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x025d, code lost:
    
        if (defpackage.ez5.h(r21, "image") == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025f, code lost:
    
        r5 = defpackage.ez5.e(r21, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0263, code lost:
    
        if (r5 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0265, code lost:
    
        r26.put(r5, r21.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0275, code lost:
    
        if (defpackage.ez5.f(r21, "metadata") == false) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(org.xmlpull.v1.XmlPullParser r21, java.util.HashMap r22, int r23, defpackage.h12 r24, java.util.HashMap r25, java.util.HashMap r26) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk6.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, h12, java.util.HashMap, java.util.HashMap):void");
    }

    public static nk6 g(XmlPullParser xmlPullParser, nk6 nk6Var, HashMap hashMap, ok6 ok6Var) {
        long j;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        rk6 i = i(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j4 = j(attributeValue, ok6Var);
                    break;
                case 2:
                    j3 = j(attributeValue, ok6Var);
                    break;
                case 3:
                    j2 = j(attributeValue, ok6Var);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = eq6.a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (nk6Var != null) {
            long j5 = nk6Var.d;
            if (j5 != -9223372036854775807L) {
                if (j2 != -9223372036854775807L) {
                    j2 += j5;
                } else {
                    j2 = j5;
                }
                if (j3 != -9223372036854775807L) {
                    j3 += j5;
                }
            }
        }
        if (j3 == -9223372036854775807L) {
            if (j4 != -9223372036854775807L) {
                j3 = j2 + j4;
            } else if (nk6Var != null) {
                long j6 = nk6Var.e;
                if (j6 != -9223372036854775807L) {
                    j = j6;
                    return new nk6(xmlPullParser.getName(), null, j2, j, i, strArr, str2, str, nk6Var);
                }
            }
        }
        j = j3;
        return new nk6(xmlPullParser.getName(), null, j2, j, i, strArr, str2, str, nk6Var);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x015c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:216:0x04ce. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bb  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.rk6 i(org.xmlpull.v1.XmlPullParser r18, defpackage.rk6 r19) {
        /*
            Method dump skipped, instructions count: 1538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk6.i(org.xmlpull.v1.XmlPullParser, rk6):rk6");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long j(java.lang.String r13, defpackage.ok6 r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk6.j(java.lang.String, ok6):long");
    }

    public static h12 k(XmlPullParser xmlPullParser) {
        String e = ez5.e(xmlPullParser, "extent");
        if (e == null) {
            return null;
        }
        Matcher matcher = D.matcher(e);
        if (!matcher.matches()) {
            kb0.O("TtmlParser", "Ignoring non-pixel tts extent: ".concat(e));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new h12(parseInt, Integer.parseInt(group2), (byte) 5);
        } catch (NumberFormatException unused) {
            kb0.O("TtmlParser", "Ignoring malformed tts extent: ".concat(e));
            return null;
        }
    }

    @Override // defpackage.y16
    public final void E(byte[] bArr, int i, int i2, x16 x16Var, ay0 ay0Var) {
        v94.P(h(bArr, i, i2), x16Var, ay0Var);
    }

    @Override // defpackage.y16
    public final k16 h(byte[] bArr, int i, int i2) {
        try {
            XmlPullParser newPullParser = this.x.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new qk6("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            h12 h12Var = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            ok6 ok6Var = F;
            int i3 = 0;
            int i4 = 15;
            kz kzVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                nk6 nk6Var = (nk6) arrayDeque.peek();
                if (i3 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            ok6Var = e(newPullParser);
                            i4 = c(newPullParser);
                            h12Var = k(newPullParser);
                        }
                        ok6 ok6Var2 = ok6Var;
                        h12 h12Var2 = h12Var;
                        int i5 = i4;
                        if (!b(name)) {
                            kb0.B("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else {
                            if ("head".equals(name)) {
                                f(newPullParser, hashMap, i5, h12Var2, hashMap2, hashMap3);
                            } else {
                                try {
                                    nk6 g = g(newPullParser, nk6Var, hashMap2, ok6Var2);
                                    arrayDeque.push(g);
                                    if (nk6Var != null) {
                                        ArrayList arrayList = nk6Var.m;
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            nk6Var.m = arrayList;
                                        }
                                        arrayList.add(g);
                                    }
                                } catch (o16 e) {
                                    kb0.P("TtmlParser", "Suppressing parser error", e);
                                }
                            }
                            i4 = i5;
                            h12Var = h12Var2;
                            ok6Var = ok6Var2;
                        }
                        i3++;
                        i4 = i5;
                        h12Var = h12Var2;
                        ok6Var = ok6Var2;
                    } else if (eventType == 4) {
                        nk6Var.getClass();
                        nk6 a = nk6.a(newPullParser.getText());
                        ArrayList arrayList2 = nk6Var.m;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            nk6Var.m = arrayList2;
                        }
                        arrayList2.add(a);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            nk6 nk6Var2 = (nk6) arrayDeque.peek();
                            nk6Var2.getClass();
                            kzVar = new kz(nk6Var2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                newPullParser.next();
            }
            kzVar.getClass();
            return kzVar;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }
}

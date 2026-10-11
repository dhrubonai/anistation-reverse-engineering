package f9;

import r6.h0;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final k9.j f4037a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f4038b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f4039c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f4040d;

    static {
        k9.j jVar = k9.j.f6522d;
        f4037a = x.v("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f4038b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f4039c = new String[64];
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            h0.s(binaryString, "toBinaryString(it)");
            String replace = z8.b.h("%8s", binaryString).replace(' ', '0');
            h0.s(replace, "replace(...)");
            strArr[i10] = replace;
        }
        f4040d = strArr;
        String[] strArr2 = f4039c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = a3.g.t(new StringBuilder(), strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f4039c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i14]);
            sb.append('|');
            strArr3[i15 | 8] = a3.g.t(sb, strArr3[i13], "|PADDED");
        }
        int length = f4039c.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f4039c;
            if (strArr4[i16] == null) {
                strArr4[i16] = f4040d[i16];
            }
        }
    }

    public static String a(boolean z9, int i10, int i11, int i12, int i13) {
        String h10;
        String str;
        String str2;
        String str3;
        String[] strArr = f4038b;
        if (i12 < strArr.length) {
            h10 = strArr[i12];
        } else {
            h10 = z8.b.h("0x%02x", Integer.valueOf(i12));
        }
        if (i13 == 0) {
            str = "";
        } else {
            String[] strArr2 = f4040d;
            if (i12 != 2 && i12 != 3) {
                if (i12 != 4 && i12 != 6) {
                    if (i12 != 7 && i12 != 8) {
                        String[] strArr3 = f4039c;
                        if (i13 < strArr3.length) {
                            str2 = strArr3[i13];
                            h0.q(str2);
                        } else {
                            str2 = strArr2[i13];
                        }
                        if (i12 == 5 && (i13 & 4) != 0) {
                            str = o7.j.y1(str2, "HEADERS", "PUSH_PROMISE");
                        } else if (i12 == 0 && (i13 & 32) != 0) {
                            str = o7.j.y1(str2, "PRIORITY", "COMPRESSED");
                        } else {
                            str = str2;
                        }
                    }
                } else if (i13 == 1) {
                    str = "ACK";
                } else {
                    str = strArr2[i13];
                }
            }
            str = strArr2[i13];
        }
        if (z9) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return z8.b.h("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i10), Integer.valueOf(i11), h10, str);
    }
}

package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a16 implements y16 {
    public static final Pattern A = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern B = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder x = new StringBuilder();
    public final ArrayList y = new ArrayList();
    public final zi4 z = new zi4();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        if (r22.equals("{\\an9}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r22.equals("{\\an8}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (r22.equals("{\\an7}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
    
        if (r22.equals("{\\an3}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        if (r22.equals("{\\an2}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        if (r22.equals("{\\an1}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0054, code lost:
    
        if (r22.equals("{\\an7}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007d, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        if (r22.equals("{\\an6}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0067, code lost:
    
        if (r22.equals("{\\an4}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006e, code lost:
    
        if (r22.equals("{\\an3}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007b, code lost:
    
        if (r22.equals("{\\an1}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if (r22.equals("{\\an9}") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.b31 a(android.text.Spanned r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a16.a(android.text.Spanned, java.lang.String):b31");
    }

    public static long b(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 3600000;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override // defpackage.y16
    public final void E(byte[] bArr, int i, int i2, x16 x16Var, ay0 ay0Var) {
        ArrayList arrayList;
        String n;
        String str;
        a16 a16Var = this;
        long j = x16Var.b;
        zi4 zi4Var = a16Var.z;
        zi4Var.L(i + i2, bArr);
        zi4Var.N(i);
        Charset J = zi4Var.J();
        if (J == null) {
            J = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        if (j != -9223372036854775807L && x16Var.a) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        while (true) {
            String n2 = zi4Var.n(J);
            if (n2 == null) {
                break;
            }
            if (!n2.isEmpty()) {
                try {
                    Integer.parseInt(n2);
                    n = zi4Var.n(J);
                } catch (NumberFormatException unused) {
                    kb0.O("SubripParser", "Skipping invalid index: ".concat(n2));
                }
                if (n == null) {
                    kb0.O("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = A.matcher(n);
                if (matcher.matches()) {
                    long b = b(matcher, 1);
                    long b2 = b(matcher, 6);
                    StringBuilder sb = a16Var.x;
                    sb.setLength(0);
                    long j3 = j2;
                    ArrayList arrayList2 = a16Var.y;
                    arrayList2.clear();
                    for (String n3 = zi4Var.n(J); !TextUtils.isEmpty(n3); n3 = zi4Var.n(J)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String trim = n3.trim();
                        StringBuilder sb2 = new StringBuilder(trim);
                        Matcher matcher2 = B.matcher(trim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i3;
                            int length = group.length();
                            sb2.replace(start, start + length, "");
                            i3 += length;
                            j = j;
                        }
                        sb.append(sb2.toString());
                    }
                    long j4 = j;
                    Spanned fromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 < arrayList2.size()) {
                            str = (String) arrayList2.get(i4);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i4++;
                            }
                        } else {
                            str = null;
                            break;
                        }
                    }
                    if (j4 != j3 && b2 < j4) {
                        if (arrayList != null) {
                            arrayList.add(new e31(b, b2 - b, nw2.s(a(fromHtml, str))));
                        }
                    } else {
                        ay0Var.accept(new e31(b, b2 - b, nw2.s(a(fromHtml, str))));
                    }
                    a16Var = this;
                    j2 = j3;
                    j = j4;
                } else {
                    kb0.O("SubripParser", "Skipping invalid timing: ".concat(n));
                    a16Var = this;
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                ay0Var.accept((e31) obj);
            }
        }
    }
}

package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class j47 {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, g47 g47Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        char c3;
        char c4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = g47Var.b;
        int length = spannableStringBuilder.length();
        String str2 = g47Var.a;
        str2.getClass();
        int i7 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i6, length, 33);
                break;
            case 2:
                for (String str3 : g47Var.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i6, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i6, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i6, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new vw6(g47Var.c), i6, length, 33);
                break;
            case 7:
                int c5 = c(list2, str, g47Var);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, f47.c);
                int i8 = g47Var.b;
                int i9 = 0;
                int i10 = 0;
                while (i9 < arrayList.size()) {
                    if ("rt".equals(((f47) arrayList.get(i9)).a.a)) {
                        f47 f47Var = (f47) arrayList.get(i9);
                        int c6 = c(list2, str, f47Var.a);
                        if (c6 == i7) {
                            if (c5 != i7) {
                                c6 = c5;
                            } else {
                                c6 = 1;
                            }
                        }
                        int i11 = f47Var.a.b - i10;
                        int i12 = f47Var.b - i10;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i11, i12);
                        spannableStringBuilder.delete(i11, i12);
                        spannableStringBuilder.setSpan(new c85(subSequence.toString(), c6), i8, i11, 33);
                        i10 = subSequence.length() + i10;
                        i8 = i11;
                    }
                    i9++;
                    i7 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b2 = b(list2, str, g47Var);
        for (int i13 = 0; i13 < b2.size(); i13++) {
            d47 d47Var = ((h47) b2.get(i13)).y;
            int i14 = d47Var.l;
            if (i14 == -1 && d47Var.m == -1) {
                i = -1;
            } else {
                if (i14 == 1) {
                    c3 = 1;
                } else {
                    c3 = 0;
                }
                if (d47Var.m == 1) {
                    c4 = 2;
                } else {
                    c4 = 0;
                }
                i = c4 | c3;
            }
            if (i != -1) {
                int i15 = d47Var.l;
                if (i15 == -1 && d47Var.m == -1) {
                    i5 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    if (i15 == 1) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (d47Var.m == 1) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = i3 | i4;
                }
                rv5.a(spannableStringBuilder, new StyleSpan(i5), i6, length);
            } else {
                i2 = 1;
            }
            if (d47Var.j == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i6, length, 33);
            }
            if (d47Var.k == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, length, 33);
            }
            if (d47Var.g) {
                if (d47Var.g) {
                    rv5.a(spannableStringBuilder, new ForegroundColorSpan(d47Var.f), i6, length);
                } else {
                    ze0.m("Font color not defined");
                    return;
                }
            }
            if (d47Var.i) {
                if (d47Var.i) {
                    rv5.a(spannableStringBuilder, new BackgroundColorSpan(d47Var.h), i6, length);
                } else {
                    ze0.m("Background color not defined.");
                    return;
                }
            }
            if (d47Var.e != null) {
                rv5.a(spannableStringBuilder, new TypefaceSpan(d47Var.e), i6, length);
            }
            int i16 = d47Var.n;
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        rv5.a(spannableStringBuilder, new RelativeSizeSpan(d47Var.o / 100.0f), i6, length);
                    }
                } else {
                    rv5.a(spannableStringBuilder, new RelativeSizeSpan(d47Var.o), i6, length);
                }
            } else {
                rv5.a(spannableStringBuilder, new AbsoluteSizeSpan((int) d47Var.o, true), i6, length);
            }
            if (d47Var.q) {
                spannableStringBuilder.setSpan(new Object(), i6, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, g47 g47Var) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            d47 d47Var = (d47) list.get(i2);
            String str2 = g47Var.a;
            Set set = g47Var.d;
            String str3 = g47Var.c;
            if (d47Var.a.isEmpty() && d47Var.b.isEmpty() && d47Var.c.isEmpty() && d47Var.d.isEmpty()) {
                i = TextUtils.isEmpty(str2);
            } else {
                int a2 = d47.a(d47Var.d, str3, d47.a(d47Var.b, str2, d47.a(d47Var.a, str, 0, 1073741824), 2), 4);
                if (a2 != -1 && set.containsAll(d47Var.c)) {
                    i = a2 + (d47Var.c.size() * 4);
                } else {
                    i = 0;
                }
            }
            if (i > 0) {
                arrayList.add(new h47(i, d47Var));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, g47 g47Var) {
        ArrayList b2 = b(list, str, g47Var);
        for (int i = 0; i < b2.size(); i++) {
            int i2 = ((h47) b2.get(i)).y.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static e47 d(String str, Matcher matcher, zi4 zi4Var, ArrayList arrayList) {
        i47 i47Var = new i47();
        try {
            String group = matcher.group(1);
            group.getClass();
            i47Var.a = l47.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            i47Var.b = l47.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, i47Var);
            StringBuilder sb = new StringBuilder();
            String n = zi4Var.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(n)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(n.trim());
                n = zi4Var.n(StandardCharsets.UTF_8);
            }
            i47Var.c = f(str, sb.toString(), arrayList);
            return new e47(i47Var.a().a(), i47Var.a, i47Var.b);
        } catch (IllegalArgumentException unused) {
            kb0.O("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0081, code lost:
    
        if (r6.equals("center") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        if (r7.equals("start") == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, defpackage.i47 r19) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j47.e(java.lang.String, i47):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01db, code lost:
    
        switch(r10) {
            case 0: goto L123;
            case 1: goto L122;
            case 2: goto L121;
            case 3: goto L120;
            default: goto L119;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01de, code lost:
    
        defpackage.kb0.O("WebvttCueParser", "ignoring unsupported entity: '&" + r7 + ";'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0206, code lost:
    
        if (r6 != r15) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0208, code lost:
    
        r3.append((java.lang.CharSequence) " ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x020b, code lost:
    
        r7 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01f7, code lost:
    
        r3.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01fb, code lost:
    
        r3.append('&');
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ff, code lost:
    
        r3.append('<');
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0203, code lost:
    
        r3.append('>');
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x00a4. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j47.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, i47 i47Var) {
        int indexOf = str.indexOf(44);
        char c2 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            int i = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    kb0.O("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            i47Var.g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            i47Var.e = l47.b(str);
            i47Var.f = false;
        } else {
            i47Var.e = Integer.parseInt(str);
            i47Var.f = true;
        }
    }
}

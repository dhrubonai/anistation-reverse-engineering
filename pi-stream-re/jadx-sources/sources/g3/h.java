package g3;

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
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import f1.o;
import f1.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p7.a0;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f4384a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f4385b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f4386c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f4387d;

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
        f4386c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4387d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, e eVar, String str, List list, List list2) {
        char c6;
        char c10;
        char c11;
        int i10;
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14 = eVar.f4368b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.f4367a;
        str2.getClass();
        int hashCode = str2.hashCode();
        int i15 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals("v")) {
                                        c6 = 5;
                                    }
                                    c6 = 65535;
                                } else {
                                    if (str2.equals("u")) {
                                        c6 = 4;
                                    }
                                    c6 = 65535;
                                }
                            } else {
                                if (str2.equals("c")) {
                                    c6 = 2;
                                }
                                c6 = 65535;
                            }
                        } else {
                            if (str2.equals("b")) {
                                c6 = 1;
                            }
                            c6 = 65535;
                        }
                    } else {
                        if (str2.equals("ruby")) {
                            c6 = 7;
                        }
                        c6 = 65535;
                    }
                } else {
                    if (str2.equals("lang")) {
                        c6 = 6;
                    }
                    c6 = 65535;
                }
            } else {
                if (str2.equals("i")) {
                    c6 = 3;
                }
                c6 = 65535;
            }
        } else {
            if (str2.equals("")) {
                c6 = 0;
            }
            c6 = 65535;
        }
        switch (c6) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i14, length, 33);
                break;
            case 2:
                for (String str3 : eVar.f4370d) {
                    Map map = f4386c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i14, length, 33);
                    } else {
                        Map map2 = f4387d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i14, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i14, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
                break;
            case zzaja.zze.zzg /* 7 */:
                int c12 = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f4364c);
                int i16 = eVar.f4368b;
                int i17 = 0;
                int i18 = 0;
                while (i17 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i17)).f4365a.f4367a)) {
                        d dVar = (d) arrayList.get(i17);
                        int c13 = c(list2, str, dVar.f4365a);
                        if (c13 == i15) {
                            if (c12 != i15) {
                                c13 = c12;
                            } else {
                                c13 = 1;
                            }
                        }
                        int i19 = dVar.f4365a.f4368b - i18;
                        int i20 = dVar.f4366b - i18;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i19, i20);
                        spannableStringBuilder.delete(i19, i20);
                        spannableStringBuilder.setSpan(new e1.g(subSequence.toString(), c13), i16, i19, 33);
                        i18 = subSequence.length() + i18;
                        i16 = i19;
                    }
                    i17++;
                    i15 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, eVar);
        for (int i21 = 0; i21 < b10.size(); i21++) {
            b bVar = ((f) b10.get(i21)).f4372b;
            if (bVar != null) {
                int i22 = bVar.f4356l;
                if (i22 == -1 && bVar.f4357m == -1) {
                    i10 = -1;
                } else {
                    if (i22 == 1) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    if (bVar.f4357m == 1) {
                        c11 = 2;
                    } else {
                        c11 = 0;
                    }
                    i10 = c11 | c10;
                }
                if (i10 != -1) {
                    int i23 = bVar.f4356l;
                    if (i23 == -1 && bVar.f4357m == -1) {
                        i13 = -1;
                    } else {
                        if (i23 == 1) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (bVar.f4357m == 1) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        i13 = i11 | i12;
                    }
                    a0.a(spannableStringBuilder, new StyleSpan(i13), i14, length);
                }
                if (bVar.f4354j == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i14, length, 33);
                }
                if (bVar.f4355k == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
                }
                if (bVar.f4351g) {
                    if (bVar.f4351g) {
                        a0.a(spannableStringBuilder, new ForegroundColorSpan(bVar.f4350f), i14, length);
                    } else {
                        throw new IllegalStateException("Font color not defined");
                    }
                }
                if (bVar.f4353i) {
                    if (bVar.f4353i) {
                        a0.a(spannableStringBuilder, new BackgroundColorSpan(bVar.f4352h), i14, length);
                    } else {
                        throw new IllegalStateException("Background color not defined.");
                    }
                }
                if (bVar.f4349e != null) {
                    a0.a(spannableStringBuilder, new TypefaceSpan(bVar.f4349e), i14, length);
                }
                int i24 = bVar.f4358n;
                if (i24 != 1) {
                    if (i24 != 2) {
                        if (i24 == 3) {
                            a0.a(spannableStringBuilder, new RelativeSizeSpan(bVar.o / 100.0f), i14, length);
                        }
                    } else {
                        a0.a(spannableStringBuilder, new RelativeSizeSpan(bVar.o), i14, length);
                    }
                } else {
                    a0.a(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.o, true), i14, length);
                }
                if (bVar.f4360q) {
                    spannableStringBuilder.setSpan(new e1.e(), i14, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = (b) list.get(i11);
            String str2 = eVar.f4367a;
            if (bVar.f4345a.isEmpty() && bVar.f4346b.isEmpty() && bVar.f4347c.isEmpty() && bVar.f4348d.isEmpty()) {
                i10 = TextUtils.isEmpty(str2);
            } else {
                int a10 = b.a(bVar.f4348d, b.a(bVar.f4346b, b.a(bVar.f4345a, 0, 1073741824, str), 2, str2), 4, eVar.f4369c);
                if (a10 != -1) {
                    if (eVar.f4370d.containsAll(bVar.f4347c)) {
                        i10 = a10 + (bVar.f4347c.size() * 4);
                    }
                }
                i10 = 0;
            }
            if (i10 > 0) {
                arrayList.add(new f(i10, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList b10 = b(list, str, eVar);
        for (int i10 = 0; i10 < b10.size(); i10++) {
            int i11 = ((f) b10.get(i10)).f4372b.f4359p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, t tVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.f4373a = i.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.f4374b = i.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gVar);
            StringBuilder sb = new StringBuilder();
            String g10 = tVar.g();
            while (!TextUtils.isEmpty(g10)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(g10.trim());
                g10 = tVar.g();
            }
            gVar.f4375c = f(str, sb.toString(), arrayList);
            return new c(gVar.a().a(), gVar.f4373a, gVar.f4374b);
        } catch (NumberFormatException unused) {
            o.f("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0099, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
    
        if (r7.equals("start") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0084, code lost:
    
        switch(r15) {
            case 0: goto L45;
            case 1: goto L45;
            case 2: goto L44;
            case 3: goto L43;
            case 4: goto L42;
            case 5: goto L41;
            default: goto L40;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0087, code lost:
    
        f1.o.f("WebvttCueParser", "Invalid alignment value: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0091, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x009a, code lost:
    
        r19.f4376d = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0093, code lost:
    
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0095, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0097, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00f9. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, g3.g r19) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.h.e(java.lang.String, g3.g):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01f3, code lost:
    
        switch(r13) {
            case 0: goto L140;
            case 1: goto L139;
            case 2: goto L138;
            case 3: goto L137;
            default: goto L136;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01f6, code lost:
    
        f1.o.f("WebvttCueParser", "ignoring unsupported entity: '&" + r7 + ";'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x021e, code lost:
    
        if (r9 != r12) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0220, code lost:
    
        r3.append((java.lang.CharSequence) " ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0223, code lost:
    
        r7 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x020f, code lost:
    
        r3.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0213, code lost:
    
        r3.append('&');
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0217, code lost:
    
        r3.append('<');
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x021b, code lost:
    
        r3.append('>');
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r16, java.lang.String r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.h.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, g gVar) {
        int indexOf = str.indexOf(44);
        char c6 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i10 = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c6 = 3;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                case 1:
                    i10 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i10 = 0;
                    break;
                default:
                    o.f("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f4379g = i10;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gVar.f4377e = i.b(str);
            gVar.f4378f = 0;
        } else {
            gVar.f4377e = Integer.parseInt(str);
            gVar.f4378f = 1;
        }
    }
}

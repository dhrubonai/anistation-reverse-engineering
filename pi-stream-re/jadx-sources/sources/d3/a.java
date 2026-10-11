package d3;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import e1.b;
import f.r0;
import f1.c;
import f1.o;
import f1.t;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q6.e;
import r6.o0;
import w.f;
import y2.d;
import y2.l;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f3216d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f3217e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f3218a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3219b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final t f3220c = new t();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(Spanned spanned, String str) {
        char c6;
        int i10;
        char c10;
        int i11;
        float f10;
        float f11;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c6 = 6;
                    break;
                }
                c6 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c6 = 7;
                    break;
                }
                c6 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c6 = '\b';
                    break;
                }
                c6 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c6 = 5;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        if (c6 != 0 && c6 != 1 && c6 != 2) {
            if (c6 != 3 && c6 != 4 && c6 != 5) {
                i10 = 1;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 0;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0 && c10 != 1 && c10 != 2) {
            if (c10 != 3 && c10 != 4 && c10 != 5) {
                i11 = 1;
            } else {
                i11 = 0;
            }
        } else {
            i11 = 2;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    f10 = 0.92f;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                f10 = 0.5f;
            }
        } else {
            f10 = 0.08f;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f11 = 0.92f;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                f11 = 0.5f;
            }
        } else {
            f11 = 0.08f;
        }
        return new b(spanned, null, null, null, f11, 0, i11, f10, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public static long b(Matcher matcher, int i10) {
        long j4;
        String group = matcher.group(i10 + 1);
        if (group != null) {
            j4 = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j4 = 0;
        }
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60 * 1000) + j4;
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override // y2.l
    public final /* synthetic */ void f() {
    }

    @Override // y2.l
    public final /* synthetic */ void k(byte[] bArr, r0 r0Var, f fVar) {
        r.f.a(this, bArr, r0Var, fVar);
    }

    @Override // y2.l
    public final void o(byte[] bArr, int i10, int i11, r0 r0Var, c cVar) {
        ArrayList arrayList;
        c cVar2;
        String str;
        a aVar = this;
        c cVar3 = cVar;
        String str2 = "SubripParser";
        t tVar = aVar.f3220c;
        tVar.E(bArr, i10 + i11);
        tVar.G(i10);
        Charset C = tVar.C();
        if (C == null) {
            C = e.f9207c;
        }
        long j4 = r0Var.f3775a;
        if (j4 != -9223372036854775807L && r0Var.f3776b) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        while (true) {
            String h10 = tVar.h(C);
            if (h10 == null) {
                break;
            }
            if (h10.length() == 0) {
                cVar2 = cVar3;
            } else {
                try {
                    Integer.parseInt(h10);
                    String h11 = tVar.h(C);
                    if (h11 == null) {
                        o.f(str2, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f3216d.matcher(h11);
                    if (matcher.matches()) {
                        long b10 = b(matcher, 1);
                        long b11 = b(matcher, 6);
                        StringBuilder sb = aVar.f3218a;
                        sb.setLength(0);
                        ArrayList arrayList2 = aVar.f3219b;
                        arrayList2.clear();
                        for (String h12 = tVar.h(C); !TextUtils.isEmpty(h12); h12 = tVar.h(C)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String trim = h12.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = f3217e.matcher(trim);
                            int i12 = 0;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList2.add(group);
                                Matcher matcher3 = matcher2;
                                int start = matcher2.start() - i12;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i12 += length;
                                matcher2 = matcher3;
                                str2 = str2;
                            }
                            sb.append(sb2.toString());
                        }
                        String str3 = str2;
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        int i13 = 0;
                        while (true) {
                            if (i13 < arrayList2.size()) {
                                str = (String) arrayList2.get(i13);
                                if (str.matches("\\{\\\\an[1-9]\\}")) {
                                    break;
                                } else {
                                    i13++;
                                }
                            } else {
                                str = null;
                                break;
                            }
                        }
                        if (j4 != -9223372036854775807L && b10 < j4) {
                            if (arrayList != null) {
                                arrayList.add(new y2.a(o0.o(a(fromHtml, str)), b10, b11 - b10));
                            }
                            cVar2 = cVar;
                        } else {
                            y2.a aVar2 = new y2.a(o0.o(a(fromHtml, str)), b10, b11 - b10);
                            cVar2 = cVar;
                            cVar2.accept(aVar2);
                        }
                        str2 = str3;
                    } else {
                        cVar2 = cVar3;
                        o.f(str2, "Skipping invalid timing: ".concat(h11));
                    }
                } catch (NumberFormatException unused) {
                    cVar2 = cVar3;
                    o.f(str2, "Skipping invalid index: ".concat(h10));
                }
            }
            cVar3 = cVar2;
            aVar = this;
        }
        c cVar4 = cVar3;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar4.accept((y2.a) it.next());
            }
        }
    }

    @Override // y2.l
    public final /* synthetic */ d r(byte[] bArr, int i10, int i11) {
        return r.f.b(this, bArr, i10, i11);
    }

    @Override // y2.l
    public final int x() {
        return 1;
    }
}

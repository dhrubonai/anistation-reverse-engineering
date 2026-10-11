package c3;

import a3.g;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c1.f;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import f.r0;
import f1.b0;
import f1.o;
import f1.t;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q6.e;
import y2.l;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f2030x = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2031a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2032b;

    /* renamed from: d, reason: collision with root package name */
    public LinkedHashMap f2034d;

    /* renamed from: e, reason: collision with root package name */
    public float f2035e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public float f2036f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    public final t f2033c = new t();

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f2031a = true;
            String n9 = b0.n((byte[]) list.get(0));
            w7.b.g(n9.startsWith("Format:"));
            f b10 = f.b(n9);
            b10.getClass();
            this.f2032b = b10;
            b(new t((byte[]) list.get(1)), e.f9207c);
            return;
        }
        this.f2031a = false;
        this.f2032b = null;
    }

    public static int a(long j4, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        ArrayList arrayList3;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j4) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j4) {
                    i10 = size + 1;
                    break;
                }
            } else {
                i10 = 0;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j4));
        if (i10 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i10 - 1));
        }
        arrayList2.add(i10, arrayList3);
        return i10;
    }

    public static long c(String str) {
        Matcher matcher = f2030x.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i10 = b0.f3799a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0294 A[Catch: RuntimeException -> 0x02c8, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x02c8, blocks: (B:49:0x01cf, B:51:0x01dd, B:52:0x01ec, B:54:0x01f0, B:55:0x01ff, B:57:0x0203, B:58:0x0212, B:60:0x0216, B:62:0x021c, B:63:0x023a, B:65:0x0240, B:68:0x0251, B:70:0x0255, B:73:0x0266, B:75:0x026a, B:78:0x027b, B:80:0x027f, B:83:0x0290, B:85:0x0294, B:87:0x029a, B:94:0x02c2, B:95:0x02af, B:107:0x0223), top: B:48:0x01cf, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(f1.t r39, java.nio.charset.Charset r40) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.a.b(f1.t, java.nio.charset.Charset):void");
    }

    @Override // y2.l
    public final /* synthetic */ void f() {
    }

    @Override // y2.l
    public final /* synthetic */ void k(byte[] bArr, r0 r0Var, w.f fVar) {
        r.f.a(this, bArr, r0Var, fVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:105:0x0241. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x021e. Please report as an issue. */
    @Override // y2.l
    public final void o(byte[] bArr, int i10, int i11, r0 r0Var, f1.c cVar) {
        f fVar;
        ArrayList arrayList;
        Charset charset;
        f fVar2;
        t tVar;
        d dVar;
        long j4;
        int i12;
        float f10;
        int i13;
        Layout.Alignment alignment;
        int i14;
        float f11;
        float f12;
        float f13;
        float f14;
        int i15;
        float f15;
        int i16;
        Integer num;
        int i17;
        int i18;
        a aVar = this;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        t tVar2 = aVar.f2033c;
        tVar2.E(bArr, i10 + i11);
        tVar2.G(i10);
        Charset C = tVar2.C();
        if (C == null) {
            C = e.f9207c;
        }
        boolean z9 = aVar.f2031a;
        if (!z9) {
            aVar.b(tVar2, C);
        }
        if (z9) {
            fVar = aVar.f2032b;
        } else {
            fVar = null;
        }
        while (true) {
            String h10 = tVar2.h(C);
            if (h10 != null) {
                if (h10.startsWith("Format:")) {
                    fVar = f.b(h10);
                } else {
                    if (h10.startsWith("Dialogue:")) {
                        if (fVar == null) {
                            o.f("SsaParser", "Skipping dialogue line before complete format: ".concat(h10));
                        } else {
                            w7.b.g(h10.startsWith("Dialogue:"));
                            String substring = h10.substring(9);
                            int i19 = fVar.f1681e;
                            String[] split = substring.split(",", i19);
                            if (split.length != i19) {
                                o.f("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(h10));
                            } else {
                                long c6 = c(split[fVar.f1677a]);
                                if (c6 == -9223372036854775807L) {
                                    o.f("SsaParser", "Skipping invalid timing: ".concat(h10));
                                } else {
                                    charset = C;
                                    long c10 = c(split[fVar.f1678b]);
                                    if (c10 == -9223372036854775807L) {
                                        o.f("SsaParser", "Skipping invalid timing: ".concat(h10));
                                        fVar2 = fVar;
                                        tVar = tVar2;
                                        aVar = this;
                                        C = charset;
                                        fVar = fVar2;
                                        tVar2 = tVar;
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.f2034d;
                                        int i20 = -1;
                                        if (linkedHashMap != null && (i18 = fVar.f1679c) != -1) {
                                            dVar = (d) linkedHashMap.get(split[i18].trim());
                                        } else {
                                            dVar = null;
                                        }
                                        String str = split[fVar.f1680d];
                                        Matcher matcher = c.f2048a.matcher(str);
                                        PointF pointF = null;
                                        while (matcher.find()) {
                                            f fVar3 = fVar;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a10 = c.a(group);
                                                if (a10 != null) {
                                                    pointF = a10;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            t tVar3 = tVar2;
                                            try {
                                                Matcher matcher2 = c.f2051d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i17 = d.a(group2);
                                                } else {
                                                    i17 = -1;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            if (i17 != -1) {
                                                i20 = i17;
                                                tVar2 = tVar3;
                                                fVar = fVar3;
                                            } else {
                                                fVar = fVar3;
                                                tVar2 = tVar3;
                                            }
                                        }
                                        fVar2 = fVar;
                                        tVar = tVar2;
                                        String replace = c.f2048a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f16 = aVar.f2035e;
                                        float f17 = aVar.f2036f;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (dVar != null) {
                                            Integer num2 = dVar.f2054c;
                                            if (num2 != null) {
                                                j4 = c10;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                j4 = c10;
                                            }
                                            if (dVar.f2061j == 3 && (num = dVar.f2055d) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f18 = dVar.f2056e;
                                            if (f18 != -3.4028235E38f && f17 != -3.4028235E38f) {
                                                f14 = f18 / f17;
                                                i15 = 1;
                                            } else {
                                                f14 = -3.4028235E38f;
                                                i15 = Integer.MIN_VALUE;
                                            }
                                            boolean z10 = dVar.f2058g;
                                            boolean z11 = dVar.f2057f;
                                            if (z11 && z10) {
                                                i16 = 33;
                                                f15 = f14;
                                                i12 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                f15 = f14;
                                                i16 = 33;
                                                i12 = 0;
                                                if (z11) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z10) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (dVar.f2059h) {
                                                spannableString.setSpan(new UnderlineSpan(), i12, spannableString.length(), i16);
                                            }
                                            if (dVar.f2060i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i12, spannableString.length(), i16);
                                            }
                                            f10 = f15;
                                            i13 = i15;
                                        } else {
                                            j4 = c10;
                                            i12 = 0;
                                            f10 = -3.4028235E38f;
                                            i13 = Integer.MIN_VALUE;
                                        }
                                        if (i20 == -1) {
                                            if (dVar != null) {
                                                i20 = dVar.f2053b;
                                            } else {
                                                i20 = -1;
                                            }
                                        }
                                        switch (i20) {
                                            case 0:
                                            default:
                                                g.A("Unknown alignment: ", i20, "SsaParser");
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case zzaja.zze.zzg /* 7 */:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        Layout.Alignment alignment2 = alignment;
                                        switch (i20) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                g.A("Unknown alignment: ", i20, "SsaParser");
                                                break;
                                            case 1:
                                            case 4:
                                            case zzaja.zze.zzg /* 7 */:
                                                i14 = i12;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i14 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i14 = 2;
                                                break;
                                        }
                                        i14 = Integer.MIN_VALUE;
                                        switch (i20) {
                                            case 0:
                                            default:
                                                g.A("Unknown alignment: ", i20, "SsaParser");
                                            case -1:
                                                i12 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i12 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i12 = 1;
                                                break;
                                            case zzaja.zze.zzg /* 7 */:
                                            case 8:
                                            case 9:
                                                break;
                                        }
                                        float f19 = -3.4028235E38f;
                                        if (pointF != null && f17 != -3.4028235E38f && f16 != -3.4028235E38f) {
                                            f13 = pointF.x / f16;
                                            f12 = pointF.y / f17;
                                        } else {
                                            if (i14 != 0) {
                                                if (i14 != 1) {
                                                    if (i14 != 2) {
                                                        f11 = -3.4028235E38f;
                                                    } else {
                                                        f11 = 0.95f;
                                                    }
                                                } else {
                                                    f11 = 0.5f;
                                                }
                                            } else {
                                                f11 = 0.05f;
                                            }
                                            if (i12 != 0) {
                                                if (i12 != 1) {
                                                    if (i12 == 2) {
                                                        f19 = 0.95f;
                                                    }
                                                } else {
                                                    f19 = 0.5f;
                                                }
                                            } else {
                                                f19 = 0.05f;
                                            }
                                            f12 = f19;
                                            f13 = f11;
                                        }
                                        e1.b bVar = new e1.b(spannableString, alignment2, null, null, f12, 0, i12, f13, i14, i13, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                        int a11 = a(j4, arrayList3, arrayList2);
                                        for (int a12 = a(c6, arrayList3, arrayList2); a12 < a11; a12++) {
                                            ((List) arrayList2.get(a12)).add(bVar);
                                        }
                                        aVar = this;
                                        C = charset;
                                        fVar = fVar2;
                                        tVar2 = tVar;
                                    }
                                }
                            }
                        }
                    }
                    charset = C;
                    fVar2 = fVar;
                    tVar = tVar2;
                    aVar = this;
                    C = charset;
                    fVar = fVar2;
                    tVar2 = tVar;
                }
            } else {
                long j10 = r0Var.f3775a;
                if (j10 != -9223372036854775807L && r0Var.f3776b) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                    List list = (List) arrayList2.get(i21);
                    if (!list.isEmpty() || i21 == 0) {
                        if (i21 != arrayList2.size() - 1) {
                            long longValue = ((Long) arrayList3.get(i21)).longValue();
                            long longValue2 = ((Long) arrayList3.get(i21 + 1)).longValue() - ((Long) arrayList3.get(i21)).longValue();
                            if (j10 != -9223372036854775807L && longValue < j10) {
                                if (arrayList != null) {
                                    arrayList.add(new y2.a(list, longValue, longValue2));
                                }
                            } else {
                                cVar.accept(new y2.a(list, longValue, longValue2));
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        cVar.accept((y2.a) it.next());
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // y2.l
    public final /* synthetic */ y2.d r(byte[] bArr, int i10, int i11) {
        return r.f.b(this, bArr, i10, i11);
    }

    @Override // y2.l
    public final int x() {
        return 1;
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.anistation.model.Info;
import com.anistation.model.NextAiringEpisode;
import com.anistation.model.animelist.WatchStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gj implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ gj(pv1 pv1Var, hm5 hm5Var, Context context, Resources resources, sb2 sb2Var) {
        this.x = (byte) 10;
        this.y = hm5Var;
        this.z = context;
        this.A = resources;
        this.B = sb2Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, w05] */
    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        Integer num;
        NextAiringEpisode nextAiringEpisode;
        Integer episodeNumber;
        long j;
        int i;
        long j2;
        long j3;
        byte b = this.x;
        byte b2 = 3;
        Integer num2 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int intValue = 0;
        boolean z3 = true;
        char c = 1;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.A;
        Object obj3 = this.B;
        Object obj4 = this.z;
        Object obj5 = this.y;
        switch (b) {
            case 0:
                String str = (String) obj4;
                String str2 = (String) obj2;
                w44 w44Var = (w44) obj3;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ((ub2) obj5).invoke(bool);
                if (!booleanValue) {
                    str = str2;
                }
                w44Var.setValue(str);
                return pn6Var;
            case 1:
                wj wjVar = (wj) obj4;
                ml mlVar = (ml) obj2;
                ub2 ub2Var = (ub2) obj5;
                r05 r05Var = (r05) obj3;
                kl klVar = (kl) obj;
                nv5.t(klVar, wjVar.c);
                ti4 ti4Var = klVar.e;
                Object b3 = wjVar.b(ti4Var.getValue());
                if (!a34.i(b3, ti4Var.getValue())) {
                    wjVar.c.y.setValue(b3);
                    mlVar.y.setValue(b3);
                    if (ub2Var != null) {
                        ub2Var.invoke(wjVar);
                    }
                    klVar.a();
                    r05Var.x = true;
                } else if (ub2Var != null) {
                    ub2Var.invoke(wjVar);
                }
                return pn6Var;
            case 2:
                ko4 ko4Var = (ko4) obj5;
                ((ci1) obj).getClass();
                th0 th0Var = new th0((qi4) obj4, (w44) obj3, (w44) obj2);
                ko4Var.v(th0Var);
                return new qj(ko4Var, th0Var, b2);
            case 3:
                uf3 uf3Var = (uf3) obj5;
                sc6 sc6Var = (sc6) obj4;
                mc6 mc6Var = (mc6) obj2;
                yv2 yv2Var = (yv2) obj3;
                if (uf3Var.b()) {
                    pz2 pz2Var = uf3Var.d;
                    r01 r01Var = uf3Var.v;
                    r01 r01Var2 = uf3Var.w;
                    ?? obj6 = new Object();
                    bg bgVar = new bg((Object) pz2Var, (Object) r01Var, (Object) obj6, (byte) 27);
                    jn4 jn4Var = sc6Var.a;
                    jn4Var.a(mc6Var, yv2Var, bgVar, r01Var2);
                    vc6 vc6Var = new vc6(sc6Var, jn4Var);
                    sc6Var.b.set(vc6Var);
                    obj6.x = vc6Var;
                    uf3Var.e = vc6Var;
                }
                return new wd((byte) 2);
            case 4:
                Set set = (Set) obj5;
                set.add(obj4);
                return new u61(set, obj4, (Set) obj2, (w44) obj3);
            case 5:
                Info info = (Info) obj5;
                zm6 zm6Var = (zm6) obj4;
                kc2 kc2Var = (kc2) obj2;
                jc2 jc2Var = (jc2) obj3;
                WatchStatus watchStatus = (WatchStatus) obj;
                if (info != null) {
                    num = info.getTotalEpisodes();
                } else {
                    num = null;
                }
                if (info != null && (nextAiringEpisode = info.getNextAiringEpisode()) != null && (episodeNumber = nextAiringEpisode.getEpisodeNumber()) != null) {
                    num2 = Integer.valueOf(episodeNumber.intValue() - 1);
                }
                int size = zm6Var.e.size();
                if (watchStatus != null) {
                    if (num2 != null) {
                        intValue = num2.intValue();
                    } else if (num != null) {
                        intValue = num.intValue();
                    }
                    kc2Var.e(num, Integer.valueOf(intValue), Integer.valueOf(size), watchStatus);
                } else {
                    if (num2 != null) {
                        i2 = num2.intValue();
                    } else if (num != null) {
                        i2 = num.intValue();
                    }
                    jc2Var.invoke(num, Integer.valueOf(i2), Integer.valueOf(size));
                }
                return pn6Var;
            case 6:
                ry2 ry2Var = (ry2) obj5;
                t05 t05Var = (t05) obj4;
                v11 v11Var = (v11) obj2;
                long longValue = ((Long) obj).longValue();
                px5 px5Var = (px5) ((w44) obj3).getValue();
                if (px5Var != null) {
                    j = ((Number) px5Var.getValue()).longValue();
                } else {
                    j = longValue;
                }
                long j4 = ry2Var.c;
                z44 z44Var = ry2Var.a;
                if (j4 == Long.MIN_VALUE || t05Var.x != nv5.j(v11Var.getCoroutineContext())) {
                    ry2Var.c = longValue;
                    Object[] objArr = z44Var.x;
                    int i3 = z44Var.z;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ((py2) objArr[i4]).C = true;
                    }
                    t05Var.x = nv5.j(v11Var.getCoroutineContext());
                }
                float f = t05Var.x;
                if (f == 0.0f) {
                    Object[] objArr2 = z44Var.x;
                    int i5 = z44Var.z;
                    for (int i6 = 0; i6 < i5; i6++) {
                        py2 py2Var = (py2) objArr2[i6];
                        py2Var.z.setValue(py2Var.A.c);
                        py2Var.C = true;
                    }
                } else {
                    long j5 = ((float) (j - ry2Var.c)) / f;
                    Object[] objArr3 = z44Var.x;
                    int i7 = z44Var.z;
                    boolean z4 = true;
                    for (int i8 = 0; i8 < i7; i8++) {
                        py2 py2Var2 = (py2) objArr3[i8];
                        boolean z5 = py2Var2.B;
                        if (!z5) {
                            py2Var2.E.b.setValue(Boolean.FALSE);
                            if (py2Var2.C) {
                                py2Var2.C = false;
                                py2Var2.D = j5;
                            }
                            long j6 = j5 - py2Var2.D;
                            py2Var2.z.setValue(py2Var2.A.g(j6));
                            z5 = py2Var2.A.f(j6);
                            py2Var2.B = z5;
                        }
                        if (!z5) {
                            z4 = false;
                        }
                    }
                    ry2Var.d.setValue(Boolean.valueOf(!z4));
                }
                return pn6Var;
            case 7:
                List list = (List) obj5;
                u05 u05Var = (u05) obj4;
                List list2 = (List) obj2;
                mc3 mc3Var = (mc3) obj3;
                et4 et4Var = (et4) obj;
                v06 v06Var = et4Var.e;
                if (v06Var != null) {
                    i = v06Var.c();
                } else {
                    i = 0;
                }
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    rg4 rg4Var = mc3Var.r;
                    v06 v06Var2 = et4Var.e;
                    long j7 = 0;
                    if (rg4Var == rg4.x) {
                        if (v06Var2 != null) {
                            j7 = v06Var2.b(i10);
                        }
                        j2 = j7 & 4294967295L;
                    } else {
                        if (v06Var2 != null) {
                            j7 = v06Var2.b(i10);
                        }
                        j2 = j7 >> 32;
                    }
                    i9 += (int) j2;
                }
                if (list != null) {
                    list.add(Integer.valueOf(i9));
                }
                if (u05Var.x != list2.size()) {
                    u05Var.x++;
                }
                return pn6Var;
            case 8:
                be3 be3Var = (be3) obj5;
                be3Var.c = new tu((qd3) obj4, (w06) obj2, (ft4) obj3);
                return new i5(be3Var, (byte) 10);
            case 9:
                t05 t05Var2 = (t05) obj5;
                h14 h14Var = (h14) obj4;
                pd5 pd5Var = (pd5) obj2;
                g5 g5Var = (g5) obj3;
                kl klVar2 = (kl) obj;
                float floatValue = ((Number) klVar2.e.getValue()).floatValue() - t05Var2.x;
                if (!h41.K(floatValue)) {
                    if (!h41.K(floatValue - h14Var.c(pd5Var, floatValue))) {
                        klVar2.a();
                        return pn6Var;
                    }
                    t05Var2.x += floatValue;
                }
                if (((Boolean) g5Var.invoke(Float.valueOf(t05Var2.x))).booleanValue()) {
                    klVar2.a();
                }
                return pn6Var;
            case 10:
                hm5 hm5Var = (hm5) obj5;
                Context context = (Context) obj4;
                Resources resources = (Resources) obj2;
                sb2 sb2Var = (sb2) obj3;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    try {
                        context.getContentResolver().takePersistableUriPermission(uri, 1);
                    } catch (Throwable unused) {
                    }
                    tl7.z(zz.J(hm5Var), null, null, new sc(hm5Var, new ll5((Object) resources, (Object) sb2Var, (byte) (c == true ? 1 : 0)), uri, new nl5(1, si.a, si.class, "show", "show(Ljava/lang/String;)V", 0, (byte) 1), null, (byte) 8), 3);
                }
                return pn6Var;
            case 11:
                sb2 sb2Var2 = (sb2) obj4;
                cc6 cc6Var = (cc6) obj2;
                be6 be6Var = (be6) obj3;
                b96 b96Var = (b96) obj;
                ((sb2) obj5).invoke();
                if (sb2Var2 != null) {
                    z3 = ((Boolean) sb2Var2.invoke()).booleanValue();
                }
                if (z3) {
                    b96Var.close();
                }
                cc6Var.x(be6Var);
                return pn6Var;
            case 12:
                wj wjVar2 = (wj) obj2;
                pi4 pi4Var = (pi4) obj3;
                p55 p55Var = (p55) obj;
                p55Var.getClass();
                float floatValue2 = ((Number) ((px5) obj5).getValue()).floatValue();
                float floatValue3 = ((Number) ((px5) obj4).getValue()).floatValue();
                float p = s07.p(1.0f, 0.85f, 1.0f - ((Number) wjVar2.d()).floatValue());
                float p2 = s07.p(1.0f, 0.94f, pi4Var.h());
                p55Var.c(((Number) wjVar2.d()).floatValue());
                float f2 = p * p2;
                p55Var.h(f2);
                p55Var.i(f2);
                p55Var.n(p55Var.Q.b() * 24.0f * (1.0f - ((Number) wjVar2.d()).floatValue()));
                if (pi4Var.h() > 0.0f) {
                    j3 = wt5.c(0.5f, 1.0f);
                } else {
                    j3 = xh6.b;
                }
                p55Var.m(j3);
                p55Var.k(p75.a(Math.max(floatValue2, pi4Var.h()) * 20.0f));
                if (floatValue2 > 0.01f || floatValue3 > 0.01f || pi4Var.h() > 0.01f) {
                    z2 = true;
                }
                p55Var.e(z2);
                p55Var.j(s07.p(0.0f, p55Var.Q.b() * 6.0f, floatValue2));
                return pn6Var;
            default:
                w05 w05Var = (w05) obj5;
                r05 r05Var2 = (r05) obj4;
                w44 w44Var2 = (w44) obj2;
                tw5 tw5Var = s07.a;
                h43 h43Var = (h43) ((w44) obj3).getValue();
                if (h43Var != null) {
                    h43Var.l(null);
                }
                w05Var.x = (uy3) w44Var2.getValue();
                uy3 uy3Var = (uy3) w44Var2.getValue();
                if (uy3Var == uy3.z || uy3Var == uy3.A) {
                    z = true;
                }
                r05Var2.x = z;
                return pn6Var;
        }
    }

    public /* synthetic */ gj(wj wjVar, ml mlVar, ub2 ub2Var, r05 r05Var) {
        this.x = (byte) 1;
        this.z = wjVar;
        this.A = mlVar;
        this.y = ub2Var;
        this.B = r05Var;
    }

    public /* synthetic */ gj(w44 w44Var, ry2 ry2Var, t05 t05Var, v11 v11Var) {
        this.x = (byte) 6;
        this.B = w44Var;
        this.y = ry2Var;
        this.z = t05Var;
        this.A = v11Var;
    }

    public /* synthetic */ gj(Object obj, Object obj2, w44 w44Var, w44 w44Var2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.B = w44Var;
        this.A = w44Var2;
    }

    public /* synthetic */ gj(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    public /* synthetic */ gj(ArrayList arrayList, u05 u05Var, List list, int i, mc3 mc3Var) {
        this.x = (byte) 7;
        this.y = arrayList;
        this.z = u05Var;
        this.A = list;
        this.B = mc3Var;
    }
}

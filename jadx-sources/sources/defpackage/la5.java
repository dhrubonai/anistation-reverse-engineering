package defpackage;

import com.anistation.model.Anime;
import com.anistation.model.SearchSuggestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class la5 implements ub2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ la5(byte b) {
        this.x = b;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        Float f;
        ek3 ek3Var;
        String str;
        ih3 ih3Var;
        kh3 kh3Var;
        oo ooVar;
        Integer num;
        Integer num2;
        String str2;
        jo joVar;
        c86 c86Var;
        j96 j96Var;
        ee6 ee6Var;
        qc6 qc6Var;
        um4 um4Var;
        lh3 lh3Var;
        fh3 fh3Var;
        zs2 zs2Var;
        ep0 ep0Var;
        ee6 ee6Var2;
        s92 s92Var;
        o92 o92Var;
        p92 p92Var;
        String str3;
        ee6 ee6Var3;
        z30 z30Var;
        oc6 oc6Var;
        fk3 fk3Var;
        ep0 ep0Var2;
        g96 g96Var;
        Boolean bool;
        jd6 jd6Var;
        byte b = this.x;
        byte b2 = 5;
        pn6 pn6Var = pn6.a;
        long j = 0;
        byte b3 = 8;
        boolean z = true;
        Float f2 = null;
        Boolean bool2 = null;
        r14 = null;
        ys1 ys1Var = null;
        r14 = null;
        km5 km5Var = null;
        r14 = null;
        kd6 kd6Var = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        r14 = null;
        th3 th3Var = null;
        r14 = null;
        uh3 uh3Var = null;
        r14 = null;
        pp6 pp6Var = null;
        r14 = null;
        zr6 zr6Var = null;
        r14 = null;
        pv5 pv5Var = null;
        r14 = null;
        hi4 hi4Var = null;
        jh3 jh3Var = null;
        r14 = null;
        id6 id6Var = null;
        switch (b) {
            case 0:
                if (a34.i(obj, 0)) {
                    return new fe6(8589934592L);
                }
                if (a34.i(obj, 1)) {
                    return new fe6(4294967296L);
                }
                return new fe6(0L);
            case 1:
                if (a34.i(obj, Boolean.FALSE)) {
                    return new xc4(9205357640488583168L);
                }
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                if (obj2 != null) {
                    f = (Float) obj2;
                } else {
                    f = null;
                }
                f.getClass();
                float floatValue = f.floatValue();
                Object obj3 = list.get(1);
                if (obj3 != null) {
                    f2 = (Float) obj3;
                }
                f2.getClass();
                float floatValue2 = f2.floatValue();
                return new xc4((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(floatValue2) & 4294967295L));
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    Object obj4 = list2.get(i);
                    y23 y23Var = na5.z;
                    if (a34.i(obj4, Boolean.FALSE) || obj4 == null) {
                        ek3Var = null;
                    } else {
                        ek3Var = (ek3) ((ub2) y23Var.z).invoke(obj4);
                    }
                    ek3Var.getClass();
                    arrayList.add(ek3Var);
                }
                return new fk3(arrayList);
            case 3:
                obj.getClass();
                String str7 = (String) obj;
                Locale forLanguageTag = Locale.forLanguageTag(str7);
                if (a34.i(forLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str7 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new ek3(forLanguageTag);
            case 4:
                obj.getClass();
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                if (obj5 != null) {
                    str = (String) obj5;
                } else {
                    str = null;
                }
                str.getClass();
                Object obj6 = list3.get(1);
                y23 y23Var2 = na5.i;
                if (!a34.i(obj6, Boolean.FALSE) && obj6 != null) {
                    id6Var = (id6) ((ub2) y23Var2.z).invoke(obj6);
                }
                return new th3(str, id6Var);
            case 5:
                obj.getClass();
                List list4 = (List) obj;
                Object obj7 = list4.get(0);
                float f3 = ih3.b;
                ma5 ma5Var = na5.B;
                Boolean bool3 = Boolean.FALSE;
                a34.i(obj7, bool3);
                if (obj7 != null) {
                    ih3Var = (ih3) ma5Var.y.invoke(obj7);
                } else {
                    ih3Var = null;
                }
                ih3Var.getClass();
                float f4 = ih3Var.a;
                Object obj8 = list4.get(1);
                ma5 ma5Var2 = na5.C;
                a34.i(obj8, bool3);
                if (obj8 != null) {
                    kh3Var = (kh3) ma5Var2.y.invoke(obj8);
                } else {
                    kh3Var = null;
                }
                kh3Var.getClass();
                int i2 = kh3Var.a;
                Object obj9 = list4.get(2);
                ma5 ma5Var3 = na5.D;
                a34.i(obj9, bool3);
                if (obj9 != null) {
                    jh3Var = (jh3) ma5Var3.y.invoke(obj9);
                }
                jh3Var.getClass();
                return new lh3(f4, i2, jh3Var.a);
            case 6:
                obj.getClass();
                float floatValue3 = ((Float) obj).floatValue();
                ih3.a(floatValue3);
                return new ih3(floatValue3);
            case 7:
                obj.getClass();
                return new kh3(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                if (obj10 != null) {
                    ooVar = (oo) obj10;
                } else {
                    ooVar = null;
                }
                ooVar.getClass();
                Object obj11 = list5.get(2);
                if (obj11 != null) {
                    num = (Integer) obj11;
                } else {
                    num = null;
                }
                num.getClass();
                int intValue = num.intValue();
                Object obj12 = list5.get(3);
                if (obj12 != null) {
                    num2 = (Integer) obj12;
                } else {
                    num2 = null;
                }
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj13 = list5.get(4);
                if (obj13 != null) {
                    str2 = (String) obj13;
                } else {
                    str2 = null;
                }
                str2.getClass();
                switch (ooVar.ordinal()) {
                    case 0:
                        Object obj14 = list5.get(1);
                        y23 y23Var3 = na5.g;
                        if (!a34.i(obj14, Boolean.FALSE) && obj14 != null) {
                            hi4Var = (hi4) ((ub2) y23Var3.z).invoke(obj14);
                        }
                        hi4Var.getClass();
                        joVar = new jo(hi4Var, intValue, intValue2, str2);
                        break;
                    case 1:
                        Object obj15 = list5.get(1);
                        y23 y23Var4 = na5.h;
                        if (!a34.i(obj15, Boolean.FALSE) && obj15 != null) {
                            pv5Var = (pv5) ((ub2) y23Var4.z).invoke(obj15);
                        }
                        pv5Var.getClass();
                        joVar = new jo(pv5Var, intValue, intValue2, str2);
                        break;
                    case 2:
                        Object obj16 = list5.get(1);
                        y23 y23Var5 = na5.c;
                        if (!a34.i(obj16, Boolean.FALSE) && obj16 != null) {
                            zr6Var = (zr6) ((ub2) y23Var5.z).invoke(obj16);
                        }
                        zr6Var.getClass();
                        joVar = new jo(zr6Var, intValue, intValue2, str2);
                        break;
                    case 3:
                        Object obj17 = list5.get(1);
                        y23 y23Var6 = na5.d;
                        if (!a34.i(obj17, Boolean.FALSE) && obj17 != null) {
                            pp6Var = (pp6) ((ub2) y23Var6.z).invoke(obj17);
                        }
                        pp6Var.getClass();
                        joVar = new jo(pp6Var, intValue, intValue2, str2);
                        break;
                    case 4:
                        Object obj18 = list5.get(1);
                        y23 y23Var7 = na5.e;
                        if (!a34.i(obj18, Boolean.FALSE) && obj18 != null) {
                            uh3Var = (uh3) ((ub2) y23Var7.z).invoke(obj18);
                        }
                        uh3Var.getClass();
                        joVar = new jo(uh3Var, intValue, intValue2, str2);
                        break;
                    case 5:
                        Object obj19 = list5.get(1);
                        y23 y23Var8 = na5.f;
                        if (!a34.i(obj19, Boolean.FALSE) && obj19 != null) {
                            th3Var = (th3) ((ub2) y23Var8.z).invoke(obj19);
                        }
                        th3Var.getClass();
                        joVar = new jo(th3Var, intValue, intValue2, str2);
                        break;
                    case 6:
                        Object obj20 = list5.get(1);
                        if (obj20 != null) {
                            str6 = (String) obj20;
                        }
                        str6.getClass();
                        joVar = new jo(new cz5(str6), intValue, intValue2, str2);
                        break;
                    default:
                        ze0.l();
                        return null;
                }
                return joVar;
            case 9:
                obj.getClass();
                return new jh3(((Integer) obj).intValue());
            case 10:
                if (obj != null) {
                    str5 = (String) obj;
                }
                str5.getClass();
                return new zr6(str5);
            case 11:
                if (obj != null) {
                    str4 = (String) obj;
                }
                str4.getClass();
                return new pp6(str4);
            case 12:
                obj.getClass();
                List list6 = (List) obj;
                Object obj21 = list6.get(0);
                ma5 ma5Var4 = na5.q;
                Boolean bool4 = Boolean.FALSE;
                a34.i(obj21, bool4);
                if (obj21 != null) {
                    c86Var = (c86) ma5Var4.y.invoke(obj21);
                } else {
                    c86Var = null;
                }
                c86Var.getClass();
                int i3 = c86Var.a;
                Object obj22 = list6.get(1);
                ma5 ma5Var5 = na5.r;
                a34.i(obj22, bool4);
                if (obj22 != null) {
                    j96Var = (j96) ma5Var5.y.invoke(obj22);
                } else {
                    j96Var = null;
                }
                j96Var.getClass();
                int i4 = j96Var.a;
                Object obj23 = list6.get(2);
                fe6[] fe6VarArr = ee6.b;
                ma5 ma5Var6 = na5.v;
                a34.i(obj23, bool4);
                if (obj23 != null) {
                    ee6Var = (ee6) ma5Var6.y.invoke(obj23);
                } else {
                    ee6Var = null;
                }
                ee6Var.getClass();
                long j2 = ee6Var.a;
                Object obj24 = list6.get(3);
                qc6 qc6Var2 = qc6.c;
                y23 y23Var9 = na5.l;
                if (a34.i(obj24, bool4) || obj24 == null) {
                    qc6Var = null;
                } else {
                    qc6Var = (qc6) ((ub2) y23Var9.z).invoke(obj24);
                }
                Object obj25 = list6.get(4);
                y23 y23Var10 = m37.f;
                if (a34.i(obj25, bool4) || obj25 == null) {
                    um4Var = null;
                } else {
                    um4Var = (um4) ((ub2) y23Var10.z).invoke(obj25);
                }
                Object obj26 = list6.get(5);
                lh3 lh3Var2 = lh3.d;
                y23 y23Var11 = na5.A;
                if (a34.i(obj26, bool4) || obj26 == null) {
                    lh3Var = null;
                } else {
                    lh3Var = (lh3) ((ub2) y23Var11.z).invoke(obj26);
                }
                Object obj27 = list6.get(6);
                y23 y23Var12 = m37.h;
                if (a34.i(obj27, bool4) || obj27 == null) {
                    fh3Var = null;
                } else {
                    fh3Var = (fh3) ((ub2) y23Var12.z).invoke(obj27);
                }
                fh3Var.getClass();
                int i5 = fh3Var.a;
                Object obj28 = list6.get(7);
                ma5 ma5Var7 = na5.s;
                a34.i(obj28, bool4);
                if (obj28 != null) {
                    zs2Var = (zs2) ma5Var7.y.invoke(obj28);
                } else {
                    zs2Var = null;
                }
                zs2Var.getClass();
                int i6 = zs2Var.a;
                Object obj29 = list6.get(8);
                y23 y23Var13 = m37.i;
                if (!a34.i(obj29, bool4) && obj29 != null) {
                    kd6Var = (kd6) ((ub2) y23Var13.z).invoke(obj29);
                }
                return new hi4(i3, i4, j2, qc6Var, um4Var, lh3Var, i5, i6, kd6Var);
            case 13:
                obj.getClass();
                List list7 = (List) obj;
                Object obj30 = list7.get(0);
                int i7 = ep0.j;
                Boolean bool5 = Boolean.FALSE;
                a34.i(obj30, bool5);
                if (obj30 != null) {
                    if (obj30.equals(bool5)) {
                        ep0Var = new ep0(ep0.i);
                    } else {
                        ep0Var = new ep0(w65.e(((Integer) obj30).intValue()));
                    }
                } else {
                    ep0Var = null;
                }
                ep0Var.getClass();
                long j3 = ep0Var.a;
                Object obj31 = list7.get(1);
                fe6[] fe6VarArr2 = ee6.b;
                ub2 ub2Var = na5.v.y;
                a34.i(obj31, bool5);
                if (obj31 != null) {
                    ee6Var2 = (ee6) ub2Var.invoke(obj31);
                } else {
                    ee6Var2 = null;
                }
                ee6Var2.getClass();
                long j4 = ee6Var2.a;
                Object obj32 = list7.get(2);
                s92 s92Var2 = s92.y;
                y23 y23Var14 = na5.m;
                if (a34.i(obj32, bool5) || obj32 == null) {
                    s92Var = null;
                } else {
                    s92Var = (s92) ((ub2) y23Var14.z).invoke(obj32);
                }
                Object obj33 = list7.get(3);
                y23 y23Var15 = na5.t;
                if (a34.i(obj33, bool5) || obj33 == null) {
                    o92Var = null;
                } else {
                    o92Var = (o92) ((ub2) y23Var15.z).invoke(obj33);
                }
                Object obj34 = list7.get(4);
                y23 y23Var16 = na5.u;
                if (a34.i(obj34, bool5) || obj34 == null) {
                    p92Var = null;
                } else {
                    p92Var = (p92) ((ub2) y23Var16.z).invoke(obj34);
                }
                Object obj35 = list7.get(6);
                if (obj35 != null) {
                    str3 = (String) obj35;
                } else {
                    str3 = null;
                }
                Object obj36 = list7.get(7);
                a34.i(obj36, bool5);
                if (obj36 != null) {
                    ee6Var3 = (ee6) ub2Var.invoke(obj36);
                } else {
                    ee6Var3 = null;
                }
                ee6Var3.getClass();
                long j5 = ee6Var3.a;
                Object obj37 = list7.get(8);
                y23 y23Var17 = na5.n;
                if (a34.i(obj37, bool5) || obj37 == null) {
                    z30Var = null;
                } else {
                    z30Var = (z30) ((ub2) y23Var17.z).invoke(obj37);
                }
                Object obj38 = list7.get(9);
                y23 y23Var18 = na5.k;
                if (a34.i(obj38, bool5) || obj38 == null) {
                    oc6Var = null;
                } else {
                    oc6Var = (oc6) ((ub2) y23Var18.z).invoke(obj38);
                }
                Object obj39 = list7.get(10);
                fk3 fk3Var2 = fk3.z;
                y23 y23Var19 = na5.y;
                if (a34.i(obj39, bool5) || obj39 == null) {
                    fk3Var = null;
                } else {
                    fk3Var = (fk3) ((ub2) y23Var19.z).invoke(obj39);
                }
                Object obj40 = list7.get(11);
                a34.i(obj40, bool5);
                if (obj40 != null) {
                    if (obj40.equals(bool5)) {
                        ep0Var2 = new ep0(ep0.i);
                    } else {
                        ep0Var2 = new ep0(w65.e(((Integer) obj40).intValue()));
                    }
                } else {
                    ep0Var2 = null;
                }
                ep0Var2.getClass();
                long j6 = ep0Var2.a;
                Object obj41 = list7.get(12);
                y23 y23Var20 = na5.j;
                if (a34.i(obj41, bool5) || obj41 == null) {
                    g96Var = null;
                } else {
                    g96Var = (g96) ((ub2) y23Var20.z).invoke(obj41);
                }
                Object obj42 = list7.get(13);
                km5 km5Var2 = km5.d;
                y23 y23Var21 = na5.o;
                if (!a34.i(obj42, bool5) && obj42 != null) {
                    km5Var = (km5) ((ub2) y23Var21.z).invoke(obj42);
                }
                return new pv5(j3, j4, s92Var, o92Var, p92Var, (q82) null, str3, j5, z30Var, oc6Var, fk3Var, j6, g96Var, km5Var, 49184);
            case 14:
                obj.getClass();
                List list8 = (List) obj;
                Object obj43 = list8.get(0);
                if (obj43 != null) {
                    bool = (Boolean) obj43;
                } else {
                    bool = null;
                }
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                Object obj44 = list8.get(1);
                y23 y23Var22 = m37.g;
                if (!a34.i(obj44, Boolean.FALSE) && obj44 != null) {
                    ys1Var = (ys1) ((ub2) y23Var22.z).invoke(obj44);
                }
                ys1Var.getClass();
                return new um4(ys1Var.a, booleanValue);
            case 15:
                obj.getClass();
                return new ys1(((Integer) obj).intValue());
            case 16:
                obj.getClass();
                return new fh3(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                List list9 = (List) obj;
                Object obj45 = list9.get(0);
                y23 y23Var23 = m37.j;
                if (a34.i(obj45, Boolean.FALSE) || obj45 == null) {
                    jd6Var = null;
                } else {
                    jd6Var = (jd6) ((ub2) y23Var23.z).invoke(obj45);
                }
                jd6Var.getClass();
                int i8 = jd6Var.a;
                Object obj46 = list9.get(1);
                if (obj46 != null) {
                    bool2 = (Boolean) obj46;
                }
                bool2.getClass();
                return new kd6(i8, bool2.booleanValue());
            case 18:
                obj.getClass();
                return new jd6(((Integer) obj).intValue());
            case 19:
                e04 e04Var = (e04) obj;
                e04Var.getClass();
                iz5.b(e04Var, z05.a(sb5.class), new oa5(b2));
                return pn6Var;
            case 20:
                return Integer.valueOf(((kc5) obj).b);
            case 21:
                return Integer.valueOf(((kc5) obj).c.b());
            case 22:
                return new yc5(((Integer) obj).intValue());
            case 23:
                ((d21) obj).getClass();
                return new j44(z);
            case 24:
                e04 e04Var2 = (e04) obj;
                e04Var2.getClass();
                iz5.b(e04Var2, z05.a(af5.class), new oa5(b3));
                return pn6Var;
            case 25:
                Anime anime = (Anime) obj;
                anime.getClass();
                return vc2.a(anime.getAnilistId(), anime.getId());
            case 26:
                ((sc3) obj).getClass();
                return new li2(tl7.e(sc3.b));
            case 27:
                String str8 = (String) obj;
                str8.getClass();
                return "history:".concat(str8);
            case 28:
                SearchSuggestion searchSuggestion = (SearchSuggestion) obj;
                searchSuggestion.getClass();
                return zo5.l("suggestion:", searchSuggestion.getId());
            default:
                if (!uz5.V((String) obj)) {
                    j = 150;
                }
                return Long.valueOf(j);
        }
    }
}

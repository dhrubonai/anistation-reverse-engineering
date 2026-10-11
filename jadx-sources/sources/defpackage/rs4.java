package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.anistation.model.Recommendation;
import com.anistation.model.Relation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class rs4 implements ub2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ rs4(byte b) {
        this.x = b;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        pv5 pv5Var;
        pv5 pv5Var2;
        pv5 pv5Var3;
        List list;
        ee6 ee6Var;
        Integer num;
        ep0 ep0Var;
        xc4 xc4Var;
        String str;
        jo joVar;
        Float f;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        pv5 pv5Var4 = null;
        fe6 fe6Var = null;
        r2 = null;
        id6 id6Var = null;
        Float f2 = null;
        Integer num2 = null;
        ee6 ee6Var2 = null;
        String str2 = null;
        pv5Var4 = null;
        int i = 0;
        switch (b) {
            case 0:
                ((Context) obj).getClass();
                return nt1.x;
            case 1:
                Context context = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                while (i < size) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str3 = activityInfo.permission;
                            if (str3 != null && context.checkSelfPermission(str3) != 0) {
                            }
                        }
                        i++;
                    }
                    arrayList.add(resolveInfo);
                    i++;
                }
                return arrayList;
            case 2:
                r83 r83Var = (r83) obj;
                r83Var.a = (short) 6000;
                Float valueOf = Float.valueOf(90.0f);
                r83Var.a(valueOf, 300).b = a14.a;
                r83Var.a(valueOf, 1500);
                Float valueOf2 = Float.valueOf(180.0f);
                r83Var.a(valueOf2, 1800);
                r83Var.a(valueOf2, 3000);
                Float valueOf3 = Float.valueOf(270.0f);
                r83Var.a(valueOf3, 3300);
                r83Var.a(valueOf3, 4500);
                Float valueOf4 = Float.valueOf(360.0f);
                r83Var.a(valueOf4, 4800);
                r83Var.a(valueOf4, 6000);
                return pn6Var;
            case 3:
                zu4 zu4Var = zu4.d;
                w73[] w73VarArr = zh5.a;
                ai5 ai5Var = yh5.c;
                w73 w73Var = zh5.a[1];
                ai5Var.getClass();
                ((bi5) obj).b(ai5Var, zu4Var);
                return pn6Var;
            case 4:
                bb3 bb3Var = (bb3) obj;
                dn0 dn0Var = bb3Var.x.y;
                long B = dn0Var.B();
                dn0Var.y().h();
                try {
                    ((dn0) ((af2) dn0Var.y).y).y().n(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    bb3Var.a();
                    return pn6Var;
                } finally {
                    h11.u(dn0Var, B);
                }
            case 5:
                Float f3 = (Float) obj;
                f3.getClass();
                return new mx4(new wj(f3, db.l, pv5Var4, 12));
            case 6:
                Recommendation recommendation = (Recommendation) obj;
                recommendation.getClass();
                return vc2.a(recommendation.getAnilistId(), recommendation.getId());
            case 7:
                Relation relation = (Relation) obj;
                relation.getClass();
                return vc2.a(relation.getAnilistId(), relation.getId());
            case 8:
                e04 e04Var = (e04) obj;
                e04Var.getClass();
                im0 a = z05.a(zn.class);
                wj3 wj3Var = new wj3((byte) 17);
                v83 v83Var = v83.x;
                n77.u(zz.u(a, wj3Var, v83Var, e04Var, 8), z05.a(pn.class));
                n77.u(zz.u(z05.a(ny6.class), new wj3((byte) 18), v83Var, e04Var, 8), z05.a(cy6.class));
                n77.u(zz.u(z05.a(qt6.class), new wj3((byte) 19), v83Var, e04Var, 8), z05.a(ot6.class));
                n77.u(zz.u(z05.a(mf2.class), new wj3((byte) 20), v83Var, e04Var, 8), z05.a(kf2.class));
                n77.u(zz.u(z05.a(xd5.class), new wj3((byte) 21), v83Var, e04Var, 8), z05.a(wd5.class));
                n77.u(zz.u(z05.a(on.class), new wj3((byte) 22), v83Var, e04Var, 8), z05.a(cn.class));
                n77.u(zz.u(z05.a(bn.class), new wj3((byte) 23), v83Var, e04Var, 8), z05.a(ym.class));
                n77.u(zz.u(z05.a(tq.class), new wj3((byte) 24), v83Var, e04Var, 8), z05.a(rq.class));
                n77.u(zz.u(z05.a(tl5.class), new wj3((byte) 25), v83Var, e04Var, 8), z05.a(ql5.class));
                e04Var.a(new k03(new r50(zp2.C, z05.a(w00.class), null, new wj3((byte) 16), v83Var)));
                return pn6Var;
            case 9:
                t97 t97Var = (t97) obj;
                t97Var.getClass();
                qj4 qj4Var = d45.C;
                return Boolean.valueOf(wk6.y(t97Var.a));
            case 10:
                return pn6Var;
            case 11:
                return new k95((Map) obj);
            case 12:
                return obj;
            case 13:
                obj.getClass();
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                ub2 ub2Var = (ub2) na5.h.z;
                Boolean bool = Boolean.FALSE;
                if (a34.i(obj2, bool) || obj2 == null) {
                    pv5Var = null;
                } else {
                    pv5Var = (pv5) ub2Var.invoke(obj2);
                }
                Object obj3 = list2.get(1);
                if (a34.i(obj3, bool) || obj3 == null) {
                    pv5Var2 = null;
                } else {
                    pv5Var2 = (pv5) ub2Var.invoke(obj3);
                }
                Object obj4 = list2.get(2);
                if (a34.i(obj4, bool) || obj4 == null) {
                    pv5Var3 = null;
                } else {
                    pv5Var3 = (pv5) ub2Var.invoke(obj4);
                }
                Object obj5 = list2.get(3);
                if (!a34.i(obj5, bool) && obj5 != null) {
                    pv5Var4 = (pv5) ub2Var.invoke(obj5);
                }
                return new id6(pv5Var, pv5Var2, pv5Var3, pv5Var4);
            case 14:
                obj.getClass();
                List list3 = (List) obj;
                Object obj6 = list3.get(1);
                y23 y23Var = na5.a;
                if (a34.i(obj6, Boolean.FALSE) || obj6 == null) {
                    list = null;
                } else {
                    list = (List) ((ub2) y23Var.z).invoke(obj6);
                }
                Object obj7 = list3.get(0);
                if (obj7 != null) {
                    str2 = (String) obj7;
                }
                str2.getClass();
                return new ko(list, str2);
            case 15:
                obj.getClass();
                return new g96(((Integer) obj).intValue());
            case 16:
                obj.getClass();
                List list4 = (List) obj;
                return new oc6(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 17:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                fe6[] fe6VarArr = ee6.b;
                ub2 ub2Var2 = na5.v.y;
                Boolean bool2 = Boolean.FALSE;
                a34.i(obj8, bool2);
                if (obj8 != null) {
                    ee6Var = (ee6) ub2Var2.invoke(obj8);
                } else {
                    ee6Var = null;
                }
                ee6Var.getClass();
                long j = ee6Var.a;
                Object obj9 = list5.get(1);
                a34.i(obj9, bool2);
                if (obj9 != null) {
                    ee6Var2 = (ee6) ub2Var2.invoke(obj9);
                }
                ee6Var2.getClass();
                return new qc6(j, ee6Var2.a);
            case 18:
                obj.getClass();
                return new s92(((Integer) obj).intValue());
            case 19:
                obj.getClass();
                return new z30(((Float) obj).floatValue());
            case 20:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                if (obj10 != null) {
                    num = (Integer) obj10;
                } else {
                    num = null;
                }
                num.getClass();
                int intValue = num.intValue();
                Object obj11 = list6.get(1);
                if (obj11 != null) {
                    num2 = (Integer) obj11;
                }
                num2.getClass();
                return new nd6(fy5.a(intValue, num2.intValue()));
            case 21:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i2 = ep0.j;
                Boolean bool3 = Boolean.FALSE;
                a34.i(obj12, bool3);
                if (obj12 != null) {
                    if (obj12.equals(bool3)) {
                        ep0Var = new ep0(ep0.i);
                    } else {
                        ep0Var = new ep0(w65.e(((Integer) obj12).intValue()));
                    }
                } else {
                    ep0Var = null;
                }
                ep0Var.getClass();
                long j2 = ep0Var.a;
                Object obj13 = list7.get(1);
                ma5 ma5Var = na5.x;
                a34.i(obj13, bool3);
                if (obj13 != null) {
                    xc4Var = (xc4) ma5Var.y.invoke(obj13);
                } else {
                    xc4Var = null;
                }
                xc4Var.getClass();
                long j3 = xc4Var.a;
                Object obj14 = list7.get(2);
                if (obj14 != null) {
                    f2 = (Float) obj14;
                }
                f2.getClass();
                return new km5(f2.floatValue(), j2, j3);
            case 22:
                obj.getClass();
                return new c86(((Integer) obj).intValue());
            case 23:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                if (obj15 != null) {
                    str = (String) obj15;
                } else {
                    str = null;
                }
                str.getClass();
                Object obj16 = list8.get(1);
                y23 y23Var2 = na5.i;
                if (!a34.i(obj16, Boolean.FALSE) && obj16 != null) {
                    id6Var = (id6) ((ub2) y23Var2.z).invoke(obj16);
                }
                return new uh3(str, id6Var);
            case 24:
                obj.getClass();
                return new j96(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                return new zs2(((Integer) obj).intValue());
            case 26:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i < size2) {
                    Object obj17 = list9.get(i);
                    y23 y23Var3 = na5.b;
                    if (a34.i(obj17, Boolean.FALSE) || obj17 == null) {
                        joVar = null;
                    } else {
                        joVar = (jo) ((ub2) y23Var3.z).invoke(obj17);
                    }
                    joVar.getClass();
                    arrayList2.add(joVar);
                    i++;
                }
                return arrayList2;
            case 27:
                obj.getClass();
                return new o92(((Integer) obj).intValue());
            case 28:
                obj.getClass();
                return new p92(((Integer) obj).intValue());
            default:
                Boolean bool4 = Boolean.FALSE;
                if (a34.i(obj, bool4)) {
                    return new ee6(ee6.c);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                if (obj18 != null) {
                    f = (Float) obj18;
                } else {
                    f = null;
                }
                f.getClass();
                float floatValue = f.floatValue();
                Object obj19 = list10.get(1);
                ma5 ma5Var2 = na5.w;
                a34.i(obj19, bool4);
                if (obj19 != null) {
                    fe6Var = (fe6) ma5Var2.y.invoke(obj19);
                }
                fe6Var.getClass();
                return new ee6(hz5.h(floatValue, fe6Var.a));
        }
    }
}

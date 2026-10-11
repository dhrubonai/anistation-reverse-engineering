package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class oa5 implements ic2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ oa5(byte b) {
        this.x = b;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        final byte b = 1;
        switch (this.x) {
            case 0:
                um4 um4Var = (um4) obj2;
                Boolean valueOf = Boolean.valueOf(um4Var.a);
                y23 y23Var = na5.a;
                return te4.n(valueOf, na5.a(new ys1(um4Var.b), m37.g, (i95) obj));
            case 1:
                return Integer.valueOf(((ys1) obj2).a);
            case 2:
                return Integer.valueOf(((fh3) obj2).a);
            case 3:
                kd6 kd6Var = (kd6) obj2;
                return te4.n(na5.a(new jd6(kd6Var.a), m37.j, (i95) obj), Boolean.valueOf(kd6Var.b));
            case 4:
                return Integer.valueOf(((jd6) obj2).a);
            case 5:
                dc5 dc5Var = (dc5) obj;
                dc5Var.getClass();
                ((li4) obj2).getClass();
                return new sb5((pn) dc5Var.d(z05.a(pn.class), null, null));
            case 6:
                ((Integer) obj).intValue();
                Map.Entry entry = (Map.Entry) obj2;
                entry.getClass();
                Object key = entry.getKey();
                key.getClass();
                return key;
            case 7:
                return Integer.valueOf(((yc5) obj2).a.h());
            case 8:
                dc5 dc5Var2 = (dc5) obj;
                dc5Var2.getClass();
                ((li4) obj2).getClass();
                return new af5((pn) dc5Var2.d(z05.a(pn.class), null, null), (wd5) dc5Var2.d(z05.a(wd5.class), null, null));
            case 9:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = nt1.x;
                }
                return yo0.u0(list, collection);
            case 10:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList(list2);
                    arrayList.addAll(list3);
                    return arrayList;
                }
                return list3;
            case 11:
                Float f = (Float) obj;
                ((Float) obj2).getClass();
                return f;
            case 12:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 13:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 14:
                return (m65) obj;
            case 15:
                return (String) obj;
            case 16:
                return (pn6) obj;
            case 17:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 != null) {
                    ArrayList arrayList2 = new ArrayList(list4);
                    arrayList2.addAll(list5);
                    return arrayList2;
                }
                return list5;
            case 18:
                return (om5) obj;
            case 19:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 20:
                return (kz0) obj;
            case 21:
                return (kb) obj;
            case 22:
                return (ic) obj;
            case 23:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case 24:
                if (obj != null || obj2 != null) {
                    ov3.d();
                }
                return null;
            case 25:
                if (obj == null) {
                    return obj2;
                }
                return obj;
            case 26:
                uh5 uh5Var = (uh5) obj2;
                Object valueOf2 = Float.valueOf(0.0f);
                ph5 ph5Var = ((uh5) obj).d;
                ai5 ai5Var = yh5.u;
                Object g = ph5Var.x.g(ai5Var);
                if (g == null) {
                    g = valueOf2;
                }
                float floatValue = ((Number) g).floatValue();
                Object g2 = uh5Var.d.x.g(ai5Var);
                if (g2 != null) {
                    valueOf2 = g2;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf2).floatValue()));
            case 27:
                e73 e73Var = (e73) obj;
                final List list6 = (List) obj2;
                e73Var.getClass();
                list6.getClass();
                ArrayList c = tj5.c(db.k, list6, true);
                c.getClass();
                final byte b2 = 0;
                return tj5.a(e73Var, c, new sb2() { // from class: pj5
                    @Override // defpackage.sb2
                    public final Object invoke() {
                        byte b3 = b2;
                        List list7 = list6;
                        switch (b3) {
                            case 0:
                                return ((y73) list7.get(0)).c();
                            default:
                                return ((y73) list7.get(0)).c();
                        }
                    }
                });
            case 28:
                e73 e73Var2 = (e73) obj;
                final List list7 = (List) obj2;
                e73Var2.getClass();
                list7.getClass();
                ArrayList c2 = tj5.c(db.k, list7, true);
                c2.getClass();
                x73 a = tj5.a(e73Var2, c2, new sb2() { // from class: pj5
                    @Override // defpackage.sb2
                    public final Object invoke() {
                        byte b3 = b;
                        List list72 = list7;
                        switch (b3) {
                            case 0:
                                return ((y73) list72.get(0)).c();
                            default:
                                return ((y73) list72.get(0)).c();
                        }
                    }
                });
                if (a == null) {
                    return null;
                }
                return jb0.a(a);
            default:
                dc5 dc5Var3 = (dc5) obj;
                dc5Var3.getClass();
                ((li4) obj2).getClass();
                return new hm5((cn) dc5Var3.d(z05.a(cn.class), null, null), (ym) dc5Var3.d(z05.a(ym.class), null, null), (kf2) dc5Var3.d(z05.a(kf2.class), null, null), (ot6) dc5Var3.d(z05.a(ot6.class), null, null), (cy6) dc5Var3.d(z05.a(cy6.class), null, null), (ql5) dc5Var3.d(z05.a(ql5.class), null, null), (w00) dc5Var3.d(z05.a(w00.class), null, null), (wd5) dc5Var3.d(z05.a(wd5.class), null, null), (ch1) dc5Var3.d(z05.a(ch1.class), null, null));
        }
    }
}

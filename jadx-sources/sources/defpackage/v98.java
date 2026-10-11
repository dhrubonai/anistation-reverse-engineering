package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v98 {
    public final String a;
    public final boolean b;
    public final tu7 c;
    public final BitSet d;
    public final BitSet e;
    public final js f;
    public final js g;
    public final /* synthetic */ df7 h;

    /* JADX WARN: Type inference failed for: r1v1, types: [so5, js] */
    public v98(df7 df7Var, String str, tu7 tu7Var, BitSet bitSet, BitSet bitSet2, js jsVar, js jsVar2) {
        this.h = df7Var;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = jsVar;
        this.g = new so5(0);
        Iterator it = ((gs) jsVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) jsVar2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = tu7Var;
    }

    public final void a(nc7 nc7Var) {
        int s;
        switch (nc7Var.g) {
            case 0:
                s = ((cq7) nc7Var.i).s();
                break;
            default:
                s = ((jq7) nc7Var.i).s();
                break;
        }
        boolean z = true;
        if (nc7Var.c != null) {
            this.e.set(s, true);
        }
        Boolean bool = nc7Var.d;
        if (bool != null) {
            this.d.set(s, bool.booleanValue());
        }
        if (nc7Var.e != null) {
            Integer valueOf = Integer.valueOf(s);
            js jsVar = this.f;
            Long l = (Long) jsVar.get(valueOf);
            long longValue = nc7Var.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                jsVar.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (nc7Var.f != null) {
            Integer valueOf2 = Integer.valueOf(s);
            js jsVar2 = this.g;
            List list = (List) jsVar2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                jsVar2.put(valueOf2, list);
            }
            boolean z2 = false;
            switch (nc7Var.g) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                list.clear();
            }
            ji7.a();
            gu7 gu7Var = (gu7) this.h.x;
            ak7 ak7Var = gu7Var.A;
            sq7 sq7Var = tq7.F0;
            String str = this.a;
            if (ak7Var.W(str, sq7Var)) {
                switch (nc7Var.g) {
                    case 0:
                        z2 = ((cq7) nc7Var.i).x();
                        break;
                }
                if (z2) {
                    list.clear();
                }
            }
            ji7.a();
            boolean W = gu7Var.A.W(str, sq7Var);
            Long l2 = nc7Var.f;
            if (W) {
                Long valueOf3 = Long.valueOf(l2.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(l2.longValue() / 1000));
        }
    }

    public final ys7 b(int i) {
        List list;
        xs7 y = ys7.y();
        y.c();
        ((ys7) y.y).z(i);
        y.c();
        ((ys7) y.y).C(this.b);
        tu7 tu7Var = this.c;
        if (tu7Var != null) {
            y.c();
            ((ys7) y.y).B(tu7Var);
        }
        ru7 z = tu7.z();
        ArrayList r0 = c28.r0(this.d);
        z.c();
        ((tu7) z.y).D(r0);
        ArrayList r02 = c28.r0(this.e);
        z.c();
        ((tu7) z.y).B(r02);
        js jsVar = this.f;
        ArrayList arrayList = new ArrayList(jsVar.z);
        Iterator it = ((gs) jsVar.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            Long l = (Long) jsVar.get(num);
            if (l != null) {
                jt7 v = kt7.v();
                v.c();
                ((kt7) v.y).w(intValue);
                long longValue = l.longValue();
                v.c();
                ((kt7) v.y).x(longValue);
                arrayList.add((kt7) v.e());
            }
        }
        z.c();
        ((tu7) z.y).F(arrayList);
        js jsVar2 = this.g;
        if (jsVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(jsVar2.z);
            Iterator it2 = ((gs) jsVar2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                wu7 w = xu7.w();
                int intValue2 = num2.intValue();
                w.c();
                ((xu7) w.y).x(intValue2);
                List list2 = (List) jsVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    w.c();
                    ((xu7) w.y).y(list2);
                }
                arrayList2.add((xu7) w.e());
            }
            list = arrayList2;
        }
        z.c();
        ((tu7) z.y).H(list);
        y.c();
        ((ys7) y.y).A((tu7) z.e());
        return (ys7) y.e();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [so5, js] */
    /* JADX WARN: Type inference failed for: r1v5, types: [so5, js] */
    public v98(df7 df7Var, String str) {
        this.h = df7Var;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new so5(0);
        this.g = new so5(0);
    }
}

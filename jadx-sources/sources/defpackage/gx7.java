package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gx7 extends zj7 {
    public final l87 y;

    public gx7(l87 l87Var) {
        this.y = l87Var;
    }

    @Override // defpackage.zj7, defpackage.ik7
    public final ik7 i(String str, vs7 vs7Var, ArrayList arrayList) {
        int hashCode = str.hashCode();
        Object obj = null;
        l87 l87Var = this.y;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    fy5.k("getEventName", 0, arrayList);
                    return new tk7(((mc7) l87Var.z).a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    fy5.k("getTimestamp", 0, arrayList);
                    return new xh7(Double.valueOf(((mc7) l87Var.z).b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    fy5.k("getParamValue", 1, arrayList);
                    String d = ((y23) vs7Var.b).f0(vs7Var, (ik7) arrayList.get(0)).d();
                    HashMap hashMap = ((mc7) l87Var.z).c;
                    if (hashMap.containsKey(d)) {
                        obj = hashMap.get(d);
                    }
                    return nz5.e(obj);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    fy5.k("getParams", 0, arrayList);
                    HashMap hashMap2 = ((mc7) l87Var.z).c;
                    zj7 zj7Var = new zj7();
                    for (String str2 : hashMap2.keySet()) {
                        zj7Var.g(str2, nz5.e(hashMap2.get(str2)));
                    }
                    return zj7Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    fy5.k("setParamValue", 2, arrayList);
                    String d2 = ((y23) vs7Var.b).f0(vs7Var, (ik7) arrayList.get(0)).d();
                    ik7 f0 = ((y23) vs7Var.b).f0(vs7Var, (ik7) arrayList.get(1));
                    mc7 mc7Var = (mc7) l87Var.z;
                    Object s = fy5.s(f0);
                    HashMap hashMap3 = mc7Var.c;
                    if (s == null) {
                        hashMap3.remove(d2);
                        return f0;
                    }
                    hashMap3.put(d2, mc7.b(d2, hashMap3.get(d2), s));
                    return f0;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    fy5.k("setEventName", 1, arrayList);
                    ik7 f02 = ((y23) vs7Var.b).f0(vs7Var, (ik7) arrayList.get(0));
                    if (!ik7.p.equals(f02) && !ik7.q.equals(f02)) {
                        ((mc7) l87Var.z).a = f02.d();
                        return new tk7(f02.d());
                    }
                    ze0.k("Illegal event name");
                    return null;
                }
                break;
        }
        return super.i(str, vs7Var, arrayList);
    }
}

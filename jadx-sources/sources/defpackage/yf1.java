package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class yf1 {
    public static final String a = xk3.f("DiagnosticsWrkr");

    public static final String a(q77 q77Var, h87 h87Var, m46 m46Var, List list) {
        Integer num;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z77 z77Var = (z77) it.next();
            i77 d = fy5.d(z77Var);
            String str = z77Var.a;
            l46 systemIdInfo = m46Var.getSystemIdInfo(d);
            if (systemIdInfo != null) {
                num = Integer.valueOf(systemIdInfo.c);
            } else {
                num = null;
            }
            String q0 = yo0.q0(q77Var.getNamesForWorkSpecId(str), ",", null, null, null, 62);
            String q02 = yo0.q0(h87Var.getTagsForWorkSpecId(str), ",", null, null, null, 62);
            String str2 = z77Var.c;
            String name = z77Var.b.name();
            StringBuilder o = h11.o("\n", str, "\t ", str2, "\t ");
            o.append(num);
            o.append("\t ");
            o.append(name);
            o.append("\t ");
            sb.append(h11.l(o, q0, "\t ", q02, "\t"));
        }
        return sb.toString();
    }
}

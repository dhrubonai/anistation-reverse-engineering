package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class xb4 {
    public static final xb4 b;
    public static final xb4 c;
    public static final xb4 d;
    public static final xb4 e;
    public static final xb4 f;
    public static final xb4 g;
    public final String a;

    static {
        new xb4("2.5.4.10");
        new xb4("2.5.4.11");
        new xb4("2.5.4.6");
        new xb4("2.5.4.3");
        new xb4("2.5.29.17");
        new xb4("2.5.29.19");
        new xb4("2.5.29.15");
        new xb4("2.5.29.37");
        new xb4("1.3.6.1.5.5.7.3.1");
        new xb4("1.3.6.1.5.5.7.3.2");
        new xb4("1 2 840 113549 1 1 1");
        new xb4("1.2.840.10045.2.1");
        b = new xb4("1.2.840.10045.4.3.3");
        c = new xb4("1.2.840.10045.4.3.2");
        d = new xb4("1.2.840.113549.1.1.13");
        e = new xb4("1.2.840.113549.1.1.12");
        f = new xb4("1.2.840.113549.1.1.11");
        g = new xb4("1.2.840.113549.1.1.5");
        new xb4("1.2.840.10045.3.1.7");
    }

    public xb4(String str) {
        this.a = str;
        List i0 = uz5.i0(str, new String[]{".", " "}, 6);
        ArrayList arrayList = new ArrayList(zo0.V(i0, 10));
        Iterator it = i0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt(uz5.w0((String) it.next()).toString())));
        }
        yo0.H0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof xb4) || !this.a.equals(((xb4) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qx1.p(new StringBuilder("OID(identifier="), this.a, ')');
    }
}

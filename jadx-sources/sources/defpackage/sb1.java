package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sb1 {
    public final String a;
    public final af2 b;

    public sb1(Set set, af2 af2Var) {
        this.a = a(set);
        this.b = af2Var;
    }

    public static String a(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cy cyVar = (cy) it.next();
            sb.append(cyVar.a);
            sb.append('/');
            sb.append(cyVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}

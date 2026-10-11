package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cw6 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map Z = vn3.Z(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = Z.values().iterator();
        while (it.hasNext()) {
            ((vv6) it.next()).b();
        }
    }

    public final String toString() {
        String f = z05.a(cw6.class).f();
        if (f == null) {
            f = "ViewModelStore";
        }
        int hashCode = hashCode();
        t80.z(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        return f + "@" + num + "(keys=" + yo0.N0(this.a.keySet()) + ")";
    }
}

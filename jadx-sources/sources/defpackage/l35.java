package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class l35 {
    public final ws2 a;
    public final String b;
    public final ik2 c;
    public final o35 d;
    public final Map e;
    public qe0 f;

    public l35(ws2 ws2Var, String str, ik2 ik2Var, o35 o35Var, Map map) {
        ws2Var.getClass();
        str.getClass();
        this.a = ws2Var;
        this.b = str;
        this.c = ik2Var;
        this.d = o35Var;
        this.e = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kz] */
    public final kz a() {
        LinkedHashMap linkedHashMap;
        ?? obj = new Object();
        obj.B = new LinkedHashMap();
        obj.x = this.a;
        obj.y = this.b;
        obj.A = this.d;
        Map map = this.e;
        if (map.isEmpty()) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(map);
        }
        obj.B = linkedHashMap;
        obj.z = this.c.d();
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        ik2 ik2Var = this.c;
        if (ik2Var.size() != 0) {
            sb.append(", headers=[");
            Iterator it = ik2Var.iterator();
            int i = 0;
            while (true) {
                o1 o1Var = (o1) it;
                if (o1Var.hasNext()) {
                    Object next = o1Var.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        ai4 ai4Var = (ai4) next;
                        String str = (String) ai4Var.x;
                        String str2 = (String) ai4Var.y;
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        sb.append(str2);
                        i = i2;
                    } else {
                        te4.R();
                        throw null;
                    }
                } else {
                    sb.append(']');
                    break;
                }
            }
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}

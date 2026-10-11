package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class li4 {
    public final List a;
    public int b;

    public li4(int i, ArrayList arrayList) {
        this.a = (i & 1) != 0 ? new ArrayList() : arrayList;
    }

    public Object a(im0 im0Var) {
        List list = this.a;
        if (list.size() > 0) {
            return list.get(0);
        }
        StringBuilder sb = new StringBuilder("Can't get injected parameter #0 from ");
        sb.append(this);
        String a = f73.a(im0Var);
        sb.append(" for type '");
        sb.append(a);
        sb.append('\'');
        throw new nw(sb.toString(), (byte) 6);
    }

    public Object b(e73 e73Var) {
        Object obj;
        e73Var.getClass();
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        Object obj2 = list.get(this.b);
        if (!((im0) e73Var).g(obj2)) {
            obj2 = null;
        }
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null && this.b < list.size() - 1) {
            this.b++;
        }
        if (obj2 == null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((im0) e73Var).g(obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                return null;
            }
            return obj;
        }
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof li4) {
                if (this.a.equals(((li4) obj).a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + yo0.I0(this.a);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dk2 {
    public final String a;
    public final List b;

    public dk2(String str, List list) {
        Object obj;
        String str2;
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (b06.C(((ek2) obj).a, "q", true)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ek2 ek2Var = (ek2) obj;
        if (ek2Var != null && (str2 = ek2Var.b) != null) {
            try {
                if (a06.w(str2)) {
                    Double.parseDouble(str2);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2)) {
            return false;
        }
        dk2 dk2Var = (dk2) obj;
        if (a34.i(this.a, dk2Var.a) && a34.i(this.b, dk2Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.a + ", params=" + this.b + ')';
    }
}

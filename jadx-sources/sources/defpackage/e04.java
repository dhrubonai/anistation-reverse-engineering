package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e04 {
    public final String a = a34.W();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();
    public final ArrayList e = new ArrayList();

    public final void a(k03 k03Var) {
        String str;
        r50 r50Var = k03Var.a;
        im0 im0Var = r50Var.b;
        kz5 kz5Var = r50Var.c;
        qx4 qx4Var = r50Var.a;
        StringBuilder sb = new StringBuilder(f73.a(im0Var));
        sb.append(':');
        if (kz5Var != null) {
            str = kz5Var.a;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(':');
        sb.append(qx4Var);
        this.c.put(sb.toString(), k03Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e04)) {
            return false;
        }
        return this.a.equals(((e04) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

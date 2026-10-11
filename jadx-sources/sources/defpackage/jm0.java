package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jm0 {
    public final String a;
    public List b = nt1.x;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public jm0(String str) {
        this.a = str;
    }

    public static void a(jm0 jm0Var, String str, aj5 aj5Var) {
        jm0Var.getClass();
        str.getClass();
        aj5Var.getClass();
        if (jm0Var.d.add(str)) {
            jm0Var.c.add(str);
            jm0Var.e.add(aj5Var);
            jm0Var.f.add(nt1.x);
            jm0Var.g.add(false);
            return;
        }
        StringBuilder n = h11.n("Element with name '", str, "' is already registered in ");
        n.append(jm0Var.a);
        throw new IllegalArgumentException(n.toString().toString());
    }

    public static /* synthetic */ void getAnnotations$annotations() {
    }

    @de1
    public static /* synthetic */ void isNullable$annotations() {
    }
}

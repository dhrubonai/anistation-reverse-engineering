package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface uj7 {
    static ik7 j(uj7 uj7Var, tk7 tk7Var, vs7 vs7Var, ArrayList arrayList) {
        String str = tk7Var.x;
        if (uj7Var.k(str)) {
            ik7 b = uj7Var.b(str);
            if (b instanceof ti7) {
                return ((ti7) b).a(vs7Var, arrayList);
            }
            ze0.k(h11.j(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            fy5.k("hasOwnProperty", 1, arrayList);
            if (uj7Var.k(((y23) vs7Var.b).f0(vs7Var, (ik7) arrayList.get(0)).d())) {
                return ik7.u;
            }
            return ik7.v;
        }
        ze0.k(zo5.l("Object has no function ", str));
        return null;
    }

    ik7 b(String str);

    void g(String str, ik7 ik7Var);

    boolean k(String str);
}

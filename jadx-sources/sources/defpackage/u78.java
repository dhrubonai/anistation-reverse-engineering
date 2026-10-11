package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u78 extends ti7 {
    public final HashMap A;
    public final fq3 z;

    public u78(fq3 fq3Var) {
        super("require");
        this.A = new HashMap();
        this.z = fq3Var;
    }

    @Override // defpackage.ti7
    public final ik7 a(vs7 vs7Var, List list) {
        ik7 ik7Var;
        fy5.k("require", 1, list);
        String d = ((y23) vs7Var.b).f0(vs7Var, (ik7) list.get(0)).d();
        HashMap hashMap = this.A;
        if (hashMap.containsKey(d)) {
            return (ik7) hashMap.get(d);
        }
        HashMap hashMap2 = (HashMap) this.z.y;
        if (hashMap2.containsKey(d)) {
            try {
                ik7Var = (ik7) ((Callable) hashMap2.get(d)).call();
            } catch (Exception unused) {
                ze0.m("Failed to create API implementation: ".concat(String.valueOf(d)));
                return null;
            }
        } else {
            ik7Var = ik7.p;
        }
        if (ik7Var instanceof ti7) {
            hashMap.put(d, (ti7) ik7Var);
        }
        return ik7Var;
    }
}

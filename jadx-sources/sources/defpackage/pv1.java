package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pv1 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;

    public pv1(byte b) {
        switch (b) {
            case 1:
                this.a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                return;
            default:
                this.a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                return;
        }
    }

    public void a(im0 im0Var, ub2 ub2Var, ub2 ub2Var2, os0 os0Var) {
        LinkedHashMap linkedHashMap = this.a;
        if (!linkedHashMap.containsKey(im0Var)) {
            linkedHashMap.put(im0Var, new ov1(im0Var, ub2Var, ub2Var2, os0Var));
        } else {
            ze0.e(qx1.m("An `entry` with the same `clazz` has already been added: ", im0Var.f(), "."));
        }
    }
}

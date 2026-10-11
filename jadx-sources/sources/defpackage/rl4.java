package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class rl4 {
    public static final ArrayList e = new ArrayList();
    public final ni1 a;
    public final wc7 b;
    public List c;
    public boolean d;

    public rl4(ni1 ni1Var, wc7 wc7Var) {
        ni1Var.getClass();
        ArrayList arrayList = e;
        arrayList.getClass();
        if ((arrayList instanceof j73) && !(arrayList instanceof l73)) {
            wk6.H(arrayList, "kotlin.collections.MutableList");
            throw null;
        }
        this.a = ni1Var;
        this.b = wc7Var;
        this.c = arrayList;
        this.d = true;
        if (arrayList.isEmpty()) {
            return;
        }
        ze0.m("The shared empty array list has been modified");
        throw null;
    }

    public final String toString() {
        return "Phase `" + this.a.b + "`, " + this.c.size() + " handlers";
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class oz0 {
    public static final e73 a(aj5 aj5Var) {
        aj5Var.getClass();
        if (aj5Var instanceof pz0) {
            return ((pz0) aj5Var).b;
        }
        if (aj5Var instanceof bj5) {
            return a(((bj5) aj5Var).a);
        }
        return null;
    }

    public static final aj5 getContextualDescriptor(uj5 uj5Var, aj5 aj5Var) {
        uj5Var.getClass();
        aj5Var.getClass();
        e73 a = a(aj5Var);
        if (a != null) {
            uj5.a(uj5Var, a);
        }
        return null;
    }

    public static final List<aj5> getPolymorphicDescriptors(uj5 uj5Var, aj5 aj5Var) {
        uj5Var.getClass();
        aj5Var.getClass();
        e73 a = a(aj5Var);
        nt1 nt1Var = nt1.x;
        if (a == null) {
            return nt1Var;
        }
        nt1 nt1Var2 = nt1Var;
        ArrayList arrayList = new ArrayList(zo0.V(nt1Var2, 10));
        Iterator<E> it = nt1Var2.iterator();
        while (it.hasNext()) {
            arrayList.add(((x73) it.next()).getDescriptor());
        }
        return arrayList;
    }

    public static /* synthetic */ void getCapturedKClass$annotations(aj5 aj5Var) {
    }
}

package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class du4 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(cu4.x, 0);
        hashMap.put(cu4.y, 1);
        hashMap.put(cu4.z, 2);
        for (cu4 cu4Var : hashMap.keySet()) {
            a.append(((Integer) b.get(cu4Var)).intValue(), cu4Var);
        }
    }

    public static int a(cu4 cu4Var) {
        Integer num = (Integer) b.get(cu4Var);
        if (num != null) {
            return num.intValue();
        }
        ov3.p(cu4Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static cu4 b(int i) {
        cu4 cu4Var = (cu4) a.get(i);
        if (cu4Var != null) {
            return cu4Var;
        }
        ze0.k(qx1.h(i, "Unknown Priority for value "));
        return null;
    }
}

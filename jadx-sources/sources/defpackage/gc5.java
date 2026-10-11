package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gc5 extends qt0 {
    public long[] A;
    public long y;
    public long[] z;

    public static Serializable M(int i, zi4 zi4Var) {
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(zi4Var.u()));
                                zi4Var.O(2);
                                return date;
                            }
                            int E = zi4Var.E();
                            ArrayList arrayList = new ArrayList(E);
                            for (int i2 = 0; i2 < E; i2++) {
                                Serializable M = M(zi4Var.A(), zi4Var);
                                if (M != null) {
                                    arrayList.add(M);
                                }
                            }
                            return arrayList;
                        }
                        return N(zi4Var);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String O = O(zi4Var);
                        int A = zi4Var.A();
                        if (A == 9) {
                            return hashMap;
                        }
                        Serializable M2 = M(A, zi4Var);
                        if (M2 != null) {
                            hashMap.put(O, M2);
                        }
                    }
                } else {
                    return O(zi4Var);
                }
            } else {
                if (zi4Var.A() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(zi4Var.u()));
        }
    }

    public static HashMap N(zi4 zi4Var) {
        int E = zi4Var.E();
        HashMap hashMap = new HashMap(E);
        for (int i = 0; i < E; i++) {
            String O = O(zi4Var);
            Serializable M = M(zi4Var.A(), zi4Var);
            if (M != null) {
                hashMap.put(O, M);
            }
        }
        return hashMap;
    }

    public static String O(zi4 zi4Var) {
        int H = zi4Var.H();
        int i = zi4Var.b;
        zi4Var.O(H);
        return new String(zi4Var.a, i, H);
    }
}

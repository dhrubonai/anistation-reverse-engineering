package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class n78 {
    public static final WeakHashMap a = new WeakHashMap();
    public static final WeakHashMap b = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable th2;
        boolean z;
        pp7 pp7Var;
        h78 h78Var;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            th2 = th;
            while (th2 != null) {
                try {
                    if (weakHashMap.containsKey(th2)) {
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                } finally {
                }
            }
            if (th2 != null) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(th, Boolean.valueOf(z));
        }
        if (th2 == null) {
            WeakHashMap weakHashMap2 = a;
            synchronized (weakHashMap2) {
                Throwable th3 = th;
                while (th3 != null) {
                    try {
                        if (weakHashMap2.containsKey(th3)) {
                            break;
                        } else {
                            th3 = th3.getCause();
                        }
                    } finally {
                    }
                }
                if (th3 == null) {
                    pp7Var = null;
                } else {
                    weakHashMap2.put(th, (j78) weakHashMap2.get(th3));
                    pp7Var = new pp7((byte) 8);
                }
            }
            if (pp7Var == null && (h78Var = q78.c().b) != null) {
                ArrayList arrayList = new ArrayList();
                for (h78Var = q78.c().b; h78Var != null; h78Var = h78Var.x) {
                    arrayList.add(h78Var);
                }
                UUID uuid = ((h78) arrayList.get(0)).y;
                ((h78) arrayList.get(0)).getClass();
                jw2 m = nw2.m(arrayList.size());
                jw2 m2 = nw2.m(arrayList.size());
                for (h78 h78Var2 : tl7.N(arrayList)) {
                    m2.c(h78Var2.A);
                    m.c(h78Var2.l());
                }
                WeakHashMap weakHashMap3 = a;
                synchronized (weakHashMap3) {
                    try {
                        o15 g = m2.g();
                        if (g != null) {
                            o15 g2 = m.g();
                            if (g2 != null) {
                                weakHashMap3.put(th, new j78(g, g2, uuid));
                            } else {
                                throw new NullPointerException("Null extras");
                            }
                        } else {
                            throw new NullPointerException("Null spansNames");
                        }
                    } finally {
                    }
                }
            }
        }
    }
}

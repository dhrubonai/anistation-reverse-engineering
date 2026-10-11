package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class f73 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final String a(e73 e73Var) {
        e73Var.getClass();
        ConcurrentHashMap concurrentHashMap = a;
        String str = (String) concurrentHashMap.get(e73Var);
        if (str == null) {
            String name = t80.M(e73Var).getName();
            concurrentHashMap.put(e73Var, name);
            return name;
        }
        return str;
    }
}

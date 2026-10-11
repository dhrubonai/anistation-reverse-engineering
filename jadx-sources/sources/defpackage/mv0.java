package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mv0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final Object a(ou ouVar, sb2 sb2Var) {
        ouVar.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(ouVar);
        if (obj != null) {
            return obj;
        }
        Object invoke = sb2Var.invoke();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(ouVar, invoke);
        if (putIfAbsent != null) {
            invoke = putIfAbsent;
        }
        invoke.getClass();
        return invoke;
    }

    public final Object b(ou ouVar) {
        ouVar.getClass();
        Object obj = c().get(ouVar);
        if (obj != null) {
            return obj;
        }
        ov3.p(ouVar, "No instance for key ");
        return null;
    }

    public final Map c() {
        return this.a;
    }

    public final Object d(ou ouVar) {
        ouVar.getClass();
        return c().get(ouVar);
    }

    public final void e(ou ouVar, Object obj) {
        ouVar.getClass();
        obj.getClass();
        c().put(ouVar, obj);
    }
}

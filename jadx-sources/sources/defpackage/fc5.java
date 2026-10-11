package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fc5 extends k03 {
    public ConcurrentHashMap b;

    @Override // defpackage.k03
    public final Object b(tp tpVar) {
        Object obj;
        if (!a34.i(((dc5) tpVar.z).a, this.a.a) && !a34.i((zk6) tpVar.D, this.a.a)) {
            throw new IllegalStateException(("Wrong Scope qualifier: trying to open instance for " + ((dc5) tpVar.z).b + " in " + this.a).toString());
        }
        Object obj2 = this.b.get(((dc5) tpVar.z).b);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            ConcurrentHashMap concurrentHashMap = this.b;
            dc5 dc5Var = (dc5) tpVar.z;
            obj = concurrentHashMap.get(dc5Var.b);
            if (obj == null) {
                obj = a(tpVar);
                this.b.put(dc5Var.b, obj);
            }
        }
        return obj;
    }
}

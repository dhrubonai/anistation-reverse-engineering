package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lw1 implements f16, vw4 {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();

    public final synchronized void a() {
        ol7 ol7Var = ol7.y;
        y95 y95Var = y95.y;
        synchronized (this) {
            try {
                if (!this.a.containsKey(h41.class)) {
                    this.a.put(h41.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(h41.class)).put(y95Var, ol7Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

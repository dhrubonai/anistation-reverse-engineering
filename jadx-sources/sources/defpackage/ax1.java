package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ax1 {
    public static final r18 c = new r18((byte) 17);
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final pz2 b;

    public ax1(String str, boolean z) {
        ReentrantLock reentrantLock;
        pz2 pz2Var;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        if (z) {
            pz2Var = new pz2(str);
        } else {
            pz2Var = null;
        }
        this.b = pz2Var;
    }
}

package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class i16 implements bt2 {
    public volatile boolean x = false;
    public final ConcurrentHashMap y = new ConcurrentHashMap();
    public final LinkedBlockingQueue z = new LinkedBlockingQueue();

    @Override // defpackage.bt2
    public final synchronized yk3 x(String str) {
        h16 h16Var;
        h16Var = (h16) this.y.get(str);
        if (h16Var == null) {
            h16Var = new h16(str, this.z, this.x);
            this.y.put(str, h16Var);
        }
        return h16Var;
    }
}

package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class px implements ac4 {
    public static final px a = new Object();
    public static final u12 b;
    public static final u12 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [px, java.lang.Object] */
    static {
        ku kuVar = new ku(1);
        HashMap hashMap = new HashMap();
        hashMap.put(cw4.class, kuVar);
        b = new u12("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap)));
        ku kuVar2 = new ku(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cw4.class, kuVar2);
        c = new u12("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // defpackage.xt1
    public final void a(Object obj, Object obj2) {
        sy5 sy5Var = (sy5) obj;
        bc4 bc4Var = (bc4) obj2;
        bc4Var.d(b, sy5Var.a);
        bc4Var.d(c, sy5Var.b);
    }
}

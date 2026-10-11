package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lx implements ac4 {
    public static final lx a = new Object();
    public static final u12 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lx] */
    static {
        ku kuVar = new ku(1);
        HashMap hashMap = new HashMap();
        hashMap.put(cw4.class, kuVar);
        b = new u12("storageMetrics", Collections.unmodifiableMap(new HashMap(hashMap)));
    }

    @Override // defpackage.xt1
    public final void a(Object obj, Object obj2) {
        ((bc4) obj2).a(b, ((gf2) obj).a);
    }
}

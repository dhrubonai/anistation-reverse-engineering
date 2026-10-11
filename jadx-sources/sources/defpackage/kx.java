package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kx implements ac4 {
    public static final kx a = new Object();
    public static final u12 b;
    public static final u12 c;
    public static final u12 d;
    public static final u12 e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kx] */
    static {
        ku kuVar = new ku(1);
        HashMap hashMap = new HashMap();
        hashMap.put(cw4.class, kuVar);
        b = new u12("window", Collections.unmodifiableMap(new HashMap(hashMap)));
        ku kuVar2 = new ku(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cw4.class, kuVar2);
        c = new u12("logSourceMetrics", Collections.unmodifiableMap(new HashMap(hashMap2)));
        ku kuVar3 = new ku(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(cw4.class, kuVar3);
        d = new u12("globalMetrics", Collections.unmodifiableMap(new HashMap(hashMap3)));
        ku kuVar4 = new ku(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(cw4.class, kuVar4);
        e = new u12("appNamespace", Collections.unmodifiableMap(new HashMap(hashMap4)));
    }

    @Override // defpackage.xt1
    public final void a(Object obj, Object obj2) {
        bn0 bn0Var = (bn0) obj;
        bc4 bc4Var = (bc4) obj2;
        bc4Var.a(b, bn0Var.a);
        bc4Var.a(c, bn0Var.b);
        bc4Var.a(d, bn0Var.c);
        bc4Var.a(e, bn0Var.d);
    }
}

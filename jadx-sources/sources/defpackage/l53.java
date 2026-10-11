package defpackage;

import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l53 implements yt1 {
    public static final j53 f;
    public static final j53 g;
    public final HashMap a;
    public final HashMap b;
    public final i53 c;
    public boolean d;
    public static final i53 e = new i53((byte) 0);
    public static final k53 h = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [j53] */
    /* JADX WARN: Type inference failed for: r0v2, types: [j53] */
    /* JADX WARN: Type inference failed for: r0v3, types: [k53, java.lang.Object] */
    static {
        final byte b = 0;
        f = new uq6() { // from class: j53
            @Override // defpackage.xt1
            public final void a(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        ((vq6) obj2).b((String) obj);
                        return;
                    default:
                        ((vq6) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final byte b2 = 1;
        g = new uq6() { // from class: j53
            @Override // defpackage.xt1
            public final void a(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        ((vq6) obj2).b((String) obj);
                        return;
                    default:
                        ((vq6) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public l53() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    public final yt1 a(Class cls, ac4 ac4Var) {
        this.a.put(cls, ac4Var);
        this.b.remove(cls);
        return this;
    }
}

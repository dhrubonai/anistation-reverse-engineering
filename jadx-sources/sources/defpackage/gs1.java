package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gs1 {
    public final Object a;
    public volatile Object b;
    public volatile Object c;

    public gs1(Looper looper, Object obj, String str) {
        this.a = new lj2(looper);
        a34.y(obj, "Listener must not be null");
        this.b = obj;
        a34.u(str);
        this.c = new qi3(obj, str);
    }

    public gs1(ks1 ks1Var) {
        this.a = ks1Var;
    }
}

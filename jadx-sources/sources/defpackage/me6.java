package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class me6 {
    public static final ThreadLocal a = new ThreadLocal();

    public static mw1 a() {
        ThreadLocal threadLocal = a;
        mw1 mw1Var = (mw1) threadLocal.get();
        if (mw1Var == null) {
            b70 b70Var = new b70(Thread.currentThread());
            threadLocal.set(b70Var);
            return b70Var;
        }
        return mw1Var;
    }
}

package p7;

/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8748a = new ThreadLocal();

    public static s0 a() {
        ThreadLocal threadLocal = f8748a;
        s0 s0Var = (s0) threadLocal.get();
        if (s0Var == null) {
            g gVar = new g(Thread.currentThread());
            threadLocal.set(gVar);
            return gVar;
        }
        return s0Var;
    }
}

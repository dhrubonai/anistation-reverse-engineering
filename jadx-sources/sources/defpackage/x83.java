package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class x83 {
    public static final tq1 a;

    static {
        new kf3(new t53((byte) 3));
        new kf3(new t53((byte) 4));
        a = new tq1(new t53((byte) 5), (byte) 0);
        new kf3(new t53((byte) 6));
    }

    public static final dc5 a(kd2 kd2Var) {
        tq1 tq1Var = a;
        try {
            dt0 dt0Var = (dt0) kd2Var.j(tq1Var);
            Object obj = dt0Var.b;
            if (obj == null) {
                obj = dt0Var.a.invoke();
                dt0Var.b = obj;
            }
            if (obj != null) {
                return (dc5) obj;
            }
            throw new IllegalStateException("Can't retrieve Koin context value. Ensure Koin is properly initialized with startKoin() or KoinApplication.");
        } catch (Exception e) {
            dt0 dt0Var2 = (dt0) kd2Var.j(tq1Var);
            Object invoke = dt0Var2.a.invoke();
            dt0Var2.b = invoke;
            dc5 dc5Var = (dc5) invoke;
            if (dc5Var != null) {
                return dc5Var;
            }
            v71.g(e, "Can't get Koin scope due to error: ");
            return null;
        }
    }
}

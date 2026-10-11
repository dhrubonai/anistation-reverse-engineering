package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ee7 {
    public static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final ge7 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ge7] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    static {
        ?? obj;
        int i = 0;
        while (true) {
            if (i < 2) {
                obj = 0;
                try {
                    obj = (ge7) Class.forName(a[i]).asSubclass(ge7.class).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                }
                if (obj != 0) {
                    break;
                } else {
                    i++;
                }
            } else {
                obj = new Object();
                break;
            }
        }
        b = obj;
    }
}

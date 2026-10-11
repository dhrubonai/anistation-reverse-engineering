package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ks {
    public static final int a;

    static {
        Object y45Var;
        int i;
        Object obj = null;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null) {
                y45Var = b06.J(10, property);
            } else {
                y45Var = null;
            }
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (!(y45Var instanceof y45)) {
            obj = y45Var;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        a = i;
    }
}

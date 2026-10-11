package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ln3 {
    public static final jn3 a;
    public static final jn3 b;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jn3] */
    static {
        ew4 ew4Var = ew4.c;
        jn3 jn3Var = null;
        try {
            jn3Var = (jn3) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = jn3Var;
        b = new Object();
    }
}

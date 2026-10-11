package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class n81 {
    public static final vc1 a;

    static {
        String str;
        boolean z;
        vc1 vc1Var;
        int i = r46.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z = Boolean.parseBoolean(str);
        } else {
            z = false;
        }
        if (!z) {
            vc1Var = m81.G;
        } else {
            ja1 ja1Var = rh1.a;
            jj2 jj2Var = qm3.a;
            jj2 jj2Var2 = jj2Var.B;
            vc1Var = jj2Var;
            if (jj2Var == null) {
                vc1Var = m81.G;
            }
        }
        a = vc1Var;
    }
}

package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class yx4 {
    public static final String a;

    static {
        String str = eq6.a;
        a = Integer.toString(0, 36);
    }

    public static yx4 a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        boolean z = false;
        boolean z2 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String str2 = we6.d;
                        if (bundle.getInt(str, -1) != 3) {
                            z2 = false;
                        }
                        io3.n(z2);
                        if (bundle.getBoolean(we6.d, false)) {
                            return new we6(bundle.getBoolean(we6.e, false));
                        }
                        return new we6();
                    }
                    ze0.k(qx1.h(i, "Unknown RatingType: "));
                    return null;
                }
                String str3 = ex5.d;
                if (bundle.getInt(str, -1) == 2) {
                    z = true;
                }
                io3.n(z);
                int i2 = bundle.getInt(ex5.d, 5);
                float f = bundle.getFloat(ex5.e, -1.0f);
                if (f == -1.0f) {
                    return new ex5(i2);
                }
                return new ex5(i2, f);
            }
            String str4 = xk4.c;
            if (bundle.getInt(str, -1) == 1) {
                z = true;
            }
            io3.n(z);
            float f2 = bundle.getFloat(xk4.c, -1.0f);
            if (f2 == -1.0f) {
                return new xk4();
            }
            return new xk4(f2);
        }
        String str5 = tk2.d;
        if (bundle.getInt(str, -1) != 0) {
            z2 = false;
        }
        io3.n(z2);
        if (bundle.getBoolean(tk2.d, false)) {
            return new tk2(bundle.getBoolean(tk2.e, false));
        }
        return new tk2();
    }

    public abstract boolean b();

    public abstract Bundle c();
}

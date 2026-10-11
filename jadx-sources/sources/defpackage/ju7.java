package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ju7 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ju7(z18 z18Var, b48 b48Var) {
        this.a = (byte) 2;
        this.c = b48Var;
        Objects.requireNonNull(z18Var);
        this.b = z18Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ht7] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                z18 z18Var = ((nv7) obj).e;
                z18Var.V();
                fl7 fl7Var = z18Var.z;
                z18.T(fl7Var);
                return fl7Var.I0((String) obj2);
            case 1:
                z18 z18Var2 = ((nv7) obj).e;
                z18Var2.V();
                return new jk7(z18Var2.p0(((b48) obj2).x));
            case 2:
                b48 b48Var = (b48) obj2;
                String str = b48Var.x;
                a34.x(str);
                z18 z18Var3 = (z18) obj;
                xv7 a = z18Var3.a(str);
                wv7 wv7Var = wv7.ANALYTICS_STORAGE;
                if (a.i(wv7Var) && xv7.c(100, b48Var.P).i(wv7Var)) {
                    return z18Var3.c0(b48Var).F();
                }
                z18Var3.c().K.a("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                xf6 xf6Var = (xf6) obj2;
                q38 q38Var = (q38) obj;
                sx7 sx7Var = (sx7) xf6Var.y;
                ?? obj3 = new Object();
                try {
                    u48 u48Var = (u48) sx7Var.f.get();
                    Uri uri = (Uri) xf6Var.z;
                    fk7 fk7Var = new fk7(q38Var);
                    fk7Var.y = new ht7[]{obj3};
                } catch (IOException | RuntimeException e) {
                    et5.p(Level.WARNING, sx7Var.a(), e, "Failed to update snapshot for %s flags may be stale.", (String) xf6Var.A);
                }
                return null;
        }
    }

    public /* synthetic */ ju7(nv7 nv7Var, Object obj, byte b) {
        this.a = b;
        this.c = obj;
        this.b = nv7Var;
    }

    public /* synthetic */ ju7(xf6 xf6Var, q38 q38Var) {
        this.a = (byte) 3;
        this.c = xf6Var;
        this.b = q38Var;
    }
}

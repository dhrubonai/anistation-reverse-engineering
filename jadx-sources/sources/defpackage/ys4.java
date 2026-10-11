package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ys4 extends vd2 {
    private static final ys4 DEFAULT_INSTANCE;
    private static volatile aj4 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private hn3 preferences_ = hn3.y;

    static {
        ys4 ys4Var = new ys4();
        DEFAULT_INSTANCE = ys4Var;
        vd2.j(ys4.class, ys4Var);
    }

    public static ws4 n() {
        return (ws4) ((td2) DEFAULT_INSTANCE.c(5));
    }

    public static ys4 o(FileInputStream fileInputStream) {
        ys4 ys4Var = DEFAULT_INSTANCE;
        oo0 oo0Var = new oo0(fileInputStream);
        xz1 a = xz1.a();
        vd2 i = ys4Var.i();
        try {
            ew4 ew4Var = ew4.c;
            ew4Var.getClass();
            zb5 a2 = ew4Var.a(i.getClass());
            fm0 fm0Var = (fm0) oo0Var.y;
            if (fm0Var == null) {
                fm0Var = new fm0(oo0Var);
            }
            a2.i(i, fm0Var, a);
            a2.b(i);
            if (vd2.f(i, true)) {
                return (ys4) i;
            }
            throw new IOException(new ln6().getMessage());
        } catch (b33 e) {
            if (e.x) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof b33) {
                throw ((b33) e2.getCause());
            }
            throw new IOException(e2.getMessage(), e2);
        } catch (ln6 e3) {
            throw new IOException(e3.getMessage());
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof b33) {
                throw ((b33) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, aj4] */
    @Override // defpackage.vd2
    public final Object c(int i) {
        aj4 aj4Var;
        switch (h11.B(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ey4(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", xs4.a});
            case 3:
                return new ys4();
            case 4:
                return new td2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aj4 aj4Var2 = PARSER;
                if (aj4Var2 == null) {
                    synchronized (ys4.class) {
                        try {
                            aj4 aj4Var3 = PARSER;
                            aj4Var = aj4Var3;
                            if (aj4Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                aj4Var = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return aj4Var;
                }
                return aj4Var2;
            default:
                ze0.d();
                return null;
        }
    }

    public final Map l() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public final hn3 m() {
        hn3 hn3Var = this.preferences_;
        if (!hn3Var.x) {
            hn3 b = hn3Var.b();
            this.preferences_ = b;
            return b;
        }
        return hn3Var;
    }
}

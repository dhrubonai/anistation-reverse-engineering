package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class at4 extends vd2 {
    private static final at4 DEFAULT_INSTANCE;
    private static volatile aj4 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private x13 strings_ = fw4.A;

    static {
        at4 at4Var = new at4();
        DEFAULT_INSTANCE = at4Var;
        vd2.j(at4.class, at4Var);
    }

    public static at4 m() {
        return DEFAULT_INSTANCE;
    }

    public static zs4 o() {
        return (zs4) ((td2) DEFAULT_INSTANCE.c(5));
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
                return new ey4(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new at4();
            case 4:
                return new td2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aj4 aj4Var2 = PARSER;
                if (aj4Var2 == null) {
                    synchronized (at4.class) {
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

    public final void l(Iterable iterable) {
        int i;
        x13 x13Var = this.strings_;
        boolean z = ((fw4) x13Var).x;
        x13 x13Var2 = x13Var;
        if (!z) {
            fw4 fw4Var = (fw4) x13Var;
            int i2 = fw4Var.z;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 * 2;
            }
            fw4 d = fw4Var.d(i);
            this.strings_ = d;
            x13Var2 = d;
        }
        Charset charset = y13.a;
        if (!(iterable instanceof if3)) {
            if (iterable instanceof zt4) {
                ((fw4) x13Var2).addAll((Collection) iterable);
                return;
            }
            if ((x13Var2 instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) x13Var2).ensureCapacity(((Collection) iterable).size() + ((fw4) x13Var2).z);
            }
            fw4 fw4Var2 = (fw4) x13Var2;
            int i3 = fw4Var2.z;
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (fw4Var2.z - i3) + " is null.";
                    for (int i4 = fw4Var2.z - 1; i4 >= i3; i4--) {
                        fw4Var2.remove(i4);
                    }
                    qi2.m(str);
                    return;
                }
                fw4Var2.add(obj);
            }
            return;
        }
        ((if3) iterable).getUnderlyingElements();
        ov3.d();
    }

    public final x13 n() {
        return this.strings_;
    }
}

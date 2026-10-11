package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ct4 extends vd2 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final ct4 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile aj4 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ct4 ct4Var = new ct4();
        DEFAULT_INSTANCE = ct4Var;
        vd2.j(ct4.class, ct4Var);
    }

    public static ct4 n() {
        return DEFAULT_INSTANCE;
    }

    public static bt4 v() {
        return (bt4) ((td2) DEFAULT_INSTANCE.c(5));
    }

    public final void A(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void B(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void C(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void D(at4 at4Var) {
        this.value_ = at4Var;
        this.valueCase_ = 6;
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
                return new ey4(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", at4.class});
            case 3:
                return new ct4();
            case 4:
                return new td2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aj4 aj4Var2 = PARSER;
                if (aj4Var2 == null) {
                    synchronized (ct4.class) {
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

    public final boolean l() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final xd0 m() {
        if (this.valueCase_ == 8) {
            return (xd0) this.value_;
        }
        return xd0.z;
    }

    public final double o() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float p() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int q() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long r() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String s() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final at4 t() {
        if (this.valueCase_ == 6) {
            return (at4) this.value_;
        }
        return at4.m();
    }

    public final int u() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public final void w(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final void x(xd0 xd0Var) {
        this.valueCase_ = 8;
        this.value_ = xd0Var;
    }

    public final void y(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void z(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }
}

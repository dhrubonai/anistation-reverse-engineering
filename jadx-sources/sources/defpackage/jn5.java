package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class jn5 {
    public static final ni1 a = new ni1("NO_VALUE", (byte) 2);

    public static final in5 a(int i, int i2, ta0 ta0Var) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && ta0Var != ta0.x) {
                    p65.g(ta0Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
                    return null;
                }
                int i3 = i2 + i;
                if (i3 < 0) {
                    i3 = Integer.MAX_VALUE;
                }
                return new in5(i, i3, ta0Var);
            }
            ze0.e(qx1.h(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        ze0.e(qx1.h(i, "replay cannot be negative, but was "));
        return null;
    }

    public static /* synthetic */ in5 b(int i, int i2, ta0 ta0Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            ta0Var = ta0.x;
        }
        return a(i, i2, ta0Var);
    }

    public static final w42 c(fn5 fn5Var, l11 l11Var, int i, ta0 ta0Var) {
        if ((i == 0 || i == -3) && ta0Var == ta0.x) {
            return fn5Var;
        }
        return new rj0(i, ta0Var, l11Var, fn5Var);
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}

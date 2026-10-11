package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class m92 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile zv5 b = new zv5(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.b(115, new n92(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.b(130, new n92(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.b(150, new n92(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.b(180, new n92(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.b(200, new n92(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.x[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        gz2.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static l92 a(float f) {
        float f2;
        l92 l92Var;
        float f3;
        float[] fArr = a;
        if (f >= 1.03f) {
            zv5 zv5Var = b;
            int i = (int) (f * 100.0f);
            zv5Var.getClass();
            l92 l92Var2 = (l92) v94.m(zv5Var, i);
            if (l92Var2 != null) {
                return l92Var2;
            }
            zv5 zv5Var2 = b;
            int p = w65.p(zv5Var2.z, i, zv5Var2.x);
            if (p >= 0) {
                return (l92) b.c(p);
            }
            int i2 = -(p + 1);
            int i3 = i2 - 1;
            if (i2 >= b.z) {
                n92 n92Var = new n92(new float[]{1.0f}, new float[]{f});
                b(f, n92Var);
                return n92Var;
            }
            if (i3 < 0) {
                l92Var = new n92(fArr, fArr);
                f2 = 1.0f;
            } else {
                f2 = b.x[i3] / 100.0f;
                l92Var = (l92) b.c(i3);
            }
            float f4 = b.x[i2] / 100.0f;
            if (f2 == f4) {
                f3 = 0.0f;
            } else {
                f3 = (f - f2) / (f4 - f2);
            }
            float max = (Math.max(0.0f, Math.min(1.0f, f3)) * 1.0f) + 0.0f;
            l92 l92Var3 = (l92) b.c(i2);
            float[] fArr2 = new float[9];
            for (int i4 = 0; i4 < 9; i4++) {
                float f5 = fArr[i4];
                float b2 = l92Var.b(f5);
                fArr2[i4] = ((l92Var3.b(f5) - b2) * max) + b2;
            }
            n92 n92Var2 = new n92(fArr, fArr2);
            b(f, n92Var2);
            return n92Var2;
        }
        return null;
    }

    public static void b(float f, n92 n92Var) {
        synchronized (c) {
            zv5 clone = b.clone();
            clone.b((int) (f * 100.0f), n92Var);
            b = clone;
        }
    }
}

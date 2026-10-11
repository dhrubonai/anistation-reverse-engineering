package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class t10 implements wd2 {
    public static final t10 a;
    private static final aj5 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [t10, wd2, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        kq4 kq4Var = new kq4("com.anistation.repository.backup.BackupSettings", obj, 6);
        kq4Var.j("global", false);
        kq4Var.j("video", false);
        kq4Var.j("download", false);
        kq4Var.j("skippedUpdateVersionCode", false);
        kq4Var.j("backupFrequency", false);
        kq4Var.j("includeAnimeList", true);
        descriptor = kq4Var;
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        return new x73[]{q00.a, k20.a, k00.a, i13.a, mz5.a, l70.a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x005a. Please report as an issue. */
    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        s00 s00Var;
        boolean z;
        int i;
        String str;
        m00 m00Var;
        m20 m20Var;
        int i2;
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        int i3 = 5;
        if (c.decodeSequentially()) {
            s00Var = (s00) c.p(aj5Var, 0, q00.a, null);
            m20 m20Var2 = (m20) c.p(aj5Var, 1, k20.a, null);
            m00 m00Var2 = (m00) c.p(aj5Var, 2, k00.a, null);
            int r = c.r(aj5Var, 3);
            String m = c.m(aj5Var, 4);
            z = c.w(aj5Var, 5);
            i = r;
            str = m;
            m00Var = m00Var2;
            m20Var = m20Var2;
            i2 = 63;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            int i4 = 0;
            int i5 = 0;
            s00Var = null;
            String str2 = null;
            m00 m00Var3 = null;
            m20 m20Var3 = null;
            while (z2) {
                int i6 = c.i(aj5Var);
                switch (i6) {
                    case -1:
                        z2 = false;
                    case 0:
                        s00Var = (s00) c.p(aj5Var, 0, q00.a, s00Var);
                        i5 |= 1;
                        i3 = 5;
                    case 1:
                        m20Var3 = (m20) c.p(aj5Var, 1, k20.a, m20Var3);
                        i5 |= 2;
                        i3 = 5;
                    case 2:
                        m00Var3 = (m00) c.p(aj5Var, 2, k00.a, m00Var3);
                        i5 |= 4;
                        i3 = 5;
                    case 3:
                        i4 = c.r(aj5Var, 3);
                        i5 |= 8;
                    case 4:
                        str2 = c.m(aj5Var, 4);
                        i5 |= 16;
                    case 5:
                        z3 = c.w(aj5Var, i3);
                        i5 |= 32;
                    default:
                        qi2.f(i6);
                        return null;
                }
            }
            z = z3;
            i = i4;
            str = str2;
            m00Var = m00Var3;
            m20Var = m20Var3;
            i2 = i5;
        }
        s00 s00Var2 = s00Var;
        c.a(aj5Var);
        return new v10(i2, s00Var2, m20Var, m00Var, i, str, z);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        v10 v10Var = (v10) obj;
        v10Var.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        q00 q00Var = q00.a;
        s00 s00Var = v10Var.a;
        boolean z = v10Var.f;
        v0 v0Var = (v0) c;
        v0Var.v(aj5Var, 0, q00Var, s00Var);
        v0Var.v(aj5Var, 1, k20.a, v10Var.b);
        v0Var.v(aj5Var, 2, k00.a, v10Var.c);
        v0Var.t(3, v10Var.d, aj5Var);
        v0Var.w(aj5Var, 4, v10Var.e);
        if (v0Var.shouldEncodeElementDefault(aj5Var, 5) || !z) {
            v0Var.p(aj5Var, 5, z);
        }
        c.a(aj5Var);
    }
}

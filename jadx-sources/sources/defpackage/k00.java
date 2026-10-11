package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class k00 implements wd2 {
    public static final k00 a;
    private static final aj5 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wd2, java.lang.Object, k00] */
    static {
        ?? obj = new Object();
        a = obj;
        kq4 kq4Var = new kq4("com.anistation.repository.backup.BackupDownloadSettings", obj, 3);
        kq4Var.j("downloadOverWifiOnly", false);
        kq4Var.j("externalLocationUri", false);
        kq4Var.j("externalLocationName", false);
        descriptor = kq4Var;
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        return new x73[]{l70.a, jb0.a(mz5Var), mz5Var};
    }

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        boolean z;
        String str;
        String str2;
        int i;
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            z = c.w(aj5Var, 0);
            str2 = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5.a, null);
            str = c.m(aj5Var, 2);
            i = 7;
        } else {
            boolean z2 = true;
            z = false;
            int i2 = 0;
            String str3 = null;
            String str4 = null;
            while (z2) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                str3 = c.m(aj5Var, 2);
                                i2 |= 4;
                            } else {
                                qi2.f(i3);
                                return null;
                            }
                        } else {
                            str4 = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5.a, str4);
                            i2 |= 2;
                        }
                    } else {
                        z = c.w(aj5Var, 0);
                        i2 |= 1;
                    }
                } else {
                    z2 = false;
                }
            }
            str = str3;
            str2 = str4;
            i = i2;
        }
        c.a(aj5Var);
        return new m00(i, str2, str, z);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        m00 m00Var = (m00) obj;
        m00Var.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        v0 v0Var = (v0) c;
        v0Var.p(aj5Var, 0, m00Var.a);
        v0Var.encodeNullableSerializableElement(aj5Var, 1, mz5.a, m00Var.b);
        v0Var.w(aj5Var, 2, m00Var.c);
        c.a(aj5Var);
    }
}

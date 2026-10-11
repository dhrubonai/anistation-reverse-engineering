package defpackage;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class g00 implements wd2 {
    public static final g00 a;
    private static final aj5 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wd2, g00, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        kq4 kq4Var = new kq4("com.anistation.repository.backup.BackupArchive", obj, 4);
        kq4Var.j("format", true);
        kq4Var.j("version", true);
        kq4Var.j("checksumSha256", false);
        kq4Var.j(HandleInvocationsFromAdViewer.KEY_PAYLOAD, false);
        descriptor = kq4Var;
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        return new x73[]{mz5Var, i13.a, mz5Var, t00.a};
    }

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        String str;
        v00 v00Var;
        String str2;
        int i;
        int i2;
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            str = c.m(aj5Var, 0);
            int r = c.r(aj5Var, 1);
            String m = c.m(aj5Var, 2);
            v00Var = (v00) c.p(aj5Var, 3, t00.a, null);
            str2 = m;
            i = r;
            i2 = 15;
        } else {
            boolean z = true;
            int i3 = 0;
            int i4 = 0;
            str = null;
            v00 v00Var2 = null;
            String str3 = null;
            while (z) {
                int i5 = c.i(aj5Var);
                if (i5 != -1) {
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 == 3) {
                                    v00Var2 = (v00) c.p(aj5Var, 3, t00.a, v00Var2);
                                    i4 |= 8;
                                } else {
                                    qi2.f(i5);
                                    return null;
                                }
                            } else {
                                str3 = c.m(aj5Var, 2);
                                i4 |= 4;
                            }
                        } else {
                            i3 = c.r(aj5Var, 1);
                            i4 |= 2;
                        }
                    } else {
                        str = c.m(aj5Var, 0);
                        i4 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            v00Var = v00Var2;
            str2 = str3;
            i = i3;
            i2 = i4;
        }
        String str4 = str;
        c.a(aj5Var);
        return new i00(i2, str4, i, str2, v00Var);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        i00 i00Var = (i00) obj;
        i00Var.getClass();
        int i = i00Var.b;
        String str = i00Var.a;
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        if (c.shouldEncodeElementDefault(aj5Var, 0) || !a34.i(str, "AniStationBackup")) {
            ((v0) c).w(aj5Var, 0, str);
        }
        if (c.shouldEncodeElementDefault(aj5Var, 1) || i != 2) {
            ((v0) c).t(1, i, aj5Var);
        }
        v0 v0Var = (v0) c;
        v0Var.w(aj5Var, 2, i00Var.c);
        v0Var.v(aj5Var, 3, t00.a, i00Var.d);
        c.a(aj5Var);
    }
}

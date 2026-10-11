package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d28 extends mf7 {
    private static final d28 zze;
    private static volatile sg7 zzf;
    private yf7 zzb = vg7.B;

    static {
        d28 d28Var = new d28();
        zze = d28Var;
        mf7.m(d28.class, d28Var);
    }

    public static d28 s(byte[] bArr, ff7 ff7Var) {
        return (d28) mf7.c(zze, bArr, ff7Var);
    }

    @Override // defpackage.mf7
    public final Object q(int i) {
        sg7 sg7Var;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 == 6) {
                                sg7 sg7Var2 = zzf;
                                if (sg7Var2 == null) {
                                    synchronized (d28.class) {
                                        try {
                                            sg7Var = zzf;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zze);
                                                zzf = sg7Var;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return sg7Var;
                                }
                                return sg7Var2;
                            }
                            throw null;
                        }
                        return zze;
                    }
                    return new kf7(zze);
                }
                return new d28();
            }
            return new wg7(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        return (byte) 1;
    }

    public final List r() {
        return this.zzb;
    }
}

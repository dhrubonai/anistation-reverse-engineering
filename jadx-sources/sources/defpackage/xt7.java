package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xt7 extends mf7 {
    private static final xt7 zzh;
    private static volatile sg7 zzi;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private ts7 zzg;

    static {
        xt7 xt7Var = new xt7();
        zzh = xt7Var;
        mf7.m(xt7.class, xt7Var);
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
                                sg7 sg7Var2 = zzi;
                                if (sg7Var2 == null) {
                                    synchronized (xt7.class) {
                                        try {
                                            sg7Var = zzi;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzh);
                                                zzi = sg7Var;
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
                        return zzh;
                    }
                    return new kf7(zzh);
                }
                return new xt7();
            }
            return new wg7(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}

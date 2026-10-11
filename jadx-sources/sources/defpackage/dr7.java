package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dr7 extends mf7 {
    private static final dr7 zzg;
    private static volatile sg7 zzh;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        dr7 dr7Var = new dr7();
        zzg = dr7Var;
        mf7.m(dr7.class, dr7Var);
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
                                sg7 sg7Var2 = zzh;
                                if (sg7Var2 == null) {
                                    synchronized (dr7.class) {
                                        try {
                                            sg7Var = zzh;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzg);
                                                zzh = sg7Var;
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
                        return zzg;
                    }
                    return new kf7(zzg);
                }
                return new dr7();
            }
            return new wg7(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String r() {
        return this.zze;
    }
}

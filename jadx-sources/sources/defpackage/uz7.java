package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uz7 extends mf7 {
    private static final uz7 zzf;
    private static volatile sg7 zzg;
    private int zzb;
    private boolean zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [uz7, mf7] */
    static {
        ?? mf7Var = new mf7();
        zzf = mf7Var;
        mf7.m(uz7.class, mf7Var);
    }

    public static uz7 s() {
        return zzf;
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
                                sg7 sg7Var2 = zzg;
                                if (sg7Var2 == null) {
                                    synchronized (uz7.class) {
                                        try {
                                            sg7Var = zzg;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzf);
                                                zzg = sg7Var;
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
                        return zzf;
                    }
                    return new kf7(zzf);
                }
                return new mf7();
            }
            return new wg7(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final boolean r() {
        return this.zze;
    }
}

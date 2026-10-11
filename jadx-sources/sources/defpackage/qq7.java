package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qq7 extends mf7 {
    private static final qq7 zzg;
    private static volatile sg7 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [qq7, mf7] */
    static {
        ?? mf7Var = new mf7();
        zzg = mf7Var;
        mf7.m(qq7.class, mf7Var);
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
                                    synchronized (qq7.class) {
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
                return new mf7();
            }
            je7 je7Var = je7.f;
            return new wg7(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", je7Var, "zzf", je7Var});
        }
        return (byte) 1;
    }

    public final int r() {
        int q = vv5.q(this.zze);
        if (q == 0) {
            return 1;
        }
        return q;
    }

    public final int s() {
        int q = vv5.q(this.zzf);
        if (q == 0) {
            return 1;
        }
        return q;
    }
}

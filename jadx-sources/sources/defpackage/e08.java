package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e08 extends mf7 {
    private static final e08 zzg;
    private static volatile sg7 zzh;
    private int zzb;
    private xz7 zze;
    private yz7 zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [e08, mf7] */
    static {
        ?? mf7Var = new mf7();
        zzg = mf7Var;
        mf7.m(e08.class, mf7Var);
    }

    public static e08 t(byte[] bArr, ff7 ff7Var) {
        return (e08) mf7.c(zzg, bArr, ff7Var);
    }

    public static c08 u() {
        return (c08) zzg.h();
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
                                    synchronized (e08.class) {
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
            return new wg7(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final xz7 r() {
        xz7 xz7Var = this.zze;
        if (xz7Var == null) {
            return xz7.F();
        }
        return xz7Var;
    }

    public final yz7 s() {
        yz7 yz7Var = this.zzf;
        if (yz7Var == null) {
            return yz7.r();
        }
        return yz7Var;
    }

    public final /* synthetic */ void v(xz7 xz7Var) {
        this.zze = xz7Var;
        this.zzb |= 1;
    }
}

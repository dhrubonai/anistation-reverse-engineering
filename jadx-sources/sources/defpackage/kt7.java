package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kt7 extends mf7 {
    private static final kt7 zzg;
    private static volatile sg7 zzh;
    private int zzb;
    private int zze;
    private long zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [mf7, kt7] */
    static {
        ?? mf7Var = new mf7();
        zzg = mf7Var;
        mf7.m(kt7.class, mf7Var);
    }

    public static jt7 v() {
        return (jt7) zzg.h();
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
                                    synchronized (kt7.class) {
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
            return new wg7(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final boolean r() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int s() {
        return this.zze;
    }

    public final boolean t() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final long u() {
        return this.zzf;
    }

    public final /* synthetic */ void w(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void x(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }
}

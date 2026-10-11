package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ys7 extends mf7 {
    private static final ys7 zzi;
    private static volatile sg7 zzj;
    private int zzb;
    private int zze;
    private tu7 zzf;
    private tu7 zzg;
    private boolean zzh;

    /* JADX WARN: Type inference failed for: r0v0, types: [ys7, mf7] */
    static {
        ?? mf7Var = new mf7();
        zzi = mf7Var;
        mf7.m(ys7.class, mf7Var);
    }

    public static xs7 y() {
        return (xs7) zzi.h();
    }

    public final /* synthetic */ void A(tu7 tu7Var) {
        this.zzf = tu7Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void B(tu7 tu7Var) {
        this.zzg = tu7Var;
        this.zzb |= 4;
    }

    public final /* synthetic */ void C(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
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
                                sg7 sg7Var2 = zzj;
                                if (sg7Var2 == null) {
                                    synchronized (ys7.class) {
                                        try {
                                            sg7Var = zzj;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzi);
                                                zzj = sg7Var;
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
                        return zzi;
                    }
                    return new kf7(zzi);
                }
                return new mf7();
            }
            return new wg7(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
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

    public final tu7 t() {
        tu7 tu7Var = this.zzf;
        if (tu7Var == null) {
            return tu7.A();
        }
        return tu7Var;
    }

    public final boolean u() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final tu7 v() {
        tu7 tu7Var = this.zzg;
        if (tu7Var == null) {
            return tu7.A();
        }
        return tu7Var;
    }

    public final boolean w() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final /* synthetic */ void z(int i) {
        this.zzb |= 1;
        this.zze = i;
    }
}

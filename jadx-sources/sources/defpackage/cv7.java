package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cv7 extends mf7 {
    private static final cv7 zzk;
    private static volatile sg7 zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        cv7 cv7Var = new cv7();
        zzk = cv7Var;
        mf7.m(cv7.class, cv7Var);
    }

    public static bv7 C() {
        return (bv7) zzk.h();
    }

    public final boolean A() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final double B() {
        return this.zzj;
    }

    public final /* synthetic */ void D(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void F(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    public final /* synthetic */ void J(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -33;
        this.zzj = 0.0d;
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
                                sg7 sg7Var2 = zzl;
                                if (sg7Var2 == null) {
                                    synchronized (cv7.class) {
                                        try {
                                            sg7Var = zzl;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzk);
                                                zzl = sg7Var;
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
                        return zzk;
                    }
                    return new kf7(zzk);
                }
                return new cv7();
            }
            return new wg7(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final boolean r() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final long s() {
        return this.zze;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean w() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final long x() {
        return this.zzh;
    }

    public final boolean y() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final float z() {
        return this.zzi;
    }
}

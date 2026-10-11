package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eq7 extends mf7 {
    private static final eq7 zzi;
    private static volatile sg7 zzj;
    private int zzb;
    private mq7 zze;
    private gq7 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        eq7 eq7Var = new eq7();
        zzi = eq7Var;
        mf7.m(eq7.class, eq7Var);
    }

    public static eq7 z() {
        return zzi;
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 8;
        this.zzh = str;
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
                                    synchronized (eq7.class) {
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
                return new eq7();
            }
            return new wg7(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final boolean r() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final mq7 s() {
        mq7 mq7Var = this.zze;
        if (mq7Var == null) {
            return mq7.y();
        }
        return mq7Var;
    }

    public final boolean t() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final gq7 u() {
        gq7 gq7Var = this.zzf;
        if (gq7Var == null) {
            return gq7.A();
        }
        return gq7Var;
    }

    public final boolean v() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final String y() {
        return this.zzh;
    }
}

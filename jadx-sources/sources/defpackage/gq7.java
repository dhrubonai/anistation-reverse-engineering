package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gq7 extends mf7 {
    private static final gq7 zzj;
    private static volatile sg7 zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        gq7 gq7Var = new gq7();
        zzj = gq7Var;
        mf7.m(gq7.class, gq7Var);
    }

    public static gq7 A() {
        return zzj;
    }

    public final int B() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        if (i2 != 4) {
                            i = 0;
                        } else {
                            i = 5;
                        }
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
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
                                sg7 sg7Var2 = zzk;
                                if (sg7Var2 == null) {
                                    synchronized (gq7.class) {
                                        try {
                                            sg7Var = zzk;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzj);
                                                zzk = sg7Var;
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
                        return zzj;
                    }
                    return new kf7(zzj);
                }
                return new gq7();
            }
            return new wg7(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", je7.c, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final boolean r() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t() {
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

    public final String x() {
        return this.zzh;
    }

    public final boolean y() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final String z() {
        return this.zzi;
    }
}

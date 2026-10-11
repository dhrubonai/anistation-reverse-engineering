package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u38 extends mf7 {
    private static final u38 zzh;
    private static volatile sg7 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        u38 u38Var = new u38();
        zzh = u38Var;
        mf7.m(u38.class, u38Var);
    }

    public static s38 x() {
        return (s38) zzh.h();
    }

    public final /* synthetic */ void A(boolean z) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z);
    }

    public final /* synthetic */ void B(double d) {
        this.zze = 4;
        this.zzf = Double.valueOf(d);
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    public final /* synthetic */ void D(we7 we7Var) {
        we7Var.getClass();
        this.zze = 6;
        this.zzf = we7Var;
    }

    public final int E() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        if (i != 2) {
            if (i == 3) {
                return 2;
            }
            if (i == 4) {
                return 3;
            }
            if (i == 5) {
                return 4;
            }
            if (i == 6) {
                return 5;
            }
            return 0;
        }
        return 1;
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
                                    synchronized (u38.class) {
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
                return new u38();
            }
            return new wg7(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        return (byte) 1;
    }

    public final String r() {
        return this.zzg;
    }

    public final long s() {
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean t() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double u() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String v() {
        if (this.zze == 5) {
            return (String) this.zzf;
        }
        return "";
    }

    public final we7 w() {
        if (this.zze == 6) {
            return (we7) this.zzf;
        }
        return we7.y;
    }

    public final /* synthetic */ void y(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void z(long j) {
        this.zze = 2;
        this.zzf = Long.valueOf(j);
    }
}

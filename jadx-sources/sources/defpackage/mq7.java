package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mq7 extends mf7 {
    private static final mq7 zzi;
    private static volatile sg7 zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private yf7 zzh = vg7.B;

    static {
        mq7 mq7Var = new mq7();
        zzi = mq7Var;
        mf7.m(mq7.class, mq7Var);
    }

    public static mq7 y() {
        return zzi;
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
                                    synchronized (mq7.class) {
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
                return new mq7();
            }
            return new wg7(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", je7.d, "zzf", "zzg", "zzh"});
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

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final yf7 w() {
        return this.zzh;
    }

    public final int x() {
        return this.zzh.size();
    }

    public final int z() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}

package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ov7 extends mf7 {
    private static final ov7 zzk;
    private static volatile sg7 zzl;
    private int zzb;
    private int zze;
    private yf7 zzf = vg7.B;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        ov7 ov7Var = new ov7();
        zzk = ov7Var;
        mf7.m(ov7.class, ov7Var);
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
                                    synchronized (ov7.class) {
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
                return new ov7();
            }
            return new wg7(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", je7.p, "zzf", ov7.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final List r() {
        return this.zzf;
    }

    public final String s() {
        return this.zzg;
    }

    public final boolean t() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String u() {
        return this.zzh;
    }

    public final boolean v() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final double y() {
        return this.zzj;
    }

    public final int z() {
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
}

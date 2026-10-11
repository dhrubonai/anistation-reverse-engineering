package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tt7 extends mf7 {
    private static final tt7 zzk;
    private static volatile sg7 zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private yf7 zzj = vg7.B;

    static {
        tt7 tt7Var = new tt7();
        zzk = tt7Var;
        mf7.m(tt7.class, tt7Var);
    }

    public static rt7 D() {
        return (rt7) zzk.h();
    }

    public final double A() {
        return this.zzi;
    }

    public final yf7 B() {
        return this.zzj;
    }

    public final int C() {
        return this.zzj.size();
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void J(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void L(tt7 tt7Var) {
        yf7 yf7Var = this.zzj;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzj = yf7Var;
        }
        yf7Var.add(tt7Var);
    }

    public final void M(ArrayList arrayList) {
        yf7 yf7Var = this.zzj;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzj = yf7Var;
        }
        kf7.b(arrayList, yf7Var);
    }

    public final void N() {
        this.zzj = vg7.B;
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
                                    synchronized (tt7.class) {
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
                return new tt7();
            }
            return new wg7(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", tt7.class});
        }
        return (byte) 1;
    }

    public final boolean r() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String u() {
        return this.zzf;
    }

    public final boolean v() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final float y() {
        return this.zzh;
    }

    public final boolean z() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }
}

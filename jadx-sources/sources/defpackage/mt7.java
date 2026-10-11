package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mt7 extends mf7 {
    private static final mt7 zzm;
    private static volatile sg7 zzn;
    private int zzb;
    private yf7 zze = vg7.B;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        mt7 mt7Var = new mt7();
        zzm = mt7Var;
        mf7.m(mt7.class, mt7Var);
    }

    public static lt7 H() {
        return (lt7) zzm.h();
    }

    public final long A() {
        return this.zzh;
    }

    public final boolean B() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int C() {
        return this.zzi;
    }

    public final boolean D() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final long E() {
        return this.zzk;
    }

    public final boolean F() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final long G() {
        return this.zzl;
    }

    public final /* synthetic */ void I(int i, tt7 tt7Var) {
        s();
        this.zze.set(i, tt7Var);
    }

    public final /* synthetic */ void J(tt7 tt7Var) {
        tt7Var.getClass();
        s();
        this.zze.add(tt7Var);
    }

    public final void K(Iterable iterable) {
        s();
        kf7.b(iterable, this.zze);
    }

    public final void L() {
        this.zze = vg7.B;
    }

    public final /* synthetic */ void M(int i) {
        s();
        this.zze.remove(i);
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void O(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void P(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zzb |= 32;
        this.zzk = j;
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
                                sg7 sg7Var2 = zzn;
                                if (sg7Var2 == null) {
                                    synchronized (mt7.class) {
                                        try {
                                            sg7Var = zzn;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzm);
                                                zzn = sg7Var;
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
                        return zzm;
                    }
                    return new kf7(zzm);
                }
                return new mt7();
            }
            return new wg7(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", tt7.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void r(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final void s() {
        yf7 yf7Var = this.zze;
        if (!((re7) yf7Var).x) {
            this.zze = zo5.o(yf7Var);
        }
    }

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final tt7 v(int i) {
        return (tt7) this.zze.get(i);
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final long y() {
        return this.zzg;
    }

    public final boolean z() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }
}

package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cq7 extends mf7 {
    private static final cq7 zzm;
    private static volatile sg7 zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private yf7 zzg = vg7.B;
    private boolean zzh;
    private gq7 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        cq7 cq7Var = new cq7();
        zzm = cq7Var;
        mf7.m(cq7.class, cq7Var);
    }

    public static bq7 D() {
        return (bq7) zzm.h();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final boolean B() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        return this.zzl;
    }

    public final /* synthetic */ void E(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void F(int i, eq7 eq7Var) {
        yf7 yf7Var = this.zzg;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzg = yf7Var;
        }
        yf7Var.set(i, eq7Var);
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
                                    synchronized (cq7.class) {
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
                return new cq7();
            }
            return new wg7(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", eq7.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
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

    public final String t() {
        return this.zzf;
    }

    public final List u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final eq7 w(int i) {
        return (eq7) this.zzg.get(i);
    }

    public final boolean x() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final gq7 y() {
        gq7 gq7Var = this.zzi;
        if (gq7Var == null) {
            return gq7.A();
        }
        return gq7Var;
    }

    public final boolean z() {
        return this.zzj;
    }
}

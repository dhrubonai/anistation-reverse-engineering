package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class aq7 extends mf7 {
    private static final aq7 zzj;
    private static volatile sg7 zzk;
    private int zzb;
    private int zze;
    private yf7 zzf;
    private yf7 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        aq7 aq7Var = new aq7();
        zzj = aq7Var;
        mf7.m(aq7.class, aq7Var);
    }

    public aq7() {
        vg7 vg7Var = vg7.B;
        this.zzf = vg7Var;
        this.zzg = vg7Var;
    }

    public final void A(int i, cq7 cq7Var) {
        yf7 yf7Var = this.zzg;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzg = yf7Var;
        }
        yf7Var.set(i, cq7Var);
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
                                    synchronized (aq7.class) {
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
                return new aq7();
            }
            return new wg7(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", jq7.class, "zzg", cq7.class, "zzh", "zzi"});
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

    public final List t() {
        return this.zzf;
    }

    public final int u() {
        return this.zzf.size();
    }

    public final jq7 v(int i) {
        return (jq7) this.zzf.get(i);
    }

    public final yf7 w() {
        return this.zzg;
    }

    public final int x() {
        return this.zzg.size();
    }

    public final cq7 y(int i) {
        return (cq7) this.zzg.get(i);
    }

    public final void z(int i, jq7 jq7Var) {
        yf7 yf7Var = this.zzf;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzf = yf7Var;
        }
        yf7Var.set(i, jq7Var);
    }
}

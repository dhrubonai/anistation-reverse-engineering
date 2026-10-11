package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tr7 extends mf7 {
    private static final tr7 zzw;
    private static volatile sg7 zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private yf7 zzh;
    private yf7 zzi;
    private yf7 zzj;
    private String zzk;
    private boolean zzl;
    private yf7 zzm;
    private yf7 zzn;
    private String zzo;
    private String zzp;
    private hr7 zzq;
    private yr7 zzr;
    private gs7 zzs;
    private as7 zzt;
    private wr7 zzu;
    private tf7 zzv;

    static {
        tr7 tr7Var = new tr7();
        zzw = tr7Var;
        mf7.m(tr7.class, tr7Var);
    }

    public tr7() {
        vg7 vg7Var = vg7.B;
        this.zzh = vg7Var;
        this.zzi = vg7Var;
        this.zzj = vg7Var;
        this.zzk = "";
        this.zzm = vg7Var;
        this.zzn = vg7Var;
        this.zzo = "";
        this.zzp = "";
        this.zzv = nf7.B;
    }

    public static rr7 I() {
        return (rr7) zzw.h();
    }

    public static tr7 J() {
        return zzw;
    }

    public final int A() {
        return this.zzm.size();
    }

    public final yf7 B() {
        return this.zzn;
    }

    public final String C() {
        return this.zzo;
    }

    public final boolean D() {
        if ((this.zzb & 128) != 0) {
            return true;
        }
        return false;
    }

    public final hr7 E() {
        hr7 hr7Var = this.zzq;
        if (hr7Var == null) {
            return hr7.x();
        }
        return hr7Var;
    }

    public final boolean F() {
        if ((this.zzb & 512) != 0) {
            return true;
        }
        return false;
    }

    public final gs7 G() {
        gs7 gs7Var = this.zzs;
        if (gs7Var == null) {
            return gs7.t();
        }
        return gs7Var;
    }

    public final tf7 H() {
        return this.zzv;
    }

    public final void K(int i, pr7 pr7Var) {
        yf7 yf7Var = this.zzi;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzi = yf7Var;
        }
        yf7Var.set(i, pr7Var);
    }

    public final void L() {
        this.zzj = vg7.B;
    }

    public final void M() {
        this.zzm = vg7.B;
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
                                sg7 sg7Var2 = zzx;
                                if (sg7Var2 == null) {
                                    synchronized (tr7.class) {
                                        try {
                                            sg7Var = zzx;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzw);
                                                zzx = sg7Var;
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
                        return zzw;
                    }
                    return new kf7(zzw);
                }
                return new tr7();
            }
            return new wg7(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", ds7.class, "zzi", pr7.class, "zzj", aq7.class, "zzk", "zzl", "zzm", mv7.class, "zzn", jr7.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
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

    public final boolean t() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String u() {
        return this.zzf;
    }

    public final yf7 v() {
        return this.zzh;
    }

    public final int w() {
        return this.zzi.size();
    }

    public final pr7 x(int i) {
        return (pr7) this.zzi.get(i);
    }

    public final List y() {
        return this.zzj;
    }

    public final yf7 z() {
        return this.zzm;
    }
}

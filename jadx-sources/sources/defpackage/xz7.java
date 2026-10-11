package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xz7 extends mf7 {
    private static final uf7 zzl = new lp7((byte) 8);
    private static final xz7 zzq;
    private static volatile sg7 zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private yf7 zzi;
    private yf7 zzj;
    private tf7 zzk;
    private b08 zzm;
    private boolean zzn;
    private boolean zzo;
    private uz7 zzp;
    private we7 zze = we7.y;
    private String zzg = "";

    static {
        xz7 xz7Var = new xz7();
        zzq = xz7Var;
        mf7.m(xz7.class, xz7Var);
    }

    public xz7() {
        vg7 vg7Var = vg7.B;
        this.zzi = vg7Var;
        this.zzj = vg7Var;
        this.zzk = nf7.B;
    }

    public static wz7 E() {
        return (wz7) zzq.h();
    }

    public static xz7 F() {
        return zzq;
    }

    public final b08 A() {
        b08 b08Var = this.zzm;
        if (b08Var == null) {
            return b08.t();
        }
        return b08Var;
    }

    public final boolean B() {
        return this.zzn;
    }

    public final boolean C() {
        return this.zzo;
    }

    public final uz7 D() {
        uz7 uz7Var = this.zzp;
        if (uz7Var == null) {
            return uz7.s();
        }
        return uz7Var;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 8;
        this.zzh = j;
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
                                sg7 sg7Var2 = zzr;
                                if (sg7Var2 == null) {
                                    synchronized (xz7.class) {
                                        try {
                                            sg7Var = zzr;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzq);
                                                zzr = sg7Var;
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
                        return zzq;
                    }
                    return new kf7(zzq);
                }
                return new xz7();
            }
            return new wg7(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", je7.b, "zzm", "zzn", "zzo", "zzp"});
        }
        return (byte) 1;
    }

    public final boolean r() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final we7 s() {
        return this.zze;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }

    public final long v() {
        return this.zzh;
    }

    public final yf7 w() {
        return this.zzi;
    }

    public final yf7 x() {
        return this.zzj;
    }

    public final List y() {
        return new vf7(this.zzk, zzl);
    }

    public final boolean z() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }
}

package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yy7 extends mf7 {
    private static final yy7 zzl;
    private static volatile sg7 zzm;
    private int zzb;
    private String zze = "";
    private we7 zzf = we7.y;
    private String zzg = "";
    private yf7 zzh;
    private yf7 zzi;
    private boolean zzj;
    private long zzk;

    static {
        yy7 yy7Var = new yy7();
        zzl = yy7Var;
        mf7.m(yy7.class, yy7Var);
    }

    public yy7() {
        vg7 vg7Var = vg7.B;
        this.zzh = vg7Var;
        this.zzi = vg7Var;
    }

    public static vy7 x() {
        return (vy7) zzl.h();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void B(bz7 bz7Var) {
        yf7 yf7Var = this.zzh;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzh = yf7Var;
        }
        yf7Var.add(bz7Var);
    }

    public final void C(String str) {
        str.getClass();
        yf7 yf7Var = this.zzi;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzi = yf7Var;
        }
        yf7Var.add(str);
    }

    public final /* synthetic */ void D(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    public final /* synthetic */ void E(long j) {
        this.zzb |= 16;
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
                                sg7 sg7Var2 = zzm;
                                if (sg7Var2 == null) {
                                    synchronized (yy7.class) {
                                        try {
                                            sg7Var = zzm;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzl);
                                                zzm = sg7Var;
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
                        return zzl;
                    }
                    return new kf7(zzl);
                }
                return new yy7();
            }
            return new wg7(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", bz7.class, "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final we7 t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }

    public final yf7 v() {
        return this.zzh;
    }

    public final long w() {
        return this.zzk;
    }

    public final /* synthetic */ void y(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void z(ve7 ve7Var) {
        ve7Var.getClass();
        this.zzb |= 2;
        this.zzf = ve7Var;
    }
}

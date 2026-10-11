package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q38 extends mf7 {
    private static final q38 zzj;
    private static volatile sg7 zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private we7 zzf = we7.y;
    private String zzg = "";
    private yf7 zzi = vg7.B;

    static {
        q38 q38Var = new q38();
        zzj = q38Var;
        mf7.m(q38.class, q38Var);
    }

    public static o38 x() {
        return (o38) zzj.h();
    }

    public static q38 y() {
        return zzj;
    }

    public final /* synthetic */ void A(we7 we7Var) {
        we7Var.getClass();
        this.zzb |= 2;
        this.zzf = we7Var;
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void C(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final void D(u38 u38Var) {
        yf7 yf7Var = this.zzi;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzi = yf7Var;
        }
        yf7Var.add(u38Var);
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
                                    synchronized (q38.class) {
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
                return new q38();
            }
            return new wg7(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", u38.class});
        }
        return (byte) 1;
    }

    public final String r() {
        return this.zze;
    }

    public final we7 s() {
        return this.zzf;
    }

    public final String t() {
        return this.zzg;
    }

    public final long u() {
        return this.zzh;
    }

    public final yf7 v() {
        return this.zzi;
    }

    public final int w() {
        return this.zzi.size();
    }

    public final /* synthetic */ void z(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}

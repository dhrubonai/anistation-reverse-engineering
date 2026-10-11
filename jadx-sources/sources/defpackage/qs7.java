package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qs7 extends mf7 {
    private static final qs7 zzp;
    private static volatile sg7 zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private gg7 zzm;
    private gg7 zzn;
    private String zzo;

    static {
        qs7 qs7Var = new qs7();
        zzp = qs7Var;
        mf7.m(qs7.class, qs7Var);
    }

    public qs7() {
        gg7 gg7Var = gg7.y;
        this.zzm = gg7Var;
        this.zzn = gg7Var;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    public static is7 W() {
        return (is7) zzp.h();
    }

    public static qs7 X() {
        return zzp;
    }

    public final gg7 A() {
        gg7 gg7Var = this.zzm;
        if (!gg7Var.x) {
            gg7 a = gg7Var.a();
            this.zzm = a;
            return a;
        }
        return gg7Var;
    }

    public final gg7 B() {
        gg7 gg7Var = this.zzn;
        if (!gg7Var.x) {
            gg7 a = gg7Var.a();
            this.zzn = a;
            return a;
        }
        return gg7Var;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    public final /* synthetic */ void D() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean E() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String F() {
        return this.zze;
    }

    public final boolean G() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String H() {
        return this.zzf;
    }

    public final boolean I() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String J() {
        return this.zzg;
    }

    public final boolean K() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final long L() {
        return this.zzh;
    }

    public final boolean M() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final String N() {
        return this.zzi;
    }

    public final boolean O() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String P() {
        return this.zzj;
    }

    public final boolean Q() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final String R() {
        return this.zzk;
    }

    public final boolean S() {
        if ((this.zzb & 128) != 0) {
            return true;
        }
        return false;
    }

    public final long T() {
        return this.zzl;
    }

    public final boolean U() {
        if ((this.zzb & 256) != 0) {
            return true;
        }
        return false;
    }

    public final String V() {
        return this.zzo;
    }

    public final /* synthetic */ void Y(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void Z() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void a0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void b0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void c0(String str) {
        this.zzb |= 4;
        this.zzg = str;
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
                                sg7 sg7Var2 = zzq;
                                if (sg7Var2 == null) {
                                    synchronized (qs7.class) {
                                        try {
                                            sg7Var = zzq;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzp);
                                                zzq = sg7Var;
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
                        return zzp;
                    }
                    return new kf7(zzp);
                }
                return new qs7();
            }
            return new wg7(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", ks7.a, "zzn", ms7.a, "zzo"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void r() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    public final /* synthetic */ void s(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void t(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    public final /* synthetic */ void u() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void v(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void w() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }

    public final /* synthetic */ void y() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void z(long j) {
        this.zzb |= 128;
        this.zzl = j;
    }
}

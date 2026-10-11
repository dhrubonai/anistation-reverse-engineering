package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yp7 extends mf7 {
    private static final yp7 zzi;
    private static volatile sg7 zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        yp7 yp7Var = new yp7();
        zzi = yp7Var;
        mf7.m(yp7.class, yp7Var);
    }

    public static xp7 r() {
        return (xp7) zzi.h();
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
                                sg7 sg7Var2 = zzj;
                                if (sg7Var2 == null) {
                                    synchronized (yp7.class) {
                                        try {
                                            sg7Var = zzj;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzi);
                                                zzj = sg7Var;
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
                        return zzi;
                    }
                    return new kf7(zzi);
                }
                return new yp7();
            }
            return new wg7(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void s(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void t() {
        this.zzb |= 2;
        this.zzf = true;
    }

    public final /* synthetic */ void u(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }
}

package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uy7 extends mf7 {
    private static final uy7 zzh;
    private static volatile sg7 zzi;
    private int zzb;
    private sy7 zzf;
    private String zze = "";
    private String zzg = "";

    static {
        uy7 uy7Var = new uy7();
        zzh = uy7Var;
        mf7.m(uy7.class, uy7Var);
    }

    public static oy7 s() {
        return (oy7) zzh.h();
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
                                sg7 sg7Var2 = zzi;
                                if (sg7Var2 == null) {
                                    synchronized (uy7.class) {
                                        try {
                                            sg7Var = zzi;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzh);
                                                zzi = sg7Var;
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
                        return zzh;
                    }
                    return new kf7(zzh);
                }
                return new uy7();
            }
            return new wg7(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final String r() {
        return this.zze;
    }

    public final /* synthetic */ void t(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void u(sy7 sy7Var) {
        this.zzf = sy7Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void v(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}

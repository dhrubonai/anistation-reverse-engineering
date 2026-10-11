package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yz7 extends mf7 {
    private static final yz7 zzo;
    private static volatile sg7 zzp;
    private int zzb;
    private boolean zzf;
    private yf7 zzh;
    private yf7 zzi;
    private tf7 zzj;
    private b08 zzk;
    private boolean zzl;
    private boolean zzm;
    private uz7 zzn;
    private we7 zze = we7.y;
    private String zzg = "";

    static {
        yz7 yz7Var = new yz7();
        zzo = yz7Var;
        mf7.m(yz7.class, yz7Var);
    }

    public yz7() {
        vg7 vg7Var = vg7.B;
        this.zzh = vg7Var;
        this.zzi = vg7Var;
        this.zzj = nf7.B;
    }

    public static yz7 r() {
        return zzo;
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
                                sg7 sg7Var2 = zzp;
                                if (sg7Var2 == null) {
                                    synchronized (yz7.class) {
                                        try {
                                            sg7Var = zzp;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzo);
                                                zzp = sg7Var;
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
                        return zzo;
                    }
                    return new kf7(zzo);
                }
                return new yz7();
            }
            return new wg7(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", je7.b, "zzk", "zzl", "zzm", "zzn"});
        }
        return (byte) 1;
    }
}

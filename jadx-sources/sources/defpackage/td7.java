package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class td7 extends ba8 {
    private static final td7 zzg;
    private ja8 zzb;
    private ja8 zzd;
    private ja8 zze;
    private ja8 zzf;

    static {
        td7 td7Var = new td7();
        zzg = td7Var;
        ba8.g(td7.class, td7Var);
    }

    public td7() {
        nb8 nb8Var = nb8.B;
        this.zzb = nb8Var;
        this.zzd = nb8Var;
        this.zze = nb8Var;
        this.zzf = nb8Var;
    }

    @Override // defpackage.ba8
    public final Object i(int i, ba8 ba8Var) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzg;
                        }
                        throw null;
                    }
                    return new x98(zzg);
                }
                return new td7();
            }
            return new ob8(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"zzb", nd7.class, "zzd", md7.class, "zze", nd7.class, "zzf", md7.class});
        }
        return (byte) 1;
    }
}

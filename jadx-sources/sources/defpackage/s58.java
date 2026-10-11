package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s58 extends ba8 {
    private static final s58 zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        s58 s58Var = new s58();
        zzh = s58Var;
        ba8.g(s58.class, s58Var);
    }

    @Override // defpackage.ba8
    public final Object i(int i, ba8 ba8Var) {
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (ba8Var == null) {
                                b = 0;
                            } else {
                                b = 1;
                            }
                            this.zzg = b;
                            return null;
                        }
                        return zzh;
                    }
                    return new x98(zzh);
                }
                return new s58();
            }
            return new ob8(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", pk2.r0, "zze", "zzf", q18.A});
        }
        return Byte.valueOf(this.zzg);
    }
}

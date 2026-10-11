package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w28 extends ba8 {
    private static final w28 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        w28 w28Var = new w28();
        zzf = w28Var;
        ba8.g(w28.class, w28Var);
    }

    public static v28 l() {
        return (v28) zzf.d();
    }

    @Override // defpackage.ba8
    public final Object i(int i, ba8 ba8Var) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzf;
                        }
                        throw null;
                    }
                    return new x98(zzf);
                }
                return new w28();
            }
            return new ob8(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void m(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void n(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }
}

package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e48 extends ba8 {
    private static final e48 zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [ba8, e48] */
    static {
        ?? ba8Var = new ba8();
        zzh = ba8Var;
        ba8.g(e48.class, ba8Var);
    }

    public static c48 l() {
        return (c48) zzh.d();
    }

    @Override // defpackage.ba8
    public final Object i(int i, ba8 ba8Var) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzh;
                        }
                        throw null;
                    }
                    return new x98(zzh);
                }
                return new ba8();
            }
            return new ob8(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", m18.y, "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void m(int i) {
        this.zzb |= 2;
        this.zze = i;
    }

    public final /* synthetic */ void n(int i) {
        this.zzb |= 4;
        this.zzf = i;
    }

    public final /* synthetic */ void o(int i) {
        this.zzb |= 8;
        this.zzg = i;
    }

    public final /* synthetic */ void p(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}

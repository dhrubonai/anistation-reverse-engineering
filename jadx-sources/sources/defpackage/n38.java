package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n38 extends ba8 {
    private static final n38 zzi;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    /* JADX WARN: Type inference failed for: r0v0, types: [n38, ba8] */
    static {
        ?? ba8Var = new ba8();
        zzi = ba8Var;
        ba8.g(n38.class, ba8Var);
    }

    public static m38 l() {
        return (m38) zzi.d();
    }

    @Override // defpackage.ba8
    public final Object i(int i, ba8 ba8Var) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzi;
                        }
                        throw null;
                    }
                    return new x98(zzi);
                }
                return new ba8();
            }
            return new ob8(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", h95.b0, "zze", "zzf", "zzg", "zzh"});
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
        this.zzb |= 16;
        this.zzh = i;
    }

    public final /* synthetic */ void q(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}

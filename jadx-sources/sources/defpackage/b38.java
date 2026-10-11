package defpackage;

import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b38 extends ba8 {
    private static final b38 zzs;
    private int zzb;
    private o48 zzd;
    private boolean zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private q68 zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;

    /* JADX WARN: Type inference failed for: r0v0, types: [b38, ba8] */
    static {
        ?? ba8Var = new ba8();
        zzs = ba8Var;
        ba8.g(b38.class, ba8Var);
    }

    public static a38 l() {
        return (a38) zzs.d();
    }

    public static a38 m(b38 b38Var) {
        x98 d = zzs.d();
        ba8 ba8Var = d.x;
        if (!ba8Var.equals(b38Var)) {
            if (!d.y.j()) {
                ba8 ba8Var2 = (ba8) ba8Var.i(4, null);
                mb8.c.a(ba8Var2.getClass()).b(ba8Var2, d.y);
                d.y = ba8Var2;
            }
            ba8 ba8Var3 = d.y;
            mb8.c.a(ba8Var3.getClass()).b(ba8Var3, b38Var);
        }
        return (a38) d;
    }

    public static b38 n() {
        return zzs;
    }

    @Override // defpackage.ba8
    public final Object i(int i, ba8 ba8Var) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzs;
                        }
                        throw null;
                    }
                    return new x98(zzs);
                }
                return new ba8();
            }
            return new ob8(zzs, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", nr1.W, "zzi", p7.Y, "zzj", "zzk", "zzl", "zzm", p7.b0, "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void o(o48 o48Var) {
        this.zzd = o48Var;
        this.zzb |= 1;
    }

    public final /* synthetic */ void p(boolean z) {
        this.zzb |= 2;
        this.zze = z;
    }

    public final /* synthetic */ void q(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void r(int i) {
        this.zzb |= 64;
        this.zzj = i;
    }

    public final /* synthetic */ void s(int i) {
        this.zzb |= 128;
        this.zzk = i;
    }

    public final /* synthetic */ void t(int i) {
        this.zzb |= 1024;
        this.zzn = i;
    }

    public final /* synthetic */ void u(boolean z) {
        this.zzb |= 2048;
        this.zzo = z;
    }

    public final /* synthetic */ void v() {
        this.zzb |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
        this.zzp = 0;
    }

    public final /* synthetic */ void w() {
        this.zzb |= 8192;
        this.zzq = 101;
    }

    public final /* synthetic */ void x(boolean z) {
        this.zzb |= 16384;
        this.zzr = z;
    }
}

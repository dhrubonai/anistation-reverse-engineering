package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x38 extends ba8 {
    private static final x38 zzm;
    private int zzb;
    private o48 zzd;
    private long zze;
    private int zzf;
    private ja8 zzg;
    private ja8 zzh;
    private ja8 zzi;
    private ja8 zzj;
    private ja8 zzk;
    private int zzl;

    static {
        x38 x38Var = new x38();
        zzm = x38Var;
        ba8.g(x38.class, x38Var);
    }

    public x38() {
        nb8 nb8Var = nb8.B;
        this.zzg = nb8Var;
        this.zzh = nb8Var;
        this.zzi = nb8Var;
        this.zzj = nb8Var;
        this.zzk = nb8Var;
    }

    public static w38 l() {
        return (w38) zzm.d();
    }

    @Override // defpackage.ba8
    public final Object i(int i, ba8 ba8Var) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzm;
                        }
                        throw null;
                    }
                    return new x98(zzm);
                }
                return new x38();
            }
            return new ob8(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0005\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\tင\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", q18.y, "zzg", v38.class, "zzh", n38.class, "zzi", f48.class, "zzj", e48.class, "zzk", r38.class, "zzl"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void m(o48 o48Var) {
        this.zzd = o48Var;
        this.zzb |= 1;
    }

    public final /* synthetic */ void n(long j) {
        this.zzb |= 2;
        this.zze = j;
    }

    public final void o(ArrayList arrayList) {
        ja8 ja8Var = this.zzg;
        if (!((a98) ja8Var).x) {
            int size = ja8Var.size();
            ja8Var = ja8Var.e(size + size);
            this.zzg = ja8Var;
        }
        w88.c(arrayList, ja8Var);
    }

    public final void p(ArrayList arrayList) {
        ja8 ja8Var = this.zzh;
        if (!((a98) ja8Var).x) {
            int size = ja8Var.size();
            ja8Var = ja8Var.e(size + size);
            this.zzh = ja8Var;
        }
        w88.c(arrayList, ja8Var);
    }

    public final void q(ArrayList arrayList) {
        ja8 ja8Var = this.zzi;
        if (!((a98) ja8Var).x) {
            int size = ja8Var.size();
            ja8Var = ja8Var.e(size + size);
            this.zzi = ja8Var;
        }
        w88.c(arrayList, ja8Var);
    }

    public final void r(ArrayList arrayList) {
        ja8 ja8Var = this.zzj;
        if (!((a98) ja8Var).x) {
            int size = ja8Var.size();
            ja8Var = ja8Var.e(size + size);
            this.zzj = ja8Var;
        }
        w88.c(arrayList, ja8Var);
    }

    public final void s(ArrayList arrayList) {
        ja8 ja8Var = this.zzk;
        if (!((a98) ja8Var).x) {
            int size = ja8Var.size();
            ja8Var = ja8Var.e(size + size);
            this.zzk = ja8Var;
        }
        w88.c(arrayList, ja8Var);
    }

    public final /* synthetic */ void t(int i) {
        this.zzb |= 8;
        this.zzl = i;
    }
}

package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m28 extends ba8 {
    private static final m28 zzh;
    private int zzb;
    private w28 zzd;
    private w58 zze;
    private ja8 zzf = nb8.B;
    private ga8 zzg = ca8.B;

    static {
        m28 m28Var = new m28();
        zzh = m28Var;
        ba8.g(m28.class, m28Var);
    }

    public static l28 l() {
        return (l28) zzh.d();
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
                return new m28();
            }
            return new ob8(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zzb", "zzd", "zze", "zzf", r58.class, "zzg", i18.A});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void m(w28 w28Var) {
        this.zzd = w28Var;
        this.zzb |= 1;
    }

    public final void n(ArrayList arrayList) {
        ja8 ja8Var = this.zzg;
        if (!((a98) ja8Var).x) {
            ca8 ca8Var = (ca8) ja8Var;
            int i = ca8Var.z;
            this.zzg = ca8Var.e(i + i);
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((ca8) this.zzg).f(((f28) obj).x);
        }
    }
}

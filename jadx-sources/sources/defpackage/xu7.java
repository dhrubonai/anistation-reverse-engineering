package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xu7 extends mf7 {
    private static final xu7 zzg;
    private static volatile sg7 zzh;
    private int zzb;
    private int zze;
    private xf7 zzf = eg7.B;

    static {
        xu7 xu7Var = new xu7();
        zzg = xu7Var;
        mf7.m(xu7.class, xu7Var);
    }

    public static wu7 w() {
        return (wu7) zzg.h();
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
                                sg7 sg7Var2 = zzh;
                                if (sg7Var2 == null) {
                                    synchronized (xu7.class) {
                                        try {
                                            sg7Var = zzh;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzg);
                                                zzh = sg7Var;
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
                        return zzg;
                    }
                    return new kf7(zzg);
                }
                return new xu7();
            }
            return new wg7(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final boolean r() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int s() {
        return this.zze;
    }

    public final List t() {
        return this.zzf;
    }

    public final int u() {
        return ((eg7) this.zzf).size();
    }

    public final long v(int i) {
        return ((eg7) this.zzf).c(i);
    }

    public final /* synthetic */ void x(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final void y(List list) {
        List list2 = this.zzf;
        boolean z = ((re7) list2).x;
        List list3 = list2;
        if (!z) {
            eg7 eg7Var = (eg7) list2;
            int i = eg7Var.z;
            eg7 l = eg7Var.l(i + i);
            this.zzf = l;
            list3 = l;
        }
        kf7.b(list, list3);
    }
}

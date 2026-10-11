package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tu7 extends mf7 {
    private static final tu7 zzh;
    private static volatile sg7 zzi;
    private xf7 zzb;
    private xf7 zze;
    private yf7 zzf;
    private yf7 zzg;

    static {
        tu7 tu7Var = new tu7();
        zzh = tu7Var;
        mf7.m(tu7.class, tu7Var);
    }

    public tu7() {
        eg7 eg7Var = eg7.B;
        this.zzb = eg7Var;
        this.zze = eg7Var;
        vg7 vg7Var = vg7.B;
        this.zzf = vg7Var;
        this.zzg = vg7Var;
    }

    public static tu7 A() {
        return zzh;
    }

    public static ru7 z() {
        return (ru7) zzh.h();
    }

    public final void B(Iterable iterable) {
        List list = this.zzb;
        boolean z = ((re7) list).x;
        List list2 = list;
        if (!z) {
            eg7 eg7Var = (eg7) list;
            int i = eg7Var.z;
            eg7 l = eg7Var.l(i + i);
            this.zzb = l;
            list2 = l;
        }
        kf7.b(iterable, list2);
    }

    public final void C() {
        this.zzb = eg7.B;
    }

    public final void D(List list) {
        List list2 = this.zze;
        boolean z = ((re7) list2).x;
        List list3 = list2;
        if (!z) {
            eg7 eg7Var = (eg7) list2;
            int i = eg7Var.z;
            eg7 l = eg7Var.l(i + i);
            this.zze = l;
            list3 = l;
        }
        kf7.b(list, list3);
    }

    public final void E() {
        this.zze = eg7.B;
    }

    public final void F(ArrayList arrayList) {
        yf7 yf7Var = this.zzf;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzf = yf7Var;
        }
        kf7.b(arrayList, yf7Var);
    }

    public final void G() {
        this.zzf = vg7.B;
    }

    public final void H(Iterable iterable) {
        yf7 yf7Var = this.zzg;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzg = yf7Var;
        }
        kf7.b(iterable, yf7Var);
    }

    public final void I() {
        this.zzg = vg7.B;
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
                                sg7 sg7Var2 = zzi;
                                if (sg7Var2 == null) {
                                    synchronized (tu7.class) {
                                        try {
                                            sg7Var = zzi;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzh);
                                                zzi = sg7Var;
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
                        return zzh;
                    }
                    return new kf7(zzh);
                }
                return new tu7();
            }
            return new wg7(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", kt7.class, "zzg", xu7.class});
        }
        return (byte) 1;
    }

    public final List r() {
        return this.zzb;
    }

    public final int s() {
        return ((eg7) this.zzb).size();
    }

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return ((eg7) this.zze).size();
    }

    public final yf7 v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final yf7 x() {
        return this.zzg;
    }

    public final int y() {
        return this.zzg.size();
    }
}

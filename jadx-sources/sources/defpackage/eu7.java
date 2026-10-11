package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eu7 extends mf7 {
    private static final eu7 zzi;
    private static volatile sg7 zzj;
    private int zzb;
    private yf7 zze = vg7.B;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        eu7 eu7Var = new eu7();
        zzi = eu7Var;
        mf7.m(eu7.class, eu7Var);
    }

    public static zt7 y() {
        return (zt7) zzi.h();
    }

    public static zt7 z(eu7 eu7Var) {
        kf7 h = zzi.h();
        h.f(eu7Var);
        return (zt7) h;
    }

    public final /* synthetic */ void A(int i, iu7 iu7Var) {
        G();
        this.zze.set(i, iu7Var);
    }

    public final /* synthetic */ void B(iu7 iu7Var) {
        G();
        this.zze.add(iu7Var);
    }

    public final void C(ArrayList arrayList) {
        G();
        kf7.b(arrayList, this.zze);
    }

    public final void D() {
        this.zze = vg7.B;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void G() {
        yf7 yf7Var = this.zze;
        if (!((re7) yf7Var).x) {
            this.zze = zo5.o(yf7Var);
        }
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
                                sg7 sg7Var2 = zzj;
                                if (sg7Var2 == null) {
                                    synchronized (eu7.class) {
                                        try {
                                            sg7Var = zzj;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzi);
                                                zzj = sg7Var;
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
                        return zzi;
                    }
                    return new kf7(zzi);
                }
                return new eu7();
            }
            return new wg7(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", iu7.class, "zzf", "zzg", "zzh", je7.k});
        }
        return (byte) 1;
    }

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final iu7 t(int i) {
        return (iu7) this.zze.get(i);
    }

    public final boolean u() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String x() {
        return this.zzg;
    }
}

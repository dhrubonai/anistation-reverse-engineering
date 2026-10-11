package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ev7 extends mf7 {
    private static final ev7 zze;
    private static volatile sg7 zzf;
    private yf7 zzb = vg7.B;

    static {
        ev7 ev7Var = new ev7();
        zze = ev7Var;
        mf7.m(ev7.class, ev7Var);
    }

    public static ev7 t() {
        return zze;
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
                                sg7 sg7Var2 = zzf;
                                if (sg7Var2 == null) {
                                    synchronized (ev7.class) {
                                        try {
                                            sg7Var = zzf;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zze);
                                                zzf = sg7Var;
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
                        return zze;
                    }
                    return new kf7(zze);
                }
                return new ev7();
            }
            return new wg7(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", gv7.class});
        }
        return (byte) 1;
    }

    public final List r() {
        return this.zzb;
    }

    public final int s() {
        return this.zzb.size();
    }
}

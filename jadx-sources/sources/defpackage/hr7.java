package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hr7 extends mf7 {
    private static final hr7 zzj;
    private static volatile sg7 zzk;
    private int zzb;
    private yf7 zze;
    private yf7 zzf;
    private yf7 zzg;
    private boolean zzh;
    private yf7 zzi;

    static {
        hr7 hr7Var = new hr7();
        zzj = hr7Var;
        mf7.m(hr7.class, hr7Var);
    }

    public hr7() {
        vg7 vg7Var = vg7.B;
        this.zze = vg7Var;
        this.zzf = vg7Var;
        this.zzg = vg7Var;
        this.zzi = vg7Var;
    }

    public static hr7 x() {
        return zzj;
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
                                sg7 sg7Var2 = zzk;
                                if (sg7Var2 == null) {
                                    synchronized (hr7.class) {
                                        try {
                                            sg7Var = zzk;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzj);
                                                zzk = sg7Var;
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
                        return zzj;
                    }
                    return new kf7(zzj);
                }
                return new hr7();
            }
            return new wg7(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", oq7.class, "zzf", qq7.class, "zzg", dr7.class, "zzh", "zzi", oq7.class});
        }
        return (byte) 1;
    }

    public final List r() {
        return this.zze;
    }

    public final List s() {
        return this.zzf;
    }

    public final List t() {
        return this.zzg;
    }

    public final boolean u() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final yf7 w() {
        return this.zzi;
    }
}

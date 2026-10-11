package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jq7 extends mf7 {
    private static final jq7 zzk;
    private static volatile sg7 zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private eq7 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        jq7 jq7Var = new jq7();
        zzk = jq7Var;
        mf7.m(jq7.class, jq7Var);
    }

    public static hq7 z() {
        return (hq7) zzk.h();
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 2;
        this.zzf = str;
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
                                sg7 sg7Var2 = zzl;
                                if (sg7Var2 == null) {
                                    synchronized (jq7.class) {
                                        try {
                                            sg7Var = zzl;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzk);
                                                zzl = sg7Var;
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
                        return zzk;
                    }
                    return new kf7(zzk);
                }
                return new jq7();
            }
            return new wg7(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
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

    public final String t() {
        return this.zzf;
    }

    public final eq7 u() {
        eq7 eq7Var = this.zzg;
        if (eq7Var == null) {
            return eq7.z();
        }
        return eq7Var;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        return this.zzj;
    }
}

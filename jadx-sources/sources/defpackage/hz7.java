package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hz7 extends mf7 {
    private static final hz7 zzj;
    private static volatile sg7 zzk;
    private int zzb;
    private long zzh;
    private gg7 zzi = gg7.y;
    private String zze = "";
    private we7 zzf = we7.y;
    private String zzg = "";

    static {
        hz7 hz7Var = new hz7();
        zzj = hz7Var;
        mf7.m(hz7.class, hz7Var);
    }

    public static hz7 x(ze7 ze7Var, ff7 ff7Var) {
        mf7 g = zzj.g();
        try {
            xg7 a = ug7.c.a(g.getClass());
            fm0 fm0Var = ze7Var.c;
            if (fm0Var == null) {
                fm0Var = new fm0(ze7Var);
            }
            a.j(g, fm0Var, ff7Var);
            a.f(g);
            mf7.p(g);
            return (hz7) g;
        } catch (ag7 e) {
            if (e.x) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (bh7 e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof ag7) {
                throw ((ag7) e3.getCause());
            }
            throw new IOException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof ag7) {
                throw ((ag7) e4.getCause());
            }
            throw e4;
        }
    }

    public static hz7 y() {
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
                                    synchronized (hz7.class) {
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
                return new hz7();
            }
            return new wg7(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", gz7.a});
        }
        return (byte) 1;
    }

    public final String r() {
        return this.zze;
    }

    public final we7 s() {
        return this.zzf;
    }

    public final String t() {
        return this.zzg;
    }

    public final long u() {
        return this.zzh;
    }

    public final int v() {
        return this.zzi.size();
    }

    public final Map w() {
        return Collections.unmodifiableMap(this.zzi);
    }
}

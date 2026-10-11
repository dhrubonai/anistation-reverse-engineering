package defpackage;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j28 extends mf7 {
    private static final j28 zzl;
    private static volatile sg7 zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private yf7 zzg = vg7.B;

    static {
        j28 j28Var = new j28();
        zzl = j28Var;
        mf7.m(j28.class, j28Var);
    }

    public static j28 t(InputStream inputStream, ff7 ff7Var) {
        j28 j28Var = zzl;
        ze7 h = ze7.h(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE);
        mf7 g = j28Var.g();
        try {
            xg7 a = ug7.c.a(g.getClass());
            fm0 fm0Var = h.c;
            if (fm0Var == null) {
                fm0Var = new fm0(h);
            }
            a.j(g, fm0Var, ff7Var);
            a.f(g);
            mf7.p(g);
            return (j28) g;
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
                                sg7 sg7Var2 = zzm;
                                if (sg7Var2 == null) {
                                    synchronized (j28.class) {
                                        try {
                                            sg7Var = zzm;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzl);
                                                zzm = sg7Var;
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
                        return zzl;
                    }
                    return new kf7(zzl);
                }
                return new j28();
            }
            return new wg7(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", je7.b, "zzi", "zzk", "zzj"});
        }
        return (byte) 1;
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        return this.zzf;
    }
}

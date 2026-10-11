package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class yo2 extends m76 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yo2(String str, Object obj, Object obj2, byte b) {
        super(str, true);
        this.e = b;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, w05] */
    @Override // defpackage.m76
    public final long a() {
        int i;
        long a;
        lp2[] lp2VarArr;
        switch (this.e) {
            case 0:
                ep2 ep2Var = (ep2) this.f;
                ep2Var.x.a(ep2Var, (jl5) ((w05) this.g).x);
                return -1L;
            case 1:
                try {
                    ((ep2) this.f).x.b((lp2) this.g);
                } catch (IOException e) {
                    lm4 lm4Var = lm4.a;
                    lm4 lm4Var2 = lm4.a;
                    String str = "Http2Connection.Listener failure for " + ((ep2) this.f).z;
                    lm4Var2.getClass();
                    lm4.i(str, 4, e);
                    try {
                        ((lp2) this.g).c(2, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                uh0 uh0Var = (uh0) this.f;
                jl5 jl5Var = (jl5) this.g;
                ?? obj = new Object();
                ep2 ep2Var2 = (ep2) uh0Var.z;
                synchronized (ep2Var2.T) {
                    synchronized (ep2Var2) {
                        try {
                            jl5 jl5Var2 = ep2Var2.N;
                            jl5 jl5Var3 = new jl5();
                            jl5Var2.getClass();
                            Object[] objArr = 0;
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & jl5Var2.a) != 0) {
                                    jl5Var3.b(i2, jl5Var2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & jl5Var.a) != 0) {
                                    jl5Var3.b(i3, jl5Var.b[i3]);
                                }
                            }
                            obj.x = jl5Var3;
                            a = jl5Var3.a() - jl5Var2.a();
                            if (a != 0 && !ep2Var2.y.isEmpty()) {
                                lp2VarArr = (lp2[]) ep2Var2.y.values().toArray(new lp2[0]);
                                jl5 jl5Var4 = (jl5) obj.x;
                                jl5Var4.getClass();
                                ep2Var2.N = jl5Var4;
                                ep2Var2.G.c(new yo2(ep2Var2.z + " onSettings", ep2Var2, obj, objArr == true ? 1 : 0), 0L);
                            }
                            lp2VarArr = null;
                            jl5 jl5Var42 = (jl5) obj.x;
                            jl5Var42.getClass();
                            ep2Var2.N = jl5Var42;
                            ep2Var2.G.c(new yo2(ep2Var2.z + " onSettings", ep2Var2, obj, objArr == true ? 1 : 0), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        ep2Var2.T.a((jl5) obj.x);
                    } catch (IOException e2) {
                        ep2Var2.a(2, 2, e2);
                    }
                }
                if (lp2VarArr != null) {
                    for (lp2 lp2Var : lp2VarArr) {
                        synchronized (lp2Var) {
                            lp2Var.f += a;
                            if (a > 0) {
                                lp2Var.notifyAll();
                            }
                        }
                    }
                }
                return -1L;
        }
    }
}

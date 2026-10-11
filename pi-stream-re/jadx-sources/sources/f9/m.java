package f9;

import java.io.IOException;
import r6.h0;

/* loaded from: classes.dex */
public final class m extends b9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f4058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4059f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f4060g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, n nVar, f0 f0Var) {
        super(str, true);
        this.f4058e = nVar;
        this.f4060g = f0Var;
    }

    @Override // b9.a
    public final long a() {
        int i10;
        boolean z9;
        long a10;
        b0[] b0VarArr;
        n nVar = this.f4058e;
        boolean z10 = this.f4059f;
        f0 f0Var = this.f4060g;
        nVar.getClass();
        h0.u(f0Var, "settings");
        i7.k kVar = new i7.k();
        t tVar = nVar.f4062b;
        synchronized (tVar.P) {
            synchronized (tVar) {
                try {
                    f0 f0Var2 = tVar.J;
                    if (!z10) {
                        f0 f0Var3 = new f0();
                        h0.u(f0Var2, "other");
                        int i11 = 0;
                        while (true) {
                            boolean z11 = true;
                            if (i11 >= 10) {
                                break;
                            }
                            if (((1 << i11) & f0Var2.f4035a) == 0) {
                                z11 = false;
                            }
                            if (z11) {
                                f0Var3.b(i11, f0Var2.f4036b[i11]);
                            }
                            i11++;
                        }
                        for (int i12 = 0; i12 < 10; i12++) {
                            if (((1 << i12) & f0Var.f4035a) != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                f0Var3.b(i12, f0Var.f4036b[i12]);
                            }
                        }
                        f0Var = f0Var3;
                    }
                    kVar.f5412a = f0Var;
                    a10 = f0Var.a() - f0Var2.a();
                    if (a10 != 0 && !tVar.f4081c.isEmpty()) {
                        b0VarArr = (b0[]) tVar.f4081c.values().toArray(new b0[0]);
                        f0 f0Var4 = (f0) kVar.f5412a;
                        h0.u(f0Var4, "<set-?>");
                        tVar.J = f0Var4;
                        tVar.B.c(new k(tVar.f4082d + " onSettings", tVar, kVar, 0), 0L);
                    }
                    b0VarArr = null;
                    f0 f0Var42 = (f0) kVar.f5412a;
                    h0.u(f0Var42, "<set-?>");
                    tVar.J = f0Var42;
                    tVar.B.c(new k(tVar.f4082d + " onSettings", tVar, kVar, 0), 0L);
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                tVar.P.a((f0) kVar.f5412a);
            } catch (IOException e10) {
                tVar.f(e10);
            }
        }
        if (b0VarArr != null) {
            for (b0 b0Var : b0VarArr) {
                synchronized (b0Var) {
                    b0Var.f3987f += a10;
                    if (a10 > 0) {
                        b0Var.notifyAll();
                    }
                }
            }
            return -1L;
        }
        return -1L;
    }
}

package t1;

import a3.g;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.widget.a0;
import androidx.lifecycle.q0;
import c1.m0;
import c1.n0;
import c1.o0;
import c1.p0;
import c1.v;
import f1.b0;
import j1.d0;
import j1.e;
import j1.z;
import java.util.ArrayList;
import r6.h0;
import w.f;

/* loaded from: classes.dex */
public final class c extends e implements Handler.Callback {
    public final a I;
    public final b J;
    public final Handler K;
    public final l2.a L;
    public h0 M;
    public boolean N;
    public boolean O;
    public long P;
    public p0 Q;
    public long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Looper looper) {
        super(5);
        Handler handler;
        q0 q0Var = a.f9995p;
        bVar.getClass();
        this.J = bVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.K = handler;
        this.I = q0Var;
        this.L = new l2.a();
        this.R = -9223372036854775807L;
    }

    @Override // j1.e
    public final int B(v vVar) {
        int i10;
        if (((q0) this.I).D(vVar)) {
            if (vVar.I == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return g.e(i10, 0, 0, 0);
        }
        return g.e(0, 0, 0, 0);
    }

    public final void D(p0 p0Var, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.f1876a;
            if (i10 < o0VarArr.length) {
                v b10 = o0VarArr[i10].b();
                if (b10 != null) {
                    q0 q0Var = (q0) this.I;
                    if (q0Var.D(b10)) {
                        h0 v9 = q0Var.v(b10);
                        byte[] c6 = o0VarArr[i10].c();
                        c6.getClass();
                        l2.a aVar = this.L;
                        aVar.h();
                        aVar.j(c6.length);
                        aVar.f5262e.put(c6);
                        aVar.k();
                        p0 G = v9.G(aVar);
                        if (G != null) {
                            D(G, arrayList);
                        }
                        i10++;
                    }
                }
                arrayList.add(o0VarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public final long E(long j4) {
        boolean z9;
        boolean z10 = true;
        if (j4 != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        if (this.R == -9223372036854775807L) {
            z10 = false;
        }
        w7.b.u(z10);
        return j4 - this.R;
    }

    public final void F(p0 p0Var) {
        z zVar = (z) this.J;
        d0 d0Var = zVar.f5932a;
        n0 n0Var = d0Var.f5673e0;
        n0Var.getClass();
        m0 m0Var = new m0(n0Var);
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.f1876a;
            if (i10 >= o0VarArr.length) {
                break;
            }
            o0VarArr[i10].a(m0Var);
            i10++;
        }
        d0Var.f5673e0 = new n0(m0Var);
        n0 o = d0Var.o();
        boolean equals = o.equals(d0Var.M);
        r.e eVar = d0Var.f5683l;
        if (!equals) {
            d0Var.M = o;
            eVar.j(14, new f(zVar, 5));
        }
        eVar.j(28, new f(p0Var, 6));
        eVar.g();
    }

    @Override // j1.g1
    public final boolean a() {
        return true;
    }

    @Override // j1.e, j1.g1
    public final boolean b() {
        return this.O;
    }

    @Override // j1.g1
    public final void d(long j4, long j10) {
        boolean z9 = true;
        while (z9) {
            if (!this.N && this.Q == null) {
                l2.a aVar = this.L;
                aVar.h();
                a0 a0Var = this.f5708c;
                a0Var.G();
                int y9 = y(a0Var, aVar, 0);
                if (y9 == -4) {
                    if (aVar.g(4)) {
                        this.N = true;
                    } else if (aVar.f5264x >= this.C) {
                        aVar.B = this.P;
                        aVar.k();
                        h0 h0Var = this.M;
                        int i10 = b0.f3799a;
                        p0 G = h0Var.G(aVar);
                        if (G != null) {
                            ArrayList arrayList = new ArrayList(G.f1876a.length);
                            D(G, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.Q = new p0(E(aVar.f5264x), (o0[]) arrayList.toArray(new o0[0]));
                            }
                        }
                    }
                } else if (y9 == -5) {
                    v vVar = (v) a0Var.f404c;
                    vVar.getClass();
                    this.P = vVar.f1938q;
                }
            }
            p0 p0Var = this.Q;
            if (p0Var != null && p0Var.f1877b <= E(j4)) {
                p0 p0Var2 = this.Q;
                Handler handler = this.K;
                if (handler != null) {
                    handler.obtainMessage(0, p0Var2).sendToTarget();
                } else {
                    F(p0Var2);
                }
                this.Q = null;
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.N && this.Q == null) {
                this.O = true;
            }
        }
    }

    @Override // j1.g1
    public final String f() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            F((p0) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // j1.e
    public final void p() {
        this.Q = null;
        this.M = null;
        this.R = -9223372036854775807L;
    }

    @Override // j1.e
    public final void s(long j4, boolean z9) {
        this.Q = null;
        this.N = false;
        this.O = false;
    }

    @Override // j1.e
    public final void x(v[] vVarArr, long j4, long j10) {
        this.M = ((q0) this.I).v(vVarArr[0]);
        p0 p0Var = this.Q;
        if (p0Var != null) {
            long j11 = this.R;
            long j12 = p0Var.f1877b;
            long j13 = (j11 + j12) - j10;
            if (j12 != j13) {
                p0Var = new p0(j13, p0Var.f1876a);
            }
            this.Q = p0Var;
        }
        this.R = j10;
    }
}

package p1;

import c1.o0;
import c1.p0;
import d2.f0;
import java.util.Map;
import v1.u0;

/* loaded from: classes.dex */
public final class s extends u0 {
    public final Map H;
    public c1.p I;

    public s(z1.d dVar, o1.q qVar, o1.n nVar, Map map) {
        super(dVar, qVar, nVar);
        this.H = map;
    }

    @Override // v1.u0, d2.g0
    public final void d(long j4, int i10, int i11, int i12, f0 f0Var) {
        super.d(j4, i10, i11, i12, f0Var);
    }

    @Override // v1.u0
    public final c1.v n(c1.v vVar) {
        c1.p pVar;
        c1.p pVar2 = this.I;
        if (pVar2 == null) {
            pVar2 = vVar.f1937p;
        }
        if (pVar2 != null && (pVar = (c1.p) this.H.get(pVar2.f1874c)) != null) {
            pVar2 = pVar;
        }
        p0 p0Var = vVar.f1933k;
        p0 p0Var2 = null;
        if (p0Var != null) {
            o0[] o0VarArr = p0Var.f1876a;
            int length = o0VarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    o0 o0Var = o0VarArr[i10];
                    if ((o0Var instanceof q2.n) && "com.apple.streaming.transportStreamTimestamp".equals(((q2.n) o0Var).f9115b)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                if (length != 1) {
                    o0[] o0VarArr2 = new o0[length - 1];
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 != i10) {
                            o0VarArr2[i11 < i10 ? i11 : i11 - 1] = o0VarArr[i11];
                        }
                    }
                    p0Var2 = new p0(o0VarArr2);
                }
            }
            if (pVar2 == vVar.f1937p || p0Var != vVar.f1933k) {
                c1.u a10 = vVar.a();
                a10.o = pVar2;
                a10.f1906j = p0Var;
                vVar = a10.a();
            }
            return super.n(vVar);
        }
        p0Var = p0Var2;
        if (pVar2 == vVar.f1937p) {
        }
        c1.u a102 = vVar.a();
        a102.o = pVar2;
        a102.f1906j = p0Var;
        vVar = a102.a();
        return super.n(vVar);
    }
}

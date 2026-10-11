package x1;

import java.util.ArrayList;
import r6.f0;
import r6.l0;
import r6.l1;
import r6.n1;
import r6.o0;
import r6.u;
import r6.u1;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f11079b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11080a = new ArrayList();

    static {
        l1 l1Var = l1.f9489a;
        h3.e eVar = new h3.e(5);
        l1Var.getClass();
        u uVar = new u(eVar, l1Var);
        u1 u1Var = u1.f9551a;
        h3.e eVar2 = new h3.e(6);
        u1Var.getClass();
        f11079b = new f0(uVar, new u(eVar2, u1Var));
    }

    @Override // x1.a
    public final void clear() {
        this.f11080a.clear();
    }

    @Override // x1.a
    public final boolean e(y2.a aVar, long j4) {
        boolean z9;
        boolean z10;
        boolean z11;
        long j10 = aVar.f11541b;
        if (j10 != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        if (aVar.f11542c != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b.g(z10);
        if (j10 <= j4 && j4 < aVar.f11543d) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = this.f11080a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((y2.a) arrayList.get(size)).f11541b) {
                arrayList.add(size + 1, aVar);
                return z11;
            }
        }
        arrayList.add(0, aVar);
        return z11;
    }

    @Override // x1.a
    public final o0 f(long j4) {
        ArrayList arrayList = this.f11080a;
        if (!arrayList.isEmpty()) {
            if (j4 >= ((y2.a) arrayList.get(0)).f11541b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    y2.a aVar = (y2.a) arrayList.get(i10);
                    if (j4 >= aVar.f11541b && j4 < aVar.f11543d) {
                        arrayList2.add(aVar);
                    }
                    if (j4 < aVar.f11541b) {
                        break;
                    }
                }
                n1 q9 = o0.q(f11079b, arrayList2);
                l0 i11 = o0.i();
                for (int i12 = 0; i12 < q9.size(); i12++) {
                    i11.A0(((y2.a) q9.get(i12)).f11540a);
                }
                return i11.C0();
            }
        }
        return o0.m();
    }

    @Override // x1.a
    public final long k(long j4) {
        int i10 = 0;
        long j10 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f11080a;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j11 = ((y2.a) arrayList.get(i10)).f11541b;
            long j12 = ((y2.a) arrayList.get(i10)).f11543d;
            if (j4 < j11) {
                if (j10 == -9223372036854775807L) {
                    j10 = j11;
                } else {
                    j10 = Math.min(j10, j11);
                }
            } else {
                if (j4 < j12) {
                    if (j10 == -9223372036854775807L) {
                        j10 = j12;
                    } else {
                        j10 = Math.min(j10, j12);
                    }
                }
                i10++;
            }
        }
        if (j10 == -9223372036854775807L) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // x1.a
    public final long u(long j4) {
        ArrayList arrayList = this.f11080a;
        if (!arrayList.isEmpty()) {
            if (j4 >= ((y2.a) arrayList.get(0)).f11541b) {
                long j10 = ((y2.a) arrayList.get(0)).f11541b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long j11 = ((y2.a) arrayList.get(i10)).f11541b;
                    long j12 = ((y2.a) arrayList.get(i10)).f11543d;
                    if (j12 <= j4) {
                        j10 = Math.max(j10, j12);
                    } else {
                        if (j11 > j4) {
                            break;
                        }
                        j10 = Math.max(j10, j11);
                    }
                }
                return j10;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // x1.a
    public final void x(long j4) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11080a;
            if (i10 < arrayList.size()) {
                long j10 = ((y2.a) arrayList.get(i10)).f11541b;
                if (j4 > j10 && j4 > ((y2.a) arrayList.get(i10)).f11543d) {
                    arrayList.remove(i10);
                    i10--;
                } else if (j4 < j10) {
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}

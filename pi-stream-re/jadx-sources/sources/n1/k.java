package n1;

import c1.v;
import java.util.ArrayList;
import java.util.List;
import r6.o0;

/* loaded from: classes.dex */
public final class k extends m implements m1.k {

    /* renamed from: h, reason: collision with root package name */
    public final n f7955h;

    public k(long j4, v vVar, o0 o0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(vVar, o0Var, nVar, arrayList, list, list2);
        this.f7955h = nVar;
    }

    @Override // n1.m
    public final String a() {
        return null;
    }

    @Override // m1.k
    public final long b(long j4) {
        return this.f7955h.g(j4);
    }

    @Override // m1.k
    public final long c(long j4, long j10) {
        return this.f7955h.f(j4, j10);
    }

    @Override // m1.k
    public final long d(long j4, long j10) {
        return this.f7955h.e(j4, j10);
    }

    @Override // m1.k
    public final long e(long j4, long j10) {
        return this.f7955h.c(j4, j10);
    }

    @Override // m1.k
    public final long f(long j4, long j10) {
        n nVar = this.f7955h;
        if (nVar.f7968f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j4, j10) + nVar.c(j4, j10);
        return (nVar.e(b10, j4) + nVar.g(b10)) - nVar.f7971i;
    }

    @Override // m1.k
    public final j g(long j4) {
        return this.f7955h.h(j4, this);
    }

    @Override // m1.k
    public final boolean h() {
        return this.f7955h.i();
    }

    @Override // m1.k
    public final long i() {
        return this.f7955h.f7966d;
    }

    @Override // m1.k
    public final long j(long j4) {
        return this.f7955h.d(j4);
    }

    @Override // m1.k
    public final long k(long j4, long j10) {
        return this.f7955h.b(j4, j10);
    }

    @Override // n1.m
    public final m1.k l() {
        return this;
    }

    @Override // n1.m
    public final j m() {
        return null;
    }
}

package y2;

import java.util.List;

/* loaded from: classes.dex */
public abstract class j extends i1.i implements d {

    /* renamed from: d, reason: collision with root package name */
    public d f11561d;

    /* renamed from: e, reason: collision with root package name */
    public long f11562e;

    @Override // y2.d
    public final int a(long j4) {
        d dVar = this.f11561d;
        dVar.getClass();
        return dVar.a(j4 - this.f11562e);
    }

    @Override // y2.d
    public final long b(int i10) {
        d dVar = this.f11561d;
        dVar.getClass();
        return dVar.b(i10) + this.f11562e;
    }

    @Override // y2.d
    public final List c(long j4) {
        d dVar = this.f11561d;
        dVar.getClass();
        return dVar.c(j4 - this.f11562e);
    }

    @Override // y2.d
    public final int d() {
        d dVar = this.f11561d;
        dVar.getClass();
        return dVar.d();
    }

    @Override // i1.i
    public final void h() {
        super.h();
        this.f11561d = null;
    }

    public final void j(long j4, d dVar, long j10) {
        this.f5267c = j4;
        this.f11561d = dVar;
        if (j10 != Long.MAX_VALUE) {
            j4 = j10;
        }
        this.f11562e = j4;
    }
}

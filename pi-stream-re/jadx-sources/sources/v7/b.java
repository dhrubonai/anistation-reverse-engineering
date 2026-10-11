package v7;

import h7.l;

/* loaded from: classes.dex */
public final class b extends i7.h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f10672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f10673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, c cVar, int i10) {
        super(1);
        this.f10671a = i10;
        this.f10672b = eVar;
        this.f10673c = cVar;
    }

    public final void b(Throwable th) {
        int i10 = this.f10671a;
        e eVar = this.f10672b;
        c cVar = this.f10673c;
        switch (i10) {
            case 0:
                eVar.c(cVar.f10675b);
                return;
            default:
                e.f10677h.set(eVar, cVar.f10675b);
                eVar.c(cVar.f10675b);
                return;
        }
    }

    @Override // h7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        w6.f fVar = w6.f.f11019a;
        switch (this.f10671a) {
            case 0:
                b((Throwable) obj);
                return fVar;
            default:
                b((Throwable) obj);
                return fVar;
        }
    }
}

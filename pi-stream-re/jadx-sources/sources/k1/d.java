package k1;

import r6.o0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements f1.l, f1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6351d;

    public /* synthetic */ d(int i10, int i11, long j4, Object obj) {
        this.f6348a = i11;
        this.f6349b = obj;
        this.f6351d = j4;
        this.f6350c = i10;
    }

    @Override // f1.c
    public final void accept(Object obj) {
        long j4;
        boolean z9;
        y2.o oVar = (y2.o) this.f6349b;
        y2.a aVar = (y2.a) obj;
        w7.b.w(oVar.f11578i);
        w1.o oVar2 = oVar.f11572c;
        o0 o0Var = aVar.f11540a;
        oVar2.getClass();
        byte[] s9 = w1.o.s(aVar.f11542c, o0Var);
        f1.t tVar = oVar.f11573d;
        tVar.getClass();
        tVar.E(s9, s9.length);
        oVar.f11570a.f(s9.length, tVar);
        int i10 = this.f6350c & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        long j10 = aVar.f11541b;
        long j11 = this.f6351d;
        if (j10 == -9223372036854775807L) {
            if (oVar.f11578i.f1938q == Long.MAX_VALUE) {
                z9 = true;
            } else {
                z9 = false;
            }
            w7.b.u(z9);
        } else {
            long j12 = oVar.f11578i.f1938q;
            if (j12 == Long.MAX_VALUE) {
                j11 += j10;
            } else {
                j4 = j10 + j12;
                oVar.f11570a.d(j4, i10, s9.length, 0, null);
            }
        }
        j4 = j11;
        oVar.f11570a.d(j4, i10, s9.length, 0, null);
    }

    @Override // f1.l
    public final void invoke(Object obj) {
        switch (this.f6348a) {
            case 0:
                ((c) obj).getClass();
                return;
            default:
                ((c) obj).getClass();
                return;
        }
    }

    public /* synthetic */ d(int i10, long j4, b bVar) {
        this.f6348a = 1;
        this.f6349b = bVar;
        this.f6350c = i10;
        this.f6351d = j4;
    }
}

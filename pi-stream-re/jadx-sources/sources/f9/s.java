package f9;

import java.io.IOException;

/* loaded from: classes.dex */
public final class s extends b9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f4076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4078g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, t tVar, int i10, long j4) {
        super(str, true);
        this.f4076e = tVar;
        this.f4077f = i10;
        this.f4078g = j4;
    }

    @Override // b9.a
    public final long a() {
        t tVar = this.f4076e;
        try {
            tVar.P.H(this.f4077f, this.f4078g);
            return -1L;
        } catch (IOException e10) {
            tVar.f(e10);
            return -1L;
        }
    }
}

package f9;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends b9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f4055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4057g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, t tVar, int i10, int i11) {
        super(str, true);
        this.f4055e = tVar;
        this.f4056f = i10;
        this.f4057g = i11;
    }

    @Override // b9.a
    public final long a() {
        int i10 = this.f4056f;
        int i11 = this.f4057g;
        t tVar = this.f4055e;
        tVar.getClass();
        try {
            tVar.P.v(i10, i11, true);
            return -1L;
        } catch (IOException e10) {
            tVar.f(e10);
            return -1L;
        }
    }
}

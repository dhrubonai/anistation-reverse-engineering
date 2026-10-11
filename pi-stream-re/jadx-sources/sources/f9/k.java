package f9;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends b9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f4053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4054g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, t tVar, Object obj, int i10) {
        super(str, true);
        this.f4052e = i10;
        this.f4053f = tVar;
        this.f4054g = obj;
    }

    @Override // b9.a
    public final long a() {
        switch (this.f4052e) {
            case 0:
                t tVar = this.f4053f;
                tVar.f4080b.a(tVar, (f0) ((i7.k) this.f4054g).f5412a);
                return -1L;
            default:
                try {
                    this.f4053f.f4080b.b((b0) this.f4054g);
                } catch (IOException e10) {
                    g9.l lVar = g9.l.f4517a;
                    g9.l lVar2 = g9.l.f4517a;
                    String str = "Http2Connection.Listener failure for " + this.f4053f.f4082d;
                    lVar2.getClass();
                    g9.l.i(4, str, e10);
                    try {
                        ((b0) this.f4054g).c(b.PROTOCOL_ERROR, e10);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
        }
    }
}

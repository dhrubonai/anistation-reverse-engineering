package f9;

import java.io.IOException;

/* loaded from: classes.dex */
public final class r extends b9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f4074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4075f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, t tVar, long j4) {
        super(str, true);
        this.f4074e = tVar;
        this.f4075f = j4;
    }

    @Override // b9.a
    public final long a() {
        t tVar;
        boolean z9;
        synchronized (this.f4074e) {
            tVar = this.f4074e;
            long j4 = tVar.E;
            long j10 = tVar.D;
            if (j4 < j10) {
                z9 = true;
            } else {
                tVar.D = j10 + 1;
                z9 = false;
            }
        }
        if (z9) {
            tVar.f(null);
            return -1L;
        }
        try {
            tVar.P.v(1, 0, false);
        } catch (IOException e10) {
            tVar.f(e10);
        }
        return this.f4075f;
    }
}

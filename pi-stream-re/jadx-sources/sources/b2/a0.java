package b2;

import c1.p1;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final z f1289a;

    /* renamed from: b, reason: collision with root package name */
    public final r f1290b;

    /* renamed from: g, reason: collision with root package name */
    public p1 f1295g;

    /* renamed from: i, reason: collision with root package name */
    public long f1297i;

    /* renamed from: c, reason: collision with root package name */
    public final q0.w f1291c = new q0.w();

    /* renamed from: d, reason: collision with root package name */
    public final c.j f1292d = new c.j();

    /* renamed from: e, reason: collision with root package name */
    public final c.j f1293e = new c.j();

    /* renamed from: f, reason: collision with root package name */
    public final f1.p f1294f = new f1.p();

    /* renamed from: h, reason: collision with root package name */
    public p1 f1296h = p1.f1878e;

    /* renamed from: j, reason: collision with root package name */
    public long f1298j = -9223372036854775807L;

    public a0(d dVar, r rVar) {
        this.f1289a = dVar;
        this.f1290b = rVar;
    }

    public static Object b(c.j jVar) {
        int i10;
        boolean z9;
        synchronized (jVar) {
            i10 = jVar.f1595b;
        }
        if (i10 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        while (jVar.h() > 1) {
            jVar.e();
        }
        Object e10 = jVar.e();
        e10.getClass();
        return e10;
    }

    public final void a() {
        int i10;
        f1.p pVar = this.f1294f;
        pVar.f3839a = 0;
        pVar.f3840b = -1;
        pVar.f3841c = 0;
        this.f1298j = -9223372036854775807L;
        c.j jVar = this.f1293e;
        synchronized (jVar) {
            i10 = jVar.f1595b;
        }
        if (i10 > 0) {
            jVar.a(Long.valueOf(((Long) b(jVar)).longValue()), 0L);
        }
        p1 p1Var = this.f1295g;
        c.j jVar2 = this.f1292d;
        if (p1Var == null) {
            if (jVar2.h() > 0) {
                this.f1295g = (p1) b(jVar2);
                return;
            }
            return;
        }
        jVar2.b();
    }
}

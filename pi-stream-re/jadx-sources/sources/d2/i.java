package d2;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final d f3152a;

    /* renamed from: b, reason: collision with root package name */
    public final h f3153b;

    /* renamed from: c, reason: collision with root package name */
    public e f3154c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3155d;

    public i(f fVar, h hVar, long j4, long j10, long j11, long j12, long j13, int i10) {
        this.f3153b = hVar;
        this.f3155d = i10;
        this.f3152a = new d(fVar, j4, j10, j11, j12, j13);
    }

    public static int b(q qVar, long j4, t tVar) {
        if (j4 == qVar.q()) {
            return 0;
        }
        tVar.f3191a = j4;
        return 1;
    }

    public final int a(q qVar, t tVar) {
        boolean z9;
        while (true) {
            e eVar = this.f3154c;
            w7.b.w(eVar);
            long j4 = eVar.f3133f;
            long j10 = eVar.f3134g;
            long j11 = eVar.f3135h;
            long j12 = j10 - j4;
            long j13 = this.f3155d;
            h hVar = this.f3153b;
            if (j12 <= j13) {
                this.f3154c = null;
                hVar.E();
                return b(qVar, j4, tVar);
            }
            long q9 = j11 - qVar.q();
            if (q9 >= 0 && q9 <= 262144) {
                qVar.h((int) q9);
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                return b(qVar, j11, tVar);
            }
            qVar.g();
            g z10 = hVar.z(qVar, eVar.f3129b);
            int i10 = z10.f3144c;
            if (i10 != -3) {
                long j14 = z10.f3142a;
                long j15 = z10.f3143b;
                if (i10 != -2) {
                    if (i10 != -1) {
                        if (i10 == 0) {
                            long q10 = j15 - qVar.q();
                            if (q10 >= 0 && q10 <= 262144) {
                                qVar.h((int) q10);
                            }
                            this.f3154c = null;
                            hVar.E();
                            return b(qVar, j15, tVar);
                        }
                        throw new IllegalStateException("Invalid case");
                    }
                    eVar.f3132e = j14;
                    eVar.f3134g = j15;
                    eVar.f3135h = e.a(eVar.f3129b, eVar.f3131d, j14, eVar.f3133f, j15, eVar.f3130c);
                } else {
                    eVar.f3131d = j14;
                    eVar.f3133f = j15;
                    eVar.f3135h = e.a(eVar.f3129b, j14, eVar.f3132e, j15, eVar.f3134g, eVar.f3130c);
                }
            } else {
                this.f3154c = null;
                hVar.E();
                return b(qVar, j11, tVar);
            }
        }
    }

    public final void c(long j4) {
        e eVar = this.f3154c;
        if (eVar != null && eVar.f3128a == j4) {
            return;
        }
        d dVar = this.f3152a;
        this.f3154c = new e(j4, dVar.f3114a.f(j4), dVar.f3116c, dVar.f3117d, dVar.f3118e, dVar.f3119f, dVar.f3120g);
    }
}

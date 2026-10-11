package y8;

/* loaded from: classes.dex */
public final class e extends i7.h implements h7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f11701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11702c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Object obj, Object obj2, int i10) {
        super(0);
        this.f11700a = i10;
        this.f11701b = fVar;
        this.f11702c = obj;
        this.f11703d = obj2;
    }

    @Override // h7.a
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f11700a) {
            case 0:
                return b();
            default:
                return b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b() {
        /*
            r4 = this;
            int r0 = r4.f11700a
            java.lang.Object r1 = r4.f11703d
            java.lang.Object r2 = r4.f11702c
            y8.f r3 = r4.f11701b
            switch(r0) {
                case 0: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L43
        Lc:
            w7.b r0 = r3.f11710b
            if (r0 == 0) goto L1b
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r0 = r0.A(r1, r3)
            if (r0 != 0) goto L1e
        L1b:
            r0 = r2
            java.util.List r0 = (java.util.List) r0
        L1e:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = x6.j.o0(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r0.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            java.lang.String r3 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r6.h0.r(r2, r3)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            r1.add(r2)
            goto L2b
        L42:
            return r1
        L43:
            w7.b r0 = r3.f11710b
            r6.h0.q(r0)
            y8.n r2 = (y8.n) r2
            java.util.List r2 = r2.a()
            y8.a r1 = (y8.a) r1
            y8.q r1 = r1.f11655i
            java.lang.String r1 = r1.f11783d
            java.util.List r0 = r0.A(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.e.b():java.util.List");
    }
}

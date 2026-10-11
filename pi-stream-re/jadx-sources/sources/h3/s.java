package h3;

/* loaded from: classes.dex */
public final class s implements k {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.a0 f4900a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4901b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4902c;

    /* renamed from: g, reason: collision with root package name */
    public long f4906g;

    /* renamed from: i, reason: collision with root package name */
    public String f4908i;

    /* renamed from: j, reason: collision with root package name */
    public d2.g0 f4909j;

    /* renamed from: k, reason: collision with root package name */
    public r f4910k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4911l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4913n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f4907h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final x f4903d = new x(7);

    /* renamed from: e, reason: collision with root package name */
    public final x f4904e = new x(8);

    /* renamed from: f, reason: collision with root package name */
    public final x f4905f = new x(6);

    /* renamed from: m, reason: collision with root package name */
    public long f4912m = -9223372036854775807L;
    public final f1.t o = new f1.t();

    public s(androidx.appcompat.widget.a0 a0Var, boolean z9, boolean z10) {
        this.f4900a = a0Var;
        this.f4901b = z9;
        this.f4902c = z10;
    }

    @Override // h3.k
    public final void a() {
        this.f4906g = 0L;
        this.f4913n = false;
        this.f4912m = -9223372036854775807L;
        g1.g.a(this.f4907h);
        this.f4903d.f();
        this.f4904e.f();
        this.f4905f.f();
        r rVar = this.f4910k;
        if (rVar != null) {
            rVar.f4892k = false;
            rVar.o = false;
            q qVar = rVar.f4895n;
            qVar.f4868b = false;
            qVar.f4867a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.s.b(byte[], int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0216, code lost:
    
        if (r5.f4880n != r6.f4880n) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0227, code lost:
    
        if (r5.f4881p != r6.f4881p) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0235, code lost:
    
        if (r5.f4878l != r6.f4878l) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x023b, code lost:
    
        if (r5 == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02ce, code lost:
    
        if (r6 != 1) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x028f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ee A[SYNTHETIC] */
    @Override // h3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(f1.t r31) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.s.d(f1.t):void");
    }

    @Override // h3.k
    public final void e(int i10, long j4) {
        boolean z9;
        this.f4912m = j4;
        boolean z10 = this.f4913n;
        if ((i10 & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f4913n = z9 | z10;
    }

    @Override // h3.k
    public final void f(d2.r rVar, i0 i0Var) {
        i0Var.a();
        i0Var.b();
        this.f4908i = i0Var.f4810e;
        i0Var.b();
        d2.g0 i10 = rVar.i(i0Var.f4809d, 2);
        this.f4909j = i10;
        this.f4910k = new r(i10, this.f4901b, this.f4902c);
        this.f4900a.H(rVar, i0Var);
    }

    @Override // h3.k
    public final void g() {
    }
}

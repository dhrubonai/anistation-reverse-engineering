package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ti2 implements ds1 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public bh6 b;
    public final kg5 c;
    public final String d;
    public final zi4 e;
    public final e64 f;
    public final boolean[] g = new boolean[4];
    public final si2 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, si2] */
    public ti2(kg5 kg5Var, String str) {
        this.c = kg5Var;
        this.d = str;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.h = obj;
        if (kg5Var != null) {
            this.f = new e64(178);
            this.e = new zi4();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e5  */
    @Override // defpackage.ds1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.zi4 r23) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti2.a(zi4):void");
    }

    @Override // defpackage.ds1
    public final void c() {
        io3.E(this.g);
        si2 si2Var = this.h;
        si2Var.a = false;
        si2Var.b = 0;
        si2Var.c = 0;
        e64 e64Var = this.f;
        if (e64Var != null) {
            e64Var.c();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.ds1
    public final void e() {
        this.b.getClass();
        long j = this.o;
        if (j != -9223372036854775807L) {
            boolean z = this.p;
            this.b.a(j, z ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // defpackage.ds1
    public final void f(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.ds1
    public final void g(d12 d12Var, lk6 lk6Var) {
        lk6Var.a();
        lk6Var.b();
        this.a = lk6Var.e;
        lk6Var.b();
        this.b = d12Var.G(lk6Var.d, 2);
        kg5 kg5Var = this.c;
        if (kg5Var != null) {
            kg5Var.b(d12Var, lk6Var);
        }
    }
}

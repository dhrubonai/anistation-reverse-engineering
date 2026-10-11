package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wi2 implements ds1 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final kg5 a;
    public final zi4 b;
    public final boolean[] c = new boolean[4];
    public final ui2 d;
    public final e64 e;
    public vi2 f;
    public long g;
    public String h;
    public bh6 i;
    public boolean j;
    public long k;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ui2] */
    public wi2(kg5 kg5Var) {
        this.a = kg5Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.k = -9223372036854775807L;
        this.e = new e64(178);
        this.b = new zi4();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    @Override // defpackage.ds1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.zi4 r20) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi2.a(zi4):void");
    }

    @Override // defpackage.ds1
    public final void c() {
        io3.E(this.c);
        ui2 ui2Var = this.d;
        ui2Var.a = false;
        ui2Var.c = 0;
        ui2Var.b = (byte) 0;
        vi2 vi2Var = this.f;
        if (vi2Var != null) {
            vi2Var.b = false;
            vi2Var.c = false;
            vi2Var.d = false;
            vi2Var.e = -1;
        }
        e64 e64Var = this.e;
        if (e64Var != null) {
            e64Var.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.ds1
    public final void e() {
        this.f.getClass();
        this.f.b(0, this.g, this.j);
        vi2 vi2Var = this.f;
        vi2Var.b = false;
        vi2Var.c = false;
        vi2Var.d = false;
        vi2Var.e = -1;
    }

    @Override // defpackage.ds1
    public final void f(int i, long j) {
        this.k = j;
    }

    @Override // defpackage.ds1
    public final void g(d12 d12Var, lk6 lk6Var) {
        lk6Var.a();
        lk6Var.b();
        this.h = lk6Var.e;
        lk6Var.b();
        bh6 G = d12Var.G(lk6Var.d, 2);
        this.i = G;
        this.f = new vi2(G);
        this.a.b(d12Var, lk6Var);
    }
}

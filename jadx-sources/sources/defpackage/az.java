package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class az implements b12 {
    public final zi4 a;
    public final n3 b;
    public final boolean c;
    public final w16 d;
    public byte e;
    public d12 f;
    public bz g;
    public long h;
    public sl0[] i;
    public long j;
    public sl0 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    /* JADX WARN: Type inference failed for: r2v3, types: [n3, java.lang.Object] */
    public az(int i, w16 w16Var) {
        this.d = w16Var;
        this.c = (i & 1) == 0;
        this.a = new zi4(12);
        this.b = new Object();
        this.f = new i18((byte) 26);
        this.i = new sl0[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.c12 r26, defpackage.d42 r27) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az.a(c12, d42):int");
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        zi4 zi4Var = this.a;
        c12Var.A(zi4Var.a, 0, 12);
        zi4Var.N(0);
        if (zi4Var.o() == 1179011410) {
            zi4Var.O(4);
            if (zi4Var.o() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (sl0 sl0Var : this.i) {
            if (sl0Var.l == 0) {
                sl0Var.j = 0;
            } else {
                sl0Var.j = sl0Var.o[eq6.f(sl0Var.n, j, true)];
            }
        }
        if (j == 0) {
            if (this.i.length == 0) {
                this.e = (byte) 0;
                return;
            } else {
                this.e = (byte) 3;
                return;
            }
        }
        this.e = (byte) 6;
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        this.e = (byte) 0;
        if (this.c) {
            d12Var = new tu(d12Var, this.d);
        }
        this.f = d12Var;
        this.j = -1L;
    }

    @Override // defpackage.b12
    public final void release() {
    }
}

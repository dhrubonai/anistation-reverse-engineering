package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f31 implements k16 {
    public static final rb0 z = new rb0(new pb0(3), w64.y);
    public final nw2 x;
    public final long[] y;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f31(defpackage.o15 r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f31.<init>(o15):void");
    }

    @Override // defpackage.k16
    public final int a(long j) {
        int b = eq6.b(this.y, j, false);
        if (b < this.x.size()) {
            return b;
        }
        return -1;
    }

    @Override // defpackage.k16
    public final long e(int i) {
        boolean z2;
        if (i < this.x.size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.n(z2);
        return this.y[i];
    }

    @Override // defpackage.k16
    public final List g(long j) {
        int f = eq6.f(this.y, j, false);
        if (f == -1) {
            z62 z62Var = nw2.y;
            return o15.B;
        }
        return (nw2) this.x.get(f);
    }

    @Override // defpackage.k16
    public final int h() {
        return this.x.size();
    }
}

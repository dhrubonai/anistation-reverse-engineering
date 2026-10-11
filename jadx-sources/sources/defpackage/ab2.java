package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ab2 extends la2 {
    public static final zd0 z;
    public final pa0 y;

    static {
        zd0 zd0Var = zd0.A;
        z = r18.g("0021F904");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pa0] */
    public ab2(db0 db0Var) {
        super(db0Var);
        this.y = new Object();
    }

    public final boolean a(long j) {
        pa0 pa0Var = this.y;
        long j2 = pa0Var.y;
        if (j2 < j) {
            long j3 = j - j2;
            if (this.x.j0(j3, pa0Var) == j3) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.la2, defpackage.bv5
    public final long j0(long j, pa0 pa0Var) {
        a(j);
        pa0 pa0Var2 = this.y;
        if (pa0Var2.y == 0) {
            if (j == 0) {
                return 0L;
            }
            return -1L;
        }
        long j2 = 0;
        while (true) {
            long j3 = -1;
            while (true) {
                zd0 zd0Var = z;
                j3 = pa0Var2.q(zd0Var.x[0], j3 + 1, Long.MAX_VALUE);
                if (j3 == -1 || (a(zd0Var.x.length) && pa0Var2.A(j3, zd0Var, zd0Var.d()))) {
                    break;
                }
            }
            if (j3 == -1) {
                break;
            }
            long j0 = pa0Var2.j0(j3 + 4, pa0Var);
            if (j0 < 0) {
                j0 = 0;
            }
            j2 += j0;
            if (a(5L) && pa0Var2.p(4L) == 0 && (((pa0Var2.p(2L) & 255) << 8) | (pa0Var2.p(1L) & 255)) < 2) {
                pa0Var.w0(pa0Var2.p(0L));
                pa0Var.w0(10);
                pa0Var.w0(0);
                pa0Var2.skip(3L);
            }
        }
        if (j2 < j) {
            long j02 = pa0Var2.j0(j - j2, pa0Var);
            if (j02 < 0) {
                j02 = 0;
            }
            j2 += j02;
        }
        if (j2 == 0) {
            return -1L;
        }
        return j2;
    }
}

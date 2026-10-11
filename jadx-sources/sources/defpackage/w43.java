package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w43 implements b12 {
    public d12 b;
    public byte c;
    public int d;
    public int e;
    public w04 g;
    public c12 h;
    public ok2 i;
    public t14 j;
    public final zi4 a = new zi4(2);
    public long f = -1;

    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.c12 r26, defpackage.d42 r27) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w43.a(c12, d42):int");
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        String v;
        zi4 zi4Var = this.a;
        zi4Var.K(2);
        c12Var.A(zi4Var.a, 0, 2);
        if (zi4Var.H() == 65496) {
            while (true) {
                zi4Var.K(2);
                c12Var.A(zi4Var.a, 0, 2);
                int H = zi4Var.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                zi4Var.K(2);
                c12Var.A(zi4Var.a, 0, 2);
                int H2 = zi4Var.H() - 2;
                if (H2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    c12Var.l(H2);
                } else {
                    zi4Var.K(H2);
                    c12Var.A(zi4Var.a, 0, H2);
                    if (Objects.equals(zi4Var.v(), "http://ns.adobe.com/xap/1.0/") && (v = zi4Var.v()) != null) {
                        String[] strArr = n03.v;
                        for (int i = 0; i < 4; i++) {
                            if (v.contains(strArr[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        if (j == 0) {
            this.c = (byte) 0;
            this.j = null;
        } else if (this.c == 5) {
            t14 t14Var = this.j;
            t14Var.getClass();
            t14Var.c(j, j2);
        }
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        this.b = d12Var;
    }

    public final void f() {
        d12 d12Var = this.b;
        d12Var.getClass();
        d12Var.t();
        this.b.I(new zy(-9223372036854775807L));
        this.c = (byte) 6;
    }

    @Override // defpackage.b12
    public final void release() {
        t14 t14Var = this.j;
        if (t14Var != null) {
            t14Var.getClass();
        }
    }
}

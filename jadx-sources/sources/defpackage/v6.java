package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v6 implements b12 {
    public final boolean a;
    public final zi4 d;
    public final yi0 e;
    public d12 f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final w6 b = new w6(0, null, "audio/mp4a-latm", true);
    public final zi4 c = new zi4(2048);
    public int i = -1;
    public long h = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public v6(int i) {
        this.a = i;
        zi4 zi4Var = new zi4(10);
        this.d = zi4Var;
        byte[] bArr = zi4Var.a;
        this.e = new yi0(bArr.length, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        r19.j = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        throw defpackage.bj4.a("Malformed ADTS stream", null);
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.c12 r20, defpackage.d42 r21) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6.a(c12, d42):int");
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        int f = f(c12Var);
        int i = f;
        int i2 = 0;
        int i3 = 0;
        do {
            zi4 zi4Var = this.d;
            p81 p81Var = (p81) c12Var;
            p81Var.j(zi4Var.a, 0, 2, false);
            zi4Var.N(0);
            if ((zi4Var.H() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                p81Var.j(zi4Var.a, 0, 4, false);
                yi0 yi0Var = this.e;
                yi0Var.m(14);
                int g = yi0Var.g(13);
                if (g <= 6) {
                    i++;
                    p81Var.C = 0;
                    p81Var.x(i, false);
                } else {
                    p81Var.x(g - 6, false);
                    i3 += g;
                }
            } else {
                i++;
                p81Var.C = 0;
                p81Var.x(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - f < 8192);
        return false;
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        this.k = false;
        this.b.c();
        this.g = j2;
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        this.f = d12Var;
        this.b.g(d12Var, new lk6(0, 1));
        d12Var.t();
    }

    public final int f(c12 c12Var) {
        int i = 0;
        while (true) {
            zi4 zi4Var = this.d;
            c12Var.A(zi4Var.a, 0, 10);
            zi4Var.N(0);
            if (zi4Var.D() != 4801587) {
                break;
            }
            zi4Var.O(3);
            int z = zi4Var.z();
            i += z + 10;
            c12Var.l(z);
        }
        c12Var.u();
        c12Var.l(i);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // defpackage.b12
    public final void release() {
    }
}

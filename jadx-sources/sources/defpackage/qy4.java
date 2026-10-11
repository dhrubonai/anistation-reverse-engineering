package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class qy4 extends m1 {
    public final a23 D;
    public final char[] E;
    public int F;
    public final yr G;

    public qy4(a23 a23Var, char[] cArr, g53 g53Var) {
        super(g53Var);
        this.D = a23Var;
        this.E = cArr;
        this.F = 128;
        this.G = new yr(cArr);
        G(0);
    }

    @Override // defpackage.m1
    public final int B(int i) {
        yr yrVar = this.G;
        if (i < yrVar.y) {
            return i;
        }
        this.y = i;
        r();
        if (this.y == 0 && yrVar.length() != 0) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.m1
    public int C() {
        int B;
        char c;
        int i = this.y;
        while (true) {
            B = B(i);
            if (B == -1 || !((c = this.G.x[B]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = B + 1;
        }
        this.y = B;
        return B;
    }

    @Override // defpackage.m1
    public final String D(int i, int i2) {
        yr yrVar = this.G;
        return b06.x(yrVar.x, i, Math.min(i2, yrVar.y));
    }

    public final void G(int i) {
        yr yrVar = this.G;
        char[] cArr = yrVar.x;
        if (i != 0) {
            int i2 = this.y;
            ms.y0(cArr, cArr, 0, i2, i2 + i);
        }
        int i3 = yrVar.y;
        while (true) {
            if (i == i3) {
                break;
            }
            int c = this.D.c(cArr, i, i3 - i);
            if (c == -1) {
                yrVar.y = Math.min(yrVar.x.length, i);
                this.F = -1;
                break;
            }
            i += c;
        }
        this.y = 0;
    }

    public final void H() {
        ok0 ok0Var = ok0.c;
        ok0Var.getClass();
        char[] cArr = this.E;
        cArr.getClass();
        if (cArr.length == 16384) {
            ok0Var.b(cArr);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }

    @Override // defpackage.m1
    public final void d(int i, int i2) {
        ((StringBuilder) this.C).append(this.G.x, i, i2 - i);
    }

    @Override // defpackage.m1
    public boolean e() {
        r();
        int i = this.y;
        while (true) {
            int B = B(i);
            if (B != -1) {
                char c = this.G.x[B];
                if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                    this.y = B;
                    return m1.x(c);
                }
                i = B + 1;
            } else {
                this.y = B;
                return false;
            }
        }
    }

    @Override // defpackage.m1
    public final String g() {
        String str;
        j('\"');
        int i = this.y;
        yr yrVar = this.G;
        int i2 = yrVar.y;
        char[] cArr = yrVar.x;
        int i3 = i;
        while (true) {
            if (i3 < i2) {
                if (cArr[i3] == '\"') {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 == -1) {
            int B = B(i);
            int i4 = this.y;
            if (B == -1) {
                int i5 = i4 > 0 ? i4 - 1 : i4;
                if (i4 != yrVar.y && i5 >= 0) {
                    str = String.valueOf(yrVar.x[i5]);
                } else {
                    str = "EOF";
                }
                m1.u(this, qx1.m("Expected quotation mark '\"', but had '", str, "' instead"), i5, null, 4);
                throw null;
            }
            return m(yrVar, i4, B);
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return m(yrVar, this.y, i6);
            }
        }
        this.y = i3 + 1;
        return b06.x(cArr, i, Math.min(i3, yrVar.y));
    }

    @Override // defpackage.m1
    public byte h() {
        r();
        int i = this.y;
        while (true) {
            int B = B(i);
            if (B != -1) {
                int i2 = B + 1;
                byte k = h98.k(this.G.x[B]);
                if (k != 3) {
                    this.y = i2;
                    return k;
                }
                i = i2;
            } else {
                this.y = B;
                return (byte) 10;
            }
        }
    }

    @Override // defpackage.m1
    public void j(char c) {
        r();
        int i = this.y;
        while (true) {
            int B = B(i);
            if (B != -1) {
                int i2 = B + 1;
                char c2 = this.G.x[B];
                if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                    this.y = i2;
                    if (c2 == c) {
                        return;
                    }
                    F(c);
                    throw null;
                }
                i = i2;
            } else {
                this.y = B;
                F(c);
                throw null;
            }
        }
    }

    @Override // defpackage.m1
    public final void r() {
        int i = this.G.y - this.y;
        if (i > this.F) {
            return;
        }
        G(i);
    }

    @Override // defpackage.m1
    public final CharSequence w() {
        return this.G;
    }
}

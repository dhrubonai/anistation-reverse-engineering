package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fm0 implements l7 {
    public int A;
    public Object B;
    public final /* synthetic */ byte x;
    public int y;
    public int z;

    public fm0(byte b) {
        this.x = b;
        switch (b) {
            case 2:
                this.A = 0;
                this.B = new k7[100];
                return;
            default:
                this.A = 7;
                this.B = new int[8];
                return;
        }
    }

    public static final void d0(int i) {
        if ((i & 3) == 0) {
            return;
        }
        jz7.e("Failed to parse the message.");
    }

    public static final void e0(int i) {
        if ((i & 7) == 0) {
            return;
        }
        jz7.e("Failed to parse the message.");
    }

    public void A(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 0) {
            if (i == 2) {
                int b = po0Var.b() + po0Var.A();
                do {
                    ((fw4) x13Var).add(Long.valueOf(po0Var.w()));
                } while (po0Var.b() < b);
                E(b);
                return;
            }
            throw b33.b();
        }
        do {
            ((fw4) x13Var).add(Long.valueOf(po0Var.w()));
            if (po0Var.c()) {
                return;
            } else {
                z = po0Var.z();
            }
        } while (z == this.y);
        this.A = z;
    }

    public void B(x13 x13Var, boolean z) {
        String x;
        int z2;
        po0 po0Var = (po0) this.B;
        if ((this.y & 7) != 2) {
            throw b33.b();
        }
        do {
            if (z) {
                F(2);
                x = po0Var.y();
            } else {
                F(2);
                x = po0Var.x();
            }
            ((fw4) x13Var).add(x);
            if (po0Var.c()) {
                return;
            } else {
                z2 = po0Var.z();
            }
        } while (z2 == this.y);
        this.A = z2;
    }

    public void C(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 0) {
            if (i == 2) {
                int b = po0Var.b() + po0Var.A();
                do {
                    ((fw4) x13Var).add(Integer.valueOf(po0Var.A()));
                } while (po0Var.b() < b);
                E(b);
                return;
            }
            throw b33.b();
        }
        do {
            ((fw4) x13Var).add(Integer.valueOf(po0Var.A()));
            if (po0Var.c()) {
                return;
            } else {
                z = po0Var.z();
            }
        } while (z == this.y);
        this.A = z;
    }

    public void D(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 0) {
            if (i == 2) {
                int b = po0Var.b() + po0Var.A();
                do {
                    ((fw4) x13Var).add(Long.valueOf(po0Var.B()));
                } while (po0Var.b() < b);
                E(b);
                return;
            }
            throw b33.b();
        }
        do {
            ((fw4) x13Var).add(Long.valueOf(po0Var.B()));
            if (po0Var.c()) {
                return;
            } else {
                z = po0Var.z();
            }
        } while (z == this.y);
        this.A = z;
    }

    public void E(int i) {
        if (((po0) this.B).b() == i) {
        } else {
            throw b33.e();
        }
    }

    public void F(int i) {
        if ((this.y & 7) == i) {
        } else {
            throw b33.b();
        }
    }

    public synchronized void G(int i) {
        boolean z;
        if (i < this.y) {
            z = true;
        } else {
            z = false;
        }
        this.y = i;
        if (z) {
            i();
        }
    }

    public boolean H() {
        int i;
        po0 po0Var = (po0) this.B;
        if (!po0Var.c() && (i = this.y) != this.z) {
            return po0Var.C(i);
        }
        return false;
    }

    public void I(yf7 yf7Var) {
        int l;
        int i;
        ze7 ze7Var = (ze7) this.B;
        boolean z = yf7Var instanceof eg7;
        int i2 = this.y;
        if (z) {
            eg7 eg7Var = (eg7) yf7Var;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = ze7Var.e() + ze7Var.A();
                    do {
                        eg7Var.f(ze7Var.r());
                    } while (ze7Var.e() < e);
                    c0(e);
                    return;
                }
                p65.p();
                return;
            }
            do {
                eg7Var.f(ze7Var.r());
                if (!ze7Var.d()) {
                    i = ze7Var.l();
                } else {
                    return;
                }
            } while (i == this.y);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = ze7Var.e() + ze7Var.A();
                    do {
                        yf7Var.add(Long.valueOf(ze7Var.r()));
                    } while (ze7Var.e() < e2);
                    c0(e2);
                    return;
                }
                p65.p();
                return;
            }
            do {
                yf7Var.add(Long.valueOf(ze7Var.r()));
                if (!ze7Var.d()) {
                    l = ze7Var.l();
                } else {
                    return;
                }
            } while (l == this.y);
            i = l;
        }
        this.A = i;
    }

    public void J(yf7 yf7Var) {
        int l;
        int i;
        ze7 ze7Var = (ze7) this.B;
        boolean z = yf7Var instanceof nf7;
        int i2 = this.y;
        if (z) {
            nf7 nf7Var = (nf7) yf7Var;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = ze7Var.e() + ze7Var.A();
                    do {
                        nf7Var.f(ze7Var.s());
                    } while (ze7Var.e() < e);
                    c0(e);
                    return;
                }
                p65.p();
                return;
            }
            do {
                nf7Var.f(ze7Var.s());
                if (!ze7Var.d()) {
                    i = ze7Var.l();
                } else {
                    return;
                }
            } while (i == this.y);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = ze7Var.e() + ze7Var.A();
                    do {
                        yf7Var.add(Integer.valueOf(ze7Var.s()));
                    } while (ze7Var.e() < e2);
                    c0(e2);
                    return;
                }
                p65.p();
                return;
            }
            do {
                yf7Var.add(Integer.valueOf(ze7Var.s()));
                if (!ze7Var.d()) {
                    l = ze7Var.l();
                } else {
                    return;
                }
            } while (l == this.y);
            i = l;
        }
        this.A = i;
    }

    public void K(yf7 yf7Var) {
        int l;
        int i;
        ze7 ze7Var = (ze7) this.B;
        boolean z = yf7Var instanceof eg7;
        int i2 = this.y;
        if (z) {
            eg7 eg7Var = (eg7) yf7Var;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int A = ze7Var.A();
                    e0(A);
                    int e = ze7Var.e() + A;
                    do {
                        eg7Var.f(ze7Var.t());
                    } while (ze7Var.e() < e);
                    return;
                }
                p65.p();
                return;
            }
            do {
                eg7Var.f(ze7Var.t());
                if (!ze7Var.d()) {
                    i = ze7Var.l();
                } else {
                    return;
                }
            } while (i == this.y);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    int A2 = ze7Var.A();
                    e0(A2);
                    int e2 = ze7Var.e() + A2;
                    do {
                        yf7Var.add(Long.valueOf(ze7Var.t()));
                    } while (ze7Var.e() < e2);
                    return;
                }
                p65.p();
                return;
            }
            do {
                yf7Var.add(Long.valueOf(ze7Var.t()));
                if (!ze7Var.d()) {
                    l = ze7Var.l();
                } else {
                    return;
                }
            } while (l == this.y);
            i = l;
        }
        this.A = i;
    }

    public void L(yf7 yf7Var) {
        int l;
        int i;
        ze7 ze7Var = (ze7) this.B;
        boolean z = yf7Var instanceof nf7;
        int i2 = this.y;
        if (z) {
            nf7 nf7Var = (nf7) yf7Var;
            int i3 = i2 & 7;
            if (i3 != 2) {
                if (i3 != 5) {
                    p65.p();
                    return;
                }
                do {
                    nf7Var.f(ze7Var.u());
                    if (!ze7Var.d()) {
                        i = ze7Var.l();
                    } else {
                        return;
                    }
                } while (i == this.y);
            } else {
                int A = ze7Var.A();
                d0(A);
                int e = ze7Var.e() + A;
                do {
                    nf7Var.f(ze7Var.u());
                } while (ze7Var.e() < e);
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    p65.p();
                    return;
                }
                do {
                    yf7Var.add(Integer.valueOf(ze7Var.u()));
                    if (!ze7Var.d()) {
                        l = ze7Var.l();
                    } else {
                        return;
                    }
                } while (l == this.y);
                i = l;
            } else {
                int A2 = ze7Var.A();
                d0(A2);
                int e2 = ze7Var.e() + A2;
                do {
                    yf7Var.add(Integer.valueOf(ze7Var.u()));
                } while (ze7Var.e() < e2);
                return;
            }
        }
        this.A = i;
    }

    public void M(yf7 yf7Var) {
        int l;
        ze7 ze7Var = (ze7) this.B;
        int i = this.y & 7;
        if (i != 0) {
            if (i == 2) {
                int e = ze7Var.e() + ze7Var.A();
                do {
                    yf7Var.add(Boolean.valueOf(ze7Var.v()));
                } while (ze7Var.e() < e);
                c0(e);
                return;
            }
            p65.p();
            return;
        }
        do {
            yf7Var.add(Boolean.valueOf(ze7Var.v()));
            if (!ze7Var.d()) {
                l = ze7Var.l();
            } else {
                return;
            }
        } while (l == this.y);
        this.A = l;
    }

    public void N(yf7 yf7Var, boolean z) {
        String w;
        int l;
        ze7 ze7Var = (ze7) this.B;
        if ((this.y & 7) != 2) {
            p65.p();
            return;
        }
        do {
            if (z) {
                Y(2);
                w = ze7Var.x();
            } else {
                Y(2);
                w = ze7Var.w();
            }
            yf7Var.add(w);
            if (ze7Var.d()) {
                return;
            } else {
                l = ze7Var.l();
            }
        } while (l == this.y);
        this.A = l;
    }

    public void O(yf7 yf7Var, xg7 xg7Var, ff7 ff7Var) {
        int l;
        int i = this.y;
        if ((i & 7) != 2) {
            p65.p();
            return;
        }
        do {
            mf7 a = xg7Var.a();
            Z(a, xg7Var, ff7Var);
            xg7Var.f(a);
            yf7Var.add(a);
            ze7 ze7Var = (ze7) this.B;
            if (!ze7Var.d() && this.A == 0) {
                l = ze7Var.l();
            } else {
                return;
            }
        } while (l == i);
        this.A = l;
    }

    public void P(yf7 yf7Var, xg7 xg7Var, ff7 ff7Var) {
        int l;
        int i = this.y;
        if ((i & 7) != 3) {
            p65.p();
            return;
        }
        do {
            mf7 a = xg7Var.a();
            a0(a, xg7Var, ff7Var);
            xg7Var.f(a);
            yf7Var.add(a);
            ze7 ze7Var = (ze7) this.B;
            if (!ze7Var.d() && this.A == 0) {
                l = ze7Var.l();
            } else {
                return;
            }
        } while (l == i);
        this.A = l;
    }

    public void Q(yf7 yf7Var) {
        int l;
        if ((this.y & 7) != 2) {
            p65.p();
            return;
        }
        do {
            yf7Var.add(g0());
            ze7 ze7Var = (ze7) this.B;
            if (ze7Var.d()) {
                return;
            } else {
                l = ze7Var.l();
            }
        } while (l == this.y);
        this.A = l;
    }

    public void R(yf7 yf7Var) {
        int l;
        int i;
        ze7 ze7Var = (ze7) this.B;
        boolean z = yf7Var instanceof nf7;
        int i2 = this.y;
        if (z) {
            nf7 nf7Var = (nf7) yf7Var;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = ze7Var.e() + ze7Var.A();
                    do {
                        nf7Var.f(ze7Var.A());
                    } while (ze7Var.e() < e);
                    c0(e);
                    return;
                }
                p65.p();
                return;
            }
            do {
                nf7Var.f(ze7Var.A());
                if (!ze7Var.d()) {
                    i = ze7Var.l();
                } else {
                    return;
                }
            } while (i == this.y);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = ze7Var.e() + ze7Var.A();
                    do {
                        yf7Var.add(Integer.valueOf(ze7Var.A()));
                    } while (ze7Var.e() < e2);
                    c0(e2);
                    return;
                }
                p65.p();
                return;
            }
            do {
                yf7Var.add(Integer.valueOf(ze7Var.A()));
                if (!ze7Var.d()) {
                    l = ze7Var.l();
                } else {
                    return;
                }
            } while (l == this.y);
            i = l;
        }
        this.A = i;
    }

    public void S(yf7 yf7Var) {
        int l;
        int i;
        ze7 ze7Var = (ze7) this.B;
        boolean z = yf7Var instanceof nf7;
        int i2 = this.y;
        if (z) {
            nf7 nf7Var = (nf7) yf7Var;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = ze7Var.e() + ze7Var.A();
                    do {
                        nf7Var.f(ze7Var.B());
                    } while (ze7Var.e() < e);
                    c0(e);
                    return;
                }
                p65.p();
                return;
            }
            do {
                nf7Var.f(ze7Var.B());
                if (!ze7Var.d()) {
                    i = ze7Var.l();
                } else {
                    return;
                }
            } while (i == this.y);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = ze7Var.e() + ze7Var.A();
                    do {
                        yf7Var.add(Integer.valueOf(ze7Var.B()));
                    } while (ze7Var.e() < e2);
                    c0(e2);
                    return;
                }
                p65.p();
                return;
            }
            do {
                yf7Var.add(Integer.valueOf(ze7Var.B()));
                if (!ze7Var.d()) {
                    l = ze7Var.l();
                } else {
                    return;
                }
            } while (l == this.y);
            i = l;
        }
        this.A = i;
    }

    public void T(yf7 yf7Var) {
        int l;
        int i;
        ze7 ze7Var = (ze7) this.B;
        boolean z = yf7Var instanceof nf7;
        int i2 = this.y;
        if (z) {
            nf7 nf7Var = (nf7) yf7Var;
            int i3 = i2 & 7;
            if (i3 != 2) {
                if (i3 != 5) {
                    p65.p();
                    return;
                }
                do {
                    nf7Var.f(ze7Var.C());
                    if (!ze7Var.d()) {
                        i = ze7Var.l();
                    } else {
                        return;
                    }
                } while (i == this.y);
            } else {
                int A = ze7Var.A();
                d0(A);
                int e = ze7Var.e() + A;
                do {
                    nf7Var.f(ze7Var.C());
                } while (ze7Var.e() < e);
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    p65.p();
                    return;
                }
                do {
                    yf7Var.add(Integer.valueOf(ze7Var.C()));
                    if (!ze7Var.d()) {
                        l = ze7Var.l();
                    } else {
                        return;
                    }
                } while (l == this.y);
                i = l;
            } else {
                int A2 = ze7Var.A();
                d0(A2);
                int e2 = ze7Var.e() + A2;
                do {
                    yf7Var.add(Integer.valueOf(ze7Var.C()));
                } while (ze7Var.e() < e2);
                return;
            }
        }
        this.A = i;
    }

    public void U(yf7 yf7Var) {
        int l;
        int i;
        ze7 ze7Var = (ze7) this.B;
        boolean z = yf7Var instanceof eg7;
        int i2 = this.y;
        if (z) {
            eg7 eg7Var = (eg7) yf7Var;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int A = ze7Var.A();
                    e0(A);
                    int e = ze7Var.e() + A;
                    do {
                        eg7Var.f(ze7Var.D());
                    } while (ze7Var.e() < e);
                    return;
                }
                p65.p();
                return;
            }
            do {
                eg7Var.f(ze7Var.D());
                if (!ze7Var.d()) {
                    i = ze7Var.l();
                } else {
                    return;
                }
            } while (i == this.y);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    int A2 = ze7Var.A();
                    e0(A2);
                    int e2 = ze7Var.e() + A2;
                    do {
                        yf7Var.add(Long.valueOf(ze7Var.D()));
                    } while (ze7Var.e() < e2);
                    return;
                }
                p65.p();
                return;
            }
            do {
                yf7Var.add(Long.valueOf(ze7Var.D()));
                if (!ze7Var.d()) {
                    l = ze7Var.l();
                } else {
                    return;
                }
            } while (l == this.y);
            i = l;
        }
        this.A = i;
    }

    public void V(yf7 yf7Var) {
        int l;
        int i;
        ze7 ze7Var = (ze7) this.B;
        boolean z = yf7Var instanceof nf7;
        int i2 = this.y;
        if (z) {
            nf7 nf7Var = (nf7) yf7Var;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = ze7Var.e() + ze7Var.A();
                    do {
                        nf7Var.f(ze7Var.E());
                    } while (ze7Var.e() < e);
                    c0(e);
                    return;
                }
                p65.p();
                return;
            }
            do {
                nf7Var.f(ze7Var.E());
                if (!ze7Var.d()) {
                    i = ze7Var.l();
                } else {
                    return;
                }
            } while (i == this.y);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = ze7Var.e() + ze7Var.A();
                    do {
                        yf7Var.add(Integer.valueOf(ze7Var.E()));
                    } while (ze7Var.e() < e2);
                    c0(e2);
                    return;
                }
                p65.p();
                return;
            }
            do {
                yf7Var.add(Integer.valueOf(ze7Var.E()));
                if (!ze7Var.d()) {
                    l = ze7Var.l();
                } else {
                    return;
                }
            } while (l == this.y);
            i = l;
        }
        this.A = i;
    }

    public void W(yf7 yf7Var) {
        int l;
        int i;
        ze7 ze7Var = (ze7) this.B;
        boolean z = yf7Var instanceof eg7;
        int i2 = this.y;
        if (z) {
            eg7 eg7Var = (eg7) yf7Var;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = ze7Var.e() + ze7Var.A();
                    do {
                        eg7Var.f(ze7Var.F());
                    } while (ze7Var.e() < e);
                    c0(e);
                    return;
                }
                p65.p();
                return;
            }
            do {
                eg7Var.f(ze7Var.F());
                if (!ze7Var.d()) {
                    i = ze7Var.l();
                } else {
                    return;
                }
            } while (i == this.y);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = ze7Var.e() + ze7Var.A();
                    do {
                        yf7Var.add(Long.valueOf(ze7Var.F()));
                    } while (ze7Var.e() < e2);
                    c0(e2);
                    return;
                }
                p65.p();
                return;
            }
            do {
                yf7Var.add(Long.valueOf(ze7Var.F()));
                if (!ze7Var.d()) {
                    l = ze7Var.l();
                } else {
                    return;
                }
            } while (l == this.y);
            i = l;
        }
        this.A = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x007e, code lost:
    
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
    
        r1.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X(defpackage.gg7 r12, defpackage.xf6 r13, defpackage.ff7 r14) {
        /*
            r11 = this;
            r0 = 2
            r11.Y(r0)
            java.lang.Object r1 = r11.B
            ze7 r1 = (defpackage.ze7) r1
            int r2 = r1.A()
            int r2 = r1.a(r2)
            java.lang.Object r3 = r13.A
            java.lang.String r4 = ""
            r5 = r3
        L15:
            int r6 = r11.f0()     // Catch: java.lang.Throwable -> L49
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L7e
            boolean r7 = r1.d()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L25
            goto L7e
        L25:
            r7 = 1
            r8 = 0
            java.lang.String r9 = "Unable to parse map entry."
            if (r6 == r7) goto L5a
            if (r6 == r0) goto L4d
            boolean r6 = r1.d()     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            if (r6 != 0) goto L3f
            int r6 = r11.y     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            int r7 = r11.z     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            if (r6 != r7) goto L3a
            goto L3f
        L3a:
            boolean r6 = r1.n(r6)     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            goto L40
        L3f:
            r6 = r8
        L40:
            if (r6 == 0) goto L43
            goto L15
        L43:
            ag7 r6 = new ag7     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            throw r6     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
        L49:
            r11 = move-exception
            goto L85
        L4b:
            r6 = move-exception
            goto L64
        L4d:
            java.lang.Object r6 = r13.z     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            lh7 r6 = (defpackage.lh7) r6     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            java.lang.Object r5 = r11.b0(r6, r7, r14)     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            goto L15
        L5a:
            java.lang.Object r6 = r13.y     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            lh7 r6 = (defpackage.lh7) r6     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            r7 = 0
            java.lang.Object r4 = r11.b0(r6, r7, r7)     // Catch: java.lang.Throwable -> L49 defpackage.zf7 -> L4b
            goto L15
        L64:
            boolean r7 = r1.d()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L75
            int r7 = r11.y     // Catch: java.lang.Throwable -> L49
            int r10 = r11.z     // Catch: java.lang.Throwable -> L49
            if (r7 != r10) goto L71
            goto L75
        L71:
            boolean r8 = r1.n(r7)     // Catch: java.lang.Throwable -> L49
        L75:
            if (r8 == 0) goto L78
            goto L15
        L78:
            ag7 r11 = new ag7     // Catch: java.lang.Throwable -> L49
            r11.<init>(r9, r6)     // Catch: java.lang.Throwable -> L49
            throw r11     // Catch: java.lang.Throwable -> L49
        L7e:
            r12.put(r4, r5)     // Catch: java.lang.Throwable -> L49
            r1.b(r2)
            return
        L85:
            r1.b(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm0.X(gg7, xf6, ff7):void");
    }

    public void Y(int i) {
        if ((this.y & 7) == i) {
            return;
        }
        p65.p();
    }

    public void Z(Object obj, xg7 xg7Var, ff7 ff7Var) {
        ze7 ze7Var = (ze7) this.B;
        int A = ze7Var.A();
        if (ze7Var.a + ze7Var.b < 100) {
            int a = ze7Var.a(A);
            ze7Var.a++;
            xg7Var.j(obj, this, ff7Var);
            ze7Var.m(0);
            ze7Var.a--;
            ze7Var.b(a);
            return;
        }
        jz7.e("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    @Override // defpackage.l7
    public synchronized void a(g90 g90Var) {
        while (g90Var != null) {
            k7[] k7VarArr = (k7[]) this.B;
            int i = this.A;
            this.A = i + 1;
            k7 k7Var = (k7) g90Var.z;
            k7Var.getClass();
            k7VarArr[i] = k7Var;
            this.z--;
            g90Var = (g90) g90Var.A;
            if (g90Var == null || ((k7) g90Var.z) == null) {
                g90Var = null;
            }
        }
    }

    public void a0(Object obj, xg7 xg7Var, ff7 ff7Var) {
        int i = this.z;
        this.z = ((this.y >>> 3) << 3) | 4;
        try {
            xg7Var.j(obj, this, ff7Var);
            if (this.y == this.z) {
            } else {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.z = i;
        }
    }

    public void b(int i) {
        int[] iArr = (int[]) this.B;
        int i2 = this.z;
        iArr[i2] = i;
        int i3 = this.A & (i2 + 1);
        this.z = i3;
        int i4 = this.y;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy((int[]) this.B, 0, iArr2, i5, this.y);
            this.B = iArr2;
            this.y = 0;
            this.z = length;
            this.A = i6 - 1;
        }
    }

    public Object b0(lh7 lh7Var, Class cls, ff7 ff7Var) {
        ze7 ze7Var = (ze7) this.B;
        lh7 lh7Var2 = lh7.z;
        switch (lh7Var.ordinal()) {
            case 0:
                Y(1);
                return Double.valueOf(ze7Var.o());
            case 1:
                Y(5);
                return Float.valueOf(ze7Var.p());
            case 2:
                Y(0);
                return Long.valueOf(ze7Var.r());
            case 3:
                Y(0);
                return Long.valueOf(ze7Var.q());
            case 4:
                Y(0);
                return Integer.valueOf(ze7Var.s());
            case 5:
                Y(1);
                return Long.valueOf(ze7Var.t());
            case 6:
                Y(5);
                return Integer.valueOf(ze7Var.u());
            case 7:
                Y(0);
                return Boolean.valueOf(ze7Var.v());
            case 8:
                Y(2);
                return ze7Var.x();
            case 9:
            default:
                ze0.k("unsupported field type.");
                return null;
            case 10:
                Y(2);
                xg7 a = ug7.c.a(cls);
                mf7 a2 = a.a();
                Z(a2, a, ff7Var);
                a.f(a2);
                return a2;
            case 11:
                return g0();
            case 12:
                Y(0);
                return Integer.valueOf(ze7Var.A());
            case 13:
                Y(0);
                return Integer.valueOf(ze7Var.B());
            case 14:
                Y(5);
                return Integer.valueOf(ze7Var.C());
            case 15:
                Y(1);
                return Long.valueOf(ze7Var.D());
            case 16:
                Y(0);
                return Integer.valueOf(ze7Var.E());
            case 17:
                Y(0);
                return Long.valueOf(ze7Var.F());
        }
    }

    public xg5 c(int i) {
        return new xg5(t80.W((bd6) this.B, i), i, 1L);
    }

    public void c0(int i) {
        if (((ze7) this.B).e() == i) {
            return;
        }
        jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.l7
    public synchronized void d(k7 k7Var) {
        k7[] k7VarArr = (k7[]) this.B;
        int i = this.A;
        this.A = i + 1;
        k7VarArr[i] = k7Var;
        this.z--;
    }

    public int e() {
        int i = this.A;
        if (i != 0) {
            this.y = i;
            this.A = 0;
        } else {
            i = ((po0) this.B).z();
            this.y = i;
        }
        if (i != 0 && i != this.z) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public int f(int i) {
        return ((hg4) this.B).A[this.z + i];
    }

    public int f0() {
        int i = this.A;
        if (i != 0) {
            this.y = i;
            this.A = 0;
        } else {
            i = ((ze7) this.B).l();
            this.y = i;
        }
        if (i != 0 && i != this.z) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.l7
    public synchronized k7 g() {
        k7 k7Var;
        try {
            int i = this.z + 1;
            this.z = i;
            int i2 = this.A;
            if (i2 > 0) {
                k7[] k7VarArr = (k7[]) this.B;
                int i3 = i2 - 1;
                this.A = i3;
                k7Var = k7VarArr[i3];
                k7Var.getClass();
                ((k7[]) this.B)[this.A] = null;
            } else {
                k7 k7Var2 = new k7(0, new byte[65536]);
                k7[] k7VarArr2 = (k7[]) this.B;
                if (i > k7VarArr2.length) {
                    this.B = (k7[]) Arrays.copyOf(k7VarArr2, k7VarArr2.length * 2);
                }
                k7Var = k7Var2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return k7Var;
    }

    public we7 g0() {
        Y(2);
        return ((ze7) this.B).y();
    }

    public Object h(int i) {
        return ((hg4) this.B).C[this.A + i];
    }

    public void h0(yf7 yf7Var) {
        int l;
        ze7 ze7Var = (ze7) this.B;
        int i = this.y & 7;
        if (i != 1) {
            if (i == 2) {
                int A = ze7Var.A();
                e0(A);
                int e = ze7Var.e() + A;
                do {
                    yf7Var.add(Double.valueOf(ze7Var.o()));
                } while (ze7Var.e() < e);
                return;
            }
            p65.p();
            return;
        }
        do {
            yf7Var.add(Double.valueOf(ze7Var.o()));
            if (!ze7Var.d()) {
                l = ze7Var.l();
            } else {
                return;
            }
        } while (l == this.y);
        this.A = l;
    }

    @Override // defpackage.l7
    public synchronized void i() {
        int max = Math.max(0, eq6.g(this.y, 65536) - this.z);
        int i = this.A;
        if (max >= i) {
            return;
        }
        Arrays.fill((k7[]) this.B, max, i, (Object) null);
        this.A = max;
    }

    public void i0(yf7 yf7Var) {
        int l;
        ze7 ze7Var = (ze7) this.B;
        int i = this.y & 7;
        if (i != 2) {
            if (i != 5) {
                p65.p();
                return;
            }
            do {
                yf7Var.add(Float.valueOf(ze7Var.p()));
                if (!ze7Var.d()) {
                    l = ze7Var.l();
                } else {
                    return;
                }
            } while (l == this.y);
            this.A = l;
            return;
        }
        int A = ze7Var.A();
        d0(A);
        int e = ze7Var.e() + A;
        do {
            yf7Var.add(Float.valueOf(ze7Var.p()));
        } while (ze7Var.e() < e);
    }

    public void j(Object obj, zb5 zb5Var, xz1 xz1Var) {
        int i = this.z;
        this.z = ((this.y >>> 3) << 3) | 4;
        try {
            zb5Var.i(obj, this, xz1Var);
            if (this.y == this.z) {
            } else {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.z = i;
        }
    }

    public void j0(yf7 yf7Var) {
        int l;
        int i;
        ze7 ze7Var = (ze7) this.B;
        boolean z = yf7Var instanceof eg7;
        int i2 = this.y;
        if (z) {
            eg7 eg7Var = (eg7) yf7Var;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = ze7Var.e() + ze7Var.A();
                    do {
                        eg7Var.f(ze7Var.q());
                    } while (ze7Var.e() < e);
                    c0(e);
                    return;
                }
                p65.p();
                return;
            }
            do {
                eg7Var.f(ze7Var.q());
                if (!ze7Var.d()) {
                    i = ze7Var.l();
                } else {
                    return;
                }
            } while (i == this.y);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = ze7Var.e() + ze7Var.A();
                    do {
                        yf7Var.add(Long.valueOf(ze7Var.q()));
                    } while (ze7Var.e() < e2);
                    c0(e2);
                    return;
                }
                p65.p();
                return;
            }
            do {
                yf7Var.add(Long.valueOf(ze7Var.q()));
                if (!ze7Var.d()) {
                    l = ze7Var.l();
                } else {
                    return;
                }
            } while (l == this.y);
            i = l;
        }
        this.A = i;
    }

    public void k(Object obj, zb5 zb5Var, xz1 xz1Var) {
        po0 po0Var = (po0) this.B;
        int A = po0Var.A();
        if (po0Var.x < 100) {
            int j = po0Var.j(A);
            po0Var.x++;
            zb5Var.i(obj, this, xz1Var);
            po0Var.a(0);
            po0Var.x--;
            po0Var.h(j);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public void l(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 0) {
            if (i == 2) {
                int b = po0Var.b() + po0Var.A();
                do {
                    ((fw4) x13Var).add(Boolean.valueOf(po0Var.k()));
                } while (po0Var.b() < b);
                E(b);
                return;
            }
            throw b33.b();
        }
        do {
            ((fw4) x13Var).add(Boolean.valueOf(po0Var.k()));
            if (po0Var.c()) {
                return;
            } else {
                z = po0Var.z();
            }
        } while (z == this.y);
        this.A = z;
    }

    public xd0 m() {
        F(2);
        return ((po0) this.B).l();
    }

    public void n(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        if ((this.y & 7) != 2) {
            throw b33.b();
        }
        do {
            ((fw4) x13Var).add(m());
            if (po0Var.c()) {
                return;
            } else {
                z = po0Var.z();
            }
        } while (z == this.y);
        this.A = z;
    }

    @Override // defpackage.l7
    public int o() {
        return 65536;
    }

    public void p(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 1) {
            if (i == 2) {
                int A = po0Var.A();
                if ((A & 7) == 0) {
                    int b = po0Var.b() + A;
                    do {
                        ((fw4) x13Var).add(Double.valueOf(po0Var.m()));
                    } while (po0Var.b() < b);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw b33.b();
        }
        do {
            ((fw4) x13Var).add(Double.valueOf(po0Var.m()));
            if (po0Var.c()) {
                return;
            } else {
                z = po0Var.z();
            }
        } while (z == this.y);
        this.A = z;
    }

    public void q(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 0) {
            if (i == 2) {
                int b = po0Var.b() + po0Var.A();
                do {
                    ((fw4) x13Var).add(Integer.valueOf(po0Var.n()));
                } while (po0Var.b() < b);
                E(b);
                return;
            }
            throw b33.b();
        }
        do {
            ((fw4) x13Var).add(Integer.valueOf(po0Var.n()));
            if (po0Var.c()) {
                return;
            } else {
                z = po0Var.z();
            }
        } while (z == this.y);
        this.A = z;
    }

    public Object r(v67 v67Var, Class cls, xz1 xz1Var) {
        po0 po0Var = (po0) this.B;
        switch (v67Var.ordinal()) {
            case 0:
                F(1);
                return Double.valueOf(po0Var.m());
            case 1:
                F(5);
                return Float.valueOf(po0Var.q());
            case 2:
                F(0);
                return Long.valueOf(po0Var.s());
            case 3:
                F(0);
                return Long.valueOf(po0Var.B());
            case 4:
                F(0);
                return Integer.valueOf(po0Var.r());
            case 5:
                F(1);
                return Long.valueOf(po0Var.p());
            case 6:
                F(5);
                return Integer.valueOf(po0Var.o());
            case 7:
                F(0);
                return Boolean.valueOf(po0Var.k());
            case 8:
                F(2);
                return po0Var.y();
            case 9:
            default:
                ze0.k("unsupported field type.");
                return null;
            case 10:
                F(2);
                zb5 a = ew4.c.a(cls);
                vd2 d = a.d();
                k(d, a, xz1Var);
                a.b(d);
                return d;
            case 11:
                return m();
            case 12:
                F(0);
                return Integer.valueOf(po0Var.A());
            case 13:
                F(0);
                return Integer.valueOf(po0Var.n());
            case 14:
                F(5);
                return Integer.valueOf(po0Var.t());
            case 15:
                F(1);
                return Long.valueOf(po0Var.u());
            case 16:
                F(0);
                return Integer.valueOf(po0Var.v());
            case 17:
                F(0);
                return Long.valueOf(po0Var.w());
        }
    }

    public void s(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 2) {
            if (i != 5) {
                throw b33.b();
            }
            do {
                ((fw4) x13Var).add(Integer.valueOf(po0Var.o()));
                if (!po0Var.c()) {
                    z = po0Var.z();
                } else {
                    return;
                }
            } while (z == this.y);
            this.A = z;
            return;
        }
        int A = po0Var.A();
        if ((A & 3) == 0) {
            int b = po0Var.b() + A;
            do {
                ((fw4) x13Var).add(Integer.valueOf(po0Var.o()));
            } while (po0Var.b() < b);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void t(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 1) {
            if (i == 2) {
                int A = po0Var.A();
                if ((A & 7) == 0) {
                    int b = po0Var.b() + A;
                    do {
                        ((fw4) x13Var).add(Long.valueOf(po0Var.p()));
                    } while (po0Var.b() < b);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw b33.b();
        }
        do {
            ((fw4) x13Var).add(Long.valueOf(po0Var.p()));
            if (po0Var.c()) {
                return;
            } else {
                z = po0Var.z();
            }
        } while (z == this.y);
        this.A = z;
    }

    public String toString() {
        switch (this.x) {
            case 4:
                int i = this.y;
                bd6 bd6Var = (bd6) this.B;
                c45 W = t80.W(bd6Var, i);
                int i2 = this.z;
                c45 W2 = t80.W(bd6Var, i2);
                int i3 = this.A;
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                sb.append(i);
                sb.append("-");
                sb.append(W);
                sb.append(",");
                sb.append(i2);
                sb.append("-");
                sb.append(W2);
                sb.append("), prevOffset=");
                return zo5.k(i3, ")", sb);
            default:
                return super.toString();
        }
    }

    public void u(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 2) {
            if (i != 5) {
                throw b33.b();
            }
            do {
                ((fw4) x13Var).add(Float.valueOf(po0Var.q()));
                if (!po0Var.c()) {
                    z = po0Var.z();
                } else {
                    return;
                }
            } while (z == this.y);
            this.A = z;
            return;
        }
        int A = po0Var.A();
        if ((A & 3) == 0) {
            int b = po0Var.b() + A;
            do {
                ((fw4) x13Var).add(Float.valueOf(po0Var.q()));
            } while (po0Var.b() < b);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void v(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 0) {
            if (i == 2) {
                int b = po0Var.b() + po0Var.A();
                do {
                    ((fw4) x13Var).add(Integer.valueOf(po0Var.r()));
                } while (po0Var.b() < b);
                E(b);
                return;
            }
            throw b33.b();
        }
        do {
            ((fw4) x13Var).add(Integer.valueOf(po0Var.r()));
            if (po0Var.c()) {
                return;
            } else {
                z = po0Var.z();
            }
        } while (z == this.y);
        this.A = z;
    }

    public void w(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 0) {
            if (i == 2) {
                int b = po0Var.b() + po0Var.A();
                do {
                    ((fw4) x13Var).add(Long.valueOf(po0Var.s()));
                } while (po0Var.b() < b);
                E(b);
                return;
            }
            throw b33.b();
        }
        do {
            ((fw4) x13Var).add(Long.valueOf(po0Var.s()));
            if (po0Var.c()) {
                return;
            } else {
                z = po0Var.z();
            }
        } while (z == this.y);
        this.A = z;
    }

    public void x(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 2) {
            if (i != 5) {
                throw b33.b();
            }
            do {
                ((fw4) x13Var).add(Integer.valueOf(po0Var.t()));
                if (!po0Var.c()) {
                    z = po0Var.z();
                } else {
                    return;
                }
            } while (z == this.y);
            this.A = z;
            return;
        }
        int A = po0Var.A();
        if ((A & 3) == 0) {
            int b = po0Var.b() + A;
            do {
                ((fw4) x13Var).add(Integer.valueOf(po0Var.t()));
            } while (po0Var.b() < b);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void y(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 1) {
            if (i == 2) {
                int A = po0Var.A();
                if ((A & 7) == 0) {
                    int b = po0Var.b() + A;
                    do {
                        ((fw4) x13Var).add(Long.valueOf(po0Var.u()));
                    } while (po0Var.b() < b);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw b33.b();
        }
        do {
            ((fw4) x13Var).add(Long.valueOf(po0Var.u()));
            if (po0Var.c()) {
                return;
            } else {
                z = po0Var.z();
            }
        } while (z == this.y);
        this.A = z;
    }

    public void z(x13 x13Var) {
        int z;
        po0 po0Var = (po0) this.B;
        int i = this.y & 7;
        if (i != 0) {
            if (i == 2) {
                int b = po0Var.b() + po0Var.A();
                do {
                    ((fw4) x13Var).add(Integer.valueOf(po0Var.v()));
                } while (po0Var.b() < b);
                E(b);
                return;
            }
            throw b33.b();
        }
        do {
            ((fw4) x13Var).add(Integer.valueOf(po0Var.v()));
            if (po0Var.c()) {
                return;
            } else {
                z = po0Var.z();
            }
        } while (z == this.y);
        this.A = z;
    }

    public fm0(ze7 ze7Var) {
        this.x = (byte) 5;
        this.A = 0;
        this.B = ze7Var;
        ze7Var.c = this;
    }

    public fm0(po0 po0Var) {
        this.x = (byte) 1;
        this.A = 0;
        Charset charset = y13.a;
        this.B = po0Var;
        po0Var.y = this;
    }

    public fm0(hg4 hg4Var) {
        this.x = (byte) 3;
        this.B = hg4Var;
    }

    public fm0(int i, int i2, int i3, bd6 bd6Var) {
        this.x = (byte) 4;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = bd6Var;
    }
}

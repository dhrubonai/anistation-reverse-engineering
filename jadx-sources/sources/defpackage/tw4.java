package defpackage;

import android.util.SparseArray;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tw4 implements b12 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public b42 i;
    public d12 j;
    public boolean k;
    public final tf6 a = new tf6(0);
    public final zi4 c = new zi4(CodedOutputStream.DEFAULT_BUFFER_SIZE);
    public final SparseArray b = new SparseArray();
    public final rw4 d = new rw4((byte) 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // defpackage.b12
    public final int a(c12 c12Var, d42 d42Var) {
        char c;
        int i;
        long j;
        int i2;
        int i3;
        ?? r3;
        int i4;
        long j2;
        long j3;
        long j4;
        ds1 ds1Var;
        long j5;
        long j6;
        rw4 rw4Var = this.d;
        tf6 tf6Var = rw4Var.b;
        this.j.getClass();
        long p = c12Var.p();
        int i5 = (p > (-1L) ? 1 : (p == (-1L) ? 0 : -1));
        if (i5 != 0) {
            c = 3;
            if (!rw4Var.d) {
                zi4 zi4Var = rw4Var.c;
                if (!rw4Var.f) {
                    long p2 = c12Var.p();
                    int min = (int) Math.min(20000L, p2);
                    long j7 = p2 - min;
                    if (c12Var.getPosition() != j7) {
                        d42Var.a = j7;
                        return 1;
                    }
                    zi4Var.K(min);
                    c12Var.u();
                    c12Var.A(zi4Var.a, 0, min);
                    int i6 = zi4Var.b;
                    int i7 = zi4Var.c - 4;
                    while (true) {
                        if (i7 >= i6) {
                            if (rw4.b(i7, zi4Var.a) == 442) {
                                zi4Var.N(i7 + 4);
                                long c2 = rw4.c(zi4Var);
                                if (c2 != -9223372036854775807L) {
                                    j6 = c2;
                                    break;
                                }
                            }
                            i7--;
                        } else {
                            j6 = -9223372036854775807L;
                            break;
                        }
                    }
                    rw4Var.h = j6;
                    rw4Var.f = true;
                    return 0;
                }
                if (rw4Var.h == -9223372036854775807L) {
                    rw4Var.a(c12Var);
                    return 0;
                }
                if (!rw4Var.e) {
                    int min2 = (int) Math.min(20000L, c12Var.p());
                    if (c12Var.getPosition() != 0) {
                        d42Var.a = 0L;
                        return 1;
                    }
                    zi4Var.K(min2);
                    c12Var.u();
                    c12Var.A(zi4Var.a, 0, min2);
                    int i8 = zi4Var.b;
                    int i9 = zi4Var.c;
                    while (true) {
                        if (i8 < i9 - 3) {
                            if (rw4.b(i8, zi4Var.a) == 442) {
                                zi4Var.N(i8 + 4);
                                long c3 = rw4.c(zi4Var);
                                if (c3 != -9223372036854775807L) {
                                    j5 = c3;
                                    break;
                                }
                            }
                            i8++;
                        } else {
                            j5 = -9223372036854775807L;
                            break;
                        }
                    }
                    rw4Var.g = j5;
                    rw4Var.e = true;
                    return 0;
                }
                long j8 = rw4Var.g;
                if (j8 == -9223372036854775807L) {
                    rw4Var.a(c12Var);
                    return 0;
                }
                rw4Var.i = tf6Var.c(rw4Var.h) - tf6Var.b(j8);
                rw4Var.a(c12Var);
                return 0;
            }
        } else {
            c = 3;
        }
        if (!this.k) {
            this.k = true;
            long j9 = rw4Var.i;
            if (j9 != -9223372036854775807L) {
                i2 = 8;
                i3 = 4;
                i = i5;
                i4 = 0;
                r3 = 1;
                j = 0;
                b42 b42Var = new b42(new i18((byte) 8), new l33(tf6Var), j9, j9 + 1, 0L, p, 188L, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
                this.i = b42Var;
                this.j.I(b42Var.a);
            } else {
                i = i5;
                i2 = 8;
                i3 = 4;
                r3 = 1;
                i4 = 0;
                j = 0;
                this.j.I(new zy(j9));
            }
        } else {
            i = i5;
            j = 0;
            i2 = 8;
            i3 = 4;
            r3 = 1;
            i4 = 0;
        }
        b42 b42Var2 = this.i;
        if (b42Var2 != null && b42Var2.c != null) {
            return b42Var2.a(c12Var, d42Var);
        }
        c12Var.u();
        if (i != 0) {
            j2 = p - c12Var.k();
        } else {
            j2 = -1;
        }
        if (j2 != -1 && j2 < 4) {
            f();
            return -1;
        }
        zi4 zi4Var2 = this.c;
        if (!c12Var.j(zi4Var2.a, i4, i3, r3)) {
            f();
            return -1;
        }
        zi4Var2.N(i4);
        int m = zi4Var2.m();
        if (m == 441) {
            f();
            return -1;
        }
        if (m == 442) {
            c12Var.A(zi4Var2.a, i4, 10);
            zi4Var2.N(9);
            c12Var.v((zi4Var2.A() & 7) + 14);
            return i4;
        }
        if (m == 443) {
            c12Var.A(zi4Var2.a, i4, 2);
            zi4Var2.N(i4);
            c12Var.v(zi4Var2.H() + 6);
            return i4;
        }
        if (((m & (-256)) >> 8) != r3) {
            c12Var.v(r3);
            return i4;
        }
        int i10 = m & 255;
        SparseArray sparseArray = this.b;
        sw4 sw4Var = (sw4) sparseArray.get(i10);
        if (!this.e) {
            if (sw4Var == null) {
                if (i10 == 189) {
                    ds1Var = new k3("video/mp2p");
                    this.f = r3;
                    this.h = c12Var.getPosition();
                } else if ((m & 224) == 192) {
                    ds1Var = new c24(null, i4, "video/mp2p");
                    this.f = r3;
                    this.h = c12Var.getPosition();
                } else if ((m & 240) == 224) {
                    ds1Var = new ti2(null, "video/mp2p");
                    this.g = r3;
                    this.h = c12Var.getPosition();
                } else {
                    ds1Var = null;
                }
                if (ds1Var != null) {
                    ds1Var.g(this.j, new lk6(i10, 256));
                    sw4Var = new sw4(ds1Var, this.a);
                    sparseArray.put(i10, sw4Var);
                }
            }
            if (this.f && this.g) {
                j4 = this.h + 8192;
            } else {
                j4 = 1048576;
            }
            if (c12Var.getPosition() > j4) {
                this.e = r3;
                this.j.t();
            }
        }
        c12Var.A(zi4Var2.a, i4, 2);
        zi4Var2.N(i4);
        int H = zi4Var2.H() + 6;
        if (sw4Var == null) {
            c12Var.v(H);
            return i4;
        }
        zi4Var2.K(H);
        c12Var.readFully(zi4Var2.a, i4, H);
        zi4Var2.N(6);
        ds1 ds1Var2 = sw4Var.a;
        yi0 yi0Var = sw4Var.c;
        zi4Var2.k(yi0Var.b, i4, 3);
        yi0Var.m(i4);
        int i11 = i2;
        yi0Var.o(i11);
        sw4Var.d = yi0Var.f();
        sw4Var.e = yi0Var.f();
        yi0Var.o(6);
        zi4Var2.k(yi0Var.b, i4, yi0Var.g(i11));
        yi0Var.m(i4);
        tf6 tf6Var2 = sw4Var.b;
        if (sw4Var.d) {
            yi0Var.o(i3);
            yi0Var.o(r3);
            yi0Var.o(r3);
            long g = (yi0Var.g(3) << 30) | (yi0Var.g(15) << 15) | yi0Var.g(15);
            yi0Var.o(r3);
            if (!sw4Var.f && sw4Var.e) {
                yi0Var.o(i3);
                yi0Var.o(r3);
                yi0Var.o(r3);
                yi0Var.o(r3);
                tf6Var2.b(yi0Var.g(15) | (yi0Var.g(3) << 30) | (yi0Var.g(15) << 15));
                sw4Var.f = r3;
            }
            j3 = tf6Var2.b(g);
        } else {
            j3 = j;
        }
        ds1Var2.f(i3, j3);
        ds1Var2.a(zi4Var2);
        ds1Var2.d();
        zi4Var2.M(zi4Var2.a.length);
        return i4;
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        byte[] bArr = new byte[14];
        p81 p81Var = (p81) c12Var;
        p81Var.j(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            p81Var.x(bArr[13] & 7, false);
            p81Var.j(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        long j3;
        boolean z;
        SparseArray sparseArray = this.b;
        tf6 tf6Var = this.a;
        synchronized (tf6Var) {
            j3 = tf6Var.b;
        }
        boolean z2 = true;
        if (j3 == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long d = tf6Var.d();
            if (d == -9223372036854775807L || d == 0 || d == j2) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            tf6Var.f(j2);
        }
        b42 b42Var = this.i;
        if (b42Var != null) {
            b42Var.d(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            sw4 sw4Var = (sw4) sparseArray.valueAt(i);
            sw4Var.f = false;
            sw4Var.a.c();
        }
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        this.j = d12Var;
    }

    public final void f() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i < sparseArray.size()) {
                ((sw4) sparseArray.valueAt(i)).a.e();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.b12
    public final void release() {
    }
}

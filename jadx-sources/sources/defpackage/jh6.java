package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jh6 implements te2, cf5 {
    public final Object A;
    public final Object B;
    public int x;
    public final Object y;
    public final Object z;

    public jh6(jk6 jk6Var, int i) {
        this.B = jk6Var;
        this.y = new yi0(5, new byte[5]);
        this.z = new SparseArray();
        this.A = new SparseIntArray();
        this.x = i;
    }

    @Override // defpackage.cf5
    public void a(zi4 zi4Var) {
        tf6 tf6Var;
        int i;
        tf6 tf6Var2;
        SparseArray sparseArray;
        int i2;
        yi0 yi0Var;
        int i3;
        char c;
        mk6 a;
        int i4;
        int i5;
        tf6 tf6Var3;
        SparseArray sparseArray2 = (SparseArray) this.z;
        SparseIntArray sparseIntArray = (SparseIntArray) this.A;
        yi0 yi0Var2 = (yi0) this.y;
        jk6 jk6Var = (jk6) this.B;
        SparseArray sparseArray3 = jk6Var.h;
        SparseBooleanArray sparseBooleanArray = jk6Var.i;
        rb1 rb1Var = jk6Var.f;
        List list = jk6Var.c;
        byte b = jk6Var.a;
        if (zi4Var.A() == 2) {
            if (b != 1 && b != 2 && jk6Var.n != 1) {
                tf6Var = new tf6(((tf6) list.get(0)).d());
                list.add(tf6Var);
            } else {
                tf6Var = (tf6) list.get(0);
            }
            if ((zi4Var.A() & 128) != 0) {
                zi4Var.O(1);
                int H = zi4Var.H();
                zi4Var.O(3);
                zi4Var.k(yi0Var2.b, 0, 2);
                yi0Var2.m(0);
                yi0Var2.o(3);
                jk6Var.t = yi0Var2.g(13);
                zi4Var.k(yi0Var2.b, 0, 2);
                yi0Var2.m(0);
                yi0Var2.o(4);
                zi4Var.O(yi0Var2.g(12));
                if (b == 2 && jk6Var.r == null) {
                    mk6 a2 = rb1Var.a(21, new ad(21, null, 0, null, eq6.b));
                    jk6Var.r = a2;
                    if (a2 != null) {
                        a2.b(tf6Var, jk6Var.m, new lk6(H, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a3 = zi4Var.a();
                while (a3 > 0) {
                    zi4Var.k(yi0Var2.b, 0, 5);
                    yi0Var2.m(0);
                    int g = yi0Var2.g(8);
                    yi0Var2.o(3);
                    int g2 = yi0Var2.g(13);
                    yi0Var2.o(4);
                    int g3 = yi0Var2.g(12);
                    int i6 = zi4Var.b;
                    int i7 = i6 + g3;
                    int i8 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i9 = 0;
                    int i10 = a3;
                    while (true) {
                        if (zi4Var.b < i7) {
                            int A = zi4Var.A();
                            yi0Var = yi0Var2;
                            int A2 = zi4Var.b + zi4Var.A();
                            if (A2 > i7) {
                                break;
                            }
                            SparseArray sparseArray4 = sparseArray3;
                            if (A == 5) {
                                long C = zi4Var.C();
                                if (C == 1094921523) {
                                    i8 = 129;
                                } else if (C == 1161904947) {
                                    i8 = 135;
                                } else {
                                    if (C != 1094921524) {
                                        if (C == 1212503619) {
                                            i8 = 36;
                                        }
                                    }
                                    i8 = 172;
                                }
                                i4 = A2;
                                i5 = H;
                                tf6Var3 = tf6Var;
                            } else if (A == 106) {
                                i4 = A2;
                                i5 = H;
                                tf6Var3 = tf6Var;
                                i8 = 129;
                            } else if (A == 122) {
                                i5 = H;
                                tf6Var3 = tf6Var;
                                i8 = 135;
                                i4 = A2;
                            } else {
                                if (A == 127) {
                                    int A3 = zi4Var.A();
                                    if (A3 != 21) {
                                        if (A3 == 14) {
                                            i8 = 136;
                                        } else if (A3 == 33) {
                                            i8 = 139;
                                        }
                                    }
                                    i8 = 172;
                                } else if (A == 123) {
                                    i8 = 138;
                                } else if (A == 10) {
                                    str = zi4Var.y(3, StandardCharsets.UTF_8).trim();
                                    i4 = A2;
                                    i9 = zi4Var.A();
                                    i5 = H;
                                    tf6Var3 = tf6Var;
                                } else {
                                    if (A == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (zi4Var.b < A2) {
                                            String trim = zi4Var.y(3, StandardCharsets.UTF_8).trim();
                                            zi4Var.A();
                                            tf6 tf6Var4 = tf6Var;
                                            byte[] bArr = new byte[4];
                                            zi4Var.k(bArr, 0, 4);
                                            arrayList2.add(new kk6(trim, bArr));
                                            tf6Var = tf6Var4;
                                            A2 = A2;
                                            H = H;
                                        }
                                        i4 = A2;
                                        i5 = H;
                                        tf6Var3 = tf6Var;
                                        arrayList = arrayList2;
                                        i8 = 89;
                                    } else {
                                        i4 = A2;
                                        i5 = H;
                                        tf6Var3 = tf6Var;
                                        if (A == 111) {
                                            i8 = 257;
                                        }
                                    }
                                    zi4Var.O(i4 - zi4Var.b);
                                    tf6Var = tf6Var3;
                                    yi0Var2 = yi0Var;
                                    sparseArray3 = sparseArray4;
                                    H = i5;
                                }
                                i4 = A2;
                                i5 = H;
                                tf6Var3 = tf6Var;
                            }
                            zi4Var.O(i4 - zi4Var.b);
                            tf6Var = tf6Var3;
                            yi0Var2 = yi0Var;
                            sparseArray3 = sparseArray4;
                            H = i5;
                        } else {
                            yi0Var = yi0Var2;
                            break;
                        }
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i11 = H;
                    tf6 tf6Var5 = tf6Var;
                    zi4Var.N(i7);
                    ad adVar = new ad(i8, str, i9, arrayList, Arrays.copyOfRange(zi4Var.a, i6, i7));
                    if (g == 6 || g == 5) {
                        g = i8;
                    }
                    int i12 = i10 - (g3 + 5);
                    if (b == 2) {
                        i3 = g;
                    } else {
                        i3 = g2;
                    }
                    if (sparseBooleanArray.get(i3)) {
                        c = 21;
                    } else {
                        c = 21;
                        if (b == 2 && g == 21) {
                            a = jk6Var.r;
                        } else {
                            a = rb1Var.a(g, adVar);
                        }
                        if (b != 2 || g2 < sparseIntArray.get(i3, 8192)) {
                            sparseIntArray.put(i3, g2);
                            sparseArray2.put(i3, a);
                        }
                    }
                    a3 = i12;
                    tf6Var = tf6Var5;
                    yi0Var2 = yi0Var;
                    sparseArray3 = sparseArray5;
                    H = i11;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i13 = H;
                tf6 tf6Var6 = tf6Var;
                int size = sparseIntArray.size();
                int i14 = 0;
                while (i14 < size) {
                    int keyAt = sparseIntArray.keyAt(i14);
                    int valueAt = sparseIntArray.valueAt(i14);
                    sparseBooleanArray.put(keyAt, true);
                    jk6Var.j.put(valueAt, true);
                    mk6 mk6Var = (mk6) sparseArray2.valueAt(i14);
                    if (mk6Var != null) {
                        if (mk6Var != jk6Var.r) {
                            i2 = i13;
                            tf6Var2 = tf6Var6;
                            mk6Var.b(tf6Var2, jk6Var.m, new lk6(i2, keyAt, 8192));
                        } else {
                            tf6Var2 = tf6Var6;
                            i2 = i13;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, mk6Var);
                    } else {
                        tf6Var2 = tf6Var6;
                        sparseArray = sparseArray6;
                        i2 = i13;
                    }
                    i14++;
                    sparseArray6 = sparseArray;
                    i13 = i2;
                    tf6Var6 = tf6Var2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (b == 2) {
                    if (!jk6Var.o) {
                        jk6Var.m.t();
                        jk6Var.n = 0;
                        jk6Var.o = true;
                        return;
                    }
                    return;
                }
                sparseArray7.remove(this.x);
                if (b == 1) {
                    i = 0;
                } else {
                    i = jk6Var.n - 1;
                }
                jk6Var.n = i;
                if (i == 0) {
                    jk6Var.m.t();
                    jk6Var.o = true;
                }
            }
        }
    }

    public boolean c(jh6 jh6Var, int i) {
        if (Objects.equals(((x25[]) this.y)[i], ((x25[]) jh6Var.y)[i]) && Objects.equals(((jz1[]) this.z)[i], ((jz1[]) jh6Var.z)[i])) {
            return true;
        }
        return false;
    }

    public boolean d(int i) {
        if (((x25[]) this.y)[i] != null) {
            return true;
        }
        return false;
    }

    public synchronized void e(final we2 we2Var, final long j) {
        try {
            if (this.x > 0) {
                ((ts6) this.A).f(new ss6() { // from class: za2
                    @Override // defpackage.ss6
                    public final void run() {
                        jh6 jh6Var = jh6.this;
                        ((ve2) jh6Var.z).c((oe2) jh6Var.y, we2Var, j);
                    }
                }, true);
                this.x--;
            } else {
                ((ArrayDeque) this.B).add(new ef6(we2Var, j));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void f() {
        try {
            if (!((ArrayDeque) this.B).isEmpty()) {
                ((ArrayDeque) this.B).add(new ef6(we2.e, Long.MIN_VALUE));
            } else {
                ts6 ts6Var = (ts6) this.A;
                ve2 ve2Var = (ve2) this.z;
                Objects.requireNonNull(ve2Var);
                ts6Var.f(new gj0(ve2Var, (byte) 1), true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.te2
    public synchronized void h() {
        ef6 ef6Var = (ef6) ((ArrayDeque) this.B).poll();
        byte b = 1;
        if (ef6Var == null) {
            this.x++;
            return;
        }
        ((ts6) this.A).f(new fj0(this, ef6Var, (byte) 4), true);
        ef6 ef6Var2 = (ef6) ((ArrayDeque) this.B).peek();
        if (ef6Var2 != null && ef6Var2.b == Long.MIN_VALUE) {
            ts6 ts6Var = (ts6) this.A;
            ve2 ve2Var = (ve2) this.z;
            Objects.requireNonNull(ve2Var);
            ts6Var.f(new gj0(ve2Var, b), true);
            ((ArrayDeque) this.B).remove();
        }
    }

    @Override // defpackage.te2
    public synchronized void q() {
        this.x = 0;
        ((ArrayDeque) this.B).clear();
    }

    public jh6(x25[] x25VarArr, jz1[] jz1VarArr, qh6 qh6Var, Object obj) {
        io3.n(x25VarArr.length == jz1VarArr.length);
        this.y = x25VarArr;
        this.z = (jz1[]) jz1VarArr.clone();
        this.A = qh6Var;
        this.B = obj;
        this.x = x25VarArr.length;
    }

    public jh6(oe2 oe2Var, ve2 ve2Var, ts6 ts6Var) {
        this.y = oe2Var;
        this.z = ve2Var;
        this.A = ts6Var;
        this.B = new ArrayDeque();
    }

    @Override // defpackage.cf5
    public void b(tf6 tf6Var, d12 d12Var, lk6 lk6Var) {
    }
}

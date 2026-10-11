package defpackage;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class qj4 implements Comparable {
    public static final String y;
    public final zd0 x;

    static {
        String str = File.separator;
        str.getClass();
        y = str;
    }

    public qj4(zd0 zd0Var) {
        zd0Var.getClass();
        this.x = zd0Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int c = c.c(this);
        zd0 zd0Var = this.x;
        if (c == -1) {
            c = 0;
        } else if (c < zd0Var.d() && zd0Var.i(c) == 92) {
            c++;
        }
        int d = zd0Var.d();
        int i = c;
        while (c < d) {
            if (zd0Var.i(c) == 47 || zd0Var.i(c) == 92) {
                arrayList.add(zd0Var.n(i, c));
                i = c + 1;
            }
            c++;
        }
        if (i < zd0Var.d()) {
            arrayList.add(zd0Var.n(i, zd0Var.d()));
        }
        return arrayList;
    }

    public final String b() {
        zd0 zd0Var = c.a;
        zd0 zd0Var2 = this.x;
        int k = zd0.k(zd0Var2, zd0Var);
        if (k == -1) {
            k = zd0.k(zd0Var2, c.b);
        }
        if (k != -1) {
            zd0Var2 = zd0.o(zd0Var2, k + 1, 0, 2);
        } else if (f() != null && zd0Var2.d() == 2) {
            zd0Var2 = zd0.A;
        }
        return zd0Var2.q();
    }

    public final qj4 c() {
        zd0 zd0Var = c.d;
        zd0 zd0Var2 = this.x;
        if (!a34.i(zd0Var2, zd0Var)) {
            zd0 zd0Var3 = c.a;
            if (!a34.i(zd0Var2, zd0Var3)) {
                zd0 zd0Var4 = c.b;
                if (!a34.i(zd0Var2, zd0Var4)) {
                    zd0 zd0Var5 = c.e;
                    zd0Var2.getClass();
                    zd0Var5.getClass();
                    int d = zd0Var2.d();
                    byte[] bArr = zd0Var5.x;
                    if (!zd0Var2.m(d - bArr.length, zd0Var5, bArr.length) || (zd0Var2.d() != 2 && !zd0Var2.m(zd0Var2.d() - 3, zd0Var3, 1) && !zd0Var2.m(zd0Var2.d() - 3, zd0Var4, 1))) {
                        int k = zd0.k(zd0Var2, zd0Var3);
                        if (k == -1) {
                            k = zd0.k(zd0Var2, zd0Var4);
                        }
                        if (k == 2 && f() != null) {
                            if (zd0Var2.d() != 3) {
                                return new qj4(zd0.o(zd0Var2, 0, 3, 1));
                            }
                            return null;
                        }
                        if (k == 1) {
                            zd0Var4.getClass();
                            if (zd0Var2.m(0, zd0Var4, zd0Var4.d())) {
                                return null;
                            }
                        }
                        if (k == -1 && f() != null) {
                            if (zd0Var2.d() != 2) {
                                return new qj4(zd0.o(zd0Var2, 0, 2, 1));
                            }
                            return null;
                        }
                        if (k == -1) {
                            return new qj4(zd0Var);
                        }
                        if (k == 0) {
                            return new qj4(zd0.o(zd0Var2, 0, 1, 1));
                        }
                        return new qj4(zd0.o(zd0Var2, 0, k, 1));
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qj4 qj4Var = (qj4) obj;
        qj4Var.getClass();
        return this.x.compareTo(qj4Var.x);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, pa0] */
    public final qj4 d(qj4 qj4Var) {
        qj4 qj4Var2;
        qj4Var.getClass();
        zd0 zd0Var = qj4Var.x;
        int c = c.c(this);
        zd0 zd0Var2 = this.x;
        qj4 qj4Var3 = null;
        if (c == -1) {
            qj4Var2 = null;
        } else {
            qj4Var2 = new qj4(zd0Var2.n(0, c));
        }
        int c2 = c.c(qj4Var);
        if (c2 != -1) {
            qj4Var3 = new qj4(zd0Var.n(0, c2));
        }
        if (a34.i(qj4Var2, qj4Var3)) {
            ArrayList a = a();
            ArrayList a2 = qj4Var.a();
            int min = Math.min(a.size(), a2.size());
            int i = 0;
            while (i < min && a34.i(a.get(i), a2.get(i))) {
                i++;
            }
            if (i == min && zd0Var2.d() == zd0Var.d()) {
                return r18.l(".");
            }
            if (a2.subList(i, a2.size()).indexOf(c.e) == -1) {
                if (a34.i(zd0Var, c.d)) {
                    return this;
                }
                ?? obj = new Object();
                zd0 b = c.b(qj4Var);
                if (b == null && (b = c.b(this)) == null) {
                    b = c.f(y);
                }
                int size = a2.size();
                for (int i2 = i; i2 < size; i2++) {
                    obj.u0(c.e);
                    obj.u0(b);
                }
                int size2 = a.size();
                while (i < size2) {
                    obj.u0((zd0) a.get(i));
                    obj.u0(b);
                    i++;
                }
                return c.d(obj, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + qj4Var).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + qj4Var).toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pa0] */
    public final qj4 e(String str) {
        str.getClass();
        ?? obj = new Object();
        obj.A0(str);
        return c.a(this, c.d(obj, false), false);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof qj4) && a34.i(((qj4) obj).x, this.x)) {
            return true;
        }
        return false;
    }

    public final Character f() {
        zd0 zd0Var = c.a;
        zd0 zd0Var2 = this.x;
        if (zd0.g(zd0Var2, zd0Var) == -1 && zd0Var2.d() >= 2 && zd0Var2.i(1) == 58) {
            char i = (char) zd0Var2.i(0);
            if (('a' <= i && i < '{') || ('A' <= i && i < '[')) {
                return Character.valueOf(i);
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final File toFile() {
        return new File(this.x.q());
    }

    public final String toString() {
        return this.x.q();
    }
}

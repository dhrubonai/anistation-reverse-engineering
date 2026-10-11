package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v24 {
    public final p44 a;

    public /* synthetic */ v24(p44 p44Var) {
        this.a = p44Var;
    }

    public static final void a(p44 p44Var, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int f = p44Var.f(obj);
        if (f < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj3 = null;
        } else {
            obj3 = p44Var.c[f];
        }
        if (obj3 != null) {
            if (obj3 instanceof f44) {
                f44 f44Var = (f44) obj3;
                f44Var.a(obj2);
                obj2 = f44Var;
            } else {
                Object[] objArr = ec4.a;
                f44 f44Var2 = new f44(2);
                f44Var2.a(obj3);
                f44Var2.a(obj2);
                obj2 = f44Var2;
            }
        }
        if (z) {
            int i = ~f;
            p44Var.b[i] = obj;
            p44Var.c[i] = obj2;
            return;
        }
        p44Var.c[f] = obj2;
    }

    public static final Object b(p44 p44Var, i14 i14Var) {
        Object g = p44Var.g(i14Var);
        if (g == null) {
            return null;
        }
        if (g instanceof f44) {
            f44 f44Var = (f44) g;
            if (!f44Var.i()) {
                int i = f44Var.b - 1;
                Object g2 = f44Var.g(i);
                f44Var.l(i);
                g2.getClass();
                if (f44Var.i()) {
                    p44Var.l(i14Var);
                }
                if (f44Var.b == 1) {
                    p44Var.n(i14Var, f44Var.f());
                }
                return g2;
            }
            p65.h("List is empty.");
            return null;
        }
        p44Var.l(i14Var);
        return g;
    }

    public static final void c(p44 p44Var, i14 i14Var, ub2 ub2Var) {
        Object g = p44Var.g(i14Var);
        if (g != null) {
            if (g instanceof f44) {
                f44 f44Var = (f44) g;
                int i = f44Var.b;
                Object[] objArr = f44Var.a;
                int i2 = 0;
                f13 r0 = db.r0(0, i);
                int i3 = r0.x;
                int i4 = r0.y;
                if (i3 <= i4) {
                    while (true) {
                        objArr[i3 - i2] = objArr[i3];
                        if (((Boolean) ub2Var.invoke(objArr[i3])).booleanValue()) {
                            i2++;
                        }
                        if (i3 == i4) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                ms.E0(i - i2, i, null, objArr);
                f44Var.b -= i2;
                if (f44Var.i()) {
                    p44Var.l(i14Var);
                }
                if (f44Var.b == 1) {
                    p44Var.n(i14Var, f44Var.f());
                    return;
                }
                return;
            }
            if (((Boolean) ub2Var.invoke(g)).booleanValue()) {
                p44Var.l(i14Var);
            }
        }
    }

    public static final f44 d(p44 p44Var) {
        if (p44Var.i()) {
            f44 f44Var = ec4.b;
            f44Var.getClass();
            return f44Var;
        }
        f44 f44Var2 = new f44();
        Object[] objArr = p44Var.c;
        long[] jArr = p44Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof f44) {
                                f44Var2.b((f44) obj);
                            } else {
                                obj.getClass();
                                f44Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f44Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v24) {
            if (!this.a.equals(((v24) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}

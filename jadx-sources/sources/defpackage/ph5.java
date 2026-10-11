package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ph5 implements bi5, Iterable, j73 {
    public boolean A;
    public final p44 x;
    public mn3 y;
    public boolean z;

    public ph5() {
        long[] jArr = cb5.a;
        this.x = new p44();
    }

    @Override // defpackage.bi5
    public final void b(ai5 ai5Var, Object obj) {
        boolean z = obj instanceof o3;
        p44 p44Var = this.x;
        if (z && p44Var.c(ai5Var)) {
            Object g = p44Var.g(ai5Var);
            g.getClass();
            o3 o3Var = (o3) g;
            o3 o3Var2 = (o3) obj;
            String str = o3Var2.a;
            if (str == null) {
                str = o3Var.a;
            }
            ec2 ec2Var = o3Var2.b;
            if (ec2Var == null) {
                ec2Var = o3Var.b;
            }
            p44Var.n(ai5Var, new o3(str, ec2Var));
        } else {
            p44Var.n(ai5Var, obj);
        }
        ai5Var.getClass();
    }

    public final Object c(ai5 ai5Var) {
        Object g = this.x.g(ai5Var);
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("Key not present: " + ai5Var + " - consider getOrElse or getOrNull");
    }

    public final void d(ph5 ph5Var) {
        p44 p44Var = ph5Var.x;
        Object[] objArr = p44Var.b;
        Object[] objArr2 = p44Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            ai5 ai5Var = (ai5) obj;
                            p44 p44Var2 = this.x;
                            Object g = p44Var2.g(ai5Var);
                            ai5Var.getClass();
                            Object invoke = ai5Var.b.invoke(g, obj2);
                            if (invoke != null) {
                                p44Var2.n(ai5Var, invoke);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ph5) {
                ph5 ph5Var = (ph5) obj;
                if (!this.x.equals(ph5Var.x) || this.z != ph5Var.z || this.A != ph5Var.A) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.A) + zo5.g(this.x.hashCode() * 31, 31, this.z);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        mn3 mn3Var = this.y;
        if (mn3Var == null) {
            mn3Var = new mn3(this.x);
            this.y = mn3Var;
        }
        return ((nv1) mn3Var.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.z) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.A) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        p44 p44Var = this.x;
        Object[] objArr = p44Var.b;
        Object[] objArr2 = p44Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((ai5) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return o80.K(this) + "{ " + ((Object) sb) + " }";
    }
}

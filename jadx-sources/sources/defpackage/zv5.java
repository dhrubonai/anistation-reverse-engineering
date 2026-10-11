package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zv5 implements Cloneable {
    public /* synthetic */ int[] x;
    public /* synthetic */ Object[] y;
    public /* synthetic */ int z;

    public zv5(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.x = new int[i5];
        this.y = new Object[i5];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zv5 clone() {
        Object clone = super.clone();
        clone.getClass();
        zv5 zv5Var = (zv5) clone;
        zv5Var.x = (int[]) this.x.clone();
        zv5Var.y = (Object[]) this.y.clone();
        return zv5Var;
    }

    public final void b(int i, Object obj) {
        int p = w65.p(this.z, i, this.x);
        if (p >= 0) {
            this.y[p] = obj;
            return;
        }
        int i2 = ~p;
        int i3 = this.z;
        if (i2 < i3) {
            Object[] objArr = this.y;
            if (objArr[i2] == v94.q) {
                this.x[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.x.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.x = Arrays.copyOf(this.x, i7);
            this.y = Arrays.copyOf(this.y, i7);
        }
        int i8 = this.z;
        if (i8 - i2 != 0) {
            int[] iArr = this.x;
            int i9 = i2 + 1;
            ms.w0(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.y;
            ms.x0(i9, i2, this.z, objArr2, objArr2);
        }
        this.x[i2] = i;
        this.y[i2] = obj;
        this.z++;
    }

    public final Object c(int i) {
        Object[] objArr = this.y;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.z;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.z;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.x[i3]);
            sb.append('=');
            Object c = c(i3);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

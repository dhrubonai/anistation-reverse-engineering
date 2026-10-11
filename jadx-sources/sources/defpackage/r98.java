package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r98 extends rv5 {
    public Object[] a;
    public int b;

    @Override // defpackage.rv5
    public final int h() {
        return this.b;
    }

    @Override // defpackage.rv5
    public final ia8 j(int i) {
        if (i < this.b) {
            return (ia8) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.rv5
    public final Object k(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.rv5
    public final Object l(ia8 ia8Var) {
        int n = n(ia8Var);
        if (n != -1) {
            return ia8Var.b.cast(this.a[n + n + 1]);
        }
        return null;
    }

    public final void m(ia8 ia8Var, Object obj) {
        int n;
        if (!ia8Var.c && (n = n(ia8Var)) != -1) {
            this.a[n + n + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i + i > length) {
            objArr = Arrays.copyOf(objArr, length + length);
            this.a = objArr;
        }
        int i2 = this.b;
        int i3 = i2 + i2;
        objArr[i3] = ia8Var;
        objArr[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final int n(ia8 ia8Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(ia8Var)) {
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(j(i));
            sb.append("': ");
            sb.append(k(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}

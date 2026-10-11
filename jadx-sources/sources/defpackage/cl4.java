package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class cl4 implements Iterator, j73 {
    public final pj6[] x;
    public int y;
    public boolean z = true;

    public cl4(oj6 oj6Var, pj6[] pj6VarArr) {
        this.x = pj6VarArr;
        pj6VarArr[0].a(oj6Var.d, Integer.bitCount(oj6Var.a) * 2, 0);
        this.y = 0;
        a();
    }

    public final void a() {
        int i = this.y;
        pj6[] pj6VarArr = this.x;
        pj6 pj6Var = pj6VarArr[i];
        if (pj6Var.z < pj6Var.y) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                pj6 pj6Var2 = pj6VarArr[i];
                int i2 = pj6Var2.z;
                Object[] objArr = pj6Var2.x;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    pj6Var2.z = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.y = b;
                return;
            }
            if (i > 0) {
                pj6 pj6Var3 = pj6VarArr[i - 1];
                int i3 = pj6Var3.z;
                int length2 = pj6Var3.x.length;
                pj6Var3.z = i3 + 1;
            }
            pj6VarArr[i].a(oj6.e.d, 0, 0);
            i--;
        }
        this.z = false;
    }

    public final int b(int i) {
        pj6[] pj6VarArr = this.x;
        pj6 pj6Var = pj6VarArr[i];
        int i2 = pj6Var.z;
        if (i2 < pj6Var.y) {
            return i;
        }
        Object[] objArr = pj6Var.x;
        if (i2 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i2];
            obj.getClass();
            oj6 oj6Var = (oj6) obj;
            if (i == 6) {
                pj6 pj6Var2 = pj6VarArr[i + 1];
                Object[] objArr2 = oj6Var.d;
                pj6Var2.a(objArr2, objArr2.length, 0);
            } else {
                pj6VarArr[i + 1].a(oj6Var.d, Integer.bitCount(oj6Var.a) * 2, 0);
            }
            return b(i + 1);
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.z;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.z) {
            Object next = this.x[this.y].next();
            a();
            return next;
        }
        qi2.e();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class es5 extends n2 {
    public static final es5 y = new es5(new Object[0]);
    public final Object[] x;

    public es5(Object[] objArr) {
        this.x = objArr;
    }

    @Override // defpackage.m0
    public final int b() {
        return this.x.length;
    }

    @Override // defpackage.n2
    public final n2 c(int i, Object obj) {
        Object[] objArr = this.x;
        n77.w(i, objArr.length);
        if (i == objArr.length) {
            return d(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            ms.B0(0, i, 6, objArr, objArr2);
            ms.x0(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new es5(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ms.x0(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new ll4(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.n2
    public final n2 d(Object obj) {
        Object[] objArr = this.x;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new es5(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new ll4(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.n2
    public final n2 f(Collection collection) {
        Object[] objArr = this.x;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            int length = objArr.length;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                copyOf[length] = it.next();
                length++;
            }
            return new es5(copyOf);
        }
        ml4 g = g();
        g.addAll(collection);
        return g.d();
    }

    @Override // defpackage.n2
    public final ml4 g() {
        return new ml4(this, null, this.x, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.x;
        n77.v(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.n2
    public final n2 h(m2 m2Var) {
        Object[] objArr = this.x;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) m2Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return y;
        }
        return new es5(ms.D0(objArr2, 0, length));
    }

    @Override // defpackage.n2
    public final n2 i(int i) {
        Object[] objArr = this.x;
        n77.v(i, objArr.length);
        if (objArr.length == 1) {
            return y;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        ms.x0(i, i + 1, objArr.length, objArr, copyOf);
        return new es5(copyOf);
    }

    @Override // defpackage.r1, java.util.List
    public final int indexOf(Object obj) {
        return ms.N0(this.x, obj);
    }

    @Override // defpackage.n2
    public final n2 j(int i, Object obj) {
        Object[] objArr = this.x;
        n77.v(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new es5(copyOf);
    }

    @Override // defpackage.r1, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.x;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.r1, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.x;
        n77.w(i, objArr.length);
        return new sa0(objArr, i, objArr.length);
    }
}

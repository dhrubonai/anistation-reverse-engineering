package x6;

import java.util.AbstractList;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class f extends AbstractList implements List {
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        h hVar = (h) this;
        int i11 = hVar.f11316c;
        if (i10 >= 0 && i10 < i11) {
            if (i10 == com.bumptech.glide.c.w(hVar)) {
                if (!hVar.isEmpty()) {
                    int f10 = hVar.f(com.bumptech.glide.c.w(hVar) + hVar.f11314a);
                    Object[] objArr = hVar.f11315b;
                    Object obj = objArr[f10];
                    objArr[f10] = null;
                    hVar.f11316c--;
                    return obj;
                }
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            if (i10 == 0) {
                return hVar.g();
            }
            int f11 = hVar.f(hVar.f11314a + i10);
            Object[] objArr2 = hVar.f11315b;
            Object obj2 = objArr2[f11];
            if (i10 < (hVar.f11316c >> 1)) {
                int i12 = hVar.f11314a;
                if (f11 >= i12) {
                    i.i1(objArr2, i12 + 1, objArr2, i12, f11);
                } else {
                    i.i1(objArr2, 1, objArr2, 0, f11);
                    Object[] objArr3 = hVar.f11315b;
                    objArr3[0] = objArr3[objArr3.length - 1];
                    int i13 = hVar.f11314a;
                    i.i1(objArr3, i13 + 1, objArr3, i13, objArr3.length - 1);
                }
                Object[] objArr4 = hVar.f11315b;
                int i14 = hVar.f11314a;
                objArr4[i14] = null;
                hVar.f11314a = hVar.e(i14);
            } else {
                int f12 = hVar.f(com.bumptech.glide.c.w(hVar) + hVar.f11314a);
                if (f11 <= f12) {
                    Object[] objArr5 = hVar.f11315b;
                    i.i1(objArr5, f11, objArr5, f11 + 1, f12 + 1);
                } else {
                    Object[] objArr6 = hVar.f11315b;
                    i.i1(objArr6, f11, objArr6, f11 + 1, objArr6.length);
                    Object[] objArr7 = hVar.f11315b;
                    objArr7[objArr7.length - 1] = objArr7[0];
                    i.i1(objArr7, 0, objArr7, 1, f12 + 1);
                }
                hVar.f11315b[f12] = null;
            }
            hVar.f11316c--;
            return obj2;
        }
        throw new IndexOutOfBoundsException(a3.g.p("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((h) this).f11316c;
    }
}

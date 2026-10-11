package x6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import r6.h0;

/* loaded from: classes.dex */
public abstract class i extends h0 {
    public static final List g1(Object[] objArr) {
        h0.u(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        h0.s(asList, "asList(...)");
        return asList;
    }

    public static final void h1(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        h0.u(bArr, "<this>");
        h0.u(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    public static final void i1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        h0.u(objArr, "<this>");
        h0.u(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static final byte[] j1(byte[] bArr, int i10, int i11) {
        h0.u(bArr, "<this>");
        int length = bArr.length;
        if (i11 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
            h0.s(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is greater than size (" + length + ").");
    }

    public static final void k1(Object[] objArr, int i10, int i11) {
        h0.u(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }

    public static final ArrayList l1(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final char m1(char[] cArr) {
        h0.u(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final List n1(long[] jArr) {
        h0.u(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j4 : jArr) {
                    arrayList.add(Long.valueOf(j4));
                }
                return arrayList;
            }
            return com.bumptech.glide.c.L(Long.valueOf(jArr[0]));
        }
        return o.f11318a;
    }

    public static final List o1(Object[] objArr) {
        h0.u(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new g(objArr, false));
            }
            return com.bumptech.glide.c.L(objArr[0]);
        }
        return o.f11318a;
    }
}

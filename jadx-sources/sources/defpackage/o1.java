package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class o1 implements Iterator, j73 {
    public final /* synthetic */ byte x;
    public int y;
    public final Object z;

    public o1(rv1 rv1Var) {
        this.x = (byte) 2;
        this.z = rv1Var;
        this.y = rv1Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.x;
        Object obj = this.z;
        switch (b) {
            case 0:
                if (this.y >= ((r1) obj).b()) {
                    return false;
                }
                return true;
            case 1:
                if (this.y >= ((Object[]) obj).length) {
                    return false;
                }
                return true;
            case 2:
                if (this.y <= 0) {
                    return false;
                }
                return true;
            case 3:
                if (this.y >= ((byte[]) obj).length) {
                    return false;
                }
                return true;
            case 4:
                if (this.y >= ((int[]) obj).length) {
                    return false;
                }
                return true;
            case 5:
                if (this.y >= ((long[]) obj).length) {
                    return false;
                }
                return true;
            default:
                if (this.y >= ((short[]) obj).length) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.x;
        Object obj = this.z;
        switch (b) {
            case 0:
                if (hasNext()) {
                    int i = this.y;
                    this.y = i + 1;
                    return ((r1) obj).get(i);
                }
                qi2.e();
                return null;
            case 1:
                try {
                    int i2 = this.y;
                    this.y = i2 + 1;
                    return ((Object[]) obj)[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.y--;
                    p65.h(e.getMessage());
                    return null;
                }
            case 2:
                rv1 rv1Var = (rv1) obj;
                int i3 = rv1Var.c;
                int i4 = this.y;
                this.y = i4 - 1;
                return rv1Var.e[i3 - i4];
            case 3:
                int i5 = this.y;
                byte[] bArr = (byte[]) obj;
                if (i5 < bArr.length) {
                    this.y = i5 + 1;
                    return new sl6(bArr[i5]);
                }
                p65.h(String.valueOf(i5));
                return null;
            case 4:
                int i6 = this.y;
                int[] iArr = (int[]) obj;
                if (i6 < iArr.length) {
                    this.y = i6 + 1;
                    return new xl6(iArr[i6]);
                }
                p65.h(String.valueOf(i6));
                return null;
            case 5:
                int i7 = this.y;
                long[] jArr = (long[]) obj;
                if (i7 < jArr.length) {
                    this.y = i7 + 1;
                    return new cm6(jArr[i7]);
                }
                p65.h(String.valueOf(i7));
                return null;
            default:
                int i8 = this.y;
                short[] sArr = (short[]) obj;
                if (i8 < sArr.length) {
                    this.y = i8 + 1;
                    return new km6(sArr[i8]);
                }
                p65.h(String.valueOf(i8));
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.x) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o1(Object[] objArr) {
        this.x = (byte) 1;
        objArr.getClass();
        this.z = objArr;
    }

    public /* synthetic */ o1(Object obj, byte b) {
        this.x = b;
        this.z = obj;
    }
}

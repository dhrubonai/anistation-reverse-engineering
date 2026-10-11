package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class mk0 implements CharSequence, Appendable {
    public String A;
    public boolean B;
    public int C;
    public int D;
    public final gc4 x;
    public ArrayList y;
    public char[] z;

    public mk0() {
        gc4 gc4Var = rk0.a;
        gc4Var.getClass();
        this.x = gc4Var;
    }

    public final char[] a(int i) {
        ArrayList arrayList = this.y;
        if (arrayList == null) {
            if (i < 2048) {
                char[] cArr = this.z;
                if (cArr != null) {
                    return cArr;
                }
                f(i);
                throw null;
            }
            f(i);
            throw null;
        }
        char[] cArr2 = this.z;
        cArr2.getClass();
        return (char[]) arrayList.get(i / cArr2.length);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return this;
        }
        int i3 = i;
        while (i3 < i2) {
            char[] d = d();
            int length = d.length;
            int i4 = this.C;
            int i5 = length - i4;
            int min = Math.min(i2 - i3, i4);
            for (int i6 = 0; i6 < min; i6++) {
                d[i5 + i6] = charSequence.charAt(i3 + i6);
            }
            i3 += min;
            this.C -= min;
        }
        this.A = null;
        this.D = (i2 - i) + this.D;
        return this;
    }

    public final CharSequence b(int i, int i2) {
        if (i == i2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        for (int i3 = i - (i % 2048); i3 < i2; i3 += 2048) {
            char[] a = a(i3);
            int min = Math.min(i2 - i3, 2048);
            for (int max = Math.max(0, i - i3); max < min; max++) {
                sb.append(a[max]);
            }
        }
        return sb;
    }

    public final char c(int i) {
        char[] a = a(i);
        char[] cArr = this.z;
        cArr.getClass();
        return a[i % cArr.length];
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i >= 0) {
            if (i < this.D) {
                return c(i);
            }
            ze0.e(qx1.o(qx1.s(i, "index ", " is not in range [0, "), this.D, ')'));
            return (char) 0;
        }
        ze0.e(qx1.h(i, "index is negative: "));
        return (char) 0;
    }

    public final char[] d() {
        if (this.C == 0) {
            char[] cArr = (char[]) this.x.y();
            char[] cArr2 = this.z;
            this.z = cArr;
            this.C = cArr.length;
            this.B = false;
            if (cArr2 != null) {
                ArrayList arrayList = this.y;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.y = arrayList;
                    arrayList.add(cArr2);
                }
                arrayList.add(cArr);
            }
            return cArr;
        }
        char[] cArr3 = this.z;
        cArr3.getClass();
        return cArr3;
    }

    public final void e() {
        ArrayList arrayList = this.y;
        gc4 gc4Var = this.x;
        if (arrayList != null) {
            this.z = null;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                gc4Var.i0(arrayList.get(i));
            }
        } else {
            char[] cArr = this.z;
            if (cArr != null) {
                gc4Var.i0(cArr);
            }
            this.z = null;
        }
        this.B = true;
        this.y = null;
        this.A = null;
        this.D = 0;
        this.C = 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.D == charSequence.length()) {
                int i = this.D;
                for (int i2 = 0; i2 < i; i2++) {
                    if (c(i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        if (this.B) {
            throw new IllegalStateException("Buffer is already released");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is not in range [0; ");
        char[] cArr = this.z;
        cArr.getClass();
        sb.append(cArr.length - this.C);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int hashCode() {
        String str = this.A;
        if (str != null) {
            return str.hashCode();
        }
        int i = this.D;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + c(i3);
        }
        return i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.D;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i <= i2) {
            if (i >= 0) {
                if (i2 <= this.D) {
                    return new kk0(this, i, i2);
                }
                ze0.e(qx1.o(qx1.s(i2, "endIndex (", ") is greater than length ("), this.D, ')'));
                return null;
            }
            ze0.e(qx1.h(i, "startIndex is negative: "));
            return null;
        }
        throw new IllegalArgumentException(("startIndex (" + i + ") should be less or equal to endIndex (" + i2 + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.A;
        if (str == null) {
            String obj = b(0, this.D).toString();
            this.A = obj;
            return obj;
        }
        return str;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        char[] d = d();
        char[] cArr = this.z;
        cArr.getClass();
        int length = cArr.length;
        int i = this.C;
        d[length - i] = c;
        this.A = null;
        this.C = i - 1;
        this.D++;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}

package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nd2 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final s34 e;
    public final d46 f;

    public nd2(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            ds4.a("Invalid start index");
        }
        this.d = new ArrayList();
        s34 s34Var = new s34();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            h83 h83Var = (h83) this.a.get(i3);
            int i4 = h83Var.c;
            int i5 = h83Var.d;
            s34Var.h(i4, new oi2(i3, i2, i5));
            i2 += i5;
        }
        this.e = s34Var;
        this.f = new d46(new r02(this, (byte) 1));
    }

    public final boolean a(int i, int i2) {
        oi2 oi2Var;
        int i3;
        int i4;
        s34 s34Var = this.e;
        oi2 oi2Var2 = (oi2) s34Var.b(i);
        if (oi2Var2 == null) {
            return false;
        }
        int i5 = oi2Var2.b;
        int i6 = i2 - oi2Var2.c;
        oi2Var2.c = i2;
        if (i6 != 0) {
            Object[] objArr = s34Var.c;
            long[] jArr = s34Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j) < 128 && (i3 = (oi2Var = (oi2) objArr[(i7 << 3) + i9]).b) >= i5 && oi2Var != oi2Var2 && (i4 = i3 + i6) >= 0) {
                                oi2Var.b = i4;
                            }
                            j >>= 8;
                        }
                        if (i8 != 8) {
                            return true;
                        }
                    }
                    if (i7 != length) {
                        i7++;
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}

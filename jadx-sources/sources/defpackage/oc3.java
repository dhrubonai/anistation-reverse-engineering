package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oc3 {
    public final int a;
    public final nc3[] b;
    public final qc3 c;
    public final List d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public oc3(int i, nc3[] nc3VarArr, qc3 qc3Var, List list, boolean z, int i2) {
        this.a = i;
        this.b = nc3VarArr;
        this.c = qc3Var;
        this.d = list;
        this.e = z;
        this.f = i2;
        int i3 = 0;
        for (nc3 nc3Var : nc3VarArr) {
            i3 = Math.max(i3, nc3Var.o);
        }
        this.g = i3;
        int i4 = i3 + this.f;
        this.h = i4 >= 0 ? i4 : 0;
    }

    public final nc3[] a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        nc3[] nc3VarArr = this.b;
        int length = nc3VarArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            nc3 nc3Var = nc3VarArr[i9];
            int i12 = i10 + 1;
            int i13 = (int) ((li2) this.d.get(i10)).a;
            int i14 = this.c.b[i11];
            int i15 = this.a;
            boolean z = this.e;
            if (z) {
                i4 = i15;
            } else {
                i4 = i11;
            }
            if (z) {
                i5 = i11;
                i8 = i;
                i6 = i2;
                i7 = i3;
            } else {
                i5 = i15;
                i6 = i2;
                i7 = i3;
                i8 = i;
            }
            nc3Var.o(i8, i14, i6, i7, i4, i5);
            i11 += i13;
            i9++;
            i10 = i12;
        }
        return nc3VarArr;
    }
}

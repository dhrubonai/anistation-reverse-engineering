package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jc3 {
    public final boolean a;
    public final qc3 b;
    public final int c;
    public final int d;
    public final ic3 e;
    public final tc3 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ qc3 h;

    public jc3(boolean z, qc3 qc3Var, int i, int i2, ic3 ic3Var, tc3 tc3Var) {
        this.g = z;
        this.h = qc3Var;
        this.a = z;
        this.b = qc3Var;
        this.c = i;
        this.d = i2;
        this.e = ic3Var;
        this.f = tc3Var;
    }

    public final long a(int i, int i2) {
        int i3;
        qc3 qc3Var = this.b;
        int[] iArr = qc3Var.a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = qc3Var.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (this.a) {
            if (i3 < 0) {
                gz2.a("width must be >= 0");
            }
            return sx0.h(i3, i3, 0, Integer.MAX_VALUE);
        }
        if (i3 < 0) {
            gz2.a("height must be >= 0");
        }
        return sx0.h(0, Integer.MAX_VALUE, i3, i3);
    }

    public final oc3 b(int i) {
        int i2;
        rb1 c = this.f.c(i);
        int i3 = c.b;
        int size = c.a.size();
        int i4 = 0;
        if (size != 0 && i3 + size != this.c) {
            i2 = this.d;
        } else {
            i2 = 0;
        }
        nc3[] nc3VarArr = new nc3[size];
        int i5 = 0;
        while (true) {
            List list = c.a;
            if (i4 < size) {
                int i6 = (int) ((li2) list.get(i4)).a;
                nc3 M = this.e.M(i3 + i4, i5, i6, a(i5, i6), i2);
                i5 += i6;
                nc3VarArr[i4] = M;
                i4++;
            } else {
                return new oc3(i, nc3VarArr, this.h, list, this.g, i2);
            }
        }
    }
}

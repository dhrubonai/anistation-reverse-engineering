package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d24 {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.b = a34.m[3 - i3];
        int i8 = a34.n[i5];
        this.d = i8;
        int i9 = 2;
        if (i2 == 2) {
            i8 /= 2;
            this.d = i8;
        } else if (i2 == 0) {
            i8 /= 4;
            this.d = i8;
        }
        int i10 = (i >>> 9) & 1;
        int i11 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i11 = 384;
                } else {
                    p65.b();
                    return false;
                }
            }
        } else if (i2 != 3) {
            i11 = 576;
        }
        this.g = i11;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = a34.o[i4 - 1];
            } else {
                i7 = a34.p[i4 - 1];
            }
            this.f = i7;
            this.c = (((i7 * 12) / i8) + i10) * 4;
        } else {
            int i12 = 144;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = a34.q[i4 - 1];
                } else {
                    i6 = a34.r[i4 - 1];
                }
                this.f = i6;
                this.c = ((i6 * 144) / i8) + i10;
            } else {
                int i13 = a34.s[i4 - 1];
                this.f = i13;
                if (i3 == 1) {
                    i12 = 72;
                }
                this.c = ((i12 * i13) / i8) + i10;
            }
        }
        if (((i >> 6) & 3) == 3) {
            i9 = 1;
        }
        this.e = i9;
        return true;
    }
}

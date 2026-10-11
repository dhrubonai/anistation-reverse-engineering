package defpackage;

import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class no2 {
    public final pa0 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = CodedOutputStream.DEFAULT_BUFFER_SIZE;
    public ak2[] e = new ak2[8];
    public int f = 7;

    public no2(pa0 pa0Var) {
        this.a = pa0Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                ak2 ak2Var = this.e[length];
                ak2Var.getClass();
                i -= ak2Var.c;
                int i4 = this.h;
                ak2 ak2Var2 = this.e[length];
                ak2Var2.getClass();
                this.h = i4 - ak2Var2.c;
                this.g--;
                i3++;
                length--;
            }
            ak2[] ak2VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(ak2VarArr, i5, ak2VarArr, i5 + i3, this.g);
            ak2[] ak2VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(ak2VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(ak2 ak2Var) {
        int i = ak2Var.c;
        int i2 = this.d;
        if (i > i2) {
            ak2[] ak2VarArr = this.e;
            ms.E0(0, ak2VarArr.length, null, ak2VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        ak2[] ak2VarArr2 = this.e;
        if (i3 > ak2VarArr2.length) {
            ak2[] ak2VarArr3 = new ak2[ak2VarArr2.length * 2];
            System.arraycopy(ak2VarArr2, 0, ak2VarArr3, ak2VarArr2.length, ak2VarArr2.length);
            this.f = this.e.length - 1;
            this.e = ak2VarArr3;
            ak2VarArr2 = ak2VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        ak2VarArr2[i4] = ak2Var;
        this.g++;
        this.h += i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, pa0] */
    public final void c(zd0 zd0Var) {
        zd0Var.getClass();
        int[] iArr = ys2.a;
        int d = zd0Var.d();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < d; i++) {
            byte i2 = zd0Var.i(i);
            byte[] bArr = dq6.a;
            j2 += ys2.b[i2 & 255];
        }
        int i3 = (int) ((j2 + 7) >> 3);
        int d2 = zd0Var.d();
        pa0 pa0Var = this.a;
        if (i3 < d2) {
            ?? obj = new Object();
            int[] iArr2 = ys2.a;
            int d3 = zd0Var.d();
            int i4 = 0;
            for (int i5 = 0; i5 < d3; i5++) {
                byte i6 = zd0Var.i(i5);
                byte[] bArr2 = dq6.a;
                int i7 = i6 & 255;
                int i8 = ys2.a[i7];
                byte b = ys2.b[i7];
                j = (j << b) | i8;
                i4 += b;
                while (i4 >= 8) {
                    i4 -= 8;
                    obj.w0((int) (j >> i4));
                }
            }
            if (i4 > 0) {
                obj.w0((int) ((j << (8 - i4)) | (255 >>> i4)));
            }
            zd0 s = obj.s(obj.y);
            e(s.d(), 127, 128);
            pa0Var.u0(s);
            return;
        }
        e(zd0Var.d(), 127, 0);
        pa0Var.u0(zd0Var);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.c) {
            int i3 = this.b;
            if (i3 < this.d) {
                e(i3, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ak2 ak2Var = (ak2) arrayList.get(i4);
            zd0 p = ak2Var.a.p();
            zd0 zd0Var = ak2Var.b;
            Integer num = (Integer) oo2.b.get(p);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    ak2[] ak2VarArr = oo2.a;
                    if (a34.i(ak2VarArr[intValue].b, zd0Var)) {
                        i = i2;
                    } else if (a34.i(ak2VarArr[i2].b, zd0Var)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.f + 1;
                int length = this.e.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    ak2 ak2Var2 = this.e[i5];
                    ak2Var2.getClass();
                    if (a34.i(ak2Var2.a, p)) {
                        ak2 ak2Var3 = this.e[i5];
                        ak2Var3.getClass();
                        if (a34.i(ak2Var3.b, zd0Var)) {
                            i2 = oo2.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + oo2.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.a.w0(64);
                c(p);
                c(zd0Var);
                b(ak2Var);
            } else {
                zd0 zd0Var2 = ak2.d;
                p.getClass();
                zd0Var2.getClass();
                if (p.m(0, zd0Var2, zd0Var2.d()) && !a34.i(ak2.i, p)) {
                    e(i, 15, 0);
                    c(zd0Var);
                } else {
                    e(i, 63, 64);
                    c(zd0Var);
                    b(ak2Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        pa0 pa0Var = this.a;
        if (i < i2) {
            pa0Var.w0(i | i3);
            return;
        }
        pa0Var.w0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            pa0Var.w0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        pa0Var.w0(i4);
    }
}

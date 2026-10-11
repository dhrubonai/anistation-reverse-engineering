package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s83 implements gq1 {
    public final r83 a;

    public s83(r83 r83Var) {
        this.a = r83Var;
    }

    @Override // defpackage.gq1, defpackage.ll
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final qr6 a(tk6 tk6Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        r83 r83Var = this.a;
        s34 s34Var = r83Var.b;
        r34 r34Var = new r34(s34Var.e + 2);
        s34 s34Var2 = new s34(s34Var.e);
        int[] iArr3 = s34Var.b;
        Object[] objArr3 = s34Var.c;
        long[] jArr = s34Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            q83 q83Var = (q83) objArr3[i6];
                            r34Var.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            s34Var2.h(i7, new pr6((rl) tk6Var.a.invoke(q83Var.a), q83Var.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!s34Var.a(0)) {
            int i8 = r34Var.b;
            if (i8 >= 0) {
                r34Var.b(i8 + 1);
                int[] iArr4 = r34Var.a;
                int i9 = r34Var.b;
                if (i9 != 0) {
                    ms.w0(1, 0, i9, iArr4, iArr4);
                }
                iArr4[0] = 0;
                r34Var.b++;
            } else {
                ze0.g("Index must be between 0 and size");
                return null;
            }
        }
        if (!s34Var.a(r83Var.a)) {
            r34Var.a(r83Var.a);
        }
        int i10 = r34Var.b;
        if (i10 != 0) {
            int[] iArr5 = r34Var.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new qr6(r34Var, s34Var2, r83Var.a, br1.d);
    }
}

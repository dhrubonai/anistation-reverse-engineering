package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wy {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public wy(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static wy a(zi4 zi4Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            zi4Var.O(4);
            int A = (zi4Var.A() & 3) + 1;
            if (A != 3) {
                ArrayList arrayList = new ArrayList();
                int A2 = zi4Var.A() & 31;
                for (int i9 = 0; i9 < A2; i9++) {
                    int H = zi4Var.H();
                    int i10 = zi4Var.b;
                    zi4Var.O(H);
                    byte[] bArr = zi4Var.a;
                    byte[] bArr2 = new byte[H + 4];
                    System.arraycopy(ko0.a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i10, bArr2, 4, H);
                    arrayList.add(bArr2);
                }
                int A3 = zi4Var.A();
                for (int i11 = 0; i11 < A3; i11++) {
                    int H2 = zi4Var.H();
                    int i12 = zi4Var.b;
                    zi4Var.O(H2);
                    byte[] bArr3 = zi4Var.a;
                    byte[] bArr4 = new byte[H2 + 4];
                    System.arraycopy(ko0.a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i12, bArr4, 4, H2);
                    arrayList.add(bArr4);
                }
                if (A2 > 0) {
                    m64 d0 = io3.d0((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                    int i13 = d0.e;
                    int i14 = d0.f;
                    int i15 = d0.h + 8;
                    int i16 = d0.i + 8;
                    int i17 = d0.p;
                    int i18 = d0.q;
                    int i19 = d0.r;
                    int i20 = d0.s;
                    float f2 = d0.g;
                    int i21 = d0.a;
                    int i22 = d0.b;
                    int i23 = d0.c;
                    byte[] bArr5 = ko0.a;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                    i4 = i18;
                    i5 = i19;
                    i6 = i20;
                    f = f2;
                    i2 = i14;
                    i3 = i15;
                    i7 = i16;
                    i8 = i17;
                    i = i13;
                } else {
                    str = null;
                    i = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    i6 = 16;
                    f = 1.0f;
                    i7 = -1;
                    i8 = -1;
                }
                return new wy(arrayList, A, i, i2, i3, i7, i8, i4, i5, i6, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw bj4.a("Error parsing AVC config", e);
        }
    }
}

package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hg4 extends n03 {
    public int B;
    public int D;
    public int z;
    public fg4[] y = new fg4[16];
    public int[] A = new int[16];
    public Object[] C = new Object[16];

    public final void L() {
        this.z = 0;
        this.B = 0;
        Arrays.fill(this.C, 0, this.D, (Object) null);
        this.D = 0;
    }

    public final void M(nr nrVar, bs5 bs5Var, b25 b25Var, gg4 gg4Var) {
        if (this.z != 0) {
            fm0 fm0Var = new fm0(this);
            hg4 hg4Var = (hg4) fm0Var.B;
            while (true) {
                fg4 fg4Var = hg4Var.y[fm0Var.y];
                ed2 b = fg4Var.b(fm0Var);
                nr nrVar2 = nrVar;
                bs5 bs5Var2 = bs5Var;
                b25 b25Var2 = b25Var;
                gg4 gg4Var2 = gg4Var;
                try {
                    fg4Var.a(fm0Var, nrVar2, bs5Var2, b25Var2, gg4Var2);
                    int i = fm0Var.y;
                    int i2 = hg4Var.z;
                    if (i < i2) {
                        fg4 fg4Var2 = hg4Var.y[i];
                        fm0Var.z += fg4Var2.a;
                        fm0Var.A += fg4Var2.b;
                        int i3 = i + 1;
                        fm0Var.y = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        nrVar = nrVar2;
                        bs5Var = bs5Var2;
                        b25Var = b25Var2;
                        gg4Var = gg4Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        L();
    }

    public final boolean N() {
        if (this.z == 0) {
            return true;
        }
        return false;
    }

    public final void O(fg4 fg4Var) {
        int i;
        int i2;
        int i3 = this.z;
        fg4[] fg4VarArr = this.y;
        int i4 = 1024;
        if (i3 == fg4VarArr.length) {
            if (i3 > 1024) {
                i2 = 1024;
            } else {
                i2 = i3;
            }
            fg4[] fg4VarArr2 = new fg4[i2 + i3];
            System.arraycopy(fg4VarArr, 0, fg4VarArr2, 0, i3);
            this.y = fg4VarArr2;
        }
        int i5 = this.B;
        int i6 = fg4Var.a;
        int i7 = fg4Var.b;
        int i8 = i5 + i6;
        int[] iArr = this.A;
        int length = iArr.length;
        if (i8 > length) {
            if (length > 1024) {
                i = 1024;
            } else {
                i = length;
            }
            int i9 = i + length;
            if (i9 >= i8) {
                i8 = i9;
            }
            int[] iArr2 = new int[i8];
            ms.w0(0, 0, length, iArr, iArr2);
            this.A = iArr2;
        }
        int i10 = this.D + i7;
        Object[] objArr = this.C;
        int length2 = objArr.length;
        if (i10 > length2) {
            if (length2 <= 1024) {
                i4 = length2;
            }
            int i11 = i4 + length2;
            if (i11 >= i10) {
                i10 = i11;
            }
            Object[] objArr2 = new Object[i10];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.C = objArr2;
        }
        fg4[] fg4VarArr3 = this.y;
        int i12 = this.z;
        this.z = i12 + 1;
        fg4VarArr3[i12] = fg4Var;
        this.B += fg4Var.a;
        this.D += i7;
    }
}

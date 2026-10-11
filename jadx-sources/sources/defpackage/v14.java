package defpackage;

import java.io.EOFException;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v14 implements d12 {
    public Object A;
    public final Object B;
    public int x;
    public int y;
    public boolean z;

    public v14(byte b) {
        switch (b) {
            case 1:
                this.A = new fd4();
                this.B = new zi4(0, new byte[65025]);
                this.x = -1;
                return;
            default:
                this.x = -1;
                this.y = -1;
                this.B = new HashMap();
                return;
        }
    }

    @Override // defpackage.d12
    public bh6 G(int i, int i2) {
        HashMap hashMap = (HashMap) this.B;
        if (i2 == 2) {
            this.x = i;
        } else if (i2 == 1) {
            this.y = i;
        }
        u14 u14Var = (u14) hashMap.get(Integer.valueOf(i2));
        if (u14Var == null) {
            u14 u14Var2 = new u14();
            hashMap.put(Integer.valueOf(i2), u14Var2);
            return u14Var2;
        }
        return u14Var;
    }

    @Override // defpackage.d12
    public void I(hf5 hf5Var) {
        this.A = (vg6) hf5Var;
        this.z = true;
    }

    public int a(int i) {
        int i2;
        int i3 = 0;
        this.y = 0;
        do {
            int i4 = this.y;
            int i5 = i + i4;
            fd4 fd4Var = (fd4) this.A;
            if (i5 >= fd4Var.c) {
                break;
            }
            int[] iArr = fd4Var.f;
            this.y = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public boolean b(c12 c12Var) {
        boolean z;
        boolean z2;
        int i;
        fd4 fd4Var = (fd4) this.A;
        zi4 zi4Var = (zi4) this.B;
        if (c12Var != null) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        if (this.z) {
            this.z = false;
            zi4Var.K(0);
        }
        while (!this.z) {
            int i2 = this.x;
            if (i2 < 0) {
                if (fd4Var.b(c12Var, -1L) && fd4Var.a(c12Var, true)) {
                    int i3 = fd4Var.d;
                    if ((fd4Var.a & 1) == 1 && zi4Var.c == 0) {
                        i3 += a(0);
                        i = this.y;
                    } else {
                        i = 0;
                    }
                    try {
                        c12Var.v(i3);
                        this.x = i;
                        i2 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a = a(i2);
            int i4 = this.x + this.y;
            if (a > 0) {
                zi4Var.c(zi4Var.c + a);
                try {
                    c12Var.readFully(zi4Var.a, zi4Var.c, a);
                    zi4Var.M(zi4Var.c + a);
                    if (fd4Var.f[i4 - 1] != 255) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.z = z2;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == fd4Var.c) {
                i4 = -1;
            }
            this.x = i4;
        }
        return true;
    }

    @Override // defpackage.d12
    public void t() {
    }
}

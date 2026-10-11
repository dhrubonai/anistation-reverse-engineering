package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ng4 extends xy5 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(zi4 zi4Var, byte[] bArr) {
        if (zi4Var.a() < bArr.length) {
            return false;
        }
        int i = zi4Var.b;
        byte[] bArr2 = new byte[bArr.length];
        zi4Var.k(bArr2, 0, bArr.length);
        zi4Var.N(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.xy5
    public final long b(zi4 zi4Var) {
        byte[] bArr = zi4Var.a;
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return (this.i * a34.d0(b2, b)) / 1000000;
    }

    @Override // defpackage.xy5
    public final boolean c(zi4 zi4Var, long j, l33 l33Var) {
        if (e(zi4Var, o)) {
            byte[] copyOf = Arrays.copyOf(zi4Var.a, zi4Var.c);
            int i = copyOf[9] & 255;
            ArrayList l = a34.l(copyOf);
            if (((ea2) l33Var.y) == null) {
                da2 da2Var = new da2();
                da2Var.n = qy3.n("audio/ogg");
                da2Var.o = qy3.n("audio/opus");
                da2Var.I = i;
                da2Var.K = 48000;
                da2Var.r = l;
                l33Var.y = new ea2(da2Var);
                return true;
            }
        } else {
            boolean e = e(zi4Var, p);
            ea2 ea2Var = (ea2) l33Var.y;
            if (e) {
                ea2Var.getClass();
                if (!this.n) {
                    this.n = true;
                    zi4Var.O(8);
                    fy3 a = cx6.a(nw2.p((String[]) ct5.m(zi4Var, false, false).y));
                    if (a != null) {
                        da2 a2 = ((ea2) l33Var.y).a();
                        a2.l = a.b(((ea2) l33Var.y).m);
                        l33Var.y = new ea2(a2);
                        return true;
                    }
                }
            } else {
                ea2Var.getClass();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.xy5
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}

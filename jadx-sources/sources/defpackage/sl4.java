package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sl4 implements ey3 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public sl4(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static sl4 d(zi4 zi4Var) {
        int m = zi4Var.m();
        String n = qy3.n(zi4Var.y(zi4Var.m(), StandardCharsets.US_ASCII));
        String y = zi4Var.y(zi4Var.m(), StandardCharsets.UTF_8);
        int m2 = zi4Var.m();
        int m3 = zi4Var.m();
        int m4 = zi4Var.m();
        int m5 = zi4Var.m();
        int m6 = zi4Var.m();
        byte[] bArr = new byte[m6];
        zi4Var.k(bArr, 0, m6);
        return new sl4(m, n, y, m2, m3, m4, m5, bArr);
    }

    @Override // defpackage.ey3
    public final void b(hr3 hr3Var) {
        hr3Var.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sl4.class == obj.getClass()) {
                sl4 sl4Var = (sl4) obj;
                if (this.a == sl4Var.a && this.b.equals(sl4Var.b) && this.c.equals(sl4Var.c) && this.d == sl4Var.d && this.e == sl4Var.e && this.f == sl4Var.f && this.g == sl4Var.g && Arrays.equals(this.h, sl4Var.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((zo5.i(this.c, zo5.i(this.b, (527 + this.a) * 31, 31), 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}

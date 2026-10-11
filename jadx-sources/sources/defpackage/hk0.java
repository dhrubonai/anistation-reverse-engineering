package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hk0 extends gu2 implements gk0 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final gu2[] g;

    public hk0(String str, int i, int i2, long j, long j2, gu2[] gu2VarArr) {
        super("CHAP");
        boolean z;
        String str2;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        this.b = str;
        this.c = i;
        this.d = i2;
        int length = gu2VarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                gu2 gu2Var = gu2VarArr[i3];
                if (gu2Var instanceof rc6) {
                    rc6 rc6Var = (rc6) gu2Var;
                    nw2 nw2Var = rc6Var.c;
                    if (rc6Var.a.equals("TIT2") && !nw2Var.isEmpty()) {
                        str2 = (String) nw2Var.get(0);
                        break;
                    }
                }
                i3++;
            } else {
                str2 = null;
                break;
            }
        }
        if (str2 != null) {
            new w93(null, str2);
        }
        this.e = j;
        this.f = j2;
        this.g = gu2VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && hk0.class == obj.getClass()) {
                hk0 hk0Var = (hk0) obj;
                if (this.c == hk0Var.c && this.d == hk0Var.d && this.e == hk0Var.e && this.f == hk0Var.f && this.b.equals(hk0Var.b) && Arrays.equals(this.g, hk0Var.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}

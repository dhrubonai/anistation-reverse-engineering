package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jq0 {
    public lk5 a;
    public iw2 f;
    public Object g;
    public final int c = 0;
    public final Bundle d = Bundle.EMPTY;
    public int b = -1;
    public final boolean e = true;

    public final kq0 a() {
        boolean z;
        boolean z2;
        int i;
        boolean z3 = false;
        if (this.a == null) {
            z = true;
        } else {
            z = false;
        }
        if (this.b == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            z3 = true;
        }
        io3.A("Exactly one of sessionCommand and playerCommand should be set", z3);
        if (this.f == null) {
            int i2 = this.b;
            if (i2 != 1) {
                if (i2 != 11 && i2 != 7) {
                    i = 6;
                    if (i2 != 6) {
                        if (i2 == 12 || i2 == 9 || i2 == 8) {
                            i = 3;
                        }
                    }
                }
                i = 2;
            } else {
                i = 1;
            }
            this.f = new iw2(new int[]{i}, 1);
        }
        return new kq0(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}

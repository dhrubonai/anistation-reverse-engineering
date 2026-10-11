package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s61 {
    public final String a;
    public final ea2 b;
    public final ea2 c;
    public final int d;
    public final int e;

    public s61(String str, ea2 ea2Var, ea2 ea2Var2, int i, int i2) {
        boolean z;
        if (i != 0 && i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        io3.n(z);
        io3.n(true ^ TextUtils.isEmpty(str));
        this.a = str;
        ea2Var.getClass();
        this.b = ea2Var;
        ea2Var2.getClass();
        this.c = ea2Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s61.class == obj.getClass()) {
            s61 s61Var = (s61) obj;
            if (this.d == s61Var.d && this.e == s61Var.e && this.a.equals(s61Var.a) && this.b.equals(s61Var.b) && this.c.equals(s61Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + zo5.i(this.a, (((527 + this.d) * 31) + this.e) * 31, 31)) * 31);
    }
}

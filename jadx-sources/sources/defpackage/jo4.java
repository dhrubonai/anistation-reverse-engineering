package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jo4 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Object a;
    public final int b;
    public final ar3 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = eq6.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public jo4(Object obj, int i, ar3 ar3Var, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        io3.n(i2 >= 0);
        this.a = obj;
        this.b = i;
        this.c = ar3Var;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public final boolean a(jo4 jo4Var) {
        if (this.b == jo4Var.b && this.e == jo4Var.e && this.f == jo4Var.f && this.g == jo4Var.g && this.h == jo4Var.h && this.i == jo4Var.i && Objects.equals(this.c, jo4Var.c)) {
            return true;
        }
        return false;
    }

    public final jo4 b(boolean z, boolean z2) {
        int i;
        ar3 ar3Var;
        long j2;
        int i2;
        if (z && z2) {
            return this;
        }
        int i3 = 0;
        if (z2) {
            i = this.b;
        } else {
            i = 0;
        }
        if (z) {
            ar3Var = this.c;
        } else {
            ar3Var = null;
        }
        if (z2) {
            i3 = this.e;
        }
        int i4 = i3;
        long j3 = 0;
        if (z) {
            j2 = this.f;
        } else {
            j2 = 0;
        }
        if (z) {
            j3 = this.g;
        }
        int i5 = -1;
        if (z) {
            i2 = this.h;
        } else {
            i2 = -1;
        }
        if (z) {
            i5 = this.i;
        }
        return new jo4(this.a, i, ar3Var, this.d, i4, j2, j3, i2, i5);
    }

    public final Bundle c(int i) {
        Bundle bundle = new Bundle();
        int i2 = this.b;
        if (i < 3 || i2 != 0) {
            bundle.putInt(j, i2);
        }
        ar3 ar3Var = this.c;
        if (ar3Var != null) {
            bundle.putBundle(k, ar3Var.c(i, false));
        }
        int i3 = this.e;
        if (i < 3 || i3 != 0) {
            bundle.putInt(l, i3);
        }
        long j2 = this.f;
        if (i < 3 || j2 != 0) {
            bundle.putLong(m, j2);
        }
        long j3 = this.g;
        if (i < 3 || j3 != 0) {
            bundle.putLong(n, j3);
        }
        int i4 = this.h;
        if (i4 != -1) {
            bundle.putInt(o, i4);
        }
        int i5 = this.i;
        if (i5 != -1) {
            bundle.putInt(p, i5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jo4.class == obj.getClass()) {
            jo4 jo4Var = (jo4) obj;
            if (a(jo4Var) && Objects.equals(this.a, jo4Var.a) && Objects.equals(this.d, jo4Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        return str + ", contentPos=" + this.g + ", adGroup=" + i + ", ad=" + this.i;
    }
}

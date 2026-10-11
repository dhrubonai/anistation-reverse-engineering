package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ex5 extends yx4 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = eq6.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public ex5(int i, float f) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.m("maxStars must be a positive integer", z);
        if (f >= 0.0f && f <= i) {
            z2 = true;
        }
        io3.m("starRating is out of range [0, maxStars]", z2);
        this.b = i;
        this.c = f;
    }

    @Override // defpackage.yx4
    public final boolean b() {
        if (this.c != -1.0f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yx4
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(yx4.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ex5)) {
            return false;
        }
        ex5 ex5Var = (ex5) obj;
        if (this.b != ex5Var.b || this.c != ex5Var.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public ex5(int i) {
        io3.m("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }
}

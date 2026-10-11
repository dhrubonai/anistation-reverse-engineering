package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class we6 extends yx4 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = eq6.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public we6() {
        this.b = false;
        this.c = false;
    }

    @Override // defpackage.yx4
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.yx4
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(yx4.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof we6) {
            we6 we6Var = (we6) obj;
            if (this.c == we6Var.c && this.b == we6Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public we6(boolean z) {
        this.b = true;
        this.c = z;
    }
}

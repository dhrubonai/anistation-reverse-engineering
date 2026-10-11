package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xk4 extends yx4 {
    public static final String c;
    public final float b;

    static {
        String str = eq6.a;
        c = Integer.toString(1, 36);
    }

    public xk4(float f) {
        boolean z;
        if (f >= 0.0f && f <= 100.0f) {
            z = true;
        } else {
            z = false;
        }
        io3.m("percent must be in the range of [0, 100]", z);
        this.b = f;
    }

    @Override // defpackage.yx4
    public final boolean b() {
        if (this.b != -1.0f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yx4
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(yx4.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xk4)) {
            return false;
        }
        if (this.b != ((xk4) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public xk4() {
        this.b = -1.0f;
    }
}

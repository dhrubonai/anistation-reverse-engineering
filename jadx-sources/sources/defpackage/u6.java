package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u6 implements f11 {
    public final f11 a;
    public final float b;

    public u6(float f, f11 f11Var) {
        while (f11Var instanceof u6) {
            f11Var = ((u6) f11Var).a;
            f += ((u6) f11Var).b;
        }
        this.a = f11Var;
        this.b = f;
    }

    @Override // defpackage.f11
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        if (this.a.equals(u6Var.a) && this.b == u6Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}

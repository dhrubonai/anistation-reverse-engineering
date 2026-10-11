package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u80 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new u80(0, 0, 0, 0);
    }

    public u80(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i <= i3) {
            if (i2 <= i4) {
                return;
            }
            ze0.e(zo5.m("top must be less than or equal to bottom, top: ", ", bottom: ", i2, i4));
            throw null;
        }
        ze0.e(zo5.m("Left must be less than or equal to right, left: ", ", right: ", i, i3));
        throw null;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!u80.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        u80 u80Var = (u80) obj;
        if (this.a == u80Var.a && this.b == u80Var.b && this.c == u80Var.c && this.d == u80Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(u80.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return zo5.k(this.d, "] }", sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u80(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}

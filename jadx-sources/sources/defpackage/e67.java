package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e67 {
    public final u80 a;
    public final float b;

    public e67(Rect rect, float f) {
        this.a = new u80(rect);
        this.b = f;
    }

    public final Rect a() {
        u80 u80Var = this.a;
        u80Var.getClass();
        return new Rect(u80Var.a, u80Var.b, u80Var.c, u80Var.d);
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
        if (!e67.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        e67 e67Var = (e67) obj;
        if (a34.i(this.a, e67Var.a) && this.b == e67Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public e67(u80 u80Var, float f) {
        this.a = u80Var;
        this.b = f;
    }
}

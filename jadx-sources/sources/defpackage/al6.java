package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class al6 implements y73 {
    public final g73 x;
    public final List y;
    public final int z;

    public al6(g73 g73Var, List list, int i) {
        g73Var.getClass();
        list.getClass();
        this.x = g73Var;
        this.y = list;
        this.z = i;
    }

    @Override // defpackage.y73
    public final boolean a() {
        if ((this.z & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.y73
    public final List b() {
        return this.y;
    }

    @Override // defpackage.y73
    public final g73 c() {
        return this.x;
    }

    public final String d(boolean z) {
        e73 e73Var;
        String name;
        String q0;
        g73 g73Var = this.x;
        Class cls = null;
        if (g73Var instanceof e73) {
            e73Var = (e73) g73Var;
        } else {
            e73Var = null;
        }
        if (e73Var != null) {
            cls = t80.M(e73Var);
        }
        if (cls == null) {
            name = g73Var.toString();
        } else if ((this.z & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (cls.isArray()) {
            if (cls.equals(boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (cls.equals(char[].class)) {
                name = "kotlin.CharArray";
            } else if (cls.equals(byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (cls.equals(short[].class)) {
                name = "kotlin.ShortArray";
            } else if (cls.equals(int[].class)) {
                name = "kotlin.IntArray";
            } else if (cls.equals(float[].class)) {
                name = "kotlin.FloatArray";
            } else if (cls.equals(long[].class)) {
                name = "kotlin.LongArray";
            } else if (cls.equals(double[].class)) {
                name = "kotlin.DoubleArray";
            } else {
                name = "kotlin.Array";
            }
        } else if (z && cls.isPrimitive()) {
            name = t80.N((e73) g73Var).getName();
        } else {
            name = cls.getName();
        }
        String str = "";
        if (this.y.isEmpty()) {
            q0 = "";
        } else {
            q0 = yo0.q0(this.y, ", ", "<", ">", new ka6(this), 24);
        }
        if (a()) {
            str = "?";
        }
        return name + q0 + str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof al6) {
            al6 al6Var = (al6) obj;
            if (a34.i(this.x, al6Var.x) && a34.i(this.y, al6Var.y) && this.z == al6Var.z) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.z) + zo5.j(this.y, this.x.hashCode() * 31, 31);
    }

    public final String toString() {
        return d(false).concat(" (Kotlin reflection is not available)");
    }
}

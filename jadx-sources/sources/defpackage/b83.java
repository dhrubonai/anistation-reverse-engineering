package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b83 implements y73 {
    public final y73 x;

    public b83(y73 y73Var) {
        y73Var.getClass();
        this.x = y73Var;
    }

    @Override // defpackage.y73
    public final boolean a() {
        return this.x.a();
    }

    @Override // defpackage.y73
    public final List b() {
        return this.x.b();
    }

    @Override // defpackage.y73
    public final g73 c() {
        return this.x.c();
    }

    public final boolean equals(Object obj) {
        b83 b83Var;
        y73 y73Var;
        y73 y73Var2;
        if (obj == null) {
            return false;
        }
        g73 g73Var = null;
        if (obj instanceof b83) {
            b83Var = (b83) obj;
        } else {
            b83Var = null;
        }
        if (b83Var != null) {
            y73Var = b83Var.x;
        } else {
            y73Var = null;
        }
        y73 y73Var3 = this.x;
        if (!a34.i(y73Var3, y73Var)) {
            return false;
        }
        g73 c = y73Var3.c();
        if (c instanceof e73) {
            if (obj instanceof y73) {
                y73Var2 = (y73) obj;
            } else {
                y73Var2 = null;
            }
            if (y73Var2 != null) {
                g73Var = y73Var2.c();
            }
            if (g73Var != null && (g73Var instanceof e73)) {
                return t80.M((e73) c).equals(t80.M((e73) g73Var));
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.x;
    }
}

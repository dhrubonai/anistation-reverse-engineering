package defpackage;

import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t70 {
    public final Route a;
    public final int b;
    public final int c;
    public final int d;

    public t70(Route route, int i, int i2, int i3) {
        route.getClass();
        this.a = route;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t70)) {
            return false;
        }
        t70 t70Var = (t70) obj;
        if (a34.i(this.a, t70Var.a) && this.b == t70Var.b && this.c == t70Var.c && this.d == t70Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qx1.c(this.c, qx1.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "BottomBarItem(route=" + this.a + ", name=" + this.b + ", icon=" + this.c + ", selectedIcon=" + this.d + ")";
    }
}

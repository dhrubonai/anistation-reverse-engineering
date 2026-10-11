package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b32 {
    public final List a;
    public final List b;
    public final List c;
    public final List d;

    public b32(List list, List list2, List list3, List list4) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b32) {
                b32 b32Var = (b32) obj;
                if (!this.a.equals(b32Var.a) || !this.b.equals(b32Var.b) || !this.c.equals(b32Var.c) || !this.d.equals(b32Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + zo5.j(this.c, zo5.j(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FilteredHome(recents=" + this.a + ", trending=" + this.b + ", popular=" + this.c + ", top=" + this.d + ")";
    }
}

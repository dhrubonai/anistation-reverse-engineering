package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tm6 {
    public final Map a;
    public final List b;
    public final int c;
    public final String d;
    public final List e;
    public final boolean f;

    public tm6(Map map, List list, int i, String str, List list2, boolean z) {
        map.getClass();
        list.getClass();
        list2.getClass();
        this.a = map;
        this.b = list;
        this.c = i;
        this.d = str;
        this.e = list2;
        this.f = z;
    }

    public static tm6 a(tm6 tm6Var, Map map, List list, int i, String str, List list2, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            map = tm6Var.a;
        }
        Map map2 = map;
        if ((i2 & 2) != 0) {
            list = tm6Var.b;
        }
        List list3 = list;
        if ((i2 & 4) != 0) {
            i = tm6Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str = tm6Var.d;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            list2 = tm6Var.e;
        }
        List list4 = list2;
        if ((i2 & 32) != 0) {
            z = tm6Var.f;
        }
        tm6Var.getClass();
        map2.getClass();
        list3.getClass();
        list4.getClass();
        return new tm6(map2, list3, i3, str2, list4, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tm6) {
                tm6 tm6Var = (tm6) obj;
                if (!a34.i(this.a, tm6Var.a) || !a34.i(this.b, tm6Var.b) || this.c != tm6Var.c || !this.d.equals(tm6Var.d) || !a34.i(this.e, tm6Var.e) || this.f != tm6Var.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + zo5.j(this.e, zo5.i(this.d, qx1.c(this.c, zo5.j(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "UiState(genreData=" + this.a + ", genres=" + this.b + ", selectedGenreIndex=" + this.c + ", selectedGenre=" + this.d + ", watchHistory=" + this.e + ", isRefreshing=" + this.f + ")";
    }
}

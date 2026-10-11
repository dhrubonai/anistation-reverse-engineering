package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z00 {
    public final List a;
    public final List b;
    public final List c;

    public z00(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z00)) {
            return false;
        }
        z00 z00Var = (z00) obj;
        if (a34.i(this.a, z00Var.a) && a34.i(this.b, z00Var.b) && a34.i(this.c, z00Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.j(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RoomSnapshot(animeList=" + this.a + ", watchProgress=" + this.b + ", removedWatchHistory=" + this.c + ")";
    }
}

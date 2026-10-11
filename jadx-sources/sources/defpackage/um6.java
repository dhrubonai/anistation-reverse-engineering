package defpackage;

import com.anistation.model.animelist.WatchStatus;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class um6 {
    public final List a;
    public final WatchStatus b;
    public final boolean c;

    public um6(List list, WatchStatus watchStatus, boolean z) {
        list.getClass();
        this.a = list;
        this.b = watchStatus;
        this.c = z;
    }

    public static um6 a(um6 um6Var, List list, WatchStatus watchStatus, boolean z, int i) {
        if ((i & 1) != 0) {
            list = um6Var.a;
        }
        if ((i & 2) != 0) {
            watchStatus = um6Var.b;
        }
        if ((i & 4) != 0) {
            z = um6Var.c;
        }
        um6Var.getClass();
        list.getClass();
        return new um6(list, watchStatus, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um6)) {
            return false;
        }
        um6 um6Var = (um6) obj;
        if (a34.i(this.a, um6Var.a) && this.b == um6Var.b && this.c == um6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        WatchStatus watchStatus = this.b;
        if (watchStatus == null) {
            hashCode = 0;
        } else {
            hashCode = watchStatus.hashCode();
        }
        return Boolean.hashCode(this.c) + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(animeList=");
        sb.append(this.a);
        sb.append(", selectedWatchStatus=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return qx1.r(sb, this.c, ")");
    }
}

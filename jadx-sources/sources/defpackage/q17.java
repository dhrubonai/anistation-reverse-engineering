package defpackage;

import com.anistation.model.animelist.WatchStatus;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q17 {
    public final WatchStatus a;
    public final int b;

    public q17(WatchStatus watchStatus, int i) {
        watchStatus.getClass();
        this.a = watchStatus;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q17)) {
            return false;
        }
        q17 q17Var = (q17) obj;
        if (this.a == q17Var.a && this.b == q17Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WatchStatusItem(status=" + this.a + ", icon=" + this.b + ")";
    }
}

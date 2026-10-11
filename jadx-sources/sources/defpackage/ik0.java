package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ik0 implements gk0 {
    public final long a;
    public final long b;
    public final boolean c;
    public final w93 d;

    public ik0(long j, long j2, boolean z, w93 w93Var) {
        boolean z2;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L && j > j2) {
            z2 = false;
        } else {
            z2 = true;
        }
        io3.n(z2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = w93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ik0.class == obj.getClass()) {
            ik0 ik0Var = (ik0) obj;
            if (this.a == ik0Var.a && this.b == ik0Var.b && this.c == ik0Var.c && Objects.equals(this.d, ik0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int K = (((zz.K(this.b) + ((zz.K(this.a) + 527) * 31)) * 31) + (this.c ? 1 : 0)) * 31;
        w93 w93Var = this.d;
        if (w93Var != null) {
            i = w93Var.hashCode();
        } else {
            i = 0;
        }
        return K + i;
    }

    public final String toString() {
        Object valueOf;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Chapter: startTimeMs=");
        long j = this.a;
        if (j == -9223372036854775807L) {
            valueOf = "UNSET";
        } else {
            valueOf = Long.valueOf(j);
        }
        sb.append(valueOf);
        long j2 = this.b;
        String str3 = "";
        if (j2 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", endTimeMs=" + j2;
        }
        sb.append(str);
        if (!this.c) {
            str2 = "";
        } else {
            str2 = ", hidden";
        }
        sb.append(str2);
        w93 w93Var = this.d;
        if (w93Var != null) {
            str3 = ", title=" + w93Var;
        }
        sb.append(str3);
        return sb.toString();
    }
}

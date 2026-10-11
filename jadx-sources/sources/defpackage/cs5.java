package defpackage;

import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cs5 {
    public final long a;
    public final long b;
    public final int c;

    public cs5(long j, int i, long j2) {
        boolean z;
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cs5.class == obj.getClass()) {
            cs5 cs5Var = (cs5) obj;
            if (this.a == cs5Var.a && this.b == cs5Var.b && this.c == cs5Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = eq6.a;
        Locale locale = Locale.US;
        StringBuilder n = zo5.n(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        n.append(this.b);
        n.append(", speedDivisor=");
        n.append(this.c);
        return n.toString();
    }
}

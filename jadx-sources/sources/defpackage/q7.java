package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q7 {
    public final long a;
    public final kf6 b;
    public final int c;
    public final jw3 d;
    public final long e;
    public final kf6 f;
    public final int g;
    public final jw3 h;
    public final long i;
    public final long j;

    public q7(long j, kf6 kf6Var, int i, jw3 jw3Var, long j2, kf6 kf6Var2, int i2, jw3 jw3Var2, long j3, long j4) {
        this.a = j;
        this.b = kf6Var;
        this.c = i;
        this.d = jw3Var;
        this.e = j2;
        this.f = kf6Var2;
        this.g = i2;
        this.h = jw3Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && q7.class == obj.getClass()) {
                q7 q7Var = (q7) obj;
                if (this.a == q7Var.a && this.c == q7Var.c && this.e == q7Var.e && this.g == q7Var.g && this.i == q7Var.i && this.j == q7Var.j && this.b.equals(q7Var.b) && Objects.equals(this.d, q7Var.d) && Objects.equals(this.f, q7Var.f) && Objects.equals(this.h, q7Var.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}

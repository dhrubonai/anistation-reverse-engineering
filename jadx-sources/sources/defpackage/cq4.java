package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cq4 {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final nw2 f;
    public final rn4 g;
    public final hh6 h;

    public cq4(bq4 bq4Var) {
        this.a = bq4Var.a;
        this.b = bq4Var.b;
        this.c = bq4Var.c;
        this.d = bq4Var.d;
        this.e = bq4Var.e;
        this.f = bq4Var.f;
        this.g = bq4Var.g;
        this.h = bq4Var.h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && cq4.class == obj.getClass()) {
            cq4 cq4Var = (cq4) obj;
            if (this.a == cq4Var.a && this.b == cq4Var.b && this.c == cq4Var.c && this.d == cq4Var.d && this.e == cq4Var.e && Objects.equals(this.f, cq4Var.f) && Objects.equals(this.g, cq4Var.g) && Objects.equals(this.h, cq4Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), Long.valueOf(this.e), this.f, this.g, this.h);
    }
}

package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rv {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final ru g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public rv(qv qvVar) {
        this.a = qvVar.a;
        this.b = qvVar.b;
        this.c = qvVar.c;
        this.d = qvVar.d;
        this.e = qvVar.e;
        this.f = qvVar.f;
        this.g = qvVar.g;
        this.h = qvVar.h;
        this.i = qvVar.i;
        this.j = qvVar.j;
        this.k = qvVar.k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qv, java.lang.Object] */
    public final qv a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && rv.class == obj.getClass()) {
                rv rvVar = (rv) obj;
                if (this.a == rvVar.a && this.b == rvVar.b && this.c == rvVar.c && this.d == rvVar.d && this.e == rvVar.e && this.f == rvVar.f && this.h == rvVar.h && this.i == rvVar.i && this.j == rvVar.j && this.k == rvVar.k && this.g.equals(rvVar.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}

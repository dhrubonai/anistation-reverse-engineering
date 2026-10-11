package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jw3 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public jw3(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final jw3 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new jw3(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b(jw3 jw3Var) {
        if (jw3Var == null) {
            return false;
        }
        if (this == jw3Var) {
            return true;
        }
        if (!this.a.equals(jw3Var.a) || this.b != jw3Var.b || this.c != jw3Var.c || this.d != jw3Var.d) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        if (this.b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw3)) {
            return false;
        }
        jw3 jw3Var = (jw3) obj;
        if (b(jw3Var) && this.e == jw3Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public jw3(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public jw3(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public jw3(Object obj) {
        this(-1L, obj);
    }
}

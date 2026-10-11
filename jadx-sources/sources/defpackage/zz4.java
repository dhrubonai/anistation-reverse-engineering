package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zz4 {
    public a05 a;
    public int b;
    public ed2 c;
    public ic2 d;
    public int e;
    public b44 f;
    public p44 g;

    public zz4(a05 a05Var) {
        this.a = a05Var;
    }

    public final boolean a() {
        boolean z;
        if (this.a != null) {
            ed2 ed2Var = this.c;
            if (ed2Var != null) {
                z = ed2Var.a();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final f33 b(Object obj) {
        f33 f;
        a05 a05Var = this.a;
        if (a05Var != null && (f = a05Var.f(this, obj)) != null) {
            return f;
        }
        return f33.x;
    }

    public final void c() {
        a05 a05Var = this.a;
        if (a05Var != null) {
            a05Var.a();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i;
        int i2 = this.b;
        if (z) {
            i = i2 | 32;
        } else {
            i = i2 & (-33);
        }
        this.b = i;
    }
}

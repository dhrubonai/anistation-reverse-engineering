package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yb4 {
    public final Object a;
    public int b;
    public final /* synthetic */ zb4 c;

    public yb4(zb4 zb4Var, int i) {
        this.c = zb4Var;
        this.a = zb4Var.a[i];
        this.b = i;
    }

    public final int a() {
        int i = this.b;
        Object obj = this.a;
        zb4 zb4Var = this.c;
        if (i == -1 || i >= zb4Var.c || !tl7.r(obj, zb4Var.a[i])) {
            this.b = zb4Var.c(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return zb4Var.b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yb4) {
            yb4 yb4Var = (yb4) obj;
            if (a() == yb4Var.a() && tl7.r(this.a, yb4Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return a() ^ hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int a = a();
        if (a == 1) {
            return valueOf;
        }
        return valueOf + " x " + a;
    }
}

package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ad6 {
    public final ko a;
    public final xd6 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final ud1 g;
    public final ia3 h;
    public final p82 i;
    public final long j;

    public ad6(ko koVar, xd6 xd6Var, List list, int i, boolean z, int i2, ud1 ud1Var, ia3 ia3Var, p82 p82Var, long j) {
        this.a = koVar;
        this.b = xd6Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = ud1Var;
        this.h = ia3Var;
        this.i = p82Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ad6) {
                ad6 ad6Var = (ad6) obj;
                if (a34.i(this.a, ad6Var.a) && a34.i(this.b, ad6Var.b) && a34.i(this.c, ad6Var.c) && this.d == ad6Var.d && this.e == ad6Var.e && this.f == ad6Var.f && a34.i(this.g, ad6Var.g) && this.h == ad6Var.h && a34.i(this.i, ad6Var.i) && rx0.b(this.j, ad6Var.j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + qx1.c(this.f, zo5.g((zo5.j(this.c, zo5.h(this.b, this.a.hashCode() * 31, 31), 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else if (i == 4) {
            str = "StartEllipsis";
        } else {
            str = "Invalid";
        }
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + str + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + rx0.l(this.j) + ")";
    }
}

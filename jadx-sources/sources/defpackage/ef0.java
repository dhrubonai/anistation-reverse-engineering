package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ef0 {
    public final ad6 a;

    public ef0(ad6 ad6Var) {
        this.a = ad6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ef0) {
                ad6 ad6Var = this.a;
                ko koVar = ad6Var.a;
                ad6 ad6Var2 = ((ef0) obj).a;
                if (a34.i(koVar, ad6Var2.a) && ad6Var.b.c(ad6Var2.b) && a34.i(ad6Var.c, ad6Var2.c) && ad6Var.d == ad6Var2.d && ad6Var.e == ad6Var2.e && ad6Var.f == ad6Var2.f && a34.i(ad6Var.g, ad6Var2.g) && ad6Var.h == ad6Var2.h && ad6Var.i == ad6Var2.i && rx0.b(ad6Var.j, ad6Var2.j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ad6 ad6Var = this.a;
        int hashCode = ad6Var.a.hashCode() * 31;
        xd6 xd6Var = ad6Var.b;
        pv5 pv5Var = xd6Var.a;
        long j = pv5Var.b;
        fe6[] fe6VarArr = ee6.b;
        int hashCode2 = Long.hashCode(j) * 31;
        s92 s92Var = pv5Var.c;
        int i9 = 0;
        if (s92Var != null) {
            i = s92Var.x;
        } else {
            i = 0;
        }
        int i10 = (hashCode2 + i) * 31;
        o92 o92Var = pv5Var.d;
        if (o92Var != null) {
            i2 = Integer.hashCode(o92Var.a);
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        p92 p92Var = pv5Var.e;
        if (p92Var != null) {
            i3 = Integer.hashCode(p92Var.a);
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        q82 q82Var = pv5Var.f;
        if (q82Var != null) {
            i4 = q82Var.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        String str = pv5Var.g;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int d = qx1.d((i13 + i5) * 31, pv5Var.h, 31);
        z30 z30Var = pv5Var.i;
        if (z30Var != null) {
            i6 = Float.hashCode(z30Var.a);
        } else {
            i6 = 0;
        }
        int i14 = (d + i6) * 31;
        oc6 oc6Var = pv5Var.j;
        if (oc6Var != null) {
            i7 = oc6Var.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        fk3 fk3Var = pv5Var.k;
        if (fk3Var != null) {
            i8 = fk3Var.x.hashCode();
        } else {
            i8 = 0;
        }
        long j2 = pv5Var.l;
        int i16 = ep0.j;
        int hashCode3 = (xd6Var.b.hashCode() + qx1.d((i15 + i8) * 31, j2, 961)) * 31;
        kn4 kn4Var = xd6Var.c;
        if (kn4Var != null) {
            i9 = kn4Var.hashCode();
        }
        return Long.hashCode(ad6Var.j) + ((ad6Var.i.hashCode() + ((ad6Var.h.hashCode() + ((ad6Var.g.hashCode() + qx1.c(ad6Var.f, zo5.g((zo5.j(ad6Var.c, (hashCode3 + i9 + hashCode) * 31, 31) + ad6Var.d) * 31, 31, ad6Var.e), 31)) * 31)) * 31)) * 31);
    }
}

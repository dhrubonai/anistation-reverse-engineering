package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cv2 {
    public static final cv2 o;
    public final n22 a;
    public final l11 b;
    public final l11 c;
    public final l11 d;
    public final af0 e;
    public final af0 f;
    public final af0 g;
    public final ub2 h;
    public final ub2 i;
    public final ub2 j;
    public final cr5 k;
    public final xa5 l;
    public final as4 m;
    public final g12 n;

    static {
        xd xdVar = xd.W;
        b73 b73Var = n22.x;
        ja1 ja1Var = rh1.a;
        j91 j91Var = j91.y;
        pz4 pz4Var = cr5.m;
        as4 as4Var = as4.x;
        g12 g12Var = g12.b;
        it1 it1Var = it1.x;
        af0 af0Var = af0.ENABLED;
        o = new cv2(b73Var, it1Var, j91Var, j91Var, af0Var, af0Var, af0Var, xdVar, xdVar, xdVar, pz4Var, xa5.y, as4Var, g12Var);
    }

    public cv2(n22 n22Var, l11 l11Var, l11 l11Var2, l11 l11Var3, af0 af0Var, af0 af0Var2, af0 af0Var3, ub2 ub2Var, ub2 ub2Var2, ub2 ub2Var3, cr5 cr5Var, xa5 xa5Var, as4 as4Var, g12 g12Var) {
        this.a = n22Var;
        this.b = l11Var;
        this.c = l11Var2;
        this.d = l11Var3;
        this.e = af0Var;
        this.f = af0Var2;
        this.g = af0Var3;
        this.h = ub2Var;
        this.i = ub2Var2;
        this.j = ub2Var3;
        this.k = cr5Var;
        this.l = xa5Var;
        this.m = as4Var;
        this.n = g12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv2)) {
            return false;
        }
        cv2 cv2Var = (cv2) obj;
        if (a34.i(this.a, cv2Var.a) && a34.i(this.b, cv2Var.b) && a34.i(this.c, cv2Var.c) && a34.i(this.d, cv2Var.d) && this.e == cv2Var.e && this.f == cv2Var.f && this.g == cv2Var.g && a34.i(this.h, cv2Var.h) && a34.i(this.i, cv2Var.i) && a34.i(this.j, cv2Var.j) && a34.i(this.k, cv2Var.k) && this.l == cv2Var.l && this.m == cv2Var.m && a34.i(this.n, cv2Var.n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ")";
    }
}

package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dv2 {
    public final l11 a;
    public final l11 b;
    public final l11 c;
    public final cr5 d;
    public final xa5 e;
    public final as4 f;

    public dv2(l11 l11Var, l11 l11Var2, l11 l11Var3, cr5 cr5Var, xa5 xa5Var, as4 as4Var) {
        this.a = l11Var;
        this.b = l11Var2;
        this.c = l11Var3;
        this.d = cr5Var;
        this.e = xa5Var;
        this.f = as4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dv2) {
                dv2 dv2Var = (dv2) obj;
                if (!a34.i(this.a, dv2Var.a) || !a34.i(this.b, dv2Var.b) || !a34.i(this.c, dv2Var.c) || !a34.i(this.d, dv2Var.d) || this.e != dv2Var.e || this.f != dv2Var.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = 0;
        l11 l11Var = this.a;
        if (l11Var == null) {
            hashCode = 0;
        } else {
            hashCode = l11Var.hashCode();
        }
        int i2 = hashCode * 31;
        l11 l11Var2 = this.b;
        if (l11Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l11Var2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        l11 l11Var3 = this.c;
        if (l11Var3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l11Var3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 923521;
        xd xdVar = xd.W;
        int hashCode6 = (xdVar.hashCode() + ((xdVar.hashCode() + ((xdVar.hashCode() + i4) * 31)) * 31)) * 31;
        cr5 cr5Var = this.d;
        if (cr5Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cr5Var.hashCode();
        }
        int i5 = (hashCode6 + hashCode4) * 31;
        xa5 xa5Var = this.e;
        if (xa5Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = xa5Var.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        as4 as4Var = this.f;
        if (as4Var != null) {
            i = as4Var.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        xd xdVar = xd.W;
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + xdVar + ", errorFactory=" + xdVar + ", fallbackFactory=" + xdVar + ", sizeResolver=" + this.d + ", scale=" + this.e + ", precision=" + this.f + ")";
    }
}

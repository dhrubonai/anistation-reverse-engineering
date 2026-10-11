package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mg4 {
    public final Context a;
    public final tq5 b;
    public final xa5 c;
    public final as4 d;
    public final String e;
    public final n22 f;
    public final af0 g;
    public final af0 h;
    public final af0 i;
    public final g12 j;

    public mg4(Context context, tq5 tq5Var, xa5 xa5Var, as4 as4Var, String str, n22 n22Var, af0 af0Var, af0 af0Var2, af0 af0Var3, g12 g12Var) {
        this.a = context;
        this.b = tq5Var;
        this.c = xa5Var;
        this.d = as4Var;
        this.e = str;
        this.f = n22Var;
        this.g = af0Var;
        this.h = af0Var2;
        this.i = af0Var3;
        this.j = g12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg4)) {
            return false;
        }
        mg4 mg4Var = (mg4) obj;
        if (a34.i(this.a, mg4Var.a) && a34.i(this.b, mg4Var.b) && this.c == mg4Var.c && this.d == mg4Var.d && a34.i(this.e, mg4Var.e) && a34.i(this.f, mg4Var.f) && this.g == mg4Var.g && this.h == mg4Var.h && this.i == mg4Var.i && a34.i(this.j, mg4Var.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((hashCode2 + hashCode) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ")";
    }
}

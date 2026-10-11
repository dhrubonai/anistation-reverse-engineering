package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ev2 {
    public final Context a;
    public final Object b;
    public final k76 c;
    public final Map d;
    public final n22 e;
    public final l11 f;
    public final l11 g;
    public final l11 h;
    public final af0 i;
    public final af0 j;
    public final af0 k;
    public final ub2 l;
    public final ub2 m;
    public final ub2 n;
    public final cr5 o;
    public final xa5 p;
    public final as4 q;
    public final g12 r;
    public final dv2 s;
    public final cv2 t;

    public ev2(Context context, Object obj, k76 k76Var, Map map, n22 n22Var, l11 l11Var, l11 l11Var2, l11 l11Var3, af0 af0Var, af0 af0Var2, af0 af0Var3, ub2 ub2Var, ub2 ub2Var2, ub2 ub2Var3, cr5 cr5Var, xa5 xa5Var, as4 as4Var, g12 g12Var, dv2 dv2Var, cv2 cv2Var) {
        this.a = context;
        this.b = obj;
        this.c = k76Var;
        this.d = map;
        this.e = n22Var;
        this.f = l11Var;
        this.g = l11Var2;
        this.h = l11Var3;
        this.i = af0Var;
        this.j = af0Var2;
        this.k = af0Var3;
        this.l = ub2Var;
        this.m = ub2Var2;
        this.n = ub2Var3;
        this.o = cr5Var;
        this.p = xa5Var;
        this.q = as4Var;
        this.r = g12Var;
        this.s = dv2Var;
        this.t = cv2Var;
    }

    public static bv2 a(ev2 ev2Var) {
        Context context = ev2Var.a;
        ev2Var.getClass();
        return new bv2(ev2Var, context);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ev2) {
                ev2 ev2Var = (ev2) obj;
                if (!a34.i(this.a, ev2Var.a) || !this.b.equals(ev2Var.b) || !a34.i(this.c, ev2Var.c) || !this.d.equals(ev2Var.d) || !a34.i(this.e, ev2Var.e) || !a34.i(this.f, ev2Var.f) || !a34.i(this.g, ev2Var.g) || !a34.i(this.h, ev2Var.h) || this.i != ev2Var.i || this.j != ev2Var.j || this.k != ev2Var.k || !a34.i(this.l, ev2Var.l) || !a34.i(this.m, ev2Var.m) || !a34.i(this.n, ev2Var.n) || !a34.i(this.o, ev2Var.o) || this.p != ev2Var.p || this.q != ev2Var.q || !this.r.equals(ev2Var.r) || !this.s.equals(ev2Var.s) || !a34.i(this.t, ev2Var.t)) {
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
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        k76 k76Var = this.c;
        if (k76Var == null) {
            hashCode = 0;
        } else {
            hashCode = k76Var.hashCode();
        }
        return this.t.hashCode() + ((this.s.hashCode() + ((this.r.a.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + hashCode) * 29791)) * 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=null, memoryCacheKey=null, memoryCacheKeyExtras=" + this.d + ", diskCacheKey=null, fileSystem=" + this.e + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f + ", fetcherCoroutineContext=" + this.g + ", decoderCoroutineContext=" + this.h + ", memoryCachePolicy=" + this.i + ", diskCachePolicy=" + this.j + ", networkCachePolicy=" + this.k + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.l + ", errorFactory=" + this.m + ", fallbackFactory=" + this.n + ", sizeResolver=" + this.o + ", scale=" + this.p + ", precision=" + this.q + ", extras=" + this.r + ", defined=" + this.s + ", defaults=" + this.t + ")";
    }
}

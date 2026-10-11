package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bv2 {
    public final Context a;
    public cv2 b;
    public Object c;
    public k76 d;
    public final Map e;
    public l11 f;
    public l11 g;
    public l11 h;
    public cr5 i;
    public xa5 j;
    public as4 k;
    public Object l;

    public bv2(ev2 ev2Var, Context context) {
        this.a = context;
        this.b = ev2Var.t;
        this.c = ev2Var.b;
        this.d = ev2Var.c;
        this.e = ev2Var.d;
        dv2 dv2Var = ev2Var.s;
        this.f = dv2Var.a;
        this.g = dv2Var.b;
        this.h = dv2Var.c;
        this.i = dv2Var.d;
        this.j = dv2Var.e;
        this.k = dv2Var.f;
        this.l = ev2Var.r;
    }

    public final ev2 a() {
        g12 g12Var;
        Object obj = this.c;
        if (obj == null) {
            obj = rb4.a;
        }
        Object obj2 = obj;
        k76 k76Var = this.d;
        Boolean bool = Boolean.FALSE;
        Map map = this.e;
        if (a34.i(map, bool)) {
            map.getClass();
            map = oi4.J(wk6.i(map));
        } else if (map == null) {
            p65.o();
            return null;
        }
        Map map2 = map;
        map2.getClass();
        cv2 cv2Var = this.b;
        n22 n22Var = cv2Var.a;
        af0 af0Var = cv2Var.e;
        af0 af0Var2 = cv2Var.f;
        af0 af0Var3 = cv2Var.g;
        l11 l11Var = this.f;
        if (l11Var == null) {
            l11Var = cv2Var.b;
        }
        l11 l11Var2 = l11Var;
        l11 l11Var3 = this.g;
        if (l11Var3 == null) {
            l11Var3 = cv2Var.c;
        }
        l11 l11Var4 = l11Var3;
        l11 l11Var5 = this.h;
        if (l11Var5 == null) {
            l11Var5 = cv2Var.d;
        }
        l11 l11Var6 = l11Var5;
        xd xdVar = xd.W;
        cr5 cr5Var = this.i;
        if (cr5Var == null) {
            cr5Var = cv2Var.k;
        }
        cr5 cr5Var2 = cr5Var;
        xa5 xa5Var = this.j;
        if (xa5Var == null) {
            xa5Var = cv2Var.l;
        }
        xa5 xa5Var2 = xa5Var;
        as4 as4Var = this.k;
        if (as4Var == null) {
            as4Var = cv2Var.m;
        }
        as4 as4Var2 = as4Var;
        Object obj3 = this.l;
        if (obj3 instanceof f12) {
            g12Var = new g12(oi4.J(((f12) obj3).a));
        } else if (obj3 instanceof g12) {
            g12Var = (g12) obj3;
        } else {
            p65.o();
            return null;
        }
        return new ev2(this.a, obj2, k76Var, map2, n22Var, l11Var2, l11Var4, l11Var6, af0Var, af0Var2, af0Var3, xdVar, xdVar, xdVar, cr5Var2, xa5Var2, as4Var2, g12Var, new dv2(this.f, this.g, this.h, this.i, this.j, this.k), this.b);
    }

    public bv2(Context context) {
        this.a = context;
        this.b = cv2.o;
        this.c = null;
        this.d = null;
        this.e = ot1.x;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = g12.b;
    }
}

package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class gh6 {
    public boolean A;
    public nw2 B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public HashMap H;
    public HashSet I;
    public int e;
    public int f;
    public int g;
    public int h;
    public nw2 m;
    public nw2 n;
    public nw2 o;
    public int p;
    public nw2 q;
    public nw2 r;
    public int s;
    public int t;
    public int u;
    public nw2 v;
    public fh6 w;
    public boolean x;
    public nw2 y;
    public int z;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;
    public boolean l = true;

    public gh6() {
        z62 z62Var = nw2.y;
        o15 o15Var = o15.B;
        this.m = o15Var;
        this.n = o15Var;
        this.o = o15Var;
        this.p = 0;
        this.q = o15Var;
        this.r = o15Var;
        this.s = 0;
        this.t = Integer.MAX_VALUE;
        this.u = Integer.MAX_VALUE;
        this.v = o15Var;
        this.w = fh6.d;
        this.x = false;
        this.y = o15Var;
        this.z = 0;
        this.A = true;
        this.B = o15Var;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static o15 f(String[] strArr) {
        jw2 k = nw2.k();
        for (String str : strArr) {
            str.getClass();
            k.c(eq6.V(str));
        }
        return k.g();
    }

    public void a(dh6 dh6Var) {
        this.H.put(dh6Var.a, dh6Var);
    }

    public hh6 b() {
        return new hh6(this);
    }

    public gh6 c() {
        this.H.clear();
        return this;
    }

    public gh6 d(int i) {
        Iterator it = this.H.values().iterator();
        while (it.hasNext()) {
            if (((dh6) it.next()).a.c == i) {
                it.remove();
            }
        }
        return this;
    }

    public final void e(hh6 hh6Var) {
        this.a = hh6Var.a;
        this.b = hh6Var.b;
        this.c = hh6Var.c;
        this.d = hh6Var.d;
        this.e = hh6Var.e;
        this.f = hh6Var.f;
        this.g = hh6Var.g;
        this.h = hh6Var.h;
        this.i = hh6Var.i;
        this.j = hh6Var.j;
        this.k = hh6Var.k;
        this.l = hh6Var.l;
        this.n = hh6Var.n;
        this.m = hh6Var.m;
        this.o = hh6Var.o;
        this.p = hh6Var.p;
        this.q = hh6Var.q;
        this.s = hh6Var.s;
        this.r = hh6Var.r;
        this.t = hh6Var.t;
        this.u = hh6Var.u;
        this.v = hh6Var.v;
        this.w = hh6Var.w;
        this.x = hh6Var.x;
        this.y = hh6Var.y;
        this.z = hh6Var.A;
        this.A = hh6Var.B;
        this.B = hh6Var.z;
        this.C = hh6Var.C;
        this.D = hh6Var.D;
        this.E = hh6Var.E;
        this.F = hh6Var.F;
        this.G = hh6Var.G;
        this.I = new HashSet(hh6Var.I);
        this.H = new HashMap(hh6Var.H);
    }

    public gh6 g(dh6 dh6Var) {
        d(dh6Var.a.c);
        this.H.put(dh6Var.a, dh6Var);
        return this;
    }

    public gh6 h(String str) {
        return i(str);
    }

    public gh6 i(String... strArr) {
        this.q = f(strArr);
        return this;
    }

    public void j(String str) {
        if (str == null) {
            k(new String[0]);
        } else {
            k(str);
        }
    }

    public gh6 k(String... strArr) {
        this.y = f(strArr);
        this.A = false;
        return this;
    }

    public gh6 l(boolean z) {
        this.x = z;
        return this;
    }

    public gh6 m(int i, boolean z) {
        HashSet hashSet = this.I;
        if (z) {
            hashSet.add(Integer.valueOf(i));
            return this;
        }
        hashSet.remove(Integer.valueOf(i));
        return this;
    }
}

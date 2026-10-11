package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bu5 implements xx5, Map, n73 {
    public final nt5 A;
    public au5 x;
    public final nt5 y;
    public final nt5 z;

    public bu5() {
        bl4 bl4Var = bl4.z;
        ft5 h = mt5.h();
        au5 au5Var = new au5(h.g(), bl4Var);
        if (!(h instanceof jh2)) {
            au5Var.b = new au5(1L, bl4Var);
        }
        this.x = au5Var;
        this.y = new nt5(this, (byte) 0);
        this.z = new nt5(this, (byte) 1);
        this.A = new nt5(this, (byte) 2);
    }

    public static boolean a(au5 au5Var, int i, bl4 bl4Var) {
        boolean z;
        synchronized (q23.g) {
            int i2 = au5Var.d;
            if (i2 == i) {
                au5Var.c = bl4Var;
                z = true;
                au5Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.xx5
    public final zx5 b() {
        return this.x;
    }

    @Override // java.util.Map
    public final void clear() {
        ft5 h;
        bl4 bl4Var = ((au5) mt5.f(this.x)).c;
        bl4 bl4Var2 = bl4.z;
        if (bl4Var2 != bl4Var) {
            au5 au5Var = this.x;
            synchronized (mt5.c) {
                h = mt5.h();
                au5 au5Var2 = (au5) mt5.w(au5Var, this, h);
                synchronized (q23.g) {
                    au5Var2.c = bl4Var2;
                    au5Var2.d++;
                }
            }
            mt5.l(h, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return d().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return d().c.containsValue(obj);
    }

    public final au5 d() {
        return (au5) mt5.s(this.x, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.y;
    }

    @Override // defpackage.xx5
    public final void f(zx5 zx5Var) {
        this.x = (au5) zx5Var;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return d().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return d().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.z;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        bl4 bl4Var;
        int i;
        Object put;
        ft5 h;
        boolean a;
        do {
            synchronized (q23.g) {
                au5 au5Var = (au5) mt5.f(this.x);
                bl4Var = au5Var.c;
                i = au5Var.d;
            }
            bl4Var.getClass();
            dl4 b = bl4Var.b();
            put = b.put(obj, obj2);
            bl4 b2 = b.b();
            if (a34.i(b2, bl4Var)) {
                break;
            }
            au5 au5Var2 = this.x;
            synchronized (mt5.c) {
                h = mt5.h();
                a = a((au5) mt5.w(au5Var2, this, h), i, b2);
            }
            mt5.l(h, this);
        } while (!a);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        bl4 bl4Var;
        int i;
        ft5 h;
        boolean a;
        do {
            synchronized (q23.g) {
                au5 au5Var = (au5) mt5.f(this.x);
                bl4Var = au5Var.c;
                i = au5Var.d;
            }
            bl4Var.getClass();
            dl4 b = bl4Var.b();
            b.putAll(map);
            bl4 b2 = b.b();
            if (!a34.i(b2, bl4Var)) {
                au5 au5Var2 = this.x;
                synchronized (mt5.c) {
                    h = mt5.h();
                    a = a((au5) mt5.w(au5Var2, this, h), i, b2);
                }
                mt5.l(h, this);
            } else {
                return;
            }
        } while (!a);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        bl4 bl4Var;
        int i;
        V remove;
        ft5 h;
        boolean a;
        do {
            synchronized (q23.g) {
                au5 au5Var = (au5) mt5.f(this.x);
                bl4Var = au5Var.c;
                i = au5Var.d;
            }
            bl4Var.getClass();
            dl4 b = bl4Var.b();
            remove = b.remove(obj);
            bl4 b2 = b.b();
            if (a34.i(b2, bl4Var)) {
                break;
            }
            au5 au5Var2 = this.x;
            synchronized (mt5.c) {
                h = mt5.h();
                a = a((au5) mt5.w(au5Var2, this, h), i, b2);
            }
            mt5.l(h, this);
        } while (!a);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        bl4 bl4Var = d().c;
        bl4Var.getClass();
        return bl4Var.y;
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((au5) mt5.f(this.x)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.A;
    }
}

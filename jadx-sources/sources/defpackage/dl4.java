package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class dl4 extends AbstractMap implements Map, n73 {
    public Object A;
    public int B;
    public int C;
    public bl4 x;
    public i18 y = new i18(25);
    public oj6 z;

    public dl4(bl4 bl4Var) {
        this.x = bl4Var;
        this.z = bl4Var.x;
        this.C = bl4Var.y;
    }

    /* renamed from: a */
    public bl4 b() {
        oj6 oj6Var = this.z;
        bl4 bl4Var = this.x;
        if (oj6Var != bl4Var.x) {
            this.y = new i18((byte) 25);
            bl4Var = new bl4(this.z, this.C);
        }
        this.x = bl4Var;
        return bl4Var;
    }

    public /* bridge */ bl4 b() {
        return b();
    }

    public final void c(int i) {
        this.C = i;
        this.B++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.z = oj6.e;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        oj6 oj6Var = this.z;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return oj6Var.d(i, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new fl4(this, (byte) 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i;
        oj6 oj6Var = this.z;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return oj6Var.g(i, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new fl4(this, (byte) 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        this.A = null;
        oj6 oj6Var = this.z;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.z = oj6Var.l(i, obj, obj2, 0, this);
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [td1, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        bl4 bl4Var;
        dl4 dl4Var;
        bl4 bl4Var2 = null;
        if (map instanceof bl4) {
            bl4Var = (bl4) map;
        } else {
            bl4Var = null;
        }
        if (bl4Var == null) {
            if (map instanceof dl4) {
                dl4Var = (dl4) map;
            } else {
                dl4Var = null;
            }
            if (dl4Var != null) {
                bl4Var2 = dl4Var.b();
            }
        } else {
            bl4Var2 = bl4Var;
        }
        if (bl4Var2 != null) {
            ?? obj = new Object();
            obj.a = 0;
            int i = this.C;
            this.z = this.z.m(bl4Var2.x, 0, obj, this);
            int i2 = (bl4Var2.y + i) - obj.a;
            if (i != i2) {
                c(i2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i;
        int i2 = this.C;
        oj6 oj6Var = this.z;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        oj6 o = oj6Var.o(i, obj, obj2, 0, this);
        if (o == null) {
            o = oj6.e;
        }
        this.z = o;
        if (i2 == this.C) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new fh0(this, (byte) 2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.A = null;
        oj6 n = this.z.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = oj6.e;
        }
        this.z = n;
        return this.A;
    }
}

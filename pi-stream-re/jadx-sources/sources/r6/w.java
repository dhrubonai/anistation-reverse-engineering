package r6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f9558b;

    public /* synthetic */ w(Map map, int i10) {
        this.f9557a = i10;
        this.f9558b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f9557a;
        Map map = this.f9558b;
        switch (i10) {
            case 0:
                ((a0) map).clear();
                return;
            case 1:
                ((a0) map).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f9557a;
        Map map = this.f9558b;
        switch (i10) {
            case 0:
                a0 a0Var = (a0) map;
                Map a10 = a0Var.a();
                if (a10 != null) {
                    return a10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int b10 = a0Var.b(entry.getKey());
                    if (b10 != -1 && q6.g.x(a0Var.k(b10), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((a0) map).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = this.f9557a;
        Map map = this.f9558b;
        switch (i10) {
            case 0:
                a0 a0Var = (a0) map;
                Map a10 = a0Var.a();
                if (a10 != null) {
                    return a10.entrySet().iterator();
                }
                return new v(a0Var, 1);
            case 1:
                a0 a0Var2 = (a0) map;
                Map a11 = a0Var2.a();
                if (a11 != null) {
                    return a11.keySet().iterator();
                }
                return new v(a0Var2, 0);
            default:
                return new n.c((n.e) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10 = this.f9557a;
        Map map = this.f9558b;
        switch (i10) {
            case 0:
                a0 a0Var = (a0) map;
                Map a10 = a0Var.a();
                if (a10 != null) {
                    return a10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!a0Var.e()) {
                        int i11 = (1 << (a0Var.f9433e & 31)) - 1;
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = a0Var.f9429a;
                        Objects.requireNonNull(obj2);
                        int e02 = com.bumptech.glide.c.e0(key, value, i11, obj2, a0Var.g(), a0Var.h(), a0Var.i());
                        if (e02 != -1) {
                            a0Var.d(e02, i11);
                            a0Var.f9434f--;
                            a0Var.f9433e += 32;
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                a0 a0Var2 = (a0) map;
                Map a11 = a0Var2.a();
                if (a11 != null) {
                    return a11.keySet().remove(obj);
                }
                if (a0Var2.f(obj) != a0.A) {
                    return true;
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f9557a;
        Map map = this.f9558b;
        switch (i10) {
            case 0:
                return ((a0) map).size();
            case 1:
                return ((a0) map).size();
            default:
                return ((n.e) map).f7891c;
        }
    }
}

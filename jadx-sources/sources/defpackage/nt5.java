package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nt5 implements Set, q73 {
    public final bu5 x;
    public final /* synthetic */ byte y;

    public nt5(bu5 bu5Var, byte b) {
        this.y = b;
        this.x = bu5Var;
    }

    private final boolean b(Collection collection) {
        bl4 bl4Var;
        int i;
        ft5 h;
        boolean a;
        Set N0 = yo0.N0(collection);
        bu5 bu5Var = this.x;
        boolean z = false;
        do {
            synchronized (q23.g) {
                au5 au5Var = (au5) mt5.f(bu5Var.x);
                bl4Var = au5Var.c;
                i = au5Var.d;
            }
            bl4Var.getClass();
            dl4 b = bl4Var.b();
            Object it = bu5Var.y.iterator();
            while (((m1) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((wx5) it).next();
                if (!N0.contains(entry.getKey())) {
                    b.remove(entry.getKey());
                    z = true;
                }
            }
            bl4 b2 = b.b();
            if (a34.i(b2, bl4Var)) {
                break;
            }
            au5 au5Var2 = bu5Var.x;
            synchronized (mt5.c) {
                h = mt5.h();
                a = bu5.a((au5) mt5.w(au5Var2, bu5Var, h), i, b2);
            }
            mt5.l(h, bu5Var);
        } while (!a);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.y) {
            case 0:
                q23.W();
                throw null;
            case 1:
                q23.W();
                throw null;
            default:
                q23.W();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.y) {
            case 0:
                q23.W();
                throw null;
            case 1:
                q23.W();
                throw null;
            default:
                q23.W();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.x.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.y;
        bu5 bu5Var = this.x;
        switch (b) {
            case 0:
                if (!wk6.v(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return a34.i(bu5Var.get(entry.getKey()), entry.getValue());
            case 1:
                return bu5Var.containsKey(obj);
            default:
                return bu5Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.y;
        bu5 bu5Var = this.x;
        switch (b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!bu5Var.containsKey(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!bu5Var.containsValue(it3.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.x.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.y;
        bu5 bu5Var = this.x;
        switch (b) {
            case 0:
                return new wx5(bu5Var, ((ax2) bu5Var.d().c.entrySet()).iterator(), (byte) 0);
            case 1:
                return new wx5(bu5Var, ((ax2) bu5Var.d().c.entrySet()).iterator(), (byte) 1);
            default:
                return new wx5(bu5Var, ((ax2) bu5Var.d().c.entrySet()).iterator(), (byte) 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        byte b = this.y;
        bu5 bu5Var = this.x;
        switch (b) {
            case 0:
                if (!wk6.v(obj) || bu5Var.remove(((Map.Entry) obj).getKey()) == null) {
                    return false;
                }
                return true;
            case 1:
                if (bu5Var.remove(obj) == null) {
                    return false;
                }
                return true;
            default:
                Object it = bu5Var.y.iterator();
                while (true) {
                    if (((m1) it).hasNext()) {
                        obj2 = ((wx5) it).next();
                        if (a34.i(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry == null) {
                    return false;
                }
                bu5Var.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        bl4 bl4Var;
        int i;
        ft5 h;
        boolean a;
        boolean z = false;
        switch (this.y) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.x.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.x.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                    break;
                }
                break;
            default:
                Set N0 = yo0.N0(collection);
                bu5 bu5Var = this.x;
                do {
                    synchronized (q23.g) {
                        au5 au5Var = (au5) mt5.f(bu5Var.x);
                        bl4Var = au5Var.c;
                        i = au5Var.d;
                    }
                    bl4Var.getClass();
                    dl4 b = bl4Var.b();
                    Object it3 = bu5Var.y.iterator();
                    while (((m1) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((wx5) it3).next();
                        if (N0.contains(entry.getValue())) {
                            b.remove(entry.getKey());
                            z = true;
                        }
                    }
                    bl4 b2 = b.b();
                    if (!a34.i(b2, bl4Var)) {
                        au5 au5Var2 = bu5Var.x;
                        synchronized (mt5.c) {
                            h = mt5.h();
                            a = bu5.a((au5) mt5.w(au5Var2, bu5Var, h), i, b2);
                        }
                        mt5.l(h, bu5Var);
                    }
                    return z;
                } while (!a);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        bl4 bl4Var;
        int i;
        ft5 h;
        boolean a;
        bl4 bl4Var2;
        int i2;
        ft5 h2;
        boolean a2;
        boolean z = false;
        switch (this.y) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int S = vn3.S(zo0.V(collection2, 10));
                if (S < 16) {
                    S = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(S);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                bu5 bu5Var = this.x;
                do {
                    synchronized (q23.g) {
                        au5 au5Var = (au5) mt5.f(bu5Var.x);
                        bl4Var = au5Var.c;
                        i = au5Var.d;
                    }
                    bl4Var.getClass();
                    dl4 b = bl4Var.b();
                    Object it = bu5Var.y.iterator();
                    while (((m1) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((wx5) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !a34.i(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            b.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    bl4 b2 = b.b();
                    if (!a34.i(b2, bl4Var)) {
                        au5 au5Var2 = bu5Var.x;
                        synchronized (mt5.c) {
                            h = mt5.h();
                            a = bu5.a((au5) mt5.w(au5Var2, bu5Var, h), i, b2);
                        }
                        mt5.l(h, bu5Var);
                    }
                    return z;
                } while (!a);
                return z;
            case 1:
                return b(collection);
            default:
                Set N0 = yo0.N0(collection);
                bu5 bu5Var2 = this.x;
                do {
                    synchronized (q23.g) {
                        au5 au5Var3 = (au5) mt5.f(bu5Var2.x);
                        bl4Var2 = au5Var3.c;
                        i2 = au5Var3.d;
                    }
                    bl4Var2.getClass();
                    dl4 b3 = bl4Var2.b();
                    Object it2 = bu5Var2.y.iterator();
                    while (((m1) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((wx5) it2).next();
                        if (!N0.contains(entry3.getValue())) {
                            b3.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    bl4 b4 = b3.b();
                    if (!a34.i(b4, bl4Var2)) {
                        au5 au5Var4 = bu5Var2.x;
                        synchronized (mt5.c) {
                            h2 = mt5.h();
                            a2 = bu5.a((au5) mt5.w(au5Var4, bu5Var2, h2), i2, b4);
                        }
                        mt5.l(h2, bu5Var2);
                    }
                    return z;
                } while (!a2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.x.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return v94.M(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return v94.N(this, objArr);
    }
}

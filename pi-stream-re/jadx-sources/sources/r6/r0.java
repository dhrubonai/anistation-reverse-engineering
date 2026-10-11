package r6;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class r0 implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient p1 f9523a;

    /* renamed from: b, reason: collision with root package name */
    public transient q1 f9524b;

    /* renamed from: c, reason: collision with root package name */
    public transient r1 f9525c;

    public static q0 a() {
        return new q0(4);
    }

    public static r0 b(Map map) {
        int i10;
        if ((map instanceof r0) && !(map instanceof SortedMap)) {
            r0 r0Var = (r0) map;
            r0Var.getClass();
            return r0Var;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        boolean z9 = entrySet instanceof Collection;
        if (z9) {
            i10 = entrySet.size();
        } else {
            i10 = 4;
        }
        q0 q0Var = new q0(i10);
        if (z9) {
            q0Var.b(entrySet.size() + q0Var.f9516a);
        }
        for (Map.Entry entry : entrySet) {
            q0Var.c(entry.getKey(), entry.getValue());
        }
        return q0Var.a();
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final t0 entrySet() {
        p1 p1Var = this.f9523a;
        if (p1Var == null) {
            s1 s1Var = (s1) this;
            p1 p1Var2 = new p1(s1Var, s1Var.f9533e, s1Var.f9534f);
            this.f9523a = p1Var2;
            return p1Var2;
        }
        return p1Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        r1 r1Var = this.f9525c;
        if (r1Var == null) {
            s1 s1Var = (s1) this;
            r1 r1Var2 = new r1(s1Var.f9533e, 1, s1Var.f9534f);
            this.f9525c = r1Var2;
            r1Var = r1Var2;
        }
        return r1Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return h0.O(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return h0.d0(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (((s1) this).f9534f == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        q1 q1Var = this.f9524b;
        if (q1Var == null) {
            s1 s1Var = (s1) this;
            q1 q1Var2 = new q1(s1Var, new r1(s1Var.f9533e, 0, s1Var.f9534f));
            this.f9524b = q1Var2;
            return q1Var2;
        }
        return q1Var;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i10 = ((s1) this).f9534f;
        h0.p(i10, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
        sb.append('{');
        boolean z9 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z9) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z9 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        r1 r1Var = this.f9525c;
        if (r1Var == null) {
            s1 s1Var = (s1) this;
            r1 r1Var2 = new r1(s1Var.f9533e, 1, s1Var.f9534f);
            this.f9525c = r1Var2;
            return r1Var2;
        }
        return r1Var;
    }
}

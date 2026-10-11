package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5(with = j63.class)
/* loaded from: classes.dex */
public final class h63 extends q53 implements Map<String, q53>, j73 {
    public static final g63 Companion = new Object();
    public final Map x;

    public h63(Map map) {
        map.getClass();
        this.x = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ q53 compute(String str, BiFunction<? super String, ? super q53, ? extends q53> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ q53 computeIfAbsent(String str, Function<? super String, ? extends q53> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ q53 computeIfPresent(String str, BiFunction<? super String, ? super q53, ? extends q53> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.x.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof q53)) {
            return false;
        }
        return this.x.containsValue((q53) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, q53>> entrySet() {
        return this.x.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return a34.i(this.x, obj);
    }

    @Override // java.util.Map
    public final q53 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (q53) this.x.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.x.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.x.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ q53 merge(String str, q53 q53Var, BiFunction<? super q53, ? super q53, ? extends q53> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ q53 put(String str, q53 q53Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends q53> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ q53 putIfAbsent(String str, q53 q53Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final q53 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ q53 replace(String str, q53 q53Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super q53, ? extends q53> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.x.size();
    }

    public final String toString() {
        return yo0.q0(this.x.entrySet(), ",", "{", "}", new p03((byte) 2), 24);
    }

    @Override // java.util.Map
    public final Collection<q53> values() {
        return this.x.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, q53 q53Var, q53 q53Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

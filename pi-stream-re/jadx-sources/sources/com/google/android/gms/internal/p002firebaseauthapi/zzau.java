package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class zzau<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zza = new Map.Entry[0];
    private transient zzav<Map.Entry<K, V>> zzb;
    private transient zzav<K> zzc;
    private transient zzal<V> zzd;

    public static <K, V> zzau<K, V> zza(Map<? extends K, ? extends V> map) {
        if ((map instanceof zzau) && !(map instanceof SortedMap)) {
            zzau<K, V> zzauVar = (zzau) map;
            zzauVar.zzd();
            return zzauVar;
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        zzat zzatVar = new zzat(entrySet instanceof Collection ? entrySet.size() : 4);
        zzatVar.zza(entrySet);
        return zzatVar.zza();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return ((zzal) values()).contains(obj);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzav<Map.Entry<K, V>> zzavVar = this.zzb;
        if (zzavVar == null) {
            zzav<Map.Entry<K, V>> zzb = zzb();
            this.zzb = zzb;
            return zzb;
        }
        return zzavVar;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v9) {
        V v10 = get(obj);
        if (v10 != null) {
            return v10;
        }
        return v9;
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzbe.zza((zzav) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzav<K> zzavVar = this.zzc;
        if (zzavVar == null) {
            zzav<K> zzc = zzc();
            this.zzc = zzc;
            return zzc;
        }
        return zzavVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        zzaj.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb.append('{');
        boolean z9 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
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
    public /* synthetic */ Collection values() {
        zzal<V> zzalVar = this.zzd;
        if (zzalVar == null) {
            zzal<V> zza2 = zza();
            this.zzd = zza2;
            return zza2;
        }
        return zzalVar;
    }

    public abstract zzal<V> zza();

    public abstract zzav<Map.Entry<K, V>> zzb();

    public abstract zzav<K> zzc();

    public abstract boolean zzd();
}

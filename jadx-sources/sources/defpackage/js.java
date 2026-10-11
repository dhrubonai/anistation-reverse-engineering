package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class js extends so5 implements Map {
    public es A;
    public gs B;
    public is C;

    @Override // java.util.Map
    public final Set entrySet() {
        es esVar = this.A;
        if (esVar == null) {
            es esVar2 = new es(this, (byte) 0);
            this.A = esVar2;
            return esVar2;
        }
        return esVar;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.z;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        if (i != this.z) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        gs gsVar = this.B;
        if (gsVar == null) {
            gs gsVar2 = new gs(this);
            this.B = gsVar2;
            return gsVar2;
        }
        return gsVar;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.z;
        int i = this.z;
        int[] iArr = this.x;
        if (iArr.length < size) {
            this.x = Arrays.copyOf(iArr, size);
            this.y = Arrays.copyOf(this.y, size * 2);
        }
        if (this.z != i) {
            ze0.j();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        is isVar = this.C;
        if (isVar == null) {
            is isVar2 = new is(this);
            this.C = isVar2;
            return isVar2;
        }
        return isVar;
    }
}

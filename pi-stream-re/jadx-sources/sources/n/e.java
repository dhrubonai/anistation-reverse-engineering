package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import r6.w;

/* loaded from: classes.dex */
public class e extends k implements Map {
    public d A;

    /* renamed from: y, reason: collision with root package name */
    public w f7862y;

    /* renamed from: z, reason: collision with root package name */
    public b f7863z;

    public e(e eVar) {
        if (eVar != null) {
            i(eVar);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        w wVar = this.f7862y;
        if (wVar == null) {
            w wVar2 = new w(this, 2);
            this.f7862y = wVar2;
            return wVar2;
        }
        return wVar;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f7863z;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.f7863z = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final boolean m(Collection collection) {
        int i10 = this.f7891c;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(h(i11))) {
                j(i11);
            }
        }
        if (i10 != this.f7891c) {
            return true;
        }
        return false;
    }

    public final Object[] n(int i10, Object[] objArr) {
        int i11 = this.f7891c;
        if (objArr.length < i11) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = this.f7890b[(i12 << 1) + i10];
        }
        if (objArr.length > i11) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f7891c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.A;
        if (dVar == null) {
            d dVar2 = new d(this);
            this.A = dVar2;
            return dVar2;
        }
        return dVar;
    }
}

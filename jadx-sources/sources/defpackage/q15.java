package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q15 extends zw2 {
    public final transient rw2 A;
    public final transient Object[] B;
    public final transient boolean C;
    public final transient int D;

    /* JADX WARN: Multi-variable type inference failed */
    public q15(rw2 rw2Var, Object[] objArr, int i, int i2) {
        this.A = rw2Var;
        this.B = objArr;
        this.C = i;
        this.D = i2;
    }

    @Override // defpackage.gw2
    public final int c(Object[] objArr, int i) {
        return b().c(objArr, i);
    }

    @Override // defpackage.gw2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.A.get(key))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.gw2
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public final ho6 iterator() {
        return b().listIterator(0);
    }

    @Override // defpackage.zw2
    public final nw2 n() {
        return new p15(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.D;
    }
}

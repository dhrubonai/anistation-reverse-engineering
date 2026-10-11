package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fl4 extends l2 {
    public final /* synthetic */ byte x;
    public final dl4 y;

    public /* synthetic */ fl4(dl4 dl4Var, byte b) {
        this.x = b;
        this.y = dl4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.x) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.l2
    public final int b() {
        byte b = this.x;
        dl4 dl4Var = this.y;
        switch (b) {
            case 0:
                return dl4Var.C;
            default:
                return dl4Var.C;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.x;
        dl4 dl4Var = this.y;
        switch (b) {
            case 0:
                dl4Var.clear();
                return;
            default:
                dl4Var.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.x) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    dl4 dl4Var = this.y;
                    Object obj2 = dl4Var.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && dl4Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.y.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.x;
        dl4 dl4Var = this.y;
        switch (b) {
            case 0:
                return new gl4(dl4Var);
            default:
                pj6[] pj6VarArr = new pj6[8];
                for (int i = 0; i < 8; i++) {
                    pj6VarArr[i] = new qj6((byte) 1);
                }
                return new el4(dl4Var, pj6VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.x) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.y.remove(entry.getKey(), entry.getValue());
            default:
                dl4 dl4Var = this.y;
                if (!dl4Var.containsKey(obj)) {
                    return false;
                }
                dl4Var.remove(obj);
                return true;
        }
    }
}

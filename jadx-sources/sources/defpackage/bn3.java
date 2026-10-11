package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bn3 extends l2 {
    public final /* synthetic */ byte x;
    public final an3 y;

    public /* synthetic */ bn3(an3 an3Var, byte b) {
        this.x = b;
        this.y = an3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.x) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        byte b = this.x;
        collection.getClass();
        switch (b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.l2
    public final int b() {
        byte b = this.x;
        an3 an3Var = this.y;
        switch (b) {
            case 0:
                return an3Var.F;
            default:
                return an3Var.F;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.x;
        an3 an3Var = this.y;
        switch (b) {
            case 0:
                an3Var.clear();
                return;
            default:
                an3Var.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.x;
        an3 an3Var = this.y;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int g = an3Var.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                Object[] objArr = an3Var.y;
                objArr.getClass();
                return a34.i(objArr[g], entry.getValue());
            default:
                return an3Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.x) {
            case 0:
                collection.getClass();
                return this.y.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        byte b = this.x;
        an3 an3Var = this.y;
        switch (b) {
            case 0:
                return an3Var.isEmpty();
            default:
                return an3Var.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.x;
        an3 an3Var = this.y;
        switch (b) {
            case 0:
                return new xm3(an3Var, (byte) 0);
            default:
                return new xm3(an3Var, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.x;
        an3 an3Var = this.y;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    an3Var.c();
                    int g = an3Var.g(entry.getKey());
                    if (g >= 0) {
                        Object[] objArr = an3Var.y;
                        objArr.getClass();
                        if (a34.i(objArr[g], entry.getValue())) {
                            an3Var.k(g);
                            return true;
                        }
                    }
                }
                return false;
            default:
                an3Var.c();
                int g2 = an3Var.g(obj);
                if (g2 < 0) {
                    return false;
                }
                an3Var.k(g2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        byte b = this.x;
        an3 an3Var = this.y;
        collection.getClass();
        switch (b) {
            case 0:
                an3Var.c();
                return super.removeAll(collection);
            default:
                an3Var.c();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        byte b = this.x;
        an3 an3Var = this.y;
        collection.getClass();
        switch (b) {
            case 0:
                an3Var.c();
                return super.retainAll(collection);
            default:
                an3Var.c();
                return super.retainAll(collection);
        }
    }
}

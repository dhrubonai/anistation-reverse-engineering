package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fh0 extends AbstractCollection implements Collection, k73 {
    public final /* synthetic */ byte x;
    public final Object y;

    public fh0(gh0 gh0Var) {
        this.x = (byte) 0;
        this.y = gh0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.x) {
            case 0:
                obj.getClass();
                throw new UnsupportedOperationException("CaseInsensitiveMap.values does not support add");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.x) {
            case 1:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 1:
                ((an3) obj).clear();
                return;
            case 2:
                ((dl4) obj).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 1:
                return ((an3) obj2).containsValue(obj);
            case 2:
                return ((dl4) obj2).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.x) {
            case 1:
                return ((an3) this.y).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return new ch0((gh0) obj, (byte) 2);
            case 1:
                return new xm3((an3) obj, (byte) 2);
            default:
                dl4 dl4Var = (dl4) obj;
                pj6[] pj6VarArr = new pj6[8];
                for (int i = 0; i < 8; i++) {
                    pj6VarArr[i] = new qj6((byte) 2);
                }
                return new el4(dl4Var, pj6VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.x) {
            case 1:
                an3 an3Var = (an3) this.y;
                an3Var.c();
                int h = an3Var.h(obj);
                if (h < 0) {
                    return false;
                }
                an3Var.k(h);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.x) {
            case 1:
                collection.getClass();
                ((an3) this.y).c();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.x) {
            case 1:
                collection.getClass();
                ((an3) this.y).c();
                return super.retainAll(collection);
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((gh0) obj).z;
            case 1:
                return ((an3) obj).F;
            default:
                return ((dl4) obj).C;
        }
    }

    public /* synthetic */ fh0(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }
}

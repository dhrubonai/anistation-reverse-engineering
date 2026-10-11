package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c44 implements ListIterator, j73 {
    public final /* synthetic */ byte x;
    public final List y;
    public int z;

    public c44(List list, int i, byte b) {
        this.x = b;
        switch (b) {
            case 1:
                this.y = list;
                this.z = i;
                return;
            default:
                this.y = list;
                this.z = i - 1;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.x;
        List list = this.y;
        switch (b) {
            case 0:
                int i = this.z + 1;
                this.z = i;
                list.add(i, obj);
                return;
            default:
                list.add(this.z, obj);
                this.z++;
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.x;
        List list = this.y;
        switch (b) {
            case 0:
                if (this.z >= list.size() - 1) {
                    return false;
                }
                return true;
            default:
                if (this.z >= list.size()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.x) {
            case 0:
                if (this.z >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.z > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.x;
        List list = this.y;
        switch (b) {
            case 0:
                int i = this.z + 1;
                this.z = i;
                return list.get(i);
            default:
                int i2 = this.z;
                this.z = i2 + 1;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.x) {
            case 0:
                return this.z + 1;
            default:
                return this.z;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.x;
        List list = this.y;
        switch (b) {
            case 0:
                int i = this.z;
                this.z = i - 1;
                return list.get(i);
            default:
                int i2 = this.z - 1;
                this.z = i2;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.x) {
            case 0:
                return this.z;
            default:
                return this.z - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.x;
        List list = this.y;
        switch (b) {
            case 0:
                list.remove(this.z);
                this.z--;
                return;
            default:
                int i = this.z - 1;
                this.z = i;
                list.remove(i);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.x;
        List list = this.y;
        switch (b) {
            case 0:
                list.set(this.z, obj);
                return;
            default:
                list.set(this.z, obj);
                return;
        }
    }
}

package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class al5 extends dl5 {
    public final /* synthetic */ Set A;
    public final /* synthetic */ byte y;
    public final /* synthetic */ Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al5(Set set, Set set2, byte b) {
        super((byte) 1);
        this.y = b;
        this.z = set;
        this.A = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.y;
        Set set = this.A;
        Set set2 = this.z;
        switch (b) {
            case 0:
                if (!set2.contains(obj) || !set.contains(obj)) {
                    return false;
                }
                return true;
            default:
                if (!set2.contains(obj) || ((oq5) set).A.equals(obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.y) {
            case 0:
                if (this.z.containsAll(collection) && this.A.containsAll(collection)) {
                    return true;
                }
                return false;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        byte b = this.y;
        Set set = this.z;
        Set set2 = this.A;
        switch (b) {
            case 0:
                return Collections.disjoint(set2, set);
            default:
                return ((oq5) set2).containsAll(set);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.y) {
            case 0:
                return new r33(this);
            default:
                return new r33(this, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.y;
        Set set = this.A;
        Set set2 = this.z;
        int i = 0;
        switch (b) {
            case 0:
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (set.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            default:
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!((oq5) set).A.equals(it2.next())) {
                        i++;
                    }
                }
                return i;
        }
    }
}

package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u33 implements Iterator {
    public ArrayDeque A;
    public Iterator x;
    public Iterator y;
    public Iterator z;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.y;
            it2.getClass();
            if (!it2.hasNext()) {
                while (true) {
                    Iterator it3 = this.z;
                    if (it3 != null && it3.hasNext()) {
                        it = this.z;
                        break;
                    }
                    ArrayDeque arrayDeque = this.A;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        break;
                    }
                    this.z = (Iterator) this.A.removeFirst();
                }
                it = null;
                this.z = it;
                if (it == null) {
                    return false;
                }
                Iterator it4 = (Iterator) it.next();
                this.y = it4;
                if (it4 instanceof u33) {
                    u33 u33Var = (u33) it4;
                    this.y = u33Var.y;
                    ArrayDeque arrayDeque2 = this.A;
                    if (arrayDeque2 == null) {
                        arrayDeque2 = new ArrayDeque();
                        this.A = arrayDeque2;
                    }
                    arrayDeque2.addFirst(this.z);
                    if (u33Var.A != null) {
                        while (!u33Var.A.isEmpty()) {
                            this.A.addFirst((Iterator) u33Var.A.removeLast());
                        }
                    }
                    this.z = u33Var.z;
                }
            } else {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Iterator it = this.y;
            this.x = it;
            return it.next();
        }
        qi2.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.x;
        if (it != null) {
            it.remove();
            this.x = null;
        } else {
            ze0.m("no calls to next() since the last call to remove()");
        }
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class w1 implements Iterator {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x = 2;
    public final Iterator y;
    public Object z;

    public w1(f2 f2Var) {
        Iterator it;
        this.A = f2Var;
        Collection collection = f2Var.y;
        this.z = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.y = it;
    }

    public void a() {
        f2 f2Var = (f2) this.A;
        f2Var.c();
        if (f2Var.y == ((Collection) this.z)) {
            return;
        }
        ze0.j();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.x) {
            case 0:
                return this.y.hasNext();
            case 1:
                return this.y.hasNext();
            default:
                a();
                return this.y.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.x;
        Iterator it = this.y;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.z = (Collection) entry.getValue();
                return ((x1) this.A).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.z = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.x;
        boolean z = false;
        Object obj = this.A;
        Iterator it = this.y;
        switch (b) {
            case 0:
                if (((Collection) this.z) != null) {
                    z = true;
                }
                io3.A("no calls to next() since the last call to remove()", z);
                it.remove();
                ((x1) obj).A.C -= ((Collection) this.z).size();
                ((Collection) this.z).clear();
                this.z = null;
                return;
            case 1:
                if (((Map.Entry) this.z) != null) {
                    z = true;
                }
                io3.A("no calls to next() since the last call to remove()", z);
                Collection collection = (Collection) ((Map.Entry) this.z).getValue();
                it.remove();
                ((y1) obj).z.C -= collection.size();
                collection.clear();
                this.z = null;
                return;
            default:
                it.remove();
                f2 f2Var = (f2) obj;
                f2Var.B.C--;
                f2Var.d();
                return;
        }
    }

    public w1(f2 f2Var, ListIterator listIterator) {
        this.A = f2Var;
        this.z = f2Var.y;
        this.y = listIterator;
    }

    public w1(y1 y1Var, Iterator it) {
        this.y = it;
        this.A = y1Var;
    }

    public w1(x1 x1Var) {
        this.A = x1Var;
        this.y = x1Var.z.entrySet().iterator();
    }
}

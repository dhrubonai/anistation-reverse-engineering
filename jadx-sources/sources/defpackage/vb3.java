package defpackage;

import com.google.protobuf.LazyField;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vb3 implements Iterator {
    public final /* synthetic */ byte x = 1;
    public Iterator y;

    public vb3(im7 im7Var) {
        this.y = im7Var.x.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.x) {
            case 0:
                return this.y.hasNext();
            case 1:
                return this.y.hasNext();
            default:
                return this.y.hasNext();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ub3, java.lang.Object] */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.x) {
            case 0:
                Map.Entry entry = (Map.Entry) this.y.next();
                if (entry.getValue() instanceof LazyField) {
                    ?? obj = new Object();
                    obj.x = entry;
                    return obj;
                }
                return entry;
            case 1:
                return (String) this.y.next();
            default:
                return (String) this.y.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.x) {
            case 0:
                this.y.remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public /* synthetic */ vb3() {
    }

    public vb3(Iterator it) {
        this.y = it;
    }
}

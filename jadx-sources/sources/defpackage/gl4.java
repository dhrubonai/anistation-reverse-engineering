package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gl4 implements Iterator, j73 {
    public final /* synthetic */ byte x = 0;
    public final Iterator y;

    public gl4(dl4 dl4Var) {
        pj6[] pj6VarArr = new pj6[8];
        for (int i = 0; i < 8; i++) {
            pj6VarArr[i] = new rj6(this);
        }
        this.y = new el4(dl4Var, pj6VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.x) {
            case 0:
                return ((el4) this.y).z;
            default:
                return this.y.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.x) {
            case 0:
                return (Map.Entry) ((el4) this.y).next();
            default:
                return (hr6) this.y.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.x) {
            case 0:
                ((el4) this.y).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public gl4(fr6 fr6Var) {
        this.y = fr6Var.G.iterator();
    }
}

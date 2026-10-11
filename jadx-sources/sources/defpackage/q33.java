package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q33 extends b72 {
    public final /* synthetic */ Iterable x;
    public final /* synthetic */ gs4 y;

    public q33(Iterable iterable, gs4 gs4Var) {
        this.x = iterable;
        this.y = gs4Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.x.iterator();
        it.getClass();
        return new r33(it, this.y);
    }
}

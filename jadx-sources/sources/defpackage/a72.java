package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a72 extends b72 {
    public final /* synthetic */ Iterable[] x;

    public a72(Iterable[] iterableArr) {
        this.x = iterableArr;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [u33, java.util.Iterator, java.lang.Object] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        z62 z62Var = new z62(this, this.x.length);
        ?? obj = new Object();
        obj.y = t33.B;
        obj.z = z62Var;
        return obj;
    }
}

package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class is5 extends es {
    public final /* synthetic */ fs5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is5(fs5 fs5Var) {
        super(fs5Var, (byte) 1);
        this.z = fs5Var;
    }

    @Override // defpackage.es, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new hs5(this.z);
    }
}

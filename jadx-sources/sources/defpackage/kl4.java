package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kl4 extends c3 implements ax2, Collection, j73 {
    public static final kl4 A;
    public final Object x;
    public final Object y;
    public final bl4 z;

    static {
        pk2 pk2Var = pk2.W;
        A = new kl4(pk2Var, pk2Var, bl4.z);
    }

    public kl4(Object obj, Object obj2, bl4 bl4Var) {
        this.x = obj;
        this.y = obj2;
        this.z = bl4Var;
    }

    @Override // defpackage.m0
    public final int b() {
        return this.z.y;
    }

    @Override // defpackage.m0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.z.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new xd2(this.x, this.z);
    }
}

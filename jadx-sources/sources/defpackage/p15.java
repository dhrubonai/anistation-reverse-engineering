package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p15 extends nw2 {
    public final /* synthetic */ q15 z;

    public p15(q15 q15Var) {
        this.z = q15Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        q15 q15Var = this.z;
        io3.r(i, q15Var.D);
        Object[] objArr = q15Var.B;
        int i2 = i * 2;
        boolean z = q15Var.C;
        Object obj = objArr[i2 + (z ? 1 : 0)];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (!z ? 1 : 0)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.gw2
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z.D;
    }
}

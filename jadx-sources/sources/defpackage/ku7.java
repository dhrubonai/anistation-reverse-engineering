package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ku7 extends st7 {
    public final /* synthetic */ mu7 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku7(mu7 mu7Var) {
        super((byte) 1);
        this.B = mu7Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        mu7 mu7Var = this.B;
        jy5.j(i, mu7Var.E);
        Object[] objArr = mu7Var.D;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B.E;
    }
}

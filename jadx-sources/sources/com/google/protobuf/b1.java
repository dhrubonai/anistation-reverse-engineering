package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b1 extends AbstractSet {
    public final Set x;
    public final /* synthetic */ Internal.MapAdapter y;

    public b1(Internal.MapAdapter mapAdapter, Set set) {
        this.y = mapAdapter;
        this.x = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a1(this.y, this.x.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x.size();
    }
}

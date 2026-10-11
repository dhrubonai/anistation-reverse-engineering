package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a1 implements Iterator {
    public final Iterator x;
    public final /* synthetic */ Internal.MapAdapter y;

    public a1(Internal.MapAdapter mapAdapter, Iterator it) {
        this.y = mapAdapter;
        this.x = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.x.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return new z0(this.y, (Map.Entry) this.x.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.x.remove();
    }
}

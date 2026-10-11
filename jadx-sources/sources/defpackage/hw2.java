package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hw2 extends g2 implements Serializable {
    public final Object x;
    public final Object y;

    public hw2(Object obj, Object obj2) {
        this.x = obj;
        this.y = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.x;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.y;
    }

    @Override // defpackage.g2, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}

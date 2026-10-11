package defpackage;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sw2 extends ho6 {
    public ho6 A;
    public final ho6 y;
    public Object z;

    public sw2(ow2 ow2Var) {
        super((byte) 0);
        this.y = ow2Var.B.entrySet().iterator();
        this.z = null;
        this.A = t33.B;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.A.hasNext() && !this.y.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.A.hasNext()) {
            Map.Entry entry = (Map.Entry) this.y.next();
            this.z = entry.getKey();
            this.A = ((gw2) entry.getValue()).iterator();
        }
        Object obj = this.z;
        Objects.requireNonNull(obj);
        return new hw2(obj, this.A.next());
    }
}

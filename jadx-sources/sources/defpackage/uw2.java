package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uw2 extends ho6 {
    public final /* synthetic */ Iterator A;
    public int y;
    public Object z;

    public uw2(ho6 ho6Var) {
        super((byte) 0);
        this.A = ho6Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.y <= 0 && !this.A.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.y;
        if (i <= 0) {
            yb4 yb4Var = (yb4) this.A.next();
            this.z = yb4Var.a;
            i = yb4Var.a();
            this.y = i;
        }
        this.y = i - 1;
        Object obj = this.z;
        Objects.requireNonNull(obj);
        return obj;
    }
}

package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class sh3 implements Iterator, j73 {
    public String x;
    public boolean y;
    public final /* synthetic */ os z;

    public sh3(os osVar) {
        this.z = osVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str = this.x;
        if (str == null && !this.y) {
            str = ((BufferedReader) this.z.b).readLine();
            this.x = str;
            if (str == null) {
                this.y = true;
            }
        }
        if (str != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            String str = this.x;
            this.x = null;
            str.getClass();
            return str;
        }
        qi2.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

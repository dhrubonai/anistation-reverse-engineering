package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l01 implements Iterable {
    public final Object x = new Object();
    public final HashMap y = new HashMap();
    public Set z = Collections.EMPTY_SET;
    public List A = Collections.EMPTY_LIST;

    public final int b(tp1 tp1Var) {
        int i;
        synchronized (this.x) {
            try {
                if (this.y.containsKey(tp1Var)) {
                    i = ((Integer) this.y.get(tp1Var)).intValue();
                } else {
                    i = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.x) {
            it = this.A.iterator();
        }
        return it;
    }
}

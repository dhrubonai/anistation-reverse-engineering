package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ny7 {
    public static final js a = new so5(0);

    public static synchronized void a() {
        synchronized (ny7.class) {
            js jsVar = a;
            Iterator it = ((is) jsVar.values()).iterator();
            if (!it.hasNext()) {
                jsVar.clear();
            } else {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
        }
    }
}

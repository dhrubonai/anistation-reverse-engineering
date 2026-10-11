package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l32 implements wz {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.wz
    public final void a(boolean z) {
        synchronized (n32.j) {
            try {
                ArrayList arrayList = new ArrayList(n32.k.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    n32 n32Var = (n32) obj;
                    if (n32Var.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = n32Var.i.iterator();
                        while (it.hasNext()) {
                            n32 n32Var2 = ((k32) it.next()).a;
                            if (!z) {
                                ((w81) n32Var2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

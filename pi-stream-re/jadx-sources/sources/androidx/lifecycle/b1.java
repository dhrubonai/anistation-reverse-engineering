package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1075a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f1075a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((w0) it.next()).clear();
        }
        linkedHashMap.clear();
    }
}

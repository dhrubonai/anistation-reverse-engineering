package i4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Set f5383a = Collections.newSetFromMap(new WeakHashMap());

    @Override // i4.j
    public final void c() {
        Iterator it = p4.m.d(this.f5383a).iterator();
        while (it.hasNext()) {
            ((m4.i) it.next()).c();
        }
    }

    @Override // i4.j
    public final void j() {
        Iterator it = p4.m.d(this.f5383a).iterator();
        while (it.hasNext()) {
            ((m4.i) it.next()).j();
        }
    }

    @Override // i4.j
    public final void k() {
        Iterator it = p4.m.d(this.f5383a).iterator();
        while (it.hasNext()) {
            ((m4.i) it.next()).k();
        }
    }
}

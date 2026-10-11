package i4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class p implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f5363a;

    public p(v vVar) {
        this.f5363a = vVar;
    }

    @Override // i4.a
    public final void a(boolean z9) {
        ArrayList arrayList;
        p4.m.a();
        synchronized (this.f5363a) {
            arrayList = new ArrayList((Set) this.f5363a.f5382d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z9);
        }
    }
}

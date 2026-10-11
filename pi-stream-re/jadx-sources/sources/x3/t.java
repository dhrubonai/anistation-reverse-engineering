package x3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final List f11252a;

    public t(ArrayList arrayList) {
        this.f11252a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f11252a.iterator();
    }
}

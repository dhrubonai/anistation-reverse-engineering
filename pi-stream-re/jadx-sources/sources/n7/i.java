package n7;

import h7.l;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f8021a;

    /* renamed from: b, reason: collision with root package name */
    public final l f8022b;

    public i(o7.c cVar, x6.a aVar) {
        this.f8021a = cVar;
        this.f8022b = aVar;
    }

    @Override // n7.c
    public final Iterator iterator() {
        return new h(this);
    }
}

package n7;

import g0.f1;
import java.util.Iterator;
import r6.h0;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f8012a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8013b;

    public b(c cVar, int i10) {
        boolean z9;
        h0.u(cVar, "sequence");
        this.f8012a = cVar;
        this.f8013b = i10;
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // n7.c
    public final Iterator iterator() {
        return new f1(this);
    }
}

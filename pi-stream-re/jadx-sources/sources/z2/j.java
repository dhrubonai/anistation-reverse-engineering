package z2;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements y2.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f12037a;

    public j(List list) {
        this.f12037a = list;
    }

    @Override // y2.d
    public final int a(long j4) {
        return j4 < 0 ? 0 : -1;
    }

    @Override // y2.d
    public final long b(int i10) {
        boolean z9;
        if (i10 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        return 0L;
    }

    @Override // y2.d
    public final List c(long j4) {
        if (j4 >= 0) {
            return this.f12037a;
        }
        return Collections.emptyList();
    }

    @Override // y2.d
    public final int d() {
        return 1;
    }
}

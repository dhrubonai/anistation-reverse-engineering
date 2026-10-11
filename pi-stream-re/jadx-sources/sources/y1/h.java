package y1;

import r6.e0;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11498a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11499b;

    public h(int i10, c1.v vVar) {
        this.f11498a = (vVar.f1927e & 1) != 0;
        this.f11499b = p.h(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return e0.f9450a.c(this.f11499b, hVar.f11499b).c(this.f11498a, hVar.f11498a).e();
    }
}

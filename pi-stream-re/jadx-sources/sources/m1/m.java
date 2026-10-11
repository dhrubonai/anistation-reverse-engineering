package m1;

import h1.e0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final h1.g f7095a;

    /* renamed from: c, reason: collision with root package name */
    public final c1.r f7097c = w1.e.A;

    /* renamed from: b, reason: collision with root package name */
    public final int f7096b = 1;

    public m(h1.g gVar) {
        this.f7095a = gVar;
    }

    public final p a(z1.p pVar, n1.c cVar, i.g gVar, int i10, int[] iArr, y1.s sVar, int i11, long j4, boolean z9, ArrayList arrayList, s sVar2, e0 e0Var) {
        h1.h a10 = this.f7095a.a();
        if (e0Var != null) {
            a10.f(e0Var);
        }
        return new p(this.f7097c, pVar, cVar, gVar, i10, iArr, sVar, i11, a10, j4, this.f7096b, z9, arrayList, sVar2);
    }
}

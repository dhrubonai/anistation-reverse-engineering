package x6;

import java.util.RandomAccess;
import r6.h0;

/* loaded from: classes.dex */
public final class d extends e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final e f11308a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11309b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11310c;

    public d(e eVar, int i10, int i11) {
        h0.u(eVar, "list");
        this.f11308a = eVar;
        this.f11309b = i10;
        int b10 = eVar.b();
        if (i10 >= 0 && i11 <= b10) {
            if (i10 <= i11) {
                this.f11310c = i11 - i10;
                return;
            }
            throw new IllegalArgumentException(a3.g.p("fromIndex: ", i10, " > toIndex: ", i11));
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + b10);
    }

    @Override // x6.b
    public final int b() {
        return this.f11310c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f11310c;
        if (i10 >= 0 && i10 < i11) {
            return this.f11308a.get(this.f11309b + i10);
        }
        throw new IndexOutOfBoundsException(a3.g.p("index: ", i10, ", size: ", i11));
    }
}

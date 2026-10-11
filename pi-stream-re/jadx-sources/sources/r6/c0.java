package r6;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class c0 extends e0 {
    public static e0 f(int i10) {
        if (i10 < 0) {
            return e0.f9451b;
        }
        if (i10 > 0) {
            return e0.f9452c;
        }
        return e0.f9450a;
    }

    @Override // r6.e0
    public final e0 a(int i10, int i11) {
        int i12;
        if (i10 < i11) {
            i12 = -1;
        } else if (i10 > i11) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return f(i12);
    }

    @Override // r6.e0
    public final e0 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // r6.e0
    public final e0 c(boolean z9, boolean z10) {
        int i10;
        if (z9 == z10) {
            i10 = 0;
        } else if (z9) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        return f(i10);
    }

    @Override // r6.e0
    public final e0 d(boolean z9, boolean z10) {
        int i10;
        if (z10 == z9) {
            i10 = 0;
        } else if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        return f(i10);
    }

    @Override // r6.e0
    public final int e() {
        return 0;
    }
}

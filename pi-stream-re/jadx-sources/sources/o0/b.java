package o0;

import android.graphics.Rect;
import h0.h;
import j6.e;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f8074a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f8075b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8076c;

    /* renamed from: d, reason: collision with root package name */
    public final e f8077d;

    public b(boolean z9, e eVar) {
        this.f8076c = z9;
        this.f8077d = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f8077d.getClass();
        Rect rect = this.f8074a;
        ((h) obj).d(rect);
        Rect rect2 = this.f8075b;
        ((h) obj2).d(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z9 = this.f8076c;
        if (i12 < i13) {
            if (!z9) {
                return -1;
            }
            return 1;
        }
        if (i12 > i13) {
            if (z9) {
                return -1;
            }
            return 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            if (!z9) {
                return -1;
            }
            return 1;
        }
        if (i16 > i17) {
            if (z9) {
                return -1;
            }
            return 1;
        }
        return 0;
    }
}

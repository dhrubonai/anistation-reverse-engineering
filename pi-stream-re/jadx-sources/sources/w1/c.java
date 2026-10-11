package w1;

import d2.g0;
import v1.u0;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f10749a;

    /* renamed from: b, reason: collision with root package name */
    public final u0[] f10750b;

    public c(int[] iArr, u0[] u0VarArr) {
        this.f10749a = iArr;
        this.f10750b = u0VarArr;
    }

    public final g0 a(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f10749a;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return this.f10750b[i11];
                }
                i11++;
            } else {
                f1.o.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new d2.o();
            }
        }
    }
}

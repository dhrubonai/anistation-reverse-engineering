package w2;

import f1.b0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final p f10925a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10926b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f10927c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f10928d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10929e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f10930f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f10931g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10932h;

    public s(p pVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j4) {
        boolean z9;
        boolean z10;
        if (iArr.length == jArr2.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b.g(z10);
        w7.b.g(iArr2.length == jArr2.length);
        this.f10925a = pVar;
        this.f10927c = jArr;
        this.f10928d = iArr;
        this.f10929e = i10;
        this.f10930f = jArr2;
        this.f10931g = iArr2;
        this.f10932h = j4;
        this.f10926b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j4) {
        long[] jArr = this.f10930f;
        for (int b10 = b0.b(jArr, j4, true); b10 < jArr.length; b10++) {
            if ((this.f10931g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }
}

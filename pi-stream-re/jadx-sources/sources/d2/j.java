package d2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3157a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3158b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f3159c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f3160d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f3161e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3162f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f3158b = iArr;
        this.f3159c = jArr;
        this.f3160d = jArr2;
        this.f3161e = jArr3;
        int length = iArr.length;
        this.f3157a = length;
        if (length > 0) {
            this.f3162f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f3162f = 0L;
        }
    }

    @Override // d2.b0
    public final boolean g() {
        return true;
    }

    @Override // d2.b0
    public final a0 j(long j4) {
        long[] jArr = this.f3161e;
        int f10 = f1.b0.f(jArr, j4, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f3159c;
        c0 c0Var = new c0(j10, jArr2[f10]);
        if (j10 < j4 && f10 != this.f3157a - 1) {
            int i10 = f10 + 1;
            return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
        }
        return new a0(c0Var, c0Var);
    }

    @Override // d2.b0
    public final long l() {
        return this.f3162f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f3157a + ", sizes=" + Arrays.toString(this.f3158b) + ", offsets=" + Arrays.toString(this.f3159c) + ", timeUs=" + Arrays.toString(this.f3161e) + ", durationsUs=" + Arrays.toString(this.f3160d) + ")";
    }
}

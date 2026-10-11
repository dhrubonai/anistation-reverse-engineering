package f1;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class p implements w2.e {

    /* renamed from: a, reason: collision with root package name */
    public int f3839a;

    /* renamed from: b, reason: collision with root package name */
    public int f3840b;

    /* renamed from: c, reason: collision with root package name */
    public int f3841c;

    /* renamed from: d, reason: collision with root package name */
    public int f3842d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3843e;

    public p() {
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        this.f3839a = 0;
        this.f3840b = -1;
        this.f3841c = 0;
        this.f3843e = new long[highestOneBit];
        this.f3842d = highestOneBit - 1;
    }

    @Override // w2.e
    public final int a() {
        return -1;
    }

    @Override // w2.e
    public final int b() {
        return this.f3839a;
    }

    @Override // w2.e
    public final int c() {
        int i10 = this.f3840b;
        Object obj = this.f3843e;
        if (i10 == 8) {
            return ((t) obj).v();
        }
        if (i10 == 16) {
            return ((t) obj).A();
        }
        int i11 = this.f3841c;
        this.f3841c = i11 + 1;
        if (i11 % 2 == 0) {
            int v9 = ((t) obj).v();
            this.f3842d = v9;
            return (v9 & 240) >> 4;
        }
        return this.f3842d & 15;
    }

    public final long d() {
        int i10 = this.f3841c;
        if (i10 != 0) {
            long[] jArr = (long[]) this.f3843e;
            int i11 = this.f3839a;
            long j4 = jArr[i11];
            this.f3839a = this.f3842d & (i11 + 1);
            this.f3841c = i10 - 1;
            return j4;
        }
        throw new NoSuchElementException();
    }

    public p(w2.b bVar) {
        t tVar = bVar.f10796c;
        this.f3843e = tVar;
        tVar.G(12);
        this.f3840b = tVar.y() & 255;
        this.f3839a = tVar.y();
    }
}

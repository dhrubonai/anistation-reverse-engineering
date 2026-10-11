package w1;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final long f10746a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10747b;

    /* renamed from: c, reason: collision with root package name */
    public long f10748c;

    public b(long j4, long j10) {
        this.f10746a = j4;
        this.f10747b = j10;
        this.f10748c = j4 - 1;
    }

    public final void b() {
        long j4 = this.f10748c;
        if (j4 >= this.f10746a && j4 <= this.f10747b) {
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // w1.p
    public final boolean next() {
        boolean z9;
        long j4 = this.f10748c + 1;
        this.f10748c = j4;
        if (j4 > this.f10747b) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }
}

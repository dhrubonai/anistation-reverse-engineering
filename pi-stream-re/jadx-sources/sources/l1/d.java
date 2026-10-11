package l1;

import java.util.Set;
import r6.d2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f6634d;

    /* renamed from: a, reason: collision with root package name */
    public final int f6635a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6636b;

    /* renamed from: c, reason: collision with root package name */
    public final r6.t0 f6637c;

    static {
        d dVar;
        if (f1.b0.f3799a >= 33) {
            r6.s0 s0Var = new r6.s0();
            for (int i10 = 1; i10 <= 10; i10++) {
                s0Var.C0(Integer.valueOf(f1.b0.q(i10)));
            }
            dVar = new d(2, s0Var.D0());
        } else {
            dVar = new d(2, 10);
        }
        f6634d = dVar;
    }

    public d(int i10, Set set) {
        this.f6635a = i10;
        r6.t0 j4 = r6.t0.j(set);
        this.f6637c = j4;
        d2 it = j4.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = Math.max(i11, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f6636b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f6635a == dVar.f6635a && this.f6636b == dVar.f6636b && f1.b0.a(this.f6637c, dVar.f6637c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = ((this.f6635a * 31) + this.f6636b) * 31;
        r6.t0 t0Var = this.f6637c;
        if (t0Var == null) {
            hashCode = 0;
        } else {
            hashCode = t0Var.hashCode();
        }
        return i10 + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f6635a + ", maxChannelCount=" + this.f6636b + ", channelMasks=" + this.f6637c + "]";
    }

    public d(int i10, int i11) {
        this.f6635a = i10;
        this.f6636b = i11;
        this.f6637c = null;
    }
}

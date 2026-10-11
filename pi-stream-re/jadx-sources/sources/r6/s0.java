package r6;

import java.util.Objects;

/* loaded from: classes.dex */
public final class s0 extends i0 {
    public final void C0(Object obj) {
        obj.getClass();
        x0(obj);
    }

    public final t0 D0() {
        int i10 = this.f9479d;
        if (i10 != 0) {
            if (i10 != 1) {
                t0 i11 = t0.i(i10, this.f9478c);
                this.f9479d = i11.size();
                this.f9480e = true;
                return i11;
            }
            Object obj = this.f9478c[0];
            Objects.requireNonNull(obj);
            int i12 = t0.f9538c;
            return new a2(obj);
        }
        int i13 = t0.f9538c;
        return t1.A;
    }

    @Override // q6.g
    public final q6.g a(Object obj) {
        obj.getClass();
        x0(obj);
        return this;
    }
}

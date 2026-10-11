package l7;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final f f6889d = new f(1, 0);

    public f(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // l7.d
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (this.f6882a == fVar.f6882a) {
                    if (this.f6883b == fVar.f6883b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // l7.d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f6882a * 31) + this.f6883b;
    }

    @Override // l7.d
    public final boolean isEmpty() {
        if (this.f6882a > this.f6883b) {
            return true;
        }
        return false;
    }

    @Override // l7.d
    public final String toString() {
        return this.f6882a + ".." + this.f6883b;
    }
}

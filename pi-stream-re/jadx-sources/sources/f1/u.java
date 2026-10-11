package f1;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final u f3861c = new u(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f3862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3863b;

    static {
        new u(0, 0);
    }

    public u(int i10, int i11) {
        boolean z9;
        if ((i10 != -1 && i10 < 0) || (i11 != -1 && i11 < 0)) {
            z9 = false;
        } else {
            z9 = true;
        }
        w7.b.g(z9);
        this.f3862a = i10;
        this.f3863b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f3862a != uVar.f3862a || this.f3863b != uVar.f3863b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f3862a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f3863b;
    }

    public final String toString() {
        return this.f3862a + "x" + this.f3863b;
    }
}

package c1;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f1949a;

    public w0(s sVar) {
        this.f1949a = sVar;
    }

    public final boolean a(int... iArr) {
        s sVar = this.f1949a;
        sVar.getClass();
        for (int i10 : iArr) {
            if (sVar.f1889a.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        return this.f1949a.equals(((w0) obj).f1949a);
    }

    public final int hashCode() {
        return this.f1949a.hashCode();
    }
}

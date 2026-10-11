package p7;

/* loaded from: classes.dex */
public final class n0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8724a;

    public n0(boolean z9) {
        this.f8724a = z9;
    }

    @Override // p7.x0
    public final boolean a() {
        return this.f8724a;
    }

    @Override // p7.x0
    public final n1 d() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f8724a) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}

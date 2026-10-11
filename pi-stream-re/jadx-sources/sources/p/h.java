package p;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public k f8387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f8388b;

    public h(i iVar) {
        this.f8388b = iVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8387a.f8394b - ((k) obj).f8394b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f8387a != null) {
            for (int i10 = 0; i10 < 9; i10++) {
                str = str + this.f8387a.f8400h[i10] + " ";
            }
        }
        StringBuilder a10 = j.a(str, "] ");
        a10.append(this.f8387a);
        return a10.toString();
    }
}

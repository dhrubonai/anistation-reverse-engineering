package e4;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3495h;

    @Override // e4.n
    public final int a(int i10, int i11, int i12, int i13) {
        switch (this.f3495h) {
            case 2:
                if (b(i10, i11, i12, i13) == 1.0f) {
                    return 2;
                }
                return n.f3496a.a(i10, i11, i12, i13);
            case 3:
                return 2;
            case 4:
                if (n.f3502g) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    @Override // e4.n
    public final float b(int i10, int i11, int i12, int i13) {
        float f10 = 1.0f;
        switch (this.f3495h) {
            case 2:
                return Math.min(1.0f, n.f3496a.b(i10, i11, i12, i13));
            case 3:
                return Math.max(i12 / i10, i13 / i11);
            case 4:
                if (n.f3502g) {
                    return Math.min(i12 / i10, i13 / i11);
                }
                if (Math.max(i11 / i13, i10 / i12) != 0) {
                    f10 = 1.0f / Integer.highestOneBit(r3);
                }
                return f10;
            default:
                return 1.0f;
        }
    }
}

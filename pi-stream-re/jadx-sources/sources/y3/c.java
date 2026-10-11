package y3;

/* loaded from: classes.dex */
public final class c extends e0.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11583b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(4);
        this.f11583b = i10;
    }

    @Override // e0.j
    public final k a() {
        switch (this.f11583b) {
            case 0:
                return new b(this);
            case 1:
                return new g(this);
            default:
                return new m(this);
        }
    }
}

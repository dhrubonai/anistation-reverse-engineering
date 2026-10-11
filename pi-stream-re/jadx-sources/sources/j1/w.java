package j1;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements f1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5918b;

    public /* synthetic */ w(int i10, boolean z9) {
        this.f5917a = i10;
        this.f5918b = z9;
    }

    @Override // f1.l
    public final void invoke(Object obj) {
        int i10 = this.f5917a;
        boolean z9 = this.f5918b;
        switch (i10) {
            case 0:
                ((c1.x0) obj).C(z9);
                return;
            default:
                ((c1.x0) obj).p(z9);
                return;
        }
    }
}

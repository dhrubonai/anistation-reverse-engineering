package androidx.fragment.app;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements f0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1059b;

    public /* synthetic */ z(Object obj, int i10) {
        this.f1058a = i10;
        this.f1059b = obj;
    }

    @Override // f0.a
    public final void accept(Object obj) {
        int i10 = this.f1058a;
        Object obj2 = this.f1059b;
        switch (i10) {
            case 0:
                ((b0) obj2).mFragments.a();
                return;
            case 1:
                ((b0) obj2).mFragments.a();
                return;
            default:
                androidx.activity.r rVar = (androidx.activity.r) obj2;
                rVar.getClass();
                if (com.bumptech.glide.d.G()) {
                    rVar.b();
                    return;
                }
                return;
        }
    }
}

package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class d3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f448b;

    public /* synthetic */ d3(SearchView searchView, int i10) {
        this.f447a = i10;
        this.f448b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f447a;
        SearchView searchView = this.f448b;
        switch (i10) {
            case 0:
                searchView.u();
                return;
            default:
                l0.b bVar = searchView.f356i0;
                if (bVar instanceof u3) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}

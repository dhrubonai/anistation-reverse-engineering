package f;

import android.content.Context;
import msr.pistream.app.ui.detail.DetailActivity;

/* loaded from: classes.dex */
public final class l implements b.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.a f3750b;

    public /* synthetic */ l(androidx.appcompat.app.a aVar, int i10) {
        this.f3749a = i10;
        this.f3750b = aVar;
    }

    @Override // b.b
    public final void a(Context context) {
        int i10 = this.f3749a;
        androidx.appcompat.app.a aVar = this.f3750b;
        switch (i10) {
            case 0:
                q k10 = aVar.k();
                k10.b();
                k10.e(aVar.getSavedStateRegistry().a("androidx:appcompat"));
                return;
            case 1:
                ((f8.g) aVar).t();
                return;
            case 2:
                ((f8.g) aVar).t();
                return;
            default:
                DetailActivity detailActivity = (DetailActivity) aVar;
                if (!detailActivity.f7739e) {
                    detailActivity.f7739e = true;
                    h8.f fVar = (h8.f) detailActivity.generatedComponent();
                    fVar.getClass();
                    return;
                }
                return;
        }
    }
}

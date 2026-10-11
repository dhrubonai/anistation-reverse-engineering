package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class l2 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f561b;

    public /* synthetic */ l2(Object obj, int i10) {
        this.f560a = i10;
        this.f561b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i10 = this.f560a;
        Object obj = this.f561b;
        switch (i10) {
            case 0:
                o2 o2Var = (o2) obj;
                if (o2Var.b()) {
                    o2Var.d();
                    return;
                }
                return;
            default:
                l0.b bVar = (l0.b) obj;
                bVar.f6579a = true;
                bVar.notifyDataSetChanged();
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i10 = this.f560a;
        Object obj = this.f561b;
        switch (i10) {
            case 0:
                ((o2) obj).dismiss();
                return;
            default:
                l0.b bVar = (l0.b) obj;
                bVar.f6579a = false;
                bVar.notifyDataSetInvalidated();
                return;
        }
    }
}

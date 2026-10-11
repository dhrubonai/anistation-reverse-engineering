package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class i2 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f532b;

    public /* synthetic */ i2(Object obj, int i10) {
        this.f531a = i10;
        this.f532b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j4) {
        b2 b2Var;
        int i11 = this.f531a;
        Object obj = this.f532b;
        switch (i11) {
            case 0:
                if (i10 != -1 && (b2Var = ((o2) obj).f590c) != null) {
                    b2Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) obj).q(i10);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

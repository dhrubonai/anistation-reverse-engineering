package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class j3 implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f541b;

    public /* synthetic */ j3(View view, int i10) {
        this.f540a = i10;
        this.f541b = view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j4) {
        Object item;
        int selectedItemPosition;
        int i11 = this.f540a;
        View view2 = this.f541b;
        switch (i11) {
            case 0:
                ((SearchView) view2).p(i10);
                return;
            default:
                m6.t tVar = (m6.t) view2;
                View view3 = null;
                if (i10 < 0) {
                    o2 o2Var = tVar.f7534e;
                    if (!o2Var.b()) {
                        item = null;
                    } else {
                        item = o2Var.f590c.getSelectedItem();
                    }
                } else {
                    item = tVar.getAdapter().getItem(i10);
                }
                m6.t.a(tVar, item);
                AdapterView.OnItemClickListener onItemClickListener = tVar.getOnItemClickListener();
                o2 o2Var2 = tVar.f7534e;
                if (onItemClickListener != null) {
                    if (view == null || i10 < 0) {
                        if (o2Var2.b()) {
                            view3 = o2Var2.f590c.getSelectedView();
                        }
                        view = view3;
                        if (!o2Var2.b()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = o2Var2.f590c.getSelectedItemPosition();
                        }
                        i10 = selectedItemPosition;
                        if (!o2Var2.b()) {
                            j4 = Long.MIN_VALUE;
                        } else {
                            j4 = o2Var2.f590c.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(o2Var2.f590c, view, i10, j4);
                }
                o2Var2.dismiss();
                return;
        }
    }
}

package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class x implements g0, c0, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f5607a;

    public static int m(l lVar, Context context, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = lVar.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = lVar.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = lVar.getView(i13, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    public static boolean u(o oVar) {
        int size = oVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = oVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // j.c0
    public final boolean c(q qVar) {
        return false;
    }

    @Override // j.c0
    public final void g(Context context, o oVar) {
    }

    @Override // j.c0
    public final boolean i(q qVar) {
        return false;
    }

    public abstract void l(o oVar);

    public abstract void n(View view);

    public abstract void o(boolean z9);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j4) {
        l lVar;
        int i11;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            lVar = (l) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            lVar = (l) listAdapter;
        }
        o oVar = lVar.f5539a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i10);
        if (!(this instanceof i)) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        oVar.q(menuItem, this, i11);
    }

    public abstract void p(int i10);

    public abstract void q(int i10);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z9);

    public abstract void t(int i10);
}

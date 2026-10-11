package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class t2 extends b2 {
    public final int D;
    public final int E;
    public p2 F;
    public j.q G;

    public t2(Context context, boolean z9) {
        super(context, z9);
        if (1 == s2.a(context.getResources().getConfiguration())) {
            this.D = 21;
            this.E = 22;
        } else {
            this.D = 22;
            this.E = 21;
        }
    }

    @Override // androidx.appcompat.widget.b2, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        j.l lVar;
        int i10;
        j.q qVar;
        int pointToPosition;
        int i11;
        if (this.F != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i10 = headerViewListAdapter.getHeadersCount();
                lVar = (j.l) headerViewListAdapter.getWrappedAdapter();
            } else {
                lVar = (j.l) adapter;
                i10 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < lVar.getCount()) {
                qVar = lVar.getItem(i11);
            } else {
                qVar = null;
            }
            j.q qVar2 = this.G;
            if (qVar2 != qVar) {
                j.o oVar = lVar.f5539a;
                if (qVar2 != null) {
                    this.F.h(oVar, qVar2);
                }
                this.G = qVar;
                if (qVar != null) {
                    this.F.n(oVar, qVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        j.l lVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.D) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i10 == this.E) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                lVar = (j.l) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                lVar = (j.l) adapter;
            }
            lVar.f5539a.c(false);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void setHoverListener(p2 p2Var) {
        this.F = p2Var;
    }

    @Override // androidx.appcompat.widget.b2, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}

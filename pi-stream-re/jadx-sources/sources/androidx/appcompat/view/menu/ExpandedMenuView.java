package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.o3;
import j.e0;
import j.n;
import j.o;
import j.q;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements n, e0, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f295b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public o f296a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        o3 o3Var = new o3(context, context.obtainStyledAttributes(attributeSet, f295b, R.attr.listViewStyle, 0));
        if (o3Var.l(0)) {
            setBackgroundDrawable(o3Var.e(0));
        }
        if (o3Var.l(1)) {
            setDivider(o3Var.e(1));
        }
        o3Var.p();
    }

    @Override // j.e0
    public final void a(o oVar) {
        this.f296a = oVar;
    }

    @Override // j.n
    public final boolean d(q qVar) {
        return this.f296a.q(qVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j4) {
        d((q) getAdapter().getItem(i10));
    }
}

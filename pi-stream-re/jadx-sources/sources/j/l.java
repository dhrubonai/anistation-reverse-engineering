package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final o f5539a;

    /* renamed from: b, reason: collision with root package name */
    public int f5540b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5541c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5542d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f5543e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5544f;

    public l(o oVar, LayoutInflater layoutInflater, boolean z9, int i10) {
        this.f5542d = z9;
        this.f5543e = layoutInflater;
        this.f5539a = oVar;
        this.f5544f = i10;
        a();
    }

    public final void a() {
        o oVar = this.f5539a;
        q qVar = oVar.f5566v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f5555j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((q) arrayList.get(i10)) == qVar) {
                    this.f5540b = i10;
                    return;
                }
            }
        }
        this.f5540b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i10) {
        ArrayList l10;
        boolean z9 = this.f5542d;
        o oVar = this.f5539a;
        if (z9) {
            oVar.i();
            l10 = oVar.f5555j;
        } else {
            l10 = oVar.l();
        }
        int i11 = this.f5540b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (q) l10.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l10;
        boolean z9 = this.f5542d;
        o oVar = this.f5539a;
        if (z9) {
            oVar.i();
            l10 = oVar.f5555j;
        } else {
            l10 = oVar.l();
        }
        if (this.f5540b < 0) {
            return l10.size();
        }
        return l10.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z9 = false;
        if (view == null) {
            view = this.f5543e.inflate(this.f5544f, viewGroup, false);
        }
        int i12 = getItem(i10).f5573b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f5573b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f5539a.m() && i12 != i11) {
            z9 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z9);
        d0 d0Var = (d0) view;
        if (this.f5541c) {
            listMenuItemView.setForceShowIcon(true);
        }
        d0Var.c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

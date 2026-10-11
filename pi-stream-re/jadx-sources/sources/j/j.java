package j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f5531a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f5532b;

    public j(k kVar) {
        this.f5532b = kVar;
        a();
    }

    public final void a() {
        o oVar = this.f5532b.f5535c;
        q qVar = oVar.f5566v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f5555j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((q) arrayList.get(i10)) == qVar) {
                    this.f5531a = i10;
                    return;
                }
            }
        }
        this.f5531a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i10) {
        k kVar = this.f5532b;
        o oVar = kVar.f5535c;
        oVar.i();
        ArrayList arrayList = oVar.f5555j;
        kVar.getClass();
        int i11 = i10 + 0;
        int i12 = this.f5531a;
        if (i12 >= 0 && i11 >= i12) {
            i11++;
        }
        return (q) arrayList.get(i11);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        k kVar = this.f5532b;
        o oVar = kVar.f5535c;
        oVar.i();
        int size = oVar.f5555j.size();
        kVar.getClass();
        int i10 = size + 0;
        if (this.f5531a < 0) {
            return i10;
        }
        return i10 - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5532b.f5534b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((d0) view).c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

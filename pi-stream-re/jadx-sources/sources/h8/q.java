package h8;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final j f5080a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5081b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f5082c;

    /* renamed from: d, reason: collision with root package name */
    public LinearLayout f5083d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f5084e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f5085f;

    /* renamed from: g, reason: collision with root package name */
    public View f5086g;

    /* renamed from: h, reason: collision with root package name */
    public int f5087h;

    /* renamed from: i, reason: collision with root package name */
    public i8.d f5088i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f5089j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f5090k;

    /* renamed from: l, reason: collision with root package name */
    public c f5091l;

    /* renamed from: m, reason: collision with root package name */
    public RecyclerView f5092m;

    /* renamed from: n, reason: collision with root package name */
    public List f5093n;
    public List o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5094p;

    public q(j jVar) {
        this.f5080a = jVar;
        this.f5081b = jVar.getContext();
    }

    public final boolean a() {
        List list = this.o;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        List list = this.f5093n;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void c(List list, List list2) {
        if (list == null || list.isEmpty()) {
            list = null;
        }
        this.f5093n = list;
        if (list2 == null || list2.isEmpty()) {
            list2 = null;
        }
        this.o = list2;
        this.f5094p = true;
        LinearLayout linearLayout = this.f5090k;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        List list3 = this.f5093n;
        if (list3 != null) {
            this.f5088i.e(list3);
        }
        List list4 = this.o;
        if (list4 != null) {
            c cVar = this.f5091l;
            List list5 = cVar.f5025e;
            list5.clear();
            list5.addAll(list4);
            cVar.f7192a.b();
        }
        if (this.f5087h == 1 && this.o == null) {
            this.f5087h = 0;
        }
        if (this.f5087h == 0 && this.f5093n == null) {
            this.f5087h = 1;
        }
        d();
    }

    public final void d() {
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (this.f5082c == null) {
            return;
        }
        int i18 = 8;
        if (this.f5094p && !b() && !a()) {
            this.f5082c.setVisibility(8);
            return;
        }
        this.f5082c.setVisibility(0);
        if (this.f5094p && (!b() || !a())) {
            z9 = false;
        } else {
            z9 = true;
        }
        LinearLayout linearLayout = this.f5083d;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        Object tag = this.f5083d.getTag();
        if (tag instanceof View) {
            View view = (View) tag;
            if (z9) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            view.setVisibility(i17);
        }
        TextView textView = this.f5084e;
        if (this.f5087h == 0) {
            i11 = w8.i.f11065e;
        } else {
            i11 = w8.i.f11068h;
        }
        textView.setTextColor(i11);
        TextView textView2 = this.f5085f;
        if (this.f5087h == 1) {
            i12 = w8.i.f11065e;
        } else {
            i12 = w8.i.f11068h;
        }
        textView2.setTextColor(i12);
        if (this.f5087h == 1 && !a() && this.f5094p) {
            this.f5087h = 0;
        }
        if (this.f5087h == 0 && !b() && this.f5094p) {
            this.f5087h = 1;
        }
        RecyclerView recyclerView = this.f5089j;
        if (this.f5087h == 0 && b()) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        recyclerView.setVisibility(i13);
        LinearLayout linearLayout2 = this.f5090k;
        if (linearLayout2 != null) {
            if (this.f5087h == 0 && !this.f5094p) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            linearLayout2.setVisibility(i16);
        }
        RecyclerView recyclerView2 = this.f5092m;
        if (this.f5087h == 1 && a()) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        recyclerView2.setVisibility(i14);
        if (this.f5094p) {
            TextView textView3 = this.f5084e;
            if (b()) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            textView3.setVisibility(i15);
            TextView textView4 = this.f5085f;
            if (a()) {
                i18 = 0;
            }
            textView4.setVisibility(i18);
        }
        View view2 = this.f5086g;
        if (view2 != null && view2.getLayoutParams() != null) {
            Context context = this.f5081b;
            int i19 = context.getResources().getDisplayMetrics().widthPixels;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5086g.getLayoutParams();
            layoutParams.gravity = 83;
            int i20 = i19 / 2;
            layoutParams.leftMargin = this.f5087h * i20;
            layoutParams.width = i20 - w8.i.e(context, 16);
            this.f5086g.setLayoutParams(layoutParams);
        }
    }
}

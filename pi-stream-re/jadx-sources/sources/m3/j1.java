package m3;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7270a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f7271b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f7272c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f7273d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f7274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f7275f;

    public j1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f7275f = staggeredGridLayoutManager;
        this.f7274e = i10;
    }

    public static g1 h(View view) {
        return (g1) view.getLayoutParams();
    }

    public final void a() {
        View view = (View) this.f7270a.get(r0.size() - 1);
        g1 h10 = h(view);
        this.f7272c = this.f7275f.f1265r.b(view);
        h10.getClass();
    }

    public final void b() {
        this.f7270a.clear();
        this.f7271b = Integer.MIN_VALUE;
        this.f7272c = Integer.MIN_VALUE;
        this.f7273d = 0;
    }

    public final int c() {
        boolean z9 = this.f7275f.f1270w;
        ArrayList arrayList = this.f7270a;
        if (z9) {
            return e(arrayList.size() - 1, -1);
        }
        return e(0, arrayList.size());
    }

    public final int d() {
        boolean z9 = this.f7275f.f1270w;
        ArrayList arrayList = this.f7270a;
        if (z9) {
            return e(0, arrayList.size());
        }
        return e(arrayList.size() - 1, -1);
    }

    public final int e(int i10, int i11) {
        int i12;
        boolean z9;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7275f;
        int h10 = staggeredGridLayoutManager.f1265r.h();
        int f10 = staggeredGridLayoutManager.f1265r.f();
        if (i11 > i10) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        while (i10 != i11) {
            View view = (View) this.f7270a.get(i10);
            int d10 = staggeredGridLayoutManager.f1265r.d(view);
            int b10 = staggeredGridLayoutManager.f1265r.b(view);
            boolean z10 = false;
            if (d10 <= f10) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (b10 >= h10) {
                z10 = true;
            }
            if (z9 && z10 && (d10 < h10 || b10 > f10)) {
                return k0.F(view);
            }
            i10 += i12;
        }
        return -1;
    }

    public final int f(int i10) {
        int i11 = this.f7272c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.f7270a.size() == 0) {
            return i10;
        }
        a();
        return this.f7272c;
    }

    public final View g(int i10, int i11) {
        ArrayList arrayList = this.f7270a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7275f;
        View view = null;
        if (i11 == -1) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                View view2 = (View) arrayList.get(i12);
                if ((staggeredGridLayoutManager.f1270w && k0.F(view2) <= i10) || ((!staggeredGridLayoutManager.f1270w && k0.F(view2) >= i10) || !view2.hasFocusable())) {
                    break;
                }
                i12++;
                view = view2;
            }
        } else {
            int size2 = arrayList.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) arrayList.get(size2);
                if ((staggeredGridLayoutManager.f1270w && k0.F(view3) >= i10) || ((!staggeredGridLayoutManager.f1270w && k0.F(view3) <= i10) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    public final int i(int i10) {
        int i11 = this.f7271b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        ArrayList arrayList = this.f7270a;
        if (arrayList.size() == 0) {
            return i10;
        }
        View view = (View) arrayList.get(0);
        g1 h10 = h(view);
        this.f7271b = this.f7275f.f1265r.d(view);
        h10.getClass();
        return this.f7271b;
    }
}

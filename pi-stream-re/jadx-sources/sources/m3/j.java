package m3;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends h0 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f7254s;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7255g = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f7256h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7257i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f7258j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f7259k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f7260l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f7261m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f7262n = new ArrayList();
    public final ArrayList o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f7263p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f7264q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f7265r = new ArrayList();

    public static void h(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((a1) arrayList.get(size)).f7153a.animate().cancel();
            } else {
                return;
            }
        }
    }

    @Override // m3.h0
    public final boolean a(a1 a1Var, a1 a1Var2, z1.h hVar, z1.h hVar2) {
        int i10;
        int i11;
        int i12 = hVar.f11924a;
        int i13 = hVar.f11925b;
        if (a1Var2.p()) {
            int i14 = hVar.f11924a;
            i11 = hVar.f11925b;
            i10 = i14;
        } else {
            i10 = hVar2.f11924a;
            i11 = hVar2.f11925b;
        }
        if (a1Var == a1Var2) {
            return g(a1Var, i12, i13, i10, i11);
        }
        View view = a1Var.f7153a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(a1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(a1Var2);
        float f10 = -((int) ((i10 - i12) - translationX));
        View view2 = a1Var2.f7153a;
        view2.setTranslationX(f10);
        view2.setTranslationY(-((int) ((i11 - i13) - translationY)));
        view2.setAlpha(0.0f);
        this.f7259k.add(new h(a1Var, a1Var2, i12, i13, i10, i11));
        return true;
    }

    @Override // m3.h0
    public final void d(a1 a1Var) {
        View view = a1Var.f7153a;
        view.animate().cancel();
        ArrayList arrayList = this.f7258j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((i) arrayList.get(size)).f7240a == a1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(a1Var);
                arrayList.remove(size);
            }
        }
        j(a1Var, this.f7259k);
        if (this.f7256h.remove(a1Var)) {
            view.setAlpha(1.0f);
            c(a1Var);
        }
        if (this.f7257i.remove(a1Var)) {
            view.setAlpha(1.0f);
            c(a1Var);
        }
        ArrayList arrayList2 = this.f7262n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(a1Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f7261m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((i) arrayList5.get(size4)).f7240a == a1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(a1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList6 = this.f7260l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
                if (arrayList7.remove(a1Var)) {
                    view.setAlpha(1.0f);
                    c(a1Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f7264q.remove(a1Var);
                this.o.remove(a1Var);
                this.f7265r.remove(a1Var);
                this.f7263p.remove(a1Var);
                i();
                return;
            }
        }
    }

    @Override // m3.h0
    public final void e() {
        ArrayList arrayList = this.f7258j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            i iVar = (i) arrayList.get(size);
            View view = iVar.f7240a.f7153a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(iVar.f7240a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f7256h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c((a1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f7257i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            a1 a1Var = (a1) arrayList3.get(size3);
            a1Var.f7153a.setAlpha(1.0f);
            c(a1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f7259k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            h hVar = (h) arrayList4.get(size4);
            a1 a1Var2 = hVar.f7224a;
            if (a1Var2 != null) {
                k(hVar, a1Var2);
            }
            a1 a1Var3 = hVar.f7225b;
            if (a1Var3 != null) {
                k(hVar, a1Var3);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        ArrayList arrayList5 = this.f7261m;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    i iVar2 = (i) arrayList6.get(size6);
                    View view2 = iVar2.f7240a.f7153a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(iVar2.f7240a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.f7260l;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    a1 a1Var4 = (a1) arrayList8.get(size8);
                    a1Var4.f7153a.setAlpha(1.0f);
                    c(a1Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.f7262n;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                break;
            }
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    h hVar2 = (h) arrayList10.get(size10);
                    a1 a1Var5 = hVar2.f7224a;
                    if (a1Var5 != null) {
                        k(hVar2, a1Var5);
                    }
                    a1 a1Var6 = hVar2.f7225b;
                    if (a1Var6 != null) {
                        k(hVar2, a1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
        h(this.f7264q);
        h(this.f7263p);
        h(this.o);
        h(this.f7265r);
        ArrayList arrayList11 = this.f7231b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            a3.g.z(arrayList11.get(0));
            throw null;
        }
    }

    @Override // m3.h0
    public final boolean f() {
        if (this.f7257i.isEmpty() && this.f7259k.isEmpty() && this.f7258j.isEmpty() && this.f7256h.isEmpty() && this.f7263p.isEmpty() && this.f7264q.isEmpty() && this.o.isEmpty() && this.f7265r.isEmpty() && this.f7261m.isEmpty() && this.f7260l.isEmpty() && this.f7262n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean g(a1 a1Var, int i10, int i11, int i12, int i13) {
        View view = a1Var.f7153a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) a1Var.f7153a.getTranslationY());
        l(a1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(a1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f7258j.add(new i(a1Var, translationX, translationY, i12, i13));
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f7231b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                a3.g.z(arrayList.get(0));
                throw null;
            }
        }
    }

    public final void j(a1 a1Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                h hVar = (h) arrayList.get(size);
                if (k(hVar, a1Var) && hVar.f7224a == null && hVar.f7225b == null) {
                    arrayList.remove(hVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean k(h hVar, a1 a1Var) {
        if (hVar.f7225b == a1Var) {
            hVar.f7225b = null;
        } else if (hVar.f7224a == a1Var) {
            hVar.f7224a = null;
        } else {
            return false;
        }
        a1Var.f7153a.setAlpha(1.0f);
        View view = a1Var.f7153a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(a1Var);
        return true;
    }

    public final void l(a1 a1Var) {
        if (f7254s == null) {
            f7254s = new ValueAnimator().getInterpolator();
        }
        a1Var.f7153a.animate().setInterpolator(f7254s);
        d(a1Var);
    }
}

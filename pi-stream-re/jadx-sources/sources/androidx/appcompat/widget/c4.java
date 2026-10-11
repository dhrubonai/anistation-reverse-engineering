package androidx.appcompat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c4 implements j.c0 {

    /* renamed from: a, reason: collision with root package name */
    public j.o f435a;

    /* renamed from: b, reason: collision with root package name */
    public j.q f436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f437c;

    public c4(Toolbar toolbar) {
        this.f437c = toolbar;
    }

    @Override // j.c0
    public final void a(j.o oVar, boolean z9) {
    }

    @Override // j.c0
    public final boolean c(j.q qVar) {
        Toolbar toolbar = this.f437c;
        toolbar.c();
        ViewParent parent = toolbar.f393y.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f393y);
            }
            toolbar.addView(toolbar.f393y);
        }
        View actionView = qVar.getActionView();
        toolbar.f394z = actionView;
        this.f436b = qVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f394z);
            }
            d4 d4Var = new d4();
            d4Var.f3622a = (toolbar.E & 112) | 8388611;
            d4Var.f449b = 2;
            toolbar.f394z.setLayoutParams(d4Var);
            toolbar.addView(toolbar.f394z);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((d4) childAt.getLayoutParams()).f449b != 2 && childAt != toolbar.f375a) {
                toolbar.removeViewAt(childCount);
                toolbar.V.add(childAt);
            }
        }
        toolbar.requestLayout();
        qVar.C = true;
        qVar.f5585n.p(false);
        KeyEvent.Callback callback = toolbar.f394z;
        if (callback instanceof i.c) {
            ((i.c) callback).b();
        }
        toolbar.s();
        return true;
    }

    @Override // j.c0
    public final void e() {
        if (this.f436b != null) {
            j.o oVar = this.f435a;
            boolean z9 = false;
            if (oVar != null) {
                int size = oVar.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (this.f435a.getItem(i10) == this.f436b) {
                        z9 = true;
                        break;
                    }
                    i10++;
                }
            }
            if (!z9) {
                i(this.f436b);
            }
        }
    }

    @Override // j.c0
    public final void g(Context context, j.o oVar) {
        j.q qVar;
        j.o oVar2 = this.f435a;
        if (oVar2 != null && (qVar = this.f436b) != null) {
            oVar2.d(qVar);
        }
        this.f435a = oVar;
    }

    @Override // j.c0
    public final boolean h() {
        return false;
    }

    @Override // j.c0
    public final boolean i(j.q qVar) {
        Toolbar toolbar = this.f437c;
        KeyEvent.Callback callback = toolbar.f394z;
        if (callback instanceof i.c) {
            ((i.c) callback).e();
        }
        toolbar.removeView(toolbar.f394z);
        toolbar.removeView(toolbar.f393y);
        toolbar.f394z = null;
        ArrayList arrayList = toolbar.V;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView((View) arrayList.get(size));
            } else {
                arrayList.clear();
                this.f436b = null;
                toolbar.requestLayout();
                qVar.C = false;
                qVar.f5585n.p(false);
                toolbar.s();
                return true;
            }
        }
    }

    @Override // j.c0
    public final boolean k(j.i0 i0Var) {
        return false;
    }
}

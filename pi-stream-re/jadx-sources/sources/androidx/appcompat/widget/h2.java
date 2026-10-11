package androidx.appcompat.widget;

import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2 f517b;

    public /* synthetic */ h2(o2 o2Var, int i10) {
        this.f516a = i10;
        this.f517b = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f516a;
        o2 o2Var = this.f517b;
        switch (i10) {
            case 1:
                b2 b2Var = o2Var.f590c;
                if (b2Var != null) {
                    b2Var.setListSelectionHidden(true);
                    b2Var.requestLayout();
                    return;
                }
                return;
            default:
                b2 b2Var2 = o2Var.f590c;
                if (b2Var2 != null) {
                    WeakHashMap weakHashMap = g0.y0.f4277a;
                    if (g0.k0.b(b2Var2) && o2Var.f590c.getCount() > o2Var.f590c.getChildCount() && o2Var.f590c.getChildCount() <= o2Var.D) {
                        o2Var.Q.setInputMethodMode(2);
                        o2Var.d();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

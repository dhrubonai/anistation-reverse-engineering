package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f0 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f881a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f883c;

    public f0(g0 g0Var, z0 z0Var) {
        this.f883c = g0Var;
        this.f882b = z0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f881a;
        Object obj = this.f883c;
        switch (i10) {
            case 0:
                z0 z0Var = this.f882b;
                y yVar = z0Var.f1062c;
                z0Var.k();
                n1.f((ViewGroup) yVar.V.getParent(), ((g0) obj).f890a.F()).e();
                return;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = g0.y0.f4277a;
                g0.l0.c(view2);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public f0(z0 z0Var, View view) {
        this.f882b = z0Var;
        this.f883c = view;
    }
}

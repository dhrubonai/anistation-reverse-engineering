package u5;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class d extends u.a {

    /* renamed from: a, reason: collision with root package name */
    public e f10287a;

    /* renamed from: b, reason: collision with root package name */
    public int f10288b;

    public d() {
        this.f10288b = 0;
    }

    @Override // u.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        r(coordinatorLayout, view, i10);
        if (this.f10287a == null) {
            this.f10287a = new e(view);
        }
        e eVar = this.f10287a;
        View view2 = eVar.f10289a;
        eVar.f10290b = view2.getTop();
        eVar.f10291c = view2.getLeft();
        this.f10287a.a();
        int i11 = this.f10288b;
        if (i11 != 0) {
            e eVar2 = this.f10287a;
            if (eVar2.f10292d != i11) {
                eVar2.f10292d = i11;
                eVar2.a();
            }
            this.f10288b = 0;
            return true;
        }
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.q(view, i10);
    }

    public d(int i10) {
        super(0);
        this.f10288b = 0;
    }
}

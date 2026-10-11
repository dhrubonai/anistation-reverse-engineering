package j;

import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.e2;

/* loaded from: classes.dex */
public final class b extends e2 {
    public final /* synthetic */ ActionMenuItemView A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.A = actionMenuItemView;
    }

    @Override // androidx.appcompat.widget.e2
    public final g0 b() {
        androidx.appcompat.widget.h hVar;
        c cVar = this.A.D;
        if (cVar == null || (hVar = ((androidx.appcompat.widget.i) cVar).f519a.K) == null) {
            return null;
        }
        return hVar.a();
    }

    @Override // androidx.appcompat.widget.e2
    public final boolean c() {
        g0 b10;
        ActionMenuItemView actionMenuItemView = this.A;
        n nVar = actionMenuItemView.B;
        if (nVar == null || !nVar.d(actionMenuItemView.f293y) || (b10 = b()) == null || !b10.b()) {
            return false;
        }
        return true;
    }
}

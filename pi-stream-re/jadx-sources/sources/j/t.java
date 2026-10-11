package j;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class t extends FrameLayout implements i.c {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f5600a;

    /* JADX WARN: Multi-variable type inference failed */
    public t(View view) {
        super(view.getContext());
        this.f5600a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // i.c
    public final void b() {
        this.f5600a.onActionViewExpanded();
    }

    @Override // i.c
    public final void e() {
        this.f5600a.onActionViewCollapsed();
    }
}

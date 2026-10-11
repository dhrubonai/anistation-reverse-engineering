package j;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class y implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f5608a;

    public y(a0 a0Var) {
        this.f5608a = a0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f5608a.c();
    }
}

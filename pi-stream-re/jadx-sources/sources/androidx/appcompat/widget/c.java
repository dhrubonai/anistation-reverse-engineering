package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f427a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f429c;

    public c(ActionBarContextView actionBarContextView, i.b bVar) {
        this.f429c = actionBarContextView;
        this.f428b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f427a;
        Object obj = this.f428b;
        switch (i10) {
            case 0:
                ((i.b) obj).a();
                return;
            default:
                g4 g4Var = (g4) this.f429c;
                Window.Callback callback = g4Var.f506k;
                if (callback != null && g4Var.f507l) {
                    callback.onMenuItemSelected(0, (j.a) obj);
                    return;
                }
                return;
        }
    }

    public c(g4 g4Var) {
        this.f429c = g4Var;
        this.f428b = new j.a(g4Var.f496a.getContext(), g4Var.f503h);
    }
}

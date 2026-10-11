package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class t implements androidx.lifecycle.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f993a;

    public t(y yVar) {
        this.f993a = yVar;
    }

    @Override // androidx.lifecycle.s
    public final void onStateChanged(androidx.lifecycle.u uVar, androidx.lifecycle.n nVar) {
        View view;
        if (nVar == androidx.lifecycle.n.ON_STOP && (view = this.f993a.V) != null) {
            view.cancelPendingInputEvents();
        }
    }
}

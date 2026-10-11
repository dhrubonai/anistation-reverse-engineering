package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class a implements g0.m1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f399a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f401c;

    public a(ActionBarContextView actionBarContextView) {
        this.f401c = actionBarContextView;
    }

    @Override // g0.m1
    public final void a() {
        if (this.f399a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f401c;
        actionBarContextView.f320f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f400b);
    }

    @Override // g0.m1
    public final void b(View view) {
        this.f399a = true;
    }

    @Override // g0.m1
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f399a = false;
    }
}

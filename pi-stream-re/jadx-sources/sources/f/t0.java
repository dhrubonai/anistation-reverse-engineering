package f;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class t0 extends i.b implements j.m {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3783c;

    /* renamed from: d, reason: collision with root package name */
    public final j.o f3784d;

    /* renamed from: e, reason: collision with root package name */
    public i.a f3785e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f3786f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u0 f3787x;

    public t0(u0 u0Var, Context context, u uVar) {
        this.f3787x = u0Var;
        this.f3783c = context;
        this.f3785e = uVar;
        j.o oVar = new j.o(context);
        oVar.f5557l = 1;
        this.f3784d = oVar;
        oVar.f5550e = this;
    }

    @Override // i.b
    public final void a() {
        u0 u0Var = this.f3787x;
        if (u0Var.K != this) {
            return;
        }
        if (!(!u0Var.R)) {
            u0Var.L = this;
            u0Var.M = this.f3785e;
        } else {
            this.f3785e.c(this);
        }
        this.f3785e = null;
        u0Var.o0(false);
        ActionBarContextView actionBarContextView = u0Var.H;
        if (actionBarContextView.B == null) {
            actionBarContextView.e();
        }
        u0Var.E.setHideOnContentScrollEnabled(u0Var.W);
        u0Var.K = null;
    }

    @Override // i.b
    public final View b() {
        WeakReference weakReference = this.f3786f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // i.b
    public final Menu c() {
        return this.f3784d;
    }

    @Override // i.b
    public final MenuInflater d() {
        return new i.k(this.f3783c);
    }

    @Override // i.b
    public final CharSequence e() {
        return this.f3787x.H.getSubtitle();
    }

    @Override // i.b
    public final CharSequence f() {
        return this.f3787x.H.getTitle();
    }

    @Override // i.b
    public final void g() {
        if (this.f3787x.K != this) {
            return;
        }
        j.o oVar = this.f3784d;
        oVar.w();
        try {
            this.f3785e.b(this, oVar);
        } finally {
            oVar.v();
        }
    }

    @Override // i.b
    public final boolean h() {
        return this.f3787x.H.J;
    }

    @Override // i.b
    public final void i(View view) {
        this.f3787x.H.setCustomView(view);
        this.f3786f = new WeakReference(view);
    }

    @Override // i.b
    public final void j(int i10) {
        k(this.f3787x.C.getResources().getString(i10));
    }

    @Override // i.b
    public final void k(CharSequence charSequence) {
        this.f3787x.H.setSubtitle(charSequence);
    }

    @Override // i.b
    public final void l(int i10) {
        m(this.f3787x.C.getResources().getString(i10));
    }

    @Override // i.b
    public final void m(CharSequence charSequence) {
        this.f3787x.H.setTitle(charSequence);
    }

    @Override // i.b
    public final void n(boolean z9) {
        this.f5181b = z9;
        this.f3787x.H.setTitleOptional(z9);
    }

    @Override // j.m
    public final void p(j.o oVar) {
        if (this.f3785e == null) {
            return;
        }
        g();
        androidx.appcompat.widget.m mVar = this.f3787x.H.f318d;
        if (mVar != null) {
            mVar.l();
        }
    }

    @Override // j.m
    public final boolean q(j.o oVar, MenuItem menuItem) {
        i.a aVar = this.f3785e;
        if (aVar != null) {
            return aVar.a(this, menuItem);
        }
        return false;
    }
}

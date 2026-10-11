package i;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class f extends b implements j.m {

    /* renamed from: c, reason: collision with root package name */
    public final Context f5188c;

    /* renamed from: d, reason: collision with root package name */
    public final ActionBarContextView f5189d;

    /* renamed from: e, reason: collision with root package name */
    public final a f5190e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f5191f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5192x;

    /* renamed from: y, reason: collision with root package name */
    public final j.o f5193y;

    public f(Context context, ActionBarContextView actionBarContextView, a aVar) {
        this.f5188c = context;
        this.f5189d = actionBarContextView;
        this.f5190e = aVar;
        j.o oVar = new j.o(actionBarContextView.getContext());
        oVar.f5557l = 1;
        this.f5193y = oVar;
        oVar.f5550e = this;
    }

    @Override // i.b
    public final void a() {
        if (this.f5192x) {
            return;
        }
        this.f5192x = true;
        this.f5190e.c(this);
    }

    @Override // i.b
    public final View b() {
        WeakReference weakReference = this.f5191f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // i.b
    public final Menu c() {
        return this.f5193y;
    }

    @Override // i.b
    public final MenuInflater d() {
        return new k(this.f5189d.getContext());
    }

    @Override // i.b
    public final CharSequence e() {
        return this.f5189d.getSubtitle();
    }

    @Override // i.b
    public final CharSequence f() {
        return this.f5189d.getTitle();
    }

    @Override // i.b
    public final void g() {
        this.f5190e.b(this, this.f5193y);
    }

    @Override // i.b
    public final boolean h() {
        return this.f5189d.J;
    }

    @Override // i.b
    public final void i(View view) {
        WeakReference weakReference;
        this.f5189d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f5191f = weakReference;
    }

    @Override // i.b
    public final void j(int i10) {
        k(this.f5188c.getString(i10));
    }

    @Override // i.b
    public final void k(CharSequence charSequence) {
        this.f5189d.setSubtitle(charSequence);
    }

    @Override // i.b
    public final void l(int i10) {
        m(this.f5188c.getString(i10));
    }

    @Override // i.b
    public final void m(CharSequence charSequence) {
        this.f5189d.setTitle(charSequence);
    }

    @Override // i.b
    public final void n(boolean z9) {
        this.f5181b = z9;
        this.f5189d.setTitleOptional(z9);
    }

    @Override // j.m
    public final void p(j.o oVar) {
        g();
        androidx.appcompat.widget.m mVar = this.f5189d.f318d;
        if (mVar != null) {
            mVar.l();
        }
    }

    @Override // j.m
    public final boolean q(j.o oVar, MenuItem menuItem) {
        return this.f5190e.a(this, menuItem);
    }
}

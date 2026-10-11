package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import j.f0;

/* loaded from: classes.dex */
public final class h extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5200a;

    /* renamed from: b, reason: collision with root package name */
    public final b f5201b;

    public h(Context context, b bVar) {
        this.f5200a = context;
        this.f5201b = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f5201b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f5201b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new f0(this.f5200a, (b0.a) this.f5201b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f5201b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f5201b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f5201b.f5180a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f5201b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f5201b.f5181b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f5201b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f5201b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f5201b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f5201b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f5201b.f5180a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f5201b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z9) {
        this.f5201b.n(z9);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f5201b.j(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f5201b.l(i10);
    }
}

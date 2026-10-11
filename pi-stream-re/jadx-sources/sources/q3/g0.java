package q3;

import android.view.View;
import android.view.ViewGroup;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class g0 extends t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f9141c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f9142d;

    public g0(i iVar, ViewGroup viewGroup, View view, View view2) {
        this.f9142d = iVar;
        this.f9139a = viewGroup;
        this.f9140b = view;
        this.f9141c = view2;
    }

    @Override // q3.t, q3.r
    public final void a() {
        this.f9139a.getOverlay().remove(this.f9140b);
    }

    @Override // q3.t, q3.r
    public final void b() {
        View view = this.f9140b;
        if (view.getParent() == null) {
            this.f9139a.getOverlay().add(view);
        } else {
            this.f9142d.d();
        }
    }

    @Override // q3.r
    public final void c(s sVar) {
        this.f9141c.setTag(R.id.save_overlay_view, null);
        this.f9139a.getOverlay().remove(this.f9140b);
        sVar.w(this);
    }
}

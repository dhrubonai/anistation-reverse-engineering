package g6;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends w7.b {

    /* renamed from: u, reason: collision with root package name */
    public final Typeface f4461u;

    /* renamed from: v, reason: collision with root package name */
    public final k3.d f4462v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4463w;

    public a(k3.d dVar, Typeface typeface) {
        this.f4461u = typeface;
        this.f4462v = dVar;
    }

    @Override // w7.b
    public final void O(int i10) {
        if (!this.f4463w) {
            e6.b bVar = (e6.b) this.f4462v.f6453b;
            if (bVar.j(this.f4461u)) {
                bVar.h(false);
            }
        }
    }

    @Override // w7.b
    public final void P(Typeface typeface, boolean z9) {
        if (!this.f4463w) {
            e6.b bVar = (e6.b) this.f4462v.f6453b;
            if (bVar.j(typeface)) {
                bVar.h(false);
            }
        }
    }
}

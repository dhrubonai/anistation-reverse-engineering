package g6;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends z7.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w7.b f4464l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f4465m;

    public b(d dVar, w7.b bVar) {
        this.f4465m = dVar;
        this.f4464l = bVar;
    }

    @Override // z7.c
    public final void q(int i10) {
        this.f4465m.f4482m = true;
        this.f4464l.O(i10);
    }

    @Override // z7.c
    public final void r(Typeface typeface) {
        d dVar = this.f4465m;
        dVar.f4483n = Typeface.create(typeface, dVar.f4472c);
        dVar.f4482m = true;
        this.f4464l.P(dVar.f4483n, false);
    }
}

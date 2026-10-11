package g6;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends w7.b {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f4466u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TextPaint f4467v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w7.b f4468w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f4469x;

    public c(d dVar, Context context, TextPaint textPaint, w7.b bVar) {
        this.f4469x = dVar;
        this.f4466u = context;
        this.f4467v = textPaint;
        this.f4468w = bVar;
    }

    @Override // w7.b
    public final void O(int i10) {
        this.f4468w.O(i10);
    }

    @Override // w7.b
    public final void P(Typeface typeface, boolean z9) {
        this.f4469x.g(this.f4466u, this.f4467v, typeface);
        this.f4468w.P(typeface, z9);
    }
}

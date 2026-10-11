package r1;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class a extends i1.i {

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f9302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f9303e;

    public a(b bVar) {
        this.f9303e = bVar;
    }

    @Override // i1.i
    public final void i() {
        boolean z9;
        b bVar = this.f9303e;
        synchronized (bVar.f5271b) {
            h();
            int i10 = bVar.f5277h;
            bVar.f5277h = i10 + 1;
            bVar.f5275f[i10] = this;
            if (!bVar.f5272c.isEmpty() && bVar.f5277h > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                bVar.f5271b.notify();
            }
        }
    }
}

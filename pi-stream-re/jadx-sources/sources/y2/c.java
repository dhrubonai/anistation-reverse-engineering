package y2;

/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1.b f11547f;

    public c(x1.b bVar) {
        this.f11547f = bVar;
    }

    @Override // i1.i
    public final void i() {
        boolean z9;
        x1.b bVar = this.f11547f;
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

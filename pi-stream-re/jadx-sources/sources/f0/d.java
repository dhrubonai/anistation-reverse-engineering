package f0;

import p.f;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: d, reason: collision with root package name */
    public final Object f3793d;

    public d(int i10) {
        super(i10, 1);
        this.f3793d = new Object();
    }

    @Override // p.f, f0.c
    public final boolean b(Object obj) {
        boolean b10;
        synchronized (this.f3793d) {
            b10 = super.b(obj);
        }
        return b10;
    }

    @Override // p.f, f0.c
    public final Object j() {
        Object j4;
        synchronized (this.f3793d) {
            j4 = super.j();
        }
        return j4;
    }
}

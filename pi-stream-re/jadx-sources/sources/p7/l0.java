package p7;

/* loaded from: classes.dex */
public final class l0 extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8712a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8713b;

    public /* synthetic */ l0(Object obj, int i10) {
        this.f8712a = i10;
        this.f8713b = obj;
    }

    @Override // p7.h
    public final void a(Throwable th) {
        int i10 = this.f8712a;
        Object obj = this.f8713b;
        switch (i10) {
            case 0:
                ((k0) obj).b();
                return;
            default:
                ((h7.l) obj).invoke(th);
                return;
        }
    }

    @Override // h7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        w6.f fVar = w6.f.f11019a;
        switch (this.f8712a) {
            case 0:
                a((Throwable) obj);
                return fVar;
            default:
                a((Throwable) obj);
                return fVar;
        }
    }

    public final String toString() {
        int i10 = this.f8712a;
        Object obj = this.f8713b;
        switch (i10) {
            case 0:
                return "DisposeOnCancel[" + ((k0) obj) + ']';
            default:
                return "InvokeOnCancel[" + ((h7.l) obj).getClass().getSimpleName() + '@' + a0.z(this) + ']';
        }
    }
}

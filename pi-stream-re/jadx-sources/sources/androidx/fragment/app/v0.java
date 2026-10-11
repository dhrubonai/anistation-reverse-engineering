package androidx.fragment.app;

/* loaded from: classes.dex */
public final class v0 implements androidx.lifecycle.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1020a;

    public /* synthetic */ v0(int i10) {
        this.f1020a = i10;
    }

    @Override // androidx.lifecycle.y0
    public final androidx.lifecycle.w0 create(Class cls) {
        switch (this.f1020a) {
            case 0:
                return new w0(true);
            case 1:
                r6.h0.u(cls, "modelClass");
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            default:
                return new z0.c();
        }
    }

    @Override // androidx.lifecycle.y0
    public final androidx.lifecycle.w0 create(Class cls, y0.c cVar) {
        switch (this.f1020a) {
            case 0:
                r6.h0.u(cls, "modelClass");
                r6.h0.u(cVar, "extras");
                return create(cls);
            case 1:
                r6.h0.u(cls, "modelClass");
                r6.h0.u(cVar, "extras");
                return new androidx.lifecycle.t0();
            default:
                r6.h0.u(cls, "modelClass");
                r6.h0.u(cVar, "extras");
                return create(cls);
        }
    }
}

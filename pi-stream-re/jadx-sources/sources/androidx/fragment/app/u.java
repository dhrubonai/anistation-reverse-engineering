package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d.a f996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.b f997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f998e;

    public u(y yVar, o oVar, AtomicReference atomicReference, d.c cVar, f8.b bVar) {
        this.f998e = yVar;
        this.f994a = oVar;
        this.f995b = atomicReference;
        this.f996c = cVar;
        this.f997d = bVar;
    }

    @Override // androidx.fragment.app.x
    public final void a() {
        c.h activityResultRegistry;
        StringBuilder sb = new StringBuilder("fragment_");
        y yVar = this.f998e;
        sb.append(yVar.f1037e);
        sb.append("_rq#");
        sb.append(yVar.f1043i0.getAndIncrement());
        String sb2 = sb.toString();
        o oVar = this.f994a;
        oVar.getClass();
        y yVar2 = (y) oVar.f947a;
        a0 a0Var = yVar2.J;
        if (a0Var instanceof c.i) {
            activityResultRegistry = a0Var.G.getActivityResultRegistry();
        } else {
            activityResultRegistry = yVar2.N().getActivityResultRegistry();
        }
        this.f995b.set(activityResultRegistry.c(sb2, yVar, this.f996c, this.f997d));
    }
}

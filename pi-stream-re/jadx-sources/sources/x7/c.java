package x7;

import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    public final g f11346a;

    /* renamed from: b, reason: collision with root package name */
    public final c f11347b = this;

    /* renamed from: c, reason: collision with root package name */
    public v6.b f11348c = v6.a.a(new b());

    public c(g gVar) {
        this.f11346a = gVar;
    }

    @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
    public final ActivityComponentBuilder activityComponentBuilder() {
        return new f.c(this.f11346a, this.f11347b, 0);
    }

    @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
    public final ActivityRetainedLifecycle getActivityRetainedLifecycle() {
        return (ActivityRetainedLifecycle) this.f11348c.get();
    }
}

package x7;

import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import java.util.Set;
import r6.t0;
import r6.t1;

/* loaded from: classes.dex */
public final class g extends p {

    /* renamed from: a, reason: collision with root package name */
    public final ApplicationContextModule f11355a;

    /* renamed from: b, reason: collision with root package name */
    public final g f11356b = this;

    /* renamed from: c, reason: collision with root package name */
    public v6.b f11357c = r.f.g(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public v6.b f11358d = r.f.g(this, 1);

    /* renamed from: e, reason: collision with root package name */
    public v6.b f11359e = r.f.g(this, 0);

    /* renamed from: f, reason: collision with root package name */
    public v6.b f11360f = r.f.g(this, 5);

    /* renamed from: g, reason: collision with root package name */
    public v6.b f11361g = r.f.g(this, 4);

    /* renamed from: h, reason: collision with root package name */
    public v6.b f11362h = r.f.g(this, 3);

    /* renamed from: i, reason: collision with root package name */
    public v6.b f11363i = r.f.g(this, 6);

    /* renamed from: j, reason: collision with root package name */
    public v6.b f11364j = r.f.g(this, 7);

    /* renamed from: k, reason: collision with root package name */
    public v6.b f11365k = r.f.g(this, 8);

    /* renamed from: l, reason: collision with root package name */
    public v6.b f11366l = r.f.g(this, 9);

    /* renamed from: m, reason: collision with root package name */
    public v6.b f11367m = r.f.g(this, 10);

    /* renamed from: n, reason: collision with root package name */
    public v6.b f11368n = r.f.g(this, 11);
    public v6.b o = r.f.g(this, 12);

    /* renamed from: p, reason: collision with root package name */
    public v6.b f11369p = r.f.g(this, 13);

    /* renamed from: q, reason: collision with root package name */
    public v6.b f11370q = r.f.g(this, 14);

    /* renamed from: r, reason: collision with root package name */
    public v6.b f11371r = r.f.g(this, 15);

    /* renamed from: s, reason: collision with root package name */
    public v6.b f11372s = r.f.g(this, 16);

    /* renamed from: t, reason: collision with root package name */
    public v6.b f11373t = r.f.g(this, 17);

    /* renamed from: u, reason: collision with root package name */
    public v6.b f11374u = r.f.g(this, 18);

    /* renamed from: v, reason: collision with root package name */
    public v6.b f11375v = r.f.g(this, 19);

    /* renamed from: w, reason: collision with root package name */
    public v6.b f11376w = r.f.g(this, 20);

    /* renamed from: x, reason: collision with root package name */
    public v6.b f11377x = r.f.g(this, 21);

    /* renamed from: y, reason: collision with root package name */
    public v6.b f11378y = r.f.g(this, 22);

    /* renamed from: z, reason: collision with root package name */
    public v6.b f11379z = r.f.g(this, 23);
    public v6.b A = r.f.g(this, 24);
    public v6.b B = r.f.g(this, 25);
    public v6.b C = r.f.g(this, 26);
    public v6.b D = r.f.g(this, 27);
    public v6.b E = r.f.g(this, 29);
    public v6.b F = r.f.g(this, 28);

    public g(ApplicationContextModule applicationContextModule) {
        this.f11355a = applicationContextModule;
    }

    @Override // dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint
    public final Set getDisableFragmentGetContextFix() {
        int i10 = t0.f9538c;
        return t1.A;
    }

    @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint
    public final ActivityRetainedComponentBuilder retainedComponentBuilder() {
        return new z3.e(this.f11356b);
    }

    @Override // dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint
    public final ServiceComponentBuilder serviceComponentBuilder() {
        return new z3.e(this.f11356b, 0);
    }
}

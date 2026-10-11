package x7;

import androidx.lifecycle.o0;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import r6.h0;

/* loaded from: classes.dex */
public final class h implements ViewModelComponentBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final g f11380a;

    /* renamed from: b, reason: collision with root package name */
    public final c f11381b;

    /* renamed from: c, reason: collision with root package name */
    public o0 f11382c;

    /* renamed from: d, reason: collision with root package name */
    public ViewModelLifecycle f11383d;

    public h(g gVar, c cVar) {
        this.f11380a = gVar;
        this.f11381b = cVar;
    }

    @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
    public final ViewModelComponent build() {
        h0.m(this.f11382c, o0.class);
        h0.m(this.f11383d, ViewModelLifecycle.class);
        return new j(this.f11380a, this.f11381b);
    }

    @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
    public final ViewModelComponentBuilder savedStateHandle(o0 o0Var) {
        o0Var.getClass();
        this.f11382c = o0Var;
        return this;
    }

    @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
    public final ViewModelComponentBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
        viewModelLifecycle.getClass();
        this.f11383d = viewModelLifecycle;
        return this;
    }
}

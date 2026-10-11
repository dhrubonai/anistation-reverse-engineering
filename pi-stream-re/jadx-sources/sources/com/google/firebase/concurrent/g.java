package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2996a;

    public /* synthetic */ g(int i10) {
        this.f2996a = i10;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f2996a) {
            case 0:
                return ExecutorsRegistrar.h(componentContainer);
            case 1:
                return ExecutorsRegistrar.a(componentContainer);
            case 2:
                return ExecutorsRegistrar.f(componentContainer);
            case 3:
                return ExecutorsRegistrar.e(componentContainer);
            default:
                return DefaultUserAgentPublisher.a(componentContainer);
        }
    }
}

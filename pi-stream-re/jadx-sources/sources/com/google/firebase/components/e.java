package com.google.firebase.components;

import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2968b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f2967a = i10;
        this.f2968b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i10 = this.f2967a;
        Object obj = this.f2968b;
        switch (i10) {
            case 0:
                return ComponentRuntime.b((ComponentRegistrar) obj);
            case 1:
                return ComponentRuntime.Builder.a((ComponentRegistrar) obj);
            default:
                return ComponentDiscovery.a((String) obj);
        }
    }
}

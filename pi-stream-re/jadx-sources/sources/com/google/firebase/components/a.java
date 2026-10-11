package com.google.firebase.components;

import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2961b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f2960a = i10;
        this.f2961b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        DefaultHeartBeatController lambda$component$3;
        Object lambda$of$1;
        Object lambda$intoSet$3;
        Object lambda$intoSet$4;
        Object lambda$of$2;
        Object lambda$of$0;
        int i10 = this.f2960a;
        Object obj = this.f2961b;
        switch (i10) {
            case 0:
                lambda$of$1 = Component.lambda$of$1(obj, componentContainer);
                return lambda$of$1;
            case 1:
                lambda$intoSet$3 = Component.lambda$intoSet$3(obj, componentContainer);
                return lambda$intoSet$3;
            case 2:
                lambda$intoSet$4 = Component.lambda$intoSet$4(obj, componentContainer);
                return lambda$intoSet$4;
            case 3:
                lambda$of$2 = Component.lambda$of$2(obj, componentContainer);
                return lambda$of$2;
            case 4:
                lambda$of$0 = Component.lambda$of$0(obj, componentContainer);
                return lambda$of$0;
            default:
                lambda$component$3 = DefaultHeartBeatController.lambda$component$3((Qualified) obj, componentContainer);
                return lambda$component$3;
        }
    }
}

package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultHeartBeatController f3004b;

    public /* synthetic */ a(DefaultHeartBeatController defaultHeartBeatController, int i10) {
        this.f3003a = i10;
        this.f3004b = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f3003a;
        DefaultHeartBeatController defaultHeartBeatController = this.f3004b;
        switch (i10) {
            case 0:
                return DefaultHeartBeatController.b(defaultHeartBeatController);
            default:
                return DefaultHeartBeatController.a(defaultHeartBeatController);
        }
    }
}

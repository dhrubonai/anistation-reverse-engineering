package com.unity3d.ads.core.data.datasource;

import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$invoke$2", f = "AppForegroundDurationObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AppForegroundDurationObserver$invoke$2 extends t36 implements ic2 {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ AppForegroundDurationObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppForegroundDurationObserver$invoke$2(AppForegroundDurationObserver appForegroundDurationObserver, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = appForegroundDurationObserver;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AppForegroundDurationObserver$invoke$2 appForegroundDurationObserver$invoke$2 = new AppForegroundDurationObserver$invoke$2(this.this$0, vz0Var);
        appForegroundDurationObserver$invoke$2.Z$0 = ((Boolean) obj).booleanValue();
        return appForegroundDurationObserver$invoke$2;
    }

    public final Object invoke(boolean z, vz0 vz0Var) {
        return ((AppForegroundDurationObserver$invoke$2) create(Boolean.valueOf(z), vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            boolean z = this.Z$0;
            AppForegroundDurationObserver appForegroundDurationObserver = this.this$0;
            if (z) {
                appForegroundDurationObserver.onForeground();
            } else {
                appForegroundDurationObserver.onBackground();
            }
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.ic2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (vz0) obj2);
    }
}

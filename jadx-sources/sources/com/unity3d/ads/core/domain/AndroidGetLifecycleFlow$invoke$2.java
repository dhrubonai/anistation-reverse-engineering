package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.unity3d.ads.core.domain.LifecycleEvent;
import com.unity3d.ads.core.log.Logger;
import defpackage.ic2;
import defpackage.m37;
import defpackage.n77;
import defpackage.nj0;
import defpackage.pn6;
import defpackage.sb2;
import defpackage.t36;
import defpackage.tu4;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", f = "AndroidGetLifecycleFlow.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidGetLifecycleFlow$invoke$2 extends t36 implements ic2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidGetLifecycleFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetLifecycleFlow$invoke$2(AndroidGetLifecycleFlow androidGetLifecycleFlow, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidGetLifecycleFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$emit(tu4 tu4Var, AndroidGetLifecycleFlow androidGetLifecycleFlow, LifecycleEvent lifecycleEvent) {
        Logger logger;
        try {
            ((nj0) tu4Var).i(lifecycleEvent);
        } catch (Throwable th) {
            logger = androidGetLifecycleFlow.logger;
            Logger.DefaultImpls.error$default(logger, "Unity Ads failed to observe the activity lifecycle: ".concat(th.getClass().getName()), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pn6 invokeSuspend$lambda$0(AndroidGetLifecycleFlow androidGetLifecycleFlow, AndroidGetLifecycleFlow$invoke$2$listener$1 androidGetLifecycleFlow$invoke$2$listener$1) {
        Context context;
        context = androidGetLifecycleFlow.applicationContext;
        ((Application) context).unregisterActivityLifecycleCallbacks(androidGetLifecycleFlow$invoke$2$listener$1);
        return pn6.a;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AndroidGetLifecycleFlow$invoke$2 androidGetLifecycleFlow$invoke$2 = new AndroidGetLifecycleFlow$invoke$2(this.this$0, vz0Var);
        androidGetLifecycleFlow$invoke$2.L$0 = obj;
        return androidGetLifecycleFlow$invoke$2;
    }

    @Override // defpackage.ic2
    public final Object invoke(tu4 tu4Var, vz0 vz0Var) {
        return ((AndroidGetLifecycleFlow$invoke$2) create(tu4Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Application$ActivityLifecycleCallbacks, com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Context context;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            final tu4 tu4Var = (tu4) this.L$0;
            final AndroidGetLifecycleFlow androidGetLifecycleFlow = this.this$0;
            final ?? r0 = new Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    activity.getClass();
                    AndroidGetLifecycleFlow$invoke$2.invokeSuspend$emit(tu4.this, androidGetLifecycleFlow, new LifecycleEvent.Created(new WeakReference(activity), bundle));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    activity.getClass();
                    AndroidGetLifecycleFlow$invoke$2.invokeSuspend$emit(tu4.this, androidGetLifecycleFlow, new LifecycleEvent.Destroyed(new WeakReference(activity)));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    activity.getClass();
                    AndroidGetLifecycleFlow$invoke$2.invokeSuspend$emit(tu4.this, androidGetLifecycleFlow, new LifecycleEvent.Paused(new WeakReference(activity)));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    activity.getClass();
                    AndroidGetLifecycleFlow$invoke$2.invokeSuspend$emit(tu4.this, androidGetLifecycleFlow, new LifecycleEvent.Resumed(new WeakReference(activity)));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    activity.getClass();
                    bundle.getClass();
                    AndroidGetLifecycleFlow$invoke$2.invokeSuspend$emit(tu4.this, androidGetLifecycleFlow, new LifecycleEvent.SaveInstanceState(new WeakReference(activity), bundle));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    activity.getClass();
                    AndroidGetLifecycleFlow$invoke$2.invokeSuspend$emit(tu4.this, androidGetLifecycleFlow, new LifecycleEvent.Started(new WeakReference(activity)));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    activity.getClass();
                    AndroidGetLifecycleFlow$invoke$2.invokeSuspend$emit(tu4.this, androidGetLifecycleFlow, new LifecycleEvent.Stopped(new WeakReference(activity)));
                }
            };
            context = this.this$0.applicationContext;
            ((Application) context).registerActivityLifecycleCallbacks(r0);
            final AndroidGetLifecycleFlow androidGetLifecycleFlow2 = this.this$0;
            sb2 sb2Var = new sb2() { // from class: com.unity3d.ads.core.domain.a
                @Override // defpackage.sb2
                public final Object invoke() {
                    pn6 invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = AndroidGetLifecycleFlow$invoke$2.invokeSuspend$lambda$0(AndroidGetLifecycleFlow.this, r0);
                    return invokeSuspend$lambda$0;
                }
            };
            this.label = 1;
            Object s = n77.s(tu4Var, sb2Var, this);
            w11 w11Var = w11.x;
            if (s == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}

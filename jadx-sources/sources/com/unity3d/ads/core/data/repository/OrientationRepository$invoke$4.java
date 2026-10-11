package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.sx5;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import defpackage.x44;
import defpackage.ze0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4", f = "OrientationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OrientationRepository$invoke$4 extends t36 implements ic2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrientationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrientationRepository$invoke$4(OrientationRepository orientationRepository, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = orientationRepository;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        OrientationRepository$invoke$4 orientationRepository$invoke$4 = new OrientationRepository$invoke$4(this.this$0, vz0Var);
        orientationRepository$invoke$4.L$0 = obj;
        return orientationRepository$invoke$4;
    }

    @Override // defpackage.ic2
    public final Object invoke(WeakReference<Activity> weakReference, vz0 vz0Var) {
        return ((OrientationRepository$invoke$4) create(weakReference, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        x44 x44Var;
        int i;
        if (this.label == 0) {
            m37.N(obj);
            WeakReference weakReference = (WeakReference) this.L$0;
            x44Var = this.this$0._resumedActivityOrientation;
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                i = activity.getRequestedOrientation();
            } else {
                i = -1;
            }
            Integer num = new Integer(i);
            sx5 sx5Var = (sx5) x44Var;
            sx5Var.getClass();
            sx5Var.l(null, num);
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

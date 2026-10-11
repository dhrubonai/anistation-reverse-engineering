package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOpenMeasurementRepository$activateOM$2 extends t36 implements ic2 {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$activateOM$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, Context context, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidOpenMeasurementRepository;
        this.$context = context;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidOpenMeasurementRepository$activateOM$2(this.this$0, this.$context, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidOpenMeasurementRepository$activateOM$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        OmidManager omidManager;
        OmidManager omidManager2;
        if (this.label == 0) {
            m37.N(obj);
            if (!this.this$0.isOMActive()) {
                try {
                    omidManager = this.this$0.omidManager;
                    omidManager.activate(this.$context);
                    AndroidOpenMeasurementRepository androidOpenMeasurementRepository = this.this$0;
                    omidManager2 = androidOpenMeasurementRepository.omidManager;
                    androidOpenMeasurementRepository.setOMActive(omidManager2.isActive());
                    if (this.this$0.isOMActive()) {
                        return OMResult.Success.INSTANCE;
                    }
                    return new OMResult.Failure("om_activate_failure_time", null, 2, null);
                } catch (Throwable th) {
                    return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
                }
            }
            return new OMResult.Failure("om_already_active", null, 2, null);
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

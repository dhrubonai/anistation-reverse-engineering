package com.unity3d.ads.core.data.repository;

import android.os.Handler;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMResult;
import defpackage.ba7;
import defpackage.da7;
import defpackage.g6;
import defpackage.ia7;
import defpackage.ic2;
import defpackage.k6;
import defpackage.l68;
import defpackage.la;
import defpackage.m37;
import defpackage.ma7;
import defpackage.mj6;
import defpackage.pa7;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOpenMeasurementRepository$finishSession$2 extends t36 implements ic2 {
    final /* synthetic */ ByteString $opportunityId;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$finishSession$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidOpenMeasurementRepository$finishSession$2(this.this$0, this.$opportunityId, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidOpenMeasurementRepository$finishSession$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        g6 session;
        if (this.label == 0) {
            m37.N(obj);
            if (this.this$0.isOMActive()) {
                session = this.this$0.getSession(this.$opportunityId);
                if (session == null) {
                    return new OMResult.Failure("om_session_not_found", null, 2, null);
                }
                ba7 ba7Var = (ba7) session;
                if (!ba7Var.g) {
                    ba7Var.d.clear();
                    if (!ba7Var.g) {
                        ba7Var.c.clear();
                    }
                    boolean z = true;
                    ba7Var.g = true;
                    k6 k6Var = ba7Var.e;
                    l68.T.a(k6Var.e(), "finishSession", k6Var.a);
                    ia7 ia7Var = ia7.c;
                    ArrayList arrayList = ia7Var.b;
                    ArrayList arrayList2 = ia7Var.b;
                    if (arrayList.size() <= 0) {
                        z = false;
                    }
                    ia7Var.a.remove(ba7Var);
                    arrayList2.remove(ba7Var);
                    if (z && arrayList2.size() <= 0) {
                        pa7 b = pa7.b();
                        mj6 mj6Var = mj6.f;
                        mj6Var.getClass();
                        Handler handler = mj6.h;
                        if (handler != null) {
                            handler.removeCallbacks(mj6.j);
                            mj6.h = null;
                        }
                        mj6Var.a.clear();
                        mj6.g.post(new la(mj6Var, (byte) 8));
                        da7 da7Var = da7.A;
                        da7Var.x = false;
                        da7Var.z = null;
                        ma7 ma7Var = b.b;
                        ma7Var.a.getContentResolver().unregisterContentObserver(ma7Var);
                    }
                    ba7Var.e.d();
                    ba7Var.e = null;
                }
                this.this$0.sessionFinished(this.$opportunityId);
                return OMResult.Success.INSTANCE;
            }
            return new OMResult.Failure("om_not_active", null, 2, null);
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

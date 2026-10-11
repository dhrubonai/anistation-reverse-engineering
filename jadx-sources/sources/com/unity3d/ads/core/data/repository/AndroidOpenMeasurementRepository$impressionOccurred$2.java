package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMResult;
import defpackage.ba7;
import defpackage.g6;
import defpackage.ic2;
import defpackage.jh4;
import defpackage.k6;
import defpackage.l68;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.v5;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOpenMeasurementRepository$impressionOccurred$2 extends t36 implements ic2 {
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ boolean $signalLoaded;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$impressionOccurred$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString, boolean z, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
        this.$signalLoaded = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidOpenMeasurementRepository$impressionOccurred$2(this.this$0, this.$opportunityId, this.$signalLoaded, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidOpenMeasurementRepository$impressionOccurred$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        g6 session;
        OmidManager omidManager;
        l68 l68Var = l68.T;
        if (this.label == 0) {
            m37.N(obj);
            session = this.this$0.getSession(this.$opportunityId);
            if (session != null) {
                omidManager = this.this$0.omidManager;
                v5 createAdEvents = omidManager.createAdEvents(session);
                boolean z = this.$signalLoaded;
                jh4 jh4Var = jh4.NATIVE;
                if (z) {
                    ba7 ba7Var = createAdEvents.a;
                    if (ba7Var.f) {
                        if (!ba7Var.g) {
                            if (jh4Var == ba7Var.b.a) {
                                if (!ba7Var.j) {
                                    k6 k6Var = ba7Var.e;
                                    l68Var.a(k6Var.e(), "publishLoadedEvent", null, k6Var.a);
                                    ba7Var.j = true;
                                } else {
                                    ze0.m("Loaded event can only be sent once");
                                    return null;
                                }
                            } else {
                                ze0.m("Impression event is not expected from the Native AdSession");
                                return null;
                            }
                        } else {
                            ze0.m("AdSession is finished");
                            return null;
                        }
                    } else {
                        ze0.m("AdSession is not started");
                        return null;
                    }
                }
                ba7 ba7Var2 = createAdEvents.a;
                boolean z2 = ba7Var2.g;
                if (!z2) {
                    if (jh4Var == ba7Var2.b.a) {
                        if (!ba7Var2.f || z2) {
                            try {
                                ba7Var2.b();
                            } catch (Exception unused) {
                            }
                        }
                        if (ba7Var2.f && !ba7Var2.g) {
                            if (!ba7Var2.i) {
                                k6 k6Var2 = ba7Var2.e;
                                l68Var.a(k6Var2.e(), "publishImpressionEvent", k6Var2.a);
                                ba7Var2.i = true;
                            } else {
                                ze0.m("Impression event can only be sent once");
                                return null;
                            }
                        }
                        return OMResult.Success.INSTANCE;
                    }
                    ze0.m("Impression event is not expected from the Native AdSession");
                    return null;
                }
                ze0.m("AdSession is finished");
                return null;
            }
            return new OMResult.Failure("om_session_not_found", null, 2, null);
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

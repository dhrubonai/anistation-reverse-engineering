package com.unity3d.ads.core.data.repository;

import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import defpackage.g6;
import defpackage.h6;
import defpackage.hj4;
import defpackage.i6;
import defpackage.ic2;
import defpackage.jh4;
import defpackage.k21;
import defpackage.kx2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.sx5;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.x44;
import defpackage.ze0;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOpenMeasurementRepository$startSession$2 extends t36 implements ic2 {
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ OmidOptions $options;
    final /* synthetic */ WebView $webView;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k21.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$startSession$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString, OmidOptions omidOptions, WebView webView, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
        this.$options = omidOptions;
        this.$webView = webView;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidOpenMeasurementRepository$startSession$2(this.this$0, this.$opportunityId, this.$options, this.$webView, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidOpenMeasurementRepository$startSession$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        x44 x44Var;
        OmidManager omidManager;
        OmidManager omidManager2;
        hj4 hj4Var;
        i6 createHtmlAdSessionContext;
        OmidManager omidManager3;
        OmidManager omidManager4;
        hj4 hj4Var2;
        if (this.label == 0) {
            m37.N(obj);
            try {
                if (this.this$0.isOMActive()) {
                    x44Var = this.this$0.activeSessions;
                    if (((Map) ((sx5) x44Var).getValue()).containsKey(this.$opportunityId.toStringUtf8())) {
                        return new OMResult.Failure("om_session_already_exists", null, 2, null);
                    }
                    k21 creativeType = this.$options.getCreativeType();
                    if (creativeType != null) {
                        omidManager = this.this$0.omidManager;
                        kx2 impressionType = this.$options.getImpressionType();
                        if (impressionType == null) {
                            impressionType = kx2.DEFINED_BY_JAVASCRIPT;
                        }
                        kx2 kx2Var = impressionType;
                        jh4 impressionOwner = this.$options.getImpressionOwner();
                        jh4 jh4Var = jh4.JAVASCRIPT;
                        if (impressionOwner == null) {
                            impressionOwner = jh4Var;
                        }
                        jh4 videoEventsOwner = this.$options.getVideoEventsOwner();
                        if (videoEventsOwner == null) {
                            videoEventsOwner = jh4Var;
                        }
                        h6 createAdSessionConfiguration = omidManager.createAdSessionConfiguration(creativeType, kx2Var, impressionOwner, videoEventsOwner, this.$options.getIsolateVerificationScripts());
                        int ordinal = creativeType.ordinal();
                        if (ordinal == 1) {
                            omidManager2 = this.this$0.omidManager;
                            hj4Var = this.this$0.partner;
                            createHtmlAdSessionContext = omidManager2.createHtmlAdSessionContext(hj4Var, this.$webView, null, this.$options.getCustomReferenceData());
                        } else if (ordinal == 3) {
                            omidManager4 = this.this$0.omidManager;
                            hj4Var2 = this.this$0.partner;
                            createHtmlAdSessionContext = omidManager4.createJavaScriptAdSessionContext(hj4Var2, this.$webView, null, this.$options.getCustomReferenceData());
                        } else {
                            return new OMResult.Failure("om_creative_type_invalid", null, 2, null);
                        }
                        omidManager3 = this.this$0.omidManager;
                        g6 createAdSession = omidManager3.createAdSession(createAdSessionConfiguration, createHtmlAdSessionContext);
                        createAdSession.a(this.$webView);
                        createAdSession.b();
                        this.this$0.addSession(this.$opportunityId, createAdSession);
                        return OMResult.Success.INSTANCE;
                    }
                    return new OMResult.Failure("om_creative_type_null", null, 2, null);
                }
                return new OMResult.Failure("om_not_active", null, 2, null);
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
            }
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

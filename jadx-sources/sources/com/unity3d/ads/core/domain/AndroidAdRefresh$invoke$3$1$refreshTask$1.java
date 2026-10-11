package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.sx5;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.y45;
import defpackage.z45;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$refreshTask$1", f = "AndroidAdRefresh.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidAdRefresh$invoke$3$1$refreshTask$1 extends t36 implements ic2 {
    final /* synthetic */ AdObject $adObject;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$refreshTask$1(AndroidAdRefresh androidAdRefresh, AdObject adObject, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidAdRefresh;
        this.$adObject = adObject;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AndroidAdRefresh$invoke$3$1$refreshTask$1 androidAdRefresh$invoke$3$1$refreshTask$1 = new AndroidAdRefresh$invoke$3$1$refreshTask$1(this.this$0, this.$adObject, vz0Var);
        androidAdRefresh$invoke$3$1$refreshTask$1.L$0 = obj;
        return androidAdRefresh$invoke$3$1$refreshTask$1;
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidAdRefresh$invoke$3$1$refreshTask$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object y45Var;
        boolean canUpdateRefreshData;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        Object performRefresh;
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    m37.N(obj);
                } else {
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                m37.N(obj);
                AndroidAdRefresh androidAdRefresh = this.this$0;
                ByteString opportunityId = this.$adObject.getOpportunityId();
                this.label = 1;
                performRefresh = androidAdRefresh.performRefresh(opportunityId, this);
                w11 w11Var = w11.x;
                if (performRefresh == w11Var) {
                    return w11Var;
                }
            }
            y45Var = pn6.a;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        AndroidAdRefresh androidAdRefresh2 = this.this$0;
        AdObject adObject = this.$adObject;
        if (z45.b(y45Var) != null) {
            canUpdateRefreshData = androidAdRefresh2.canUpdateRefreshData((AdObjectState) ((sx5) adObject.getState()).getValue());
            if (canUpdateRefreshData && (webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData()) != null) {
                webViewLessLoadingRequiredData.setAdRefreshState(AdRefreshState.REUSE_ERROR);
            }
        }
        return new z45(y45Var);
    }
}

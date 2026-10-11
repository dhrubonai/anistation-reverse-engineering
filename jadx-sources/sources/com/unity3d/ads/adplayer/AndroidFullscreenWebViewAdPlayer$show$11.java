package com.unity3d.ads.adplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.datasource.CurrentActivityDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.y45;
import defpackage.yq0;
import defpackage.z45;
import defpackage.ze0;
import defpackage.zq0;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$11 extends t36 implements ic2 {
    final /* synthetic */ int $defaultIntentFlags;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ yq0 $listenerStarted;
    final /* synthetic */ int $selectedIntentFlags;
    final /* synthetic */ ShowOptions $showOptions;
    final /* synthetic */ Context $startContext;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$11(yq0 yq0Var, int i, int i2, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Context context, ShowOptions showOptions, Intent intent, vz0 vz0Var) {
        super(2, vz0Var);
        this.$listenerStarted = yq0Var;
        this.$selectedIntentFlags = i;
        this.$defaultIntentFlags = i2;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$startContext = context;
        this.$showOptions = showOptions;
        this.$intent = intent;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AndroidFullscreenWebViewAdPlayer$show$11 androidFullscreenWebViewAdPlayer$show$11 = new AndroidFullscreenWebViewAdPlayer$show$11(this.$listenerStarted, this.$selectedIntentFlags, this.$defaultIntentFlags, this.this$0, this.$startContext, this.$showOptions, this.$intent, vz0Var);
        androidFullscreenWebViewAdPlayer$show$11.L$0 = obj;
        return androidFullscreenWebViewAdPlayer$show$11;
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidFullscreenWebViewAdPlayer$show$11) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Intent intent;
        Object y45Var;
        Object y45Var2;
        SessionRepository sessionRepository;
        CurrentActivityDataSource currentActivityDataSource;
        Object y45Var3;
        SendDiagnosticEvent sendDiagnosticEvent;
        AdObject adObject;
        pn6 pn6Var = pn6.a;
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
            v11 v11Var = (v11) this.L$0;
            yq0 yq0Var = this.$listenerStarted;
            this.L$0 = v11Var;
            this.label = 1;
            Object o = ((zq0) yq0Var).o(this);
            w11 w11Var = w11.x;
            if (o == w11Var) {
                return w11Var;
            }
        }
        int i2 = this.$selectedIntentFlags;
        int i3 = this.$defaultIntentFlags;
        if (i2 != i3) {
            intent = this.this$0.getIntent(this.$startContext, (AndroidShowOptions) this.$showOptions, i3);
        } else {
            intent = this.$intent;
        }
        try {
            this.$startContext.startActivity(this.$intent);
            y45Var = pn6Var;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        int i4 = this.$selectedIntentFlags;
        int i5 = this.$defaultIntentFlags;
        Context context = this.$startContext;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
        Throwable b = z45.b(y45Var);
        if (b != null) {
            if (i4 != i5) {
                try {
                    context.startActivity(intent);
                    y45Var2 = pn6Var;
                } catch (Throwable th2) {
                    y45Var2 = new y45(th2);
                }
            } else {
                y45Var2 = new y45(b);
            }
            Throwable b2 = z45.b(y45Var2);
            if (b2 != null) {
                sessionRepository = androidFullscreenWebViewAdPlayer.sessionRepository;
                if (sessionRepository.getNativeConfiguration().getFeatureFlags().getRetryShowWithCurrentActivity()) {
                    currentActivityDataSource = androidFullscreenWebViewAdPlayer.currentActivityDataSource;
                    Activity currentActivity = currentActivityDataSource.getCurrentActivity();
                    if (currentActivity != null) {
                        try {
                            currentActivity.startActivity(intent);
                            y45Var3 = pn6Var;
                        } catch (Throwable th3) {
                            y45Var3 = new y45(th3);
                        }
                        if (!(y45Var3 instanceof y45)) {
                            sendDiagnosticEvent = androidFullscreenWebViewAdPlayer.sendDiagnosticEvent;
                            adObject = androidFullscreenWebViewAdPlayer.getAdObject();
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_show_start_activity_retried_with_current_activity", (Double) null, (Map) null, (Map) null, adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 238, (Object) null);
                        }
                        Throwable b3 = z45.b(y45Var3);
                        if (b3 != null) {
                            throw b3;
                        }
                    } else {
                        throw b2;
                    }
                } else {
                    throw b2;
                }
            }
        }
        return pn6Var;
    }
}

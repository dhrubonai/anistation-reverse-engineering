package com.unity3d.ads.adplayer.probe;

import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.probe.AndroidWebViewProbe$invoke$1", f = "AndroidWebViewProbe.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidWebViewProbe$invoke$1 extends t36 implements ic2 {
    int label;
    final /* synthetic */ AndroidWebViewProbe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewProbe$invoke$1(AndroidWebViewProbe androidWebViewProbe, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidWebViewProbe;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidWebViewProbe$invoke$1(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidWebViewProbe$invoke$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object runProbe;
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
            AndroidWebViewProbe androidWebViewProbe = this.this$0;
            this.label = 1;
            runProbe = androidWebViewProbe.runProbe(this);
            w11 w11Var = w11.x;
            if (runProbe == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}

package com.unity3d.services;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import defpackage.ic2;
import defpackage.l11;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.services.SDKErrorHandler$handleException$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SDKErrorHandler$handleException$1 extends t36 implements ic2 {
    final /* synthetic */ l11 $context;
    final /* synthetic */ Throwable $exception;
    int label;
    final /* synthetic */ SDKErrorHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKErrorHandler$handleException$1(SDKErrorHandler sDKErrorHandler, l11 l11Var, Throwable th, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = sDKErrorHandler;
        this.$context = l11Var;
        this.$exception = th;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new SDKErrorHandler$handleException$1(this.this$0, this.$context, this.$exception, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((SDKErrorHandler$handleException$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        String retrieveCoroutineName;
        ByteString retrieveOpportunityId;
        String str;
        if (this.label == 0) {
            m37.N(obj);
            retrieveCoroutineName = this.this$0.retrieveCoroutineName(this.$context);
            retrieveOpportunityId = this.this$0.retrieveOpportunityId(this.$context);
            Throwable th = this.$exception;
            if (th instanceof NullPointerException) {
                str = "native_exception_npe";
            } else if (th instanceof OutOfMemoryError) {
                str = "native_exception_oom";
            } else if (th instanceof IllegalStateException) {
                str = "native_exception_ise";
            } else if (th instanceof SecurityException) {
                str = "native_exception_se";
            } else if (th instanceof RuntimeException) {
                str = "native_exception_re";
            } else {
                str = "native_exception";
            }
            String str2 = str;
            String retrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(th);
            DeviceLog.error("Unity Ads SDK encountered an exception: " + retrieveUnityCrashValue);
            this.this$0.sendDiagnostic(str2, retrieveUnityCrashValue, retrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(this.$exception, 15), retrieveOpportunityId);
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

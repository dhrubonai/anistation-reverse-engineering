package com.unity3d.services.core.extensions;

import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.xz0;
import defpackage.z45;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", f = "CoroutineExtensions.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE}, m = "runReturnSuspendCatching")
/* loaded from: classes.dex */
public final class CoroutineExtensionsKt$runReturnSuspendCatching$1<R> extends xz0 {
    int label;
    /* synthetic */ Object result;

    public CoroutineExtensionsKt$runReturnSuspendCatching$1(vz0 vz0Var) {
        super(vz0Var);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object runReturnSuspendCatching = CoroutineExtensionsKt.runReturnSuspendCatching(null, this);
        if (runReturnSuspendCatching == w11.x) {
            return runReturnSuspendCatching;
        }
        return new z45(runReturnSuspendCatching);
    }
}

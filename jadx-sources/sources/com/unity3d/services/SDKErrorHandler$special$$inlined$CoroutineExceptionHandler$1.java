package com.unity3d.services;

import com.unity3d.services.core.log.DeviceLog;
import defpackage.l11;
import defpackage.o11;
import defpackage.p11;
import defpackage.t0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1 extends t0 implements p11 {
    public SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1(o11 o11Var) {
        super(o11Var);
    }

    @Override // defpackage.p11
    public void handleException(l11 l11Var, Throwable th) {
        DeviceLog.error("SDKErrorHandler encountered an exception: %s", th);
    }
}

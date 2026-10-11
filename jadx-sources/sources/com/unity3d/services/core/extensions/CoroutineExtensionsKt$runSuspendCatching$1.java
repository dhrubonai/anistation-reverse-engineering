package com.unity3d.services.core.extensions;

import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.xz0;
import defpackage.z45;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", f = "CoroutineExtensions.kt", l = {15}, m = "runSuspendCatching")
/* loaded from: classes.dex */
public final class CoroutineExtensionsKt$runSuspendCatching$1<R> extends xz0 {
    int label;
    /* synthetic */ Object result;

    public CoroutineExtensionsKt$runSuspendCatching$1(vz0 vz0Var) {
        super(vz0Var);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object runSuspendCatching = CoroutineExtensionsKt.runSuspendCatching(null, this);
        if (runSuspendCatching == w11.x) {
            return runSuspendCatching;
        }
        return new z45(runSuspendCatching);
    }
}

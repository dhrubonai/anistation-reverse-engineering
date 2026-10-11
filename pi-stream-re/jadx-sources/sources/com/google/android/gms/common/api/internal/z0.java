package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class z0 extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public final Object f2486c;

    public z0(TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f2486c = null;
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final /* bridge */ /* synthetic */ void d(z zVar, boolean z9) {
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final boolean f(g0 g0Var) {
        HashMap hashMap = g0Var.f2408f;
        a3.g.z(this.f2486c);
        a3.g.z(hashMap.get(null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final b5.c[] g(g0 g0Var) {
        HashMap hashMap = g0Var.f2408f;
        a3.g.z(this.f2486c);
        a3.g.z(hashMap.get(null));
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void h(g0 g0Var) {
        HashMap hashMap = g0Var.f2408f;
        a3.g.z(this.f2486c);
        a3.g.z(hashMap.remove(null));
        this.f2474b.trySetResult(Boolean.FALSE);
    }
}

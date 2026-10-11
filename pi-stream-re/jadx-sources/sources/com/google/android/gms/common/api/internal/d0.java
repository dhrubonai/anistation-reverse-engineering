package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zaq;

/* loaded from: classes.dex */
public final class d0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f2393a;

    public d0(h hVar) {
        this.f2393a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void onBackgroundStateChanged(boolean z9) {
        zaq zaqVar = this.f2393a.E;
        zaqVar.sendMessage(zaqVar.obtainMessage(1, Boolean.valueOf(z9)));
    }
}

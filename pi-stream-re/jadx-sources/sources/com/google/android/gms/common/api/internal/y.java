package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class y implements com.google.android.gms.common.api.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f2481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f2482b;

    public y(z zVar, d dVar) {
        this.f2482b = zVar;
        this.f2481a = dVar;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Status status) {
        ((Map) this.f2482b.f2484a).remove(this.f2481a);
    }
}

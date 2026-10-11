package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public final class x extends BasePendingResult {

    /* renamed from: a, reason: collision with root package name */
    public final s f2492a;

    public x(Status status) {
        super(null);
        this.f2492a = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final s createFailedResult(Status status) {
        return this.f2492a;
    }
}

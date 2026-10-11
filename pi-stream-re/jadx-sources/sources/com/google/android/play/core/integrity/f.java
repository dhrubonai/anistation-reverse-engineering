package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes.dex */
final class f extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private long f2928a;

    /* renamed from: b, reason: collision with root package name */
    private byte f2929b;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f2929b == 1) {
            return new h(this.f2928a, null);
        }
        throw new IllegalStateException("Missing required properties: cloudProjectNumber");
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j4) {
        this.f2928a = j4;
        this.f2929b = (byte) 1;
        return this;
    }
}

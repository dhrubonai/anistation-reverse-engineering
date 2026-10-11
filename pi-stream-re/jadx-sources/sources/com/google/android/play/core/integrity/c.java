package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* loaded from: classes.dex */
final class c extends IntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private String f2924a;

    /* renamed from: b, reason: collision with root package name */
    private Long f2925b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f2924a;
        if (str != null) {
            return new e(str, this.f2925b, null, 0 == true ? 1 : 0);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j4) {
        this.f2925b = Long.valueOf(j4);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.f2924a = str;
            return this;
        }
        throw new NullPointerException("Null nonce");
    }
}

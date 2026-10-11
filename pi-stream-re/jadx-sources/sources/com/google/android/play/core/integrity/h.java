package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes.dex */
final class h extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final long f2930a;

    public /* synthetic */ h(long j4, g gVar) {
        this.f2930a = j4;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final long a() {
        return this.f2930a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) && this.f2930a == ((StandardIntegrityManager.PrepareIntegrityTokenRequest) obj).a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f2930a;
        return ((int) (j4 ^ (j4 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f2930a + "}";
    }
}

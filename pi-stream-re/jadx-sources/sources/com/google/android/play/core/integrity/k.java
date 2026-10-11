package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes.dex */
final class k extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f2932a;

    public /* synthetic */ k(String str, j jVar) {
        this.f2932a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String a() {
        return this.f2932a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.f2932a;
        if (str == null) {
            if (standardIntegrityTokenRequest.a() == null) {
                return true;
            }
            return false;
        }
        return str.equals(standardIntegrityTokenRequest.a());
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f2932a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return r.f.e("StandardIntegrityTokenRequest{requestHash=", this.f2932a, "}");
    }
}

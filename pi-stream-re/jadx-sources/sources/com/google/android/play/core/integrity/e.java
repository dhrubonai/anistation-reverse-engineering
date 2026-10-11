package com.google.android.play.core.integrity;

import android.net.Network;

/* loaded from: classes.dex */
final class e extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f2926a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f2927b;

    public /* synthetic */ e(String str, Long l10, Network network, d dVar) {
        this.f2926a = str;
        this.f2927b = l10;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Network a() {
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f2927b;
    }

    public final boolean equals(Object obj) {
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f2926a.equals(integrityTokenRequest.nonce()) && ((l10 = this.f2927b) != null ? l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                integrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f2926a.hashCode() ^ 1000003;
        Long l10 = this.f2927b;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return ((hashCode2 * 1000003) ^ hashCode) * 1000003;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f2926a;
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f2926a + ", cloudProjectNumber=" + this.f2927b + ", network=null}";
    }
}

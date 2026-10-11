package com.google.android.play.core.integrity;

import android.app.PendingIntent;

/* loaded from: classes.dex */
final class ah extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    private final String f2881a;

    /* renamed from: b, reason: collision with root package name */
    private final u f2882b;

    public ah(String str, p6.v vVar, PendingIntent pendingIntent) {
        this.f2881a = str;
        this.f2882b = new u(vVar, pendingIntent);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f2881a;
    }
}

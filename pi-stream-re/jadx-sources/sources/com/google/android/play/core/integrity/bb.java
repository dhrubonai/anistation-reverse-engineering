package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes.dex */
final class bb extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a, reason: collision with root package name */
    private final String f2917a;

    /* renamed from: b, reason: collision with root package name */
    private final u f2918b;

    public bb(String str, p6.v vVar, PendingIntent pendingIntent) {
        this.f2917a = str;
        this.f2918b = new u(vVar, pendingIntent);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f2917a;
    }
}

package com.google.android.play.core.integrity;

import android.app.PendingIntent;

/* loaded from: classes.dex */
final class b extends ba {

    /* renamed from: a, reason: collision with root package name */
    private String f2914a;

    /* renamed from: b, reason: collision with root package name */
    private p6.v f2915b;

    /* renamed from: c, reason: collision with root package name */
    private PendingIntent f2916c;

    @Override // com.google.android.play.core.integrity.ba
    public final ba a(PendingIntent pendingIntent) {
        this.f2916c = pendingIntent;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ba
    public final ba b(p6.v vVar) {
        if (vVar != null) {
            this.f2915b = vVar;
            return this;
        }
        throw new NullPointerException("Null logger");
    }

    @Override // com.google.android.play.core.integrity.ba
    public final ba c(String str) {
        if (str != null) {
            this.f2914a = str;
            return this;
        }
        throw new NullPointerException("Null token");
    }

    @Override // com.google.android.play.core.integrity.ba
    public final bb d() {
        p6.v vVar;
        String str = this.f2914a;
        if (str != null && (vVar = this.f2915b) != null) {
            return new bb(str, vVar, this.f2916c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2914a == null) {
            sb.append(" token");
        }
        if (this.f2915b == null) {
            sb.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

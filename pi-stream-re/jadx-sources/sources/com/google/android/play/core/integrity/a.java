package com.google.android.play.core.integrity;

import android.app.PendingIntent;

/* loaded from: classes.dex */
final class a extends ag {

    /* renamed from: a, reason: collision with root package name */
    private String f2863a;

    /* renamed from: b, reason: collision with root package name */
    private p6.v f2864b;

    /* renamed from: c, reason: collision with root package name */
    private PendingIntent f2865c;

    @Override // com.google.android.play.core.integrity.ag
    public final ag a(PendingIntent pendingIntent) {
        this.f2865c = pendingIntent;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ag
    public final ag b(p6.v vVar) {
        if (vVar != null) {
            this.f2864b = vVar;
            return this;
        }
        throw new NullPointerException("Null logger");
    }

    @Override // com.google.android.play.core.integrity.ag
    public final ag c(String str) {
        this.f2863a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ag
    public final ah d() {
        p6.v vVar;
        String str = this.f2863a;
        if (str != null && (vVar = this.f2864b) != null) {
            return new ah(str, vVar, this.f2865c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2863a == null) {
            sb.append(" token");
        }
        if (this.f2864b == null) {
            sb.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

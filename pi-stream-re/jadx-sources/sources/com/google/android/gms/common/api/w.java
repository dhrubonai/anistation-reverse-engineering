package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class w extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final b5.c f2491a;

    public w(b5.c cVar) {
        this.f2491a = cVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f2491a));
    }
}

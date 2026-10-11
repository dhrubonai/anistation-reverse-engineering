package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class m implements t {

    /* renamed from: a, reason: collision with root package name */
    private Context f2933a;

    private m() {
    }

    public /* synthetic */ m(l lVar) {
    }

    public final m a(Context context) {
        context.getClass();
        this.f2933a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.t
    public final o b() {
        Context context = this.f2933a;
        if (context != null) {
            return new o(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }
}

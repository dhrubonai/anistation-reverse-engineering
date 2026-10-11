package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f2944a = this;

    /* renamed from: b, reason: collision with root package name */
    private final p6.h f2945b;

    /* renamed from: c, reason: collision with root package name */
    private final p6.h f2946c;

    /* renamed from: d, reason: collision with root package name */
    private final p6.h f2947d;

    /* renamed from: e, reason: collision with root package name */
    private final p6.h f2948e;

    /* renamed from: f, reason: collision with root package name */
    private final p6.h f2949f;

    public s(Context context, r rVar) {
        ao aoVar;
        if (context != null) {
            androidx.fragment.app.o oVar = new androidx.fragment.app.o(context);
            this.f2945b = oVar;
            aoVar = an.f2890a;
            p6.h b10 = p6.f.b(aoVar);
            this.f2946c = b10;
            p6.h b11 = p6.f.b(new az(oVar, b10));
            this.f2947d = b11;
            p6.h b12 = p6.f.b(new be(b11));
            this.f2948e = b12;
            this.f2949f = p6.f.b(new am(b11, b12));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f2949f.a();
    }
}

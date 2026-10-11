package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private final o f2938a = this;

    /* renamed from: b, reason: collision with root package name */
    private final p6.h f2939b;

    /* renamed from: c, reason: collision with root package name */
    private final p6.h f2940c;

    /* renamed from: d, reason: collision with root package name */
    private final p6.h f2941d;

    /* renamed from: e, reason: collision with root package name */
    private final p6.h f2942e;

    public o(Context context, n nVar) {
        z zVar;
        if (context != null) {
            androidx.fragment.app.o oVar = new androidx.fragment.app.o(context);
            this.f2939b = oVar;
            zVar = y.f2955a;
            p6.h b10 = p6.f.b(zVar);
            this.f2940c = b10;
            p6.h b11 = p6.f.b(new af(oVar, b10));
            this.f2941d = b11;
            this.f2942e = p6.f.b(new x(b11));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f2942e.a();
    }
}

package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private static o f2952a;

    public static synchronized o a(Context context) {
        o oVar;
        synchronized (v.class) {
            if (f2952a == null) {
                m mVar = new m(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                mVar.a(context);
                f2952a = mVar.b();
            }
            oVar = f2952a;
        }
        return oVar;
    }
}

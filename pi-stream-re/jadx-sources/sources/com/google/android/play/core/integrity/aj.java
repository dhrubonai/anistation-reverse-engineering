package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    private static s f2883a;

    public static synchronized s a(Context context) {
        s sVar;
        synchronized (aj.class) {
            if (f2883a == null) {
                q qVar = new q(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                qVar.a(context);
                f2883a = qVar.b();
            }
            sVar = f2883a;
        }
        return sVar;
    }
}

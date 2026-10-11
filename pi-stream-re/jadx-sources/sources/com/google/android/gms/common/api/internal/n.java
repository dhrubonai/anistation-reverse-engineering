package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.internal.common.zzi;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2441a;

    public n(Looper looper, Object obj, String str) {
        new zzi(looper);
        if (obj != null) {
            this.f2441a = obj;
            w7.b.o(str);
            return;
        }
        throw new NullPointerException("Listener must not be null");
    }
}

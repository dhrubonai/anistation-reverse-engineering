package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f2438a;

    public k(Activity activity) {
        if (activity != null) {
            this.f2438a = activity;
            return;
        }
        throw new NullPointerException("Activity must not be null");
    }
}

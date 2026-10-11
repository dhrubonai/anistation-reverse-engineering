package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public interface l {
    void a(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback c(Class cls, String str);

    Activity d();

    void startActivityForResult(Intent intent, int i10);
}

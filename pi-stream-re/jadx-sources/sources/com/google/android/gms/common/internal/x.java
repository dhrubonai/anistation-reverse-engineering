package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class x extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f2606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f2607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2608c = 2;

    public x(Activity activity, Intent intent) {
        this.f2606a = intent;
        this.f2607b = activity;
    }

    @Override // com.google.android.gms.common.internal.z
    public final void a() {
        Intent intent = this.f2606a;
        if (intent != null) {
            this.f2607b.startActivityForResult(intent, this.f2608c);
        }
    }
}

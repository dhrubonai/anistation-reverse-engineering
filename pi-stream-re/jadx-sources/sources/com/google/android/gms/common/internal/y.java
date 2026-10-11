package com.google.android.gms.common.internal;

import android.content.Intent;

/* loaded from: classes.dex */
public final class y extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f2609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.l f2610b;

    public y(Intent intent, com.google.android.gms.common.api.internal.l lVar) {
        this.f2609a = intent;
        this.f2610b = lVar;
    }

    @Override // com.google.android.gms.common.internal.z
    public final void a() {
        Intent intent = this.f2609a;
        if (intent != null) {
            this.f2610b.startActivityForResult(intent, 2);
        }
    }
}

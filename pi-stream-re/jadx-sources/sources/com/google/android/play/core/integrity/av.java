package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class av extends at {

    /* renamed from: c, reason: collision with root package name */
    private final p6.v f2905c;

    public av(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(axVar, taskCompletionSource);
        this.f2905c = new p6.v("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.at, p6.p
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f2905c.b("onWarmUpExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f2902a.trySetException(new StandardIntegrityException(i10, null));
        } else {
            this.f2902a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}

package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class au extends at {

    /* renamed from: c, reason: collision with root package name */
    private final p6.v f2904c;

    public au(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(axVar, taskCompletionSource);
        this.f2904c = new p6.v("OnRequestIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.at, p6.p
    public final void c(Bundle bundle) {
        PendingIntent pendingIntent;
        Object parcelable;
        super.c(bundle);
        this.f2904c.b("onRequestExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f2902a.trySetException(new StandardIntegrityException(i10, null));
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable("dialog.intent", PendingIntent.class);
            pendingIntent = (PendingIntent) parcelable;
        } else {
            pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        }
        TaskCompletionSource taskCompletionSource = this.f2902a;
        b bVar = new b();
        bVar.c(bundle.getString("token"));
        bVar.b(this.f2904c);
        bVar.a(pendingIntent);
        taskCompletionSource.trySetResult(bVar.d());
    }
}

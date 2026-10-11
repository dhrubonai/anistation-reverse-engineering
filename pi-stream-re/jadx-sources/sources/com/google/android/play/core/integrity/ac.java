package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class ac extends p6.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f2872a;

    /* renamed from: b, reason: collision with root package name */
    private final p6.v f2873b = new p6.v("OnRequestIntegrityTokenCallback");

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f2874c;

    public ac(ad adVar, TaskCompletionSource taskCompletionSource) {
        this.f2872a = adVar;
        this.f2874c = taskCompletionSource;
    }

    @Override // p6.u
    public final void b(Bundle bundle) {
        PendingIntent pendingIntent;
        Object parcelable;
        this.f2872a.f2875a.d(this.f2874c);
        this.f2873b.b("onRequestIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f2874c.trySetException(new IntegrityServiceException(i10, null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f2874c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable("dialog.intent", PendingIntent.class);
            pendingIntent = (PendingIntent) parcelable;
        } else {
            pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        }
        TaskCompletionSource taskCompletionSource = this.f2874c;
        a aVar = new a();
        aVar.c(string);
        aVar.b(this.f2873b);
        aVar.a(pendingIntent);
        taskCompletionSource.trySetResult(aVar.d());
    }
}

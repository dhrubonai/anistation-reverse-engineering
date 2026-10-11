package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import p6.a0;

/* loaded from: classes.dex */
final class ad {

    /* renamed from: a, reason: collision with root package name */
    final p6.c f2875a;

    /* renamed from: b, reason: collision with root package name */
    private final p6.v f2876b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2877c;

    public ad(Context context, p6.v vVar) {
        this.f2877c = context.getPackageName();
        this.f2876b = vVar;
        if (!p6.e.a(context)) {
            Object[] objArr = new Object[0];
            vVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", p6.v.c(vVar.f8627a, "Phonesky is not installed.", objArr));
            }
            this.f2875a = null;
            return;
        }
        this.f2875a = new p6.c(context, vVar, "IntegrityService", ae.f2878a, new a0() { // from class: com.google.android.play.core.integrity.aa
            @Override // p6.a0
            public final Object a(IBinder iBinder) {
                int i10 = p6.r.f8626d;
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                if (queryLocalInterface instanceof p6.s) {
                    return (p6.s) queryLocalInterface;
                }
                return new p6.q(iBinder);
            }
        });
    }

    public static Bundle a(ad adVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", adVar.f2877c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 2);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p6.k(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(w7.b.a(arrayList)));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f2875a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            integrityTokenRequest.a();
            this.f2876b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f2875a.c(new ab(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}

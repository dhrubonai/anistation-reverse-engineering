package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import p6.a0;

/* loaded from: classes.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    final p6.c f2907a;

    /* renamed from: b, reason: collision with root package name */
    private final p6.v f2908b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2909c;

    /* renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f2910d;

    public ax(Context context, p6.v vVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2910d = taskCompletionSource;
        this.f2909c = context.getPackageName();
        this.f2908b = vVar;
        p6.c cVar = new p6.c(context, vVar, "ExpressIntegrityService", ay.f2911a, new a0() { // from class: com.google.android.play.core.integrity.ap
            @Override // p6.a0
            public final Object a(IBinder iBinder) {
                int i10 = p6.m.f8625d;
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                if (queryLocalInterface instanceof p6.n) {
                    return (p6.n) queryLocalInterface;
                }
                return new p6.l(iBinder);
            }
        });
        this.f2907a = cVar;
        cVar.a().post(new aq(this, taskCompletionSource, context));
    }

    public static Bundle a(ax axVar, String str, long j4, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", axVar.f2909c);
        bundle.putLong("cloud.prj", j4);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p6.k(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(w7.b.a(arrayList)));
        return bundle;
    }

    public static Bundle b(ax axVar, long j4) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", axVar.f2909c);
        bundle.putLong("cloud.prj", j4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p6.k(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(w7.b.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean g(ax axVar) {
        if (axVar.f2910d.getTask().isSuccessful() && !((Boolean) axVar.f2910d.getTask().getResult()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final Task c(String str, long j4, long j10) {
        this.f2908b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2907a.c(new as(this, taskCompletionSource, str, j4, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(long j4) {
        this.f2908b.b("warmUpIntegrityToken(%s)", Long.valueOf(j4));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2907a.c(new ar(this, taskCompletionSource, j4, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}

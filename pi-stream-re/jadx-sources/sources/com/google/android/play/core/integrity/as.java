package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class as extends aw {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2897a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f2898b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f2899c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f2900d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ax f2901e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(ax axVar, TaskCompletionSource taskCompletionSource, String str, long j4, long j10, TaskCompletionSource taskCompletionSource2) {
        super(axVar, taskCompletionSource);
        this.f2901e = axVar;
        this.f2897a = str;
        this.f2898b = j4;
        this.f2899c = j10;
        this.f2900d = taskCompletionSource2;
    }

    @Override // p6.w
    public final void b() {
        p6.v vVar;
        if (ax.g(this.f2901e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            ax axVar = this.f2901e;
            p6.n nVar = (p6.n) axVar.f2907a.f8617n;
            Bundle a10 = ax.a(axVar, this.f2897a, this.f2898b, this.f2899c);
            au auVar = new au(this.f2901e, this.f2900d);
            p6.l lVar = (p6.l) nVar;
            lVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(lVar.f8600b);
            int i10 = p6.j.f8622a;
            obtain.writeInt(1);
            a10.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(auVar);
            try {
                lVar.f8599a.transact(3, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e10) {
            vVar = this.f2901e.f2908b;
            vVar.a("requestExpressIntegrityToken(%s, %s)", e10, this.f2897a, Long.valueOf(this.f2898b));
            this.f2900d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}

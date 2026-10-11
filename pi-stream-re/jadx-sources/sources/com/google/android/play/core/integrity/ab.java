package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ab extends p6.w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f2867a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f2868b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f2869c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f2870d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ad f2871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ad adVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f2871e = adVar;
        this.f2867a = bArr;
        this.f2868b = l10;
        this.f2869c = taskCompletionSource2;
        this.f2870d = integrityTokenRequest;
    }

    @Override // p6.w
    public final void a(Exception exc) {
        if (exc instanceof p6.d) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // p6.w
    public final void b() {
        p6.v vVar;
        try {
            ad adVar = this.f2871e;
            p6.s sVar = (p6.s) adVar.f2875a.f8617n;
            Bundle a10 = ad.a(adVar, this.f2867a, this.f2868b, null);
            ac acVar = new ac(this.f2871e, this.f2869c);
            p6.q qVar = (p6.q) sVar;
            qVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(qVar.f8600b);
            int i10 = p6.j.f8622a;
            obtain.writeInt(1);
            a10.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(acVar);
            try {
                qVar.f8599a.transact(2, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e10) {
            vVar = this.f2871e.f2876b;
            vVar.a("requestIntegrityToken(%s)", e10, this.f2870d);
            this.f2869c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}

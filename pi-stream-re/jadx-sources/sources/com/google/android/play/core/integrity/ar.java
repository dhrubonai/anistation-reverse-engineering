package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ar extends aw {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f2894a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f2895b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ax f2896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(ax axVar, TaskCompletionSource taskCompletionSource, long j4, TaskCompletionSource taskCompletionSource2) {
        super(axVar, taskCompletionSource);
        this.f2896c = axVar;
        this.f2894a = j4;
        this.f2895b = taskCompletionSource2;
    }

    @Override // p6.w
    public final void b() {
        p6.v vVar;
        if (ax.g(this.f2896c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            ax axVar = this.f2896c;
            p6.n nVar = (p6.n) axVar.f2907a.f8617n;
            Bundle b10 = ax.b(axVar, this.f2894a);
            av avVar = new av(this.f2896c, this.f2895b);
            p6.l lVar = (p6.l) nVar;
            lVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(lVar.f8600b);
            int i10 = p6.j.f8622a;
            obtain.writeInt(1);
            b10.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(avVar);
            try {
                lVar.f8599a.transact(2, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e10) {
            vVar = this.f2896c.f2908b;
            vVar.a("warmUpIntegrityToken(%s)", e10, Long.valueOf(this.f2894a));
            this.f2895b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}

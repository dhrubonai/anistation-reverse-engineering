package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class k0 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f2549g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f2550h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(f fVar, int i10, IBinder iBinder, Bundle bundle) {
        super(fVar, i10, bundle);
        this.f2550h = fVar;
        this.f2549g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.d0
    public final void b(b5.a aVar) {
        c cVar;
        c cVar2;
        f fVar = this.f2550h;
        cVar = fVar.zzx;
        if (cVar != null) {
            cVar2 = fVar.zzx;
            ((com.google.android.gms.common.api.internal.p) ((k3.d) cVar2).f6453b).c(aVar);
        }
        fVar.onConnectionFailed(aVar);
    }

    @Override // com.google.android.gms.common.internal.d0
    public final boolean c() {
        b bVar;
        b bVar2;
        IBinder iBinder = this.f2549g;
        try {
            w7.b.s(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.f2550h;
            if (!fVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + fVar.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface createServiceInterface = fVar.createServiceInterface(iBinder);
            if (createServiceInterface != null && (f.zzn(fVar, 2, 4, createServiceInterface) || f.zzn(fVar, 3, 4, createServiceInterface))) {
                fVar.zzB = null;
                fVar.getConnectionHint();
                bVar = fVar.zzw;
                if (bVar != null) {
                    bVar2 = fVar.zzw;
                    ((com.google.android.gms.common.api.internal.g) ((k3.d) bVar2).f6453b).b();
                    return true;
                }
                return true;
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public final class i0 extends zzb {

    /* renamed from: a, reason: collision with root package name */
    public f f2536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2537b;

    public i0(f fVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f2536a = fVar;
        this.f2537b = i10;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int i12 = this.f2537b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                m0 m0Var = (m0) zzc.zza(parcel, m0.CREATOR);
                zzc.zzb(parcel);
                f fVar = this.f2536a;
                w7.b.r(fVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                w7.b.s(m0Var);
                f.zzj(fVar, m0Var);
                w7.b.r(this.f2536a, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f2536a.onPostInitHandler(readInt, readStrongBinder, m0Var.f2555a, i12);
                this.f2536a = null;
            } else {
                parcel.readInt();
                zzc.zzb(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            w7.b.r(this.f2536a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f2536a.onPostInitHandler(readInt2, readStrongBinder2, bundle, i12);
            this.f2536a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

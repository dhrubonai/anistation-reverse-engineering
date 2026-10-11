package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.firebase.FirebaseApp;

/* loaded from: classes.dex */
public final class zzcb {
    private volatile int zza;
    private final zzaq zzb;
    private volatile boolean zzc;

    public zzcb(FirebaseApp firebaseApp) {
        this(firebaseApp.getApplicationContext(), new zzaq(firebaseApp));
    }

    private zzcb(Context context, zzaq zzaqVar) {
        this.zzc = false;
        this.zza = 0;
        this.zzb = zzaqVar;
        c.a((Application) context.getApplicationContext());
        c cVar = c.f2385e;
        zzca zzcaVar = new zzca(this);
        cVar.getClass();
        synchronized (cVar) {
            cVar.f2388c.add(zzcaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzb() {
        return this.zza > 0 && !this.zzc;
    }

    public final void zza() {
        this.zzb.zzb();
    }

    public final void zza(int i10) {
        if (i10 > 0 && this.zza == 0) {
            this.zza = i10;
            if (zzb()) {
                this.zzb.zzc();
            }
        } else if (i10 == 0 && this.zza != 0) {
            this.zzb.zzb();
        }
        this.zza = i10;
    }

    public final void zza(zzafm zzafmVar) {
        if (zzafmVar == null) {
            return;
        }
        long zza = zzafmVar.zza();
        if (zza <= 0) {
            zza = 3600;
        }
        long zzb = (zza * 1000) + zzafmVar.zzb();
        zzaq zzaqVar = this.zzb;
        zzaqVar.zza = zzb;
        zzaqVar.zzb = -1L;
        if (zzb()) {
            this.zzb.zzc();
        }
    }
}

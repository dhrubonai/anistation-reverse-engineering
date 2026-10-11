package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import p7.y;
import r6.h0;

/* loaded from: classes.dex */
public final class zzbj extends TimerTask {
    final /* synthetic */ zzbm zza;

    public zzbj(zzbm zzbmVar) {
        this.zza = zzbmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        y yVar;
        zzbm zzbmVar = this.zza;
        yVar = zzbmVar.zzd;
        h0.k0(yVar, new zzbk(zzbmVar, null));
    }
}

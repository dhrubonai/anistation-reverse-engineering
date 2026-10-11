package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

@Deprecated
/* loaded from: classes.dex */
final class zzmc implements zzce {
    private final SharedPreferences.Editor zza;
    private final String zzb;

    public zzmc(Context context, String str, String str2) {
        if (str != null) {
            this.zzb = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.zza = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.zza = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(zzty zztyVar) {
        if (!this.zza.putString(this.zzb, zzxh.zza(zztyVar.zzj())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(zzvh zzvhVar) {
        if (!this.zza.putString(this.zzb, zzxh.zza(zzvhVar.zzj())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}

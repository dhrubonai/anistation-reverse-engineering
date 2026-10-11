package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zzd;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzyt implements zzadm<zzafc> {
    private final /* synthetic */ zzadj zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ zzd zze;
    private final /* synthetic */ zzacf zzf;
    private final /* synthetic */ zzafm zzg;

    public zzyt(zzyl zzylVar, zzadj zzadjVar, String str, String str2, Boolean bool, zzd zzdVar, zzacf zzacfVar, zzafm zzafmVar) {
        this.zza = zzadjVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = zzdVar;
        this.zzf = zzacfVar;
        this.zzg = zzafmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafc zzafcVar) {
        List<zzafb> zza = zzafcVar.zza();
        if (zza != null && !zza.isEmpty()) {
            zzafb zzafbVar = zza.get(0);
            zzafu zzf = zzafbVar.zzf();
            List<zzafr> zza2 = zzf != null ? zzf.zza() : null;
            if (zza2 != null && !zza2.isEmpty()) {
                if (TextUtils.isEmpty(this.zzb)) {
                    zza2.get(0).zza(this.zzc);
                } else {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= zza2.size()) {
                            break;
                        }
                        if (zza2.get(i10).zzf().equals(this.zzb)) {
                            zza2.get(i10).zza(this.zzc);
                            break;
                        }
                        i10++;
                    }
                }
            }
            Boolean bool = this.zzd;
            if (bool != null) {
                zzafbVar.zza(bool.booleanValue());
            } else {
                zzafbVar.zza(zzafbVar.zzb() - zzafbVar.zza() < 1000);
            }
            zzafbVar.zza(this.zze);
            this.zzf.zza(this.zzg, zzafbVar);
            return;
        }
        this.zza.zza("No users.");
    }
}

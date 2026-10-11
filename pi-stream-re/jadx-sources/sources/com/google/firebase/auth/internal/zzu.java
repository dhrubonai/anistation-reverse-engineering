package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzafv;
import com.google.firebase.auth.ActionCodeInfo;
import com.google.firebase.auth.ActionCodeResult;

/* loaded from: classes.dex */
public final class zzu implements ActionCodeResult {
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final ActionCodeInfo zzd;

    public zzu(zzafv zzafvVar) {
        String zzb;
        if (zzafvVar.zzg()) {
            zzb = zzafvVar.zzc();
        } else {
            zzb = zzafvVar.zzb();
        }
        this.zzb = zzb;
        this.zzc = zzafvVar.zzb();
        ActionCodeInfo actionCodeInfo = null;
        if (!zzafvVar.zzh()) {
            this.zza = 3;
            this.zzd = null;
            return;
        }
        String zzd = zzafvVar.zzd();
        zzd.getClass();
        int i10 = 5;
        char c6 = 65535;
        switch (zzd.hashCode()) {
            case -1874510116:
                if (zzd.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1452371317:
                if (zzd.equals("PASSWORD_RESET")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1341836234:
                if (zzd.equals("VERIFY_EMAIL")) {
                    c6 = 2;
                    break;
                }
                break;
            case -1099157829:
                if (zzd.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c6 = 3;
                    break;
                }
                break;
            case 870738373:
                if (zzd.equals("EMAIL_SIGNIN")) {
                    c6 = 4;
                    break;
                }
                break;
            case 970484929:
                if (zzd.equals("RECOVER_EMAIL")) {
                    c6 = 5;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                i10 = 6;
                break;
            case 1:
                i10 = 0;
                break;
            case 2:
                i10 = 1;
                break;
            case 3:
                break;
            case 4:
                i10 = 4;
                break;
            case 5:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        this.zza = i10;
        if (i10 != 4 && i10 != 3) {
            if (zzafvVar.zzf()) {
                actionCodeInfo = new zzv(zzafvVar.zzb(), zzbk.zza(zzafvVar.zza()));
            } else if (zzafvVar.zzg()) {
                actionCodeInfo = new zzt(zzafvVar.zzc(), zzafvVar.zzb());
            } else if (zzafvVar.zze()) {
                actionCodeInfo = new zzs(zzafvVar.zzb());
            }
            this.zzd = actionCodeInfo;
            return;
        }
        this.zzd = null;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final String getData(int i10) {
        if (this.zza == 4) {
            return null;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.zzc;
        }
        return this.zzb;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final ActionCodeInfo getInfo() {
        return this.zzd;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final int getOperation() {
        return this.zza;
    }
}

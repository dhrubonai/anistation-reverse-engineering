package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.zzd;
import w7.b;

/* loaded from: classes.dex */
public final class zzyl {
    private final zzadk zza;

    public zzyl(zzadk zzadkVar) {
        b.s(zzadkVar);
        this.zza = zzadkVar;
    }

    public final void zzb(String str, String str2, zzacf zzacfVar) {
        b.o(str);
        b.o(str2);
        b.s(zzacfVar);
        zza(str, new zzaad(this, str2, zzacfVar));
    }

    public final void zzc(String str, String str2, zzacf zzacfVar) {
        b.o(str);
        b.o(str2);
        b.s(zzacfVar);
        zza(str, new zzaac(this, str2, zzacfVar));
    }

    public final void zzd(String str, String str2, zzacf zzacfVar) {
        b.o(str);
        b.s(zzacfVar);
        this.zza.zza(new zzafw(str, null, str2), new zzyu(this, zzacfVar));
    }

    public final void zze(String str, String str2, zzacf zzacfVar) {
        b.o(str);
        b.s(zzacfVar);
        this.zza.zza(new zzaej(str, str2), new zzys(this, zzacfVar));
    }

    public final void zzf(String str, zzacf zzacfVar) {
        b.o(str);
        b.s(zzacfVar);
        zza(str, new zzzh(this, zzacfVar));
    }

    public static void zza(zzyl zzylVar, zzagu zzaguVar, zzacf zzacfVar, zzadj zzadjVar) {
        Status zza;
        if (zzaguVar.zzo()) {
            zzd zzb = zzaguVar.zzb();
            String zzc = zzaguVar.zzc();
            String zzj = zzaguVar.zzj();
            if (zzaguVar.zzm()) {
                zza = new Status(FirebaseError.ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL, null);
            } else {
                zza = zzao.zza(zzaguVar.zzd());
            }
            zzacfVar.zza(new zzyj(zza, zzb, zzc, zzj));
            return;
        }
        zzylVar.zza(new zzafm(zzaguVar.zzi(), zzaguVar.zze(), Long.valueOf(zzaguVar.zza()), "Bearer"), zzaguVar.zzh(), zzaguVar.zzg(), Boolean.valueOf(zzaguVar.zzn()), zzaguVar.zzb(), zzacfVar, zzadjVar);
    }

    public final void zzf(String str, String str2, zzacf zzacfVar) {
        b.o(str);
        b.o(str2);
        b.s(zzacfVar);
        zza(str2, new zzzg(this, str, zzacfVar));
    }

    public final void zzb(String str, zzacf zzacfVar) {
        b.o(str);
        b.s(zzacfVar);
        this.zza.zza(new zzafa(str), new zzyk(this, zzacfVar));
    }

    public final void zzc(String str, zzacf zzacfVar) {
        b.o(str);
        b.s(zzacfVar);
        zza(str, new zzzs(this, zzacfVar));
    }

    public final void zzd(String str, zzacf zzacfVar) {
        b.s(zzacfVar);
        this.zza.zza(str, new zzzw(this, zzacfVar));
    }

    public final void zze(String str, zzacf zzacfVar) {
        b.s(zzacfVar);
        this.zza.zza(new zzagd(str), new zzzy(this, zzacfVar));
    }

    private final void zzb(zzafd zzafdVar, zzacf zzacfVar) {
        b.s(zzafdVar);
        b.s(zzacfVar);
        this.zza.zza(zzafdVar, new zzzz(this, zzacfVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacf zzacfVar) {
        b.o(str);
        b.o(str2);
        b.s(zzacfVar);
        this.zza.zza(new zzagv(str, str2, str3, str4), new zzym(this, zzacfVar));
    }

    public final void zzb(String str, String str2, String str3, zzacf zzacfVar) {
        b.o(str);
        b.o(str2);
        b.s(zzacfVar);
        zza(str, new zzzi(this, str2, str3, zzacfVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzagd zzagdVar, zzadj zzadjVar) {
        b.s(zzacfVar);
        b.s(zzagdVar);
        b.s(zzadjVar);
        zzylVar.zza.zza(zzagdVar, new zzza(zzylVar, zzacfVar, zzadjVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzafm zzafmVar, zzagb zzagbVar, zzadj zzadjVar) {
        b.s(zzacfVar);
        b.s(zzafmVar);
        b.s(zzagbVar);
        b.s(zzadjVar);
        zzylVar.zza.zza(new zzaez(zzafmVar.zzc()), new zzyr(zzylVar, zzadjVar, zzacfVar, zzafmVar, zzagbVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzafm zzafmVar, zzafb zzafbVar, zzagb zzagbVar, zzadj zzadjVar) {
        b.s(zzacfVar);
        b.s(zzafmVar);
        b.s(zzafbVar);
        b.s(zzagbVar);
        b.s(zzadjVar);
        zzylVar.zza.zza(zzagbVar, new zzyq(zzylVar, zzagbVar, zzafbVar, zzacfVar, zzafmVar, zzadjVar));
    }

    public final void zza(String str, String str2, zzacf zzacfVar) {
        b.o(str);
        b.s(zzacfVar);
        zzagb zzagbVar = new zzagb();
        zzagbVar.zze(str);
        zzagbVar.zzh(str2);
        this.zza.zza(zzagbVar, new zzaaf(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, zzacf zzacfVar) {
        b.o(str);
        b.o(str2);
        b.s(zzacfVar);
        this.zza.zza(new zzafw(str, str2, str3), new zzyw(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacf zzacfVar) {
        b.o(str);
        b.o(str2);
        b.s(zzacfVar);
        this.zza.zza(new zzagd(str, str2, null, str3, str4, null), new zzyn(this, zzacfVar));
    }

    public final void zza(String str, zzacf zzacfVar) {
        b.o(str);
        b.s(zzacfVar);
        zza(str, new zzzu(this, zzacfVar));
    }

    private final void zza(String str, zzadm<zzafm> zzadmVar) {
        b.s(zzadmVar);
        b.o(str);
        zzafm zzb = zzafm.zzb(str);
        if (zzb.zzg()) {
            zzadmVar.zza((zzadm<zzafm>) zzb);
        } else {
            this.zza.zza(new zzafa(zzb.zzd()), new zzaae(this, zzadmVar));
        }
    }

    public final void zza(zzaeq zzaeqVar, String str, zzacf zzacfVar) {
        b.s(zzaeqVar);
        b.s(zzacfVar);
        zza(str, new zzzm(this, zzaeqVar, zzacfVar));
    }

    public final void zza(zzaes zzaesVar, zzacf zzacfVar) {
        b.s(zzaesVar);
        b.s(zzacfVar);
        this.zza.zza(zzaesVar, new zzzo(this, zzacfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzaeo zzaeoVar, zzacf zzacfVar) {
        b.s(zzaeoVar);
        b.s(zzacfVar);
        this.zza.zza(zzaeoVar, new zzyo(this, zzacfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzafm zzafmVar, String str, String str2, Boolean bool, zzd zzdVar, zzacf zzacfVar, zzadj zzadjVar) {
        b.s(zzafmVar);
        b.s(zzadjVar);
        b.s(zzacfVar);
        this.zza.zza(new zzaez(zzafmVar.zzc()), new zzyt(this, zzadjVar, str2, str, bool, zzdVar, zzacfVar, zzafmVar));
    }

    public final void zza(zzaff zzaffVar, zzacf zzacfVar) {
        b.s(zzaffVar);
        b.s(zzacfVar);
        this.zza.zza(zzaffVar, new zzzt(this, zzacfVar));
    }

    public final void zza(zzafk zzafkVar, zzacf zzacfVar) {
        b.s(zzafkVar);
        b.s(zzacfVar);
        this.zza.zza(zzafkVar, new zzzq(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacf zzacfVar) {
        b.o(str);
        b.o(str2);
        b.o(str3);
        b.s(zzacfVar);
        zza(str3, new zzzb(this, str, str2, str4, str5, zzacfVar));
    }

    public final void zza(String str, zzags zzagsVar, zzacf zzacfVar) {
        b.o(str);
        b.s(zzagsVar);
        b.s(zzacfVar);
        zza(str, new zzzf(this, zzagsVar, zzacfVar));
    }

    public final void zza(String str, zzagx zzagxVar, zzacf zzacfVar) {
        b.o(str);
        b.s(zzagxVar);
        b.s(zzacfVar);
        zza(str, new zzzd(this, zzagxVar, zzacfVar));
    }

    public final void zza(zzafy zzafyVar, zzacf zzacfVar) {
        this.zza.zza(zzafyVar, new zzaab(this, zzacfVar));
    }

    public final void zza(String str, ActionCodeSettings actionCodeSettings, zzacf zzacfVar) {
        b.o(str);
        b.s(zzacfVar);
        zzafd zzafdVar = new zzafd(4);
        zzafdVar.zzd(str);
        if (actionCodeSettings != null) {
            zzafdVar.zza(actionCodeSettings);
        }
        zzb(zzafdVar, zzacfVar);
    }

    public final void zza(String str, ActionCodeSettings actionCodeSettings, String str2, String str3, zzacf zzacfVar) {
        b.o(str);
        b.s(zzacfVar);
        zzafd zzafdVar = new zzafd(actionCodeSettings.zza());
        zzafdVar.zzb(str);
        zzafdVar.zza(actionCodeSettings);
        zzafdVar.zzc(str2);
        zzafdVar.zza(str3);
        this.zza.zza(zzafdVar, new zzyv(this, zzacfVar));
    }

    public final void zza(zzafz zzafzVar, zzacf zzacfVar) {
        b.o(zzafzVar.zzd());
        b.s(zzacfVar);
        this.zza.zza(zzafzVar, new zzyz(this, zzacfVar));
    }

    public final void zza(zzags zzagsVar, zzacf zzacfVar) {
        b.s(zzagsVar);
        b.s(zzacfVar);
        zzagsVar.zzb(true);
        this.zza.zza(zzagsVar, new zzzk(this, zzacfVar));
    }

    public final void zza(zzagt zzagtVar, zzacf zzacfVar) {
        b.s(zzagtVar);
        b.s(zzacfVar);
        this.zza.zza(zzagtVar, new zzyx(this, zzacfVar));
    }

    public final void zza(EmailAuthCredential emailAuthCredential, String str, zzacf zzacfVar) {
        b.s(emailAuthCredential);
        b.s(zzacfVar);
        if (emailAuthCredential.zzg()) {
            zza(emailAuthCredential.zzb(), new zzyp(this, emailAuthCredential, str, zzacfVar));
        } else {
            zza(new zzaeo(emailAuthCredential, null, str), zzacfVar);
        }
    }

    public final void zza(zzagx zzagxVar, zzacf zzacfVar) {
        b.s(zzagxVar);
        b.s(zzacfVar);
        this.zza.zza(zzagxVar, new zzyy(this, zzacfVar));
    }

    public final void zza(zzagf zzagfVar, zzacf zzacfVar) {
        b.s(zzagfVar);
        b.s(zzacfVar);
        this.zza.zza(zzagfVar, new zzzn(this, zzagfVar, zzacfVar));
    }

    public final void zza(zzagh zzaghVar, zzacf zzacfVar) {
        b.s(zzaghVar);
        b.s(zzacfVar);
        this.zza.zza(zzaghVar, new zzzr(this, zzacfVar));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzacf zzacfVar) {
        b.o(str);
        b.s(userProfileChangeRequest);
        b.s(zzacfVar);
        zza(str, new zzaaa(this, userProfileChangeRequest, zzacfVar));
    }

    public final void zza(zzafd zzafdVar, zzacf zzacfVar) {
        zzb(zzafdVar, zzacfVar);
    }
}

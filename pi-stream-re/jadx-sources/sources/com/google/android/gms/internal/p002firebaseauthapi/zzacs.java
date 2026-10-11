package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import w7.b;

/* loaded from: classes.dex */
final class zzacs extends zzadk implements zzaee {
    private zzacm zza;
    private zzacp zzb;
    private zzadp zzc;
    private final zzact zzd;
    private final FirebaseApp zze;
    private String zzf;
    private zzacv zzg;

    public zzacs(FirebaseApp firebaseApp, zzact zzactVar) {
        this(firebaseApp, zzactVar, null, null, null);
    }

    private final zzacv zzb() {
        if (this.zzg == null) {
            this.zzg = new zzacv(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzaej zzaejVar, zzadm<zzaem> zzadmVar) {
        b.s(zzaejVar);
        b.s(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/createAuthUri", this.zzf), zzaejVar, zzadmVar, zzaem.class, zzacmVar.zza);
    }

    private zzacs(FirebaseApp firebaseApp, zzact zzactVar, zzadp zzadpVar, zzacm zzacmVar, zzacp zzacpVar) {
        this.zze = firebaseApp;
        this.zzf = firebaseApp.getOptions().getApiKey();
        b.s(zzactVar);
        this.zzd = zzactVar;
        zza(null, null, null);
        zzaec.zza(this.zzf, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzael zzaelVar, zzadm<Void> zzadmVar) {
        b.s(zzaelVar);
        b.s(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/deleteAccount", this.zzf), zzaelVar, zzadmVar, Void.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzaeo zzaeoVar, zzadm<zzaen> zzadmVar) {
        b.s(zzaeoVar);
        b.s(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/emailLinkSignin", this.zzf), zzaeoVar, zzadmVar, zzaen.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzaeq zzaeqVar, zzadm<zzaep> zzadmVar) {
        b.s(zzaeqVar);
        b.s(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzaeqVar, zzadmVar, zzaep.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzaes zzaesVar, zzadm<zzaer> zzadmVar) {
        b.s(zzaesVar);
        b.s(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzaesVar, zzadmVar, zzaer.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafa zzafaVar, zzadm<zzafm> zzadmVar) {
        b.s(zzafaVar);
        b.s(zzadmVar);
        zzadp zzadpVar = this.zzc;
        zzadl.zza(zzadpVar.zza("/token", this.zzf), zzafaVar, zzadmVar, zzafm.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzaez zzaezVar, zzadm<zzafc> zzadmVar) {
        b.s(zzaezVar);
        b.s(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/getAccountInfo", this.zzf), zzaezVar, zzadmVar, zzafc.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafd zzafdVar, zzadm<zzafg> zzadmVar) {
        b.s(zzafdVar);
        b.s(zzadmVar);
        if (zzafdVar.zzb() != null) {
            zzb().zzb(zzafdVar.zzb().zze());
        }
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/getOobConfirmationCode", this.zzf), zzafdVar, zzadmVar, zzafg.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzaff zzaffVar, zzadm<zzafi> zzadmVar) {
        b.s(zzaffVar);
        b.s(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/getRecaptchaParam", this.zzf), zzadmVar, zzafi.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafk zzafkVar, zzadm<zzafj> zzadmVar) {
        b.s(zzafkVar);
        b.s(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzafkVar.zzb() + "&version=" + zzafkVar.zzc(), zzadmVar, zzafj.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaee
    public final void zza() {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafw zzafwVar, zzadm<zzafv> zzadmVar) {
        b.s(zzafwVar);
        b.s(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/resetPassword", this.zzf), zzafwVar, zzadmVar, zzafv.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafy zzafyVar, zzadm<zzaga> zzadmVar) {
        b.s(zzafyVar);
        b.s(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/accounts:revokeToken", this.zzf), zzafyVar, zzadmVar, zzaga.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzafz zzafzVar, zzadm<zzagc> zzadmVar) {
        b.s(zzafzVar);
        b.s(zzadmVar);
        if (!TextUtils.isEmpty(zzafzVar.zzc())) {
            zzb().zzb(zzafzVar.zzc());
        }
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/sendVerificationCode", this.zzf), zzafzVar, zzadmVar, zzagc.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagb zzagbVar, zzadm<zzage> zzadmVar) {
        b.s(zzagbVar);
        b.s(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/setAccountInfo", this.zzf), zzagbVar, zzadmVar, zzage.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(String str, zzadm<Void> zzadmVar) {
        b.s(zzadmVar);
        zzb().zza(str);
        zzadmVar.zza((zzadm<Void>) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagd zzagdVar, zzadm<zzagg> zzadmVar) {
        b.s(zzagdVar);
        b.s(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/signupNewUser", this.zzf), zzagdVar, zzadmVar, zzagg.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagf zzagfVar, zzadm<zzagi> zzadmVar) {
        b.s(zzagfVar);
        b.s(zzadmVar);
        if (zzagfVar instanceof zzagj) {
            zzagj zzagjVar = (zzagj) zzagfVar;
            if (!TextUtils.isEmpty(zzagjVar.zzb())) {
                zzb().zzb(zzagjVar.zzb());
            }
        }
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzagfVar, zzadmVar, zzagi.class, zzacpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagh zzaghVar, zzadm<zzagk> zzadmVar) {
        b.s(zzaghVar);
        b.s(zzadmVar);
        if (!TextUtils.isEmpty(zzaghVar.zzb())) {
            zzb().zzb(zzaghVar.zzb());
        }
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/accounts/mfaSignIn:start", this.zzf), zzaghVar, zzadmVar, zzagk.class, zzacpVar.zza);
    }

    private final void zza(zzadp zzadpVar, zzacm zzacmVar, zzacp zzacpVar) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String zza = zzadz.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza)) {
            zza = zzaec.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + zza);
        }
        if (this.zzc == null) {
            this.zzc = new zzadp(zza, zzb());
        }
        String zza2 = zzadz.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzaec.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + zza2);
        }
        if (this.zza == null) {
            this.zza = new zzacm(zza2, zzb());
        }
        String zza3 = zzadz.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzaec.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + zza3);
        }
        if (this.zzb == null) {
            this.zzb = new zzacp(zza3, zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzags zzagsVar, zzadm<zzagu> zzadmVar) {
        b.s(zzagsVar);
        b.s(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/verifyAssertion", this.zzf), zzagsVar, zzadmVar, zzagu.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagt zzagtVar, zzadm<zzagw> zzadmVar) {
        b.s(zzagtVar);
        b.s(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/verifyCustomToken", this.zzf), zzagtVar, zzadmVar, zzagw.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagv zzagvVar, zzadm<zzagy> zzadmVar) {
        b.s(zzagvVar);
        b.s(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/verifyPassword", this.zzf), zzagvVar, zzadmVar, zzagy.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagx zzagxVar, zzadm<zzaha> zzadmVar) {
        b.s(zzagxVar);
        b.s(zzadmVar);
        zzacm zzacmVar = this.zza;
        zzadl.zza(zzacmVar.zza("/verifyPhoneNumber", this.zzf), zzagxVar, zzadmVar, zzaha.class, zzacmVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final void zza(zzagz zzagzVar, zzadm<zzahc> zzadmVar) {
        b.s(zzagzVar);
        b.s(zzadmVar);
        zzacp zzacpVar = this.zzb;
        zzadl.zza(zzacpVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzagzVar, zzadmVar, zzahc.class, zzacpVar.zza);
    }
}

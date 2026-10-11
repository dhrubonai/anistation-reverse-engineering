package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.ActionCodeResult;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.auth.TotpMultiFactorAssertion;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzab;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzah;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.internal.zzau;
import com.google.firebase.auth.internal.zzav;
import com.google.firebase.auth.internal.zzbk;
import com.google.firebase.auth.internal.zzcc;
import com.google.firebase.auth.internal.zzl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import w7.b;

/* loaded from: classes.dex */
public final class zzaag extends zzadf {
    public zzaag(FirebaseApp firebaseApp, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzace(firebaseApp, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, String str, String str2) {
        return zza((zzaaj) new zzaaj(str, str2).zza(firebaseApp));
    }

    public final Task<ActionCodeResult> zzb(FirebaseApp firebaseApp, String str, String str2) {
        return zza((zzaai) new zzaai(str, str2).zza(firebaseApp));
    }

    public final Task<SignInMethodQueryResult> zzc(FirebaseApp firebaseApp, String str, String str2) {
        return zza((zzaam) new zzaam(str, str2).zza(firebaseApp));
    }

    public final Task<Void> zzd(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzcc zzccVar) {
        return zza((zzabw) new zzabw(str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<Void, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, String str, String str2, String str3) {
        return zza((zzaal) new zzaal(str, str2, str3).zza(firebaseApp));
    }

    public final Task<Void> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, String str, zzcc zzccVar) {
        return zza((zzaaw) new zzaaw(authCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<Void, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<AuthResult> zzc(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, String str, zzcc zzccVar) {
        return zza((zzaaz) new zzaaz(authCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, String str, String str2, String str3, String str4, zzl zzlVar) {
        return zza((zzaak) new zzaak(str, str2, str3, str4).zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar));
    }

    public final Task<String> zzd(FirebaseApp firebaseApp, String str, String str2) {
        return zza((zzaca) new zzaca(str, str2).zza(firebaseApp));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, String str, zzcc zzccVar) {
        return zza((zzabb) new zzabb(emailAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zzc(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzcc zzccVar) {
        return zza((zzabx) new zzabx(str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<Void, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseUser firebaseUser, zzav zzavVar) {
        return zza((zzaan) new zzaan().zza(firebaseUser).zza((zzacw<Void, zzav>) zzavVar).zza((zzau) zzavVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, PhoneMultiFactorAssertion phoneMultiFactorAssertion, FirebaseUser firebaseUser, String str, zzl zzlVar) {
        zzads.zza();
        zzaap zzaapVar = new zzaap(phoneMultiFactorAssertion, firebaseUser.zze(), str, null);
        zzaapVar.zza(firebaseApp).zza((zzacw<Void, zzl>) zzlVar);
        return zza(zzaapVar);
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, String str3, String str4, zzcc zzccVar) {
        return zza((zzabd) new zzabd(str, str2, str3, str4).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, TotpMultiFactorAssertion totpMultiFactorAssertion, FirebaseUser firebaseUser, String str, String str2, zzl zzlVar) {
        zzaap zzaapVar = new zzaap(totpMultiFactorAssertion, firebaseUser.zze(), str, str2);
        zzaapVar.zza(firebaseApp).zza((zzacw<Void, zzl>) zzlVar);
        return zza(zzaapVar);
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, zzcc zzccVar) {
        zzads.zza();
        return zza((zzabf) new zzabf(phoneAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneMultiFactorAssertion phoneMultiFactorAssertion, String str, zzl zzlVar) {
        zzads.zza();
        zzaao zzaaoVar = new zzaao(phoneMultiFactorAssertion, str, null);
        zzaaoVar.zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar);
        if (firebaseUser != null) {
            zzaaoVar.zza(firebaseUser);
        }
        return zza(zzaaoVar);
    }

    public final Task<Void> zzb(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        actionCodeSettings.zza(6);
        return zza((zzabj) new zzabj(str, actionCodeSettings, str2, str3, "sendSignInLinkToEmail").zza(firebaseApp));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, TotpMultiFactorAssertion totpMultiFactorAssertion, String str, String str2, zzl zzlVar) {
        zzaao zzaaoVar = new zzaao(totpMultiFactorAssertion, str, str2);
        zzaaoVar.zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar);
        if (firebaseUser != null) {
            zzaaoVar.zza(firebaseUser);
        }
        return zza(zzaaoVar);
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, String str, String str2, String str3, String str4, zzl zzlVar) {
        return zza((zzabm) new zzabm(str, str2, str3, str4).zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar));
    }

    public final Task<GetTokenResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzcc zzccVar) {
        return zza((zzaar) new zzaar(str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<GetTokenResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzcc zzccVar) {
        b.s(firebaseApp);
        b.o(str);
        b.s(firebaseUser);
        b.s(zzccVar);
        List<String> zzf = firebaseUser.zzf();
        if ((zzf != null && !zzf.contains(str)) || firebaseUser.isAnonymous()) {
            return Tasks.forException(zzach.zza(new Status(FirebaseError.ERROR_NO_SUCH_PROVIDER, str)));
        }
        str.getClass();
        if (!str.equals("password")) {
            return zza((zzabu) new zzabu(str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
        }
        return zza((zzabv) new zzabv().zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<zzafi> zza() {
        return zza(new zzaaq());
    }

    public final Task<zzafj> zza(String str, String str2) {
        return zza(new zzaat(str, str2));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, String str, zzcc zzccVar) {
        b.s(firebaseApp);
        b.s(authCredential);
        b.s(firebaseUser);
        b.s(zzccVar);
        List<String> zzf = firebaseUser.zzf();
        if (zzf != null && zzf.contains(authCredential.getProvider())) {
            return Tasks.forException(zzach.zza(new Status(FirebaseError.ERROR_PROVIDER_ALREADY_LINKED, null)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!emailAuthCredential.zzf()) {
                return zza((zzaas) new zzaas(emailAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
            }
            return zza((zzaax) new zzaax(emailAuthCredential).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
        }
        if (authCredential instanceof PhoneAuthCredential) {
            zzads.zza();
            return zza((zzaau) new zzaau((PhoneAuthCredential) authCredential).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
        }
        return zza((zzaav) new zzaav(authCredential).zza(firebaseApp).zza(firebaseUser).zza((zzacw<AuthResult, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, String str, zzcc zzccVar) {
        return zza((zzaay) new zzaay(emailAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<Void, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, String str3, String str4, zzcc zzccVar) {
        return zza((zzaba) new zzaba(str, str2, str3, str4).zza(firebaseApp).zza(firebaseUser).zza((zzacw<Void, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, zzcc zzccVar) {
        zzads.zza();
        return zza((zzabc) new zzabc(phoneAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzacw<Void, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, zzcc zzccVar) {
        return zza((zzabe) new zzabe().zza(firebaseApp).zza(firebaseUser).zza((zzacw<Void, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzabh(str, str2, str3, str4));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, ActionCodeSettings actionCodeSettings, String str) {
        return zza((zzabg) new zzabg(str, actionCodeSettings).zza(firebaseApp));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        actionCodeSettings.zza(1);
        return zza((zzabj) new zzabj(str, actionCodeSettings, str2, str3, "sendPasswordResetEmail").zza(firebaseApp));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzabi(str));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, zzl zzlVar, String str) {
        return zza((zzabl) new zzabl(str).zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, AuthCredential authCredential, String str, zzl zzlVar) {
        return zza((zzabk) new zzabk(authCredential, str).zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, String str, String str2, zzl zzlVar) {
        return zza((zzabn) new zzabn(str, str2).zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, EmailAuthCredential emailAuthCredential, String str, zzl zzlVar) {
        return zza((zzabp) new zzabp(emailAuthCredential, str).zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, PhoneAuthCredential phoneAuthCredential, String str, zzl zzlVar) {
        zzads.zza();
        return zza((zzabo) new zzabo(phoneAuthCredential, str).zza(firebaseApp).zza((zzacw<AuthResult, zzl>) zzlVar));
    }

    public final Task<Void> zza(zzam zzamVar, String str, String str2, long j4, boolean z9, boolean z10, String str3, String str4, boolean z11, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, Activity activity) {
        zzabr zzabrVar = new zzabr(zzamVar, str, str2, j4, z9, z10, str3, str4, z11);
        zzabrVar.zza(onVerificationStateChangedCallbacks, activity, executor, str);
        return zza(zzabrVar);
    }

    public final Task<zzagi> zza(zzam zzamVar, String str) {
        return zza(new zzabq(zzamVar, str));
    }

    public final Task<Void> zza(zzam zzamVar, PhoneMultiFactorInfo phoneMultiFactorInfo, String str, long j4, boolean z9, boolean z10, String str2, String str3, boolean z11, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, Activity activity) {
        String zzc = zzamVar.zzc();
        b.o(zzc);
        zzabt zzabtVar = new zzabt(phoneMultiFactorInfo, zzc, str, j4, z9, z10, str2, str3, z11);
        zzabtVar.zza(onVerificationStateChangedCallbacks, activity, executor, phoneMultiFactorInfo.getUid());
        return zza(zzabtVar);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, zzcc zzccVar) {
        return zza((zzabs) new zzabs(firebaseUser.zze(), str, str2).zza(firebaseApp).zza(firebaseUser).zza((zzacw<Void, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, zzcc zzccVar) {
        zzads.zza();
        return zza((zzabz) new zzabz(phoneAuthCredential).zza(firebaseApp).zza(firebaseUser).zza((zzacw<Void, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, zzcc zzccVar) {
        return zza((zzaby) new zzaby(userProfileChangeRequest).zza(firebaseApp).zza(firebaseUser).zza((zzacw<Void, zzl>) zzccVar).zza((zzau) zzccVar));
    }

    public final Task<Void> zza(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.zza(7);
        return zza(new zzacb(str, str2, actionCodeSettings));
    }

    public static zzaf zza(FirebaseApp firebaseApp, zzafb zzafbVar) {
        b.s(firebaseApp);
        b.s(zzafbVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzab(zzafbVar, FirebaseAuthProvider.PROVIDER_ID));
        List<zzafr> zzl = zzafbVar.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i10 = 0; i10 < zzl.size(); i10++) {
                arrayList.add(new zzab(zzl.get(i10)));
            }
        }
        zzaf zzafVar = new zzaf(firebaseApp, arrayList);
        zzafVar.zza(new zzah(zzafbVar.zzb(), zzafbVar.zza()));
        zzafVar.zza(zzafbVar.zzn());
        zzafVar.zza(zzafbVar.zze());
        zzafVar.zzb(zzbk.zza(zzafbVar.zzk()));
        zzafVar.zzc(zzafbVar.zzd());
        return zzafVar;
    }

    public final void zza(FirebaseApp firebaseApp, zzafz zzafzVar, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        zza((zzacd) new zzacd(zzafzVar).zza(firebaseApp).zza(onVerificationStateChangedCallbacks, activity, executor, zzafzVar.zzd()));
    }
}

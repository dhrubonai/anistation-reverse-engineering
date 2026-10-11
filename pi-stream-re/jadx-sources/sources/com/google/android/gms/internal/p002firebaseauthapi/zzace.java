package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.TotpMultiFactorAssertion;
import com.google.firebase.auth.TotpSecret;
import com.google.firebase.auth.UserProfileChangeRequest;
import e5.a;
import java.util.concurrent.ScheduledExecutorService;
import w7.b;

/* loaded from: classes.dex */
public final class zzace {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzyl zzb;
    private final zzadt zzc;

    public zzace(FirebaseApp firebaseApp, ScheduledExecutorService scheduledExecutorService) {
        b.s(firebaseApp);
        Context applicationContext = firebaseApp.getApplicationContext();
        b.s(applicationContext);
        this.zzb = new zzyl(new zzacs(firebaseApp, zzact.zza()));
        this.zzc = new zzadt(applicationContext, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzacc zzaccVar) {
        b.o(str);
        b.s(zzaccVar);
        this.zzb.zza(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzb(String str, String str2, zzacc zzaccVar) {
        b.o(str);
        b.o(str2);
        b.s(zzaccVar);
        this.zzb.zzb(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzc(String str, String str2, zzacc zzaccVar) {
        b.o(str);
        b.o(str2);
        b.s(zzaccVar);
        this.zzb.zzc(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzd(String str, String str2, zzacc zzaccVar) {
        b.o(str);
        b.s(zzaccVar);
        this.zzb.zzd(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zze(String str, String str2, zzacc zzaccVar) {
        b.o(str);
        this.zzb.zze(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzf(String str, String str2, zzacc zzaccVar) {
        b.o(str);
        b.o(str2);
        b.s(zzaccVar);
        this.zzb.zzf(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zze(String str, zzacc zzaccVar) {
        b.o(str);
        b.s(zzaccVar);
        this.zzb.zzf(str, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxx zzxxVar, zzacc zzaccVar) {
        b.s(zzxxVar);
        b.o(zzxxVar.zza());
        b.o(zzxxVar.zzb());
        b.s(zzaccVar);
        this.zzb.zza(zzxxVar.zza(), zzxxVar.zzb(), zzxxVar.zzc(), new zzacf(zzaccVar, zza));
    }

    public final void zzd(String str, zzacc zzaccVar) {
        b.s(zzaccVar);
        this.zzb.zze(str, new zzacf(zzaccVar, zza));
    }

    public final void zzb(String str, zzacc zzaccVar) {
        b.o(str);
        b.s(zzaccVar);
        this.zzb.zzb(str, new zzacf(zzaccVar, zza));
    }

    public final void zzc(String str, zzacc zzaccVar) {
        b.o(str);
        b.s(zzaccVar);
        this.zzb.zzc(str, new zzacf(zzaccVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacc zzaccVar) {
        b.o(str);
        b.o(str2);
        b.s(zzaccVar);
        this.zzb.zzb(str, str2, str3, str4, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacc zzaccVar) {
        b.o(str);
        b.o(str2);
        b.s(zzaccVar);
        this.zzb.zza(str, str2, str3, str4, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, zzacc zzaccVar) {
        b.o(str);
        b.s(zzaccVar);
        this.zzb.zza(str, new zzacf(zzaccVar, zza));
    }

    public final void zza(MultiFactorAssertion multiFactorAssertion, String str, String str2, String str3, zzacc zzaccVar) {
        zzaeq zza2;
        b.s(multiFactorAssertion);
        b.n("cachedTokenState should not be empty.", str);
        b.s(zzaccVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            PhoneAuthCredential zza3 = ((PhoneMultiFactorAssertion) multiFactorAssertion).zza();
            String zzc = zza3.zzc();
            b.s(zzc);
            String smsCode = zza3.getSmsCode();
            b.s(smsCode);
            zza2 = zzaeu.zza(str, zzc, smsCode, str2, str3);
        } else if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            TotpMultiFactorAssertion totpMultiFactorAssertion = (TotpMultiFactorAssertion) multiFactorAssertion;
            TotpSecret zza4 = totpMultiFactorAssertion.zza();
            b.s(zza4);
            b.o(str2);
            String sessionInfo = zza4.getSessionInfo();
            b.o(sessionInfo);
            String zzc2 = totpMultiFactorAssertion.zzc();
            b.o(zzc2);
            zza2 = zzaew.zza(str, str2, sessionInfo, zzc2, str3);
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        this.zzb.zza(zza2, str, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, MultiFactorAssertion multiFactorAssertion, String str2, zzacc zzaccVar) {
        b.o(str);
        b.s(multiFactorAssertion);
        b.s(zzaccVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            PhoneAuthCredential zza2 = ((PhoneMultiFactorAssertion) multiFactorAssertion).zza();
            zzyl zzylVar = this.zzb;
            String zzc = zza2.zzc();
            b.s(zzc);
            String smsCode = zza2.getSmsCode();
            b.s(smsCode);
            zzylVar.zza(zzaet.zza(str, zzc, smsCode, str2), new zzacf(zzaccVar, zza));
            return;
        }
        if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            TotpMultiFactorAssertion totpMultiFactorAssertion = (TotpMultiFactorAssertion) multiFactorAssertion;
            zzyl zzylVar2 = this.zzb;
            String zzc2 = totpMultiFactorAssertion.zzc();
            b.o(zzc2);
            String zzb = totpMultiFactorAssertion.zzb();
            b.o(zzb);
            zzylVar2.zza(zzaev.zza(str, zzc2, str2, zzb), new zzacf(zzaccVar, zza));
            return;
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zza(zzxw zzxwVar, zzacc zzaccVar) {
        b.s(zzxwVar);
        this.zzb.zza(zzaff.zzb(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxz zzxzVar, zzacc zzaccVar) {
        b.s(zzxzVar);
        this.zzb.zza(zzafk.zza(zzxzVar.zzb(), zzxzVar.zza()), new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacc zzaccVar) {
        b.o(str);
        b.o(str2);
        b.o(str3);
        b.s(zzaccVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, zzags zzagsVar, zzacc zzaccVar) {
        b.o(str);
        b.s(zzagsVar);
        b.s(zzaccVar);
        this.zzb.zza(str, zzagsVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxy zzxyVar, zzacc zzaccVar) {
        b.s(zzaccVar);
        b.s(zzxyVar);
        PhoneAuthCredential zza2 = zzxyVar.zza();
        b.s(zza2);
        String zzb = zzxyVar.zzb();
        b.o(zzb);
        this.zzb.zza(zzb, zzadn.zza(zza2), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzafy zzafyVar, zzacc zzaccVar) {
        b.s(zzafyVar);
        this.zzb.zza(zzafyVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyb zzybVar, zzacc zzaccVar) {
        b.s(zzybVar);
        b.o(zzybVar.zzb());
        b.s(zzaccVar);
        this.zzb.zza(zzybVar.zzb(), zzybVar.zza(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzya zzyaVar, zzacc zzaccVar) {
        b.s(zzyaVar);
        b.o(zzyaVar.zzc());
        b.s(zzaccVar);
        this.zzb.zza(zzyaVar.zzc(), zzyaVar.zza(), zzyaVar.zzd(), zzyaVar.zzb(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyd zzydVar, zzacc zzaccVar) {
        b.s(zzaccVar);
        b.s(zzydVar);
        zzafz zza2 = zzydVar.zza();
        b.s(zza2);
        String zzd = zza2.zzd();
        zzacf zzacfVar = new zzacf(zzaccVar, zza);
        if (this.zzc.zzd(zzd)) {
            if (zza2.zze()) {
                this.zzc.zzc(zzd);
            } else {
                this.zzc.zzb(zzacfVar, zzd);
                return;
            }
        }
        long zzb = zza2.zzb();
        boolean zzf = zza2.zzf();
        if (zza(zzb, zzf)) {
            zza2.zza(new zzaed(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzacfVar, zzb, zzf);
        this.zzb.zza(zza2, this.zzc.zza(zzacfVar, zzd));
    }

    public final void zza(zzyc zzycVar, zzacc zzaccVar) {
        b.s(zzycVar);
        b.s(zzaccVar);
        this.zzb.zzd(zzycVar.zza(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzags zzagsVar, zzacc zzaccVar) {
        b.s(zzagsVar);
        b.s(zzaccVar);
        this.zzb.zza(zzagsVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzagt zzagtVar, zzacc zzaccVar) {
        b.s(zzagtVar);
        b.s(zzaccVar);
        this.zzb.zza(zzagtVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyf zzyfVar, zzacc zzaccVar) {
        b.s(zzyfVar);
        b.s(zzyfVar.zza());
        b.s(zzaccVar);
        this.zzb.zza(zzyfVar.zza(), zzyfVar.zzb(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzye zzyeVar, zzacc zzaccVar) {
        b.s(zzaccVar);
        b.s(zzyeVar);
        PhoneAuthCredential zza2 = zzyeVar.zza();
        b.s(zza2);
        this.zzb.zza(zzadn.zza(zza2), new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j4, boolean z9, boolean z10, String str4, String str5, boolean z11, zzacc zzaccVar) {
        b.n("idToken should not be empty.", str);
        b.s(zzaccVar);
        zzacf zzacfVar = new zzacf(zzaccVar, zza);
        if (this.zzc.zzd(str2)) {
            if (z9) {
                this.zzc.zzc(str2);
            } else {
                this.zzc.zzb(zzacfVar, str2);
                return;
            }
        }
        zzagj zza2 = zzagj.zza(str, str2, str3, str4, str5, null);
        if (zza(j4, z11)) {
            zza2.zza(new zzaed(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzacfVar, j4, z11);
        this.zzb.zza(zza2, this.zzc.zza(zzacfVar, str2));
    }

    public final void zza(zzyh zzyhVar, zzacc zzaccVar) {
        b.s(zzyhVar);
        b.s(zzaccVar);
        String phoneNumber = zzyhVar.zzb().getPhoneNumber();
        zzacf zzacfVar = new zzacf(zzaccVar, zza);
        if (this.zzc.zzd(phoneNumber)) {
            if (zzyhVar.zzg()) {
                this.zzc.zzc(phoneNumber);
            } else {
                this.zzc.zzb(zzacfVar, phoneNumber);
                return;
            }
        }
        long zza2 = zzyhVar.zza();
        boolean zzh = zzyhVar.zzh();
        zzagh zza3 = zzagh.zza(zzyhVar.zzd(), zzyhVar.zzb().getUid(), zzyhVar.zzb().getPhoneNumber(), zzyhVar.zzc(), zzyhVar.zzf(), zzyhVar.zze());
        if (zza(zza2, zzh)) {
            zza3.zza(new zzaed(this.zzc.zzb()));
        }
        this.zzc.zza(phoneNumber, zzacfVar, zza2, zzh);
        this.zzb.zza(zza3, this.zzc.zza(zzacfVar, phoneNumber));
    }

    public final void zza(zzagl zzaglVar, zzacc zzaccVar) {
        b.s(zzaccVar);
        this.zzb.zza(zzaglVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, String str3, zzacc zzaccVar) {
        b.n("cachedTokenState should not be empty.", str);
        b.n("uid should not be empty.", str2);
        b.s(zzaccVar);
        this.zzb.zzb(str, str2, str3, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzacc zzaccVar) {
        b.o(str);
        b.s(userProfileChangeRequest);
        b.s(zzaccVar);
        this.zzb.zza(str, userProfileChangeRequest, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyg zzygVar, zzacc zzaccVar) {
        b.s(zzygVar);
        this.zzb.zza(zzafd.zza(zzygVar.zza(), zzygVar.zzb(), zzygVar.zzc()), new zzacf(zzaccVar, zza));
    }

    private static boolean zza(long j4, boolean z9) {
        if (j4 > 0 && z9) {
            return true;
        }
        zza.f("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}

package com.google.firebase.auth;

import android.app.Activity;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import w7.b;

/* loaded from: classes.dex */
public final class PhoneAuthOptions {
    private final FirebaseAuth zza;
    private Long zzb;
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks zzc;
    private Executor zzd;
    private String zze;
    private Activity zzf;
    private PhoneAuthProvider.ForceResendingToken zzg;
    private MultiFactorSession zzh;
    private PhoneMultiFactorInfo zzi;
    private boolean zzj;
    private boolean zzk;

    /* loaded from: classes.dex */
    public static final class Builder {
        private final FirebaseAuth zza;
        private String zzb;
        private Long zzc;
        private PhoneAuthProvider.OnVerificationStateChangedCallbacks zzd;
        private Executor zze;
        private Activity zzf;
        private PhoneAuthProvider.ForceResendingToken zzg;
        private MultiFactorSession zzh;
        private PhoneMultiFactorInfo zzi;
        private boolean zzj;

        public Builder(FirebaseAuth firebaseAuth) {
            b.s(firebaseAuth);
            this.zza = firebaseAuth;
        }

        public final PhoneAuthOptions build() {
            boolean z9;
            boolean z10;
            boolean z11;
            b.r(this.zza, "FirebaseAuth instance cannot be null");
            b.r(this.zzc, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            b.r(this.zzd, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.zze = this.zza.zzg();
            if (this.zzc.longValue() >= 0 && this.zzc.longValue() <= 120) {
                MultiFactorSession multiFactorSession = this.zzh;
                boolean z12 = false;
                if (multiFactorSession == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    b.n("The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()", this.zzb);
                    b.i("You cannot require sms validation without setting a multi-factor session.", !this.zzj);
                    if (this.zzi == null) {
                        z12 = true;
                    }
                    b.i("A phoneMultiFactorInfo must be set for second factor sign-in.", z12);
                } else {
                    if (multiFactorSession != null && ((com.google.firebase.auth.internal.zzam) multiFactorSession).zzd()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        b.o(this.zzb);
                        if (this.zzi == null) {
                            z12 = true;
                        }
                        b.i("Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.", z12);
                    } else {
                        if (this.zzi != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        b.i("A phoneMultiFactorInfo must be set for second factor sign-in.", z11);
                        if (this.zzb == null) {
                            z12 = true;
                        }
                        b.i("A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.", z12);
                    }
                }
                return new PhoneAuthOptions(this.zza, this.zzc, this.zzd, this.zze, this.zzb, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj);
            }
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }

        public final Builder requireSmsValidation(boolean z9) {
            this.zzj = z9;
            return this;
        }

        public final Builder setActivity(Activity activity) {
            this.zzf = activity;
            return this;
        }

        public final Builder setCallbacks(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
            this.zzd = onVerificationStateChangedCallbacks;
            return this;
        }

        public final Builder setForceResendingToken(PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            this.zzg = forceResendingToken;
            return this;
        }

        public final Builder setMultiFactorHint(PhoneMultiFactorInfo phoneMultiFactorInfo) {
            this.zzi = phoneMultiFactorInfo;
            return this;
        }

        public final Builder setMultiFactorSession(MultiFactorSession multiFactorSession) {
            this.zzh = multiFactorSession;
            return this;
        }

        public final Builder setPhoneNumber(String str) {
            this.zzb = str;
            return this;
        }

        public final Builder setTimeout(Long l10, TimeUnit timeUnit) {
            this.zzc = Long.valueOf(TimeUnit.SECONDS.convert(l10.longValue(), timeUnit));
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder(FirebaseAuth.getInstance());
    }

    public final Activity zza() {
        return this.zzf;
    }

    public final FirebaseAuth zzb() {
        return this.zza;
    }

    public final MultiFactorSession zzc() {
        return this.zzh;
    }

    public final PhoneAuthProvider.ForceResendingToken zzd() {
        return this.zzg;
    }

    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks zze() {
        return this.zzc;
    }

    public final PhoneMultiFactorInfo zzf() {
        return this.zzi;
    }

    public final Long zzg() {
        return this.zzb;
    }

    public final String zzh() {
        return this.zze;
    }

    public final Executor zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzk;
    }

    public final boolean zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        if (this.zzh != null) {
            return true;
        }
        return false;
    }

    private PhoneAuthOptions(FirebaseAuth firebaseAuth, Long l10, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, String str, Activity activity, PhoneAuthProvider.ForceResendingToken forceResendingToken, MultiFactorSession multiFactorSession, PhoneMultiFactorInfo phoneMultiFactorInfo, boolean z9) {
        this.zza = firebaseAuth;
        this.zze = str;
        this.zzb = l10;
        this.zzc = onVerificationStateChangedCallbacks;
        this.zzf = activity;
        this.zzd = executor;
        this.zzg = forceResendingToken;
        this.zzh = multiFactorSession;
        this.zzi = phoneMultiFactorInfo;
        this.zzj = z9;
    }

    public static Builder newBuilder(FirebaseAuth firebaseAuth) {
        return new Builder(firebaseAuth);
    }

    public final void zza(boolean z9) {
        this.zzk = true;
    }
}

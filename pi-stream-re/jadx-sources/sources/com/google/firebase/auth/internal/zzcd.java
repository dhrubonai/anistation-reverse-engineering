package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.TotpSecret;
import w7.b;

/* loaded from: classes.dex */
public final class zzcd implements TotpSecret {
    private final String zza;
    private final String zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private String zzf;
    private FirebaseAuth zzg;

    public zzcd(String str, String str2, int i10, int i11, long j4, String str3, FirebaseAuth firebaseAuth) {
        b.n("sessionInfo cannot be empty.", str3);
        if (firebaseAuth != null) {
            b.n("sharedSecretKey cannot be empty. This is required to generate QR code URL.", str);
            this.zza = str;
            b.n("hashAlgorithm cannot be empty.", str2);
            this.zzb = str2;
            this.zzc = i10;
            this.zzd = i11;
            this.zze = j4;
            this.zzf = str3;
            this.zzg = firebaseAuth;
            return;
        }
        throw new NullPointerException("firebaseAuth cannot be null.");
    }

    private final void zza(String str) {
        this.zzg.getApp().getApplicationContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String generateQrCodeUrl() {
        FirebaseUser currentUser = this.zzg.getCurrentUser();
        b.r(currentUser, "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.");
        String email = currentUser.getEmail();
        b.n("Email cannot be empty, since verified email is required to use MFA.", email);
        return generateQrCodeUrl(email, this.zzg.getApp().getName());
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final int getCodeIntervalSeconds() {
        return this.zzd;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final int getCodeLength() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final long getEnrollmentCompletionDeadline() {
        return this.zze;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String getHashAlgorithm() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String getSessionInfo() {
        return this.zzf;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String getSharedSecretKey() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final void openInOtpApp(String str) {
        b.n("qrCodeUrl cannot be empty.", str);
        try {
            zza(str);
        } catch (ActivityNotFoundException unused) {
            zza("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final void openInOtpApp(String str, String str2, Activity activity) {
        b.n("QrCodeUrl cannot be empty.", str);
        b.n("FallbackUrl cannot be empty.", str2);
        if (activity != null) {
            try {
                zza(str, activity);
                return;
            } catch (ActivityNotFoundException unused) {
                zza(str2, activity);
                return;
            }
        }
        throw new NullPointerException("Activity cannot be null.");
    }

    private static void zza(String str, Activity activity) {
        if (activity != null) {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
            return;
        }
        throw new NullPointerException("Activity cannot be null.");
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String generateQrCodeUrl(String str, String str2) {
        b.n("accountName cannot be empty.", str);
        b.n("issuer cannot be empty.", str2);
        return String.format(null, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d", str2, str, this.zza, str2, this.zzb, Integer.valueOf(this.zzc));
    }
}

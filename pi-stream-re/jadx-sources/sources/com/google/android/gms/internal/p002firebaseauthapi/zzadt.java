package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.internal.p001authapiphone.zzab;
import com.google.firebase.auth.PhoneAuthCredential;
import e5.a;
import j5.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadt {
    private static final a zza = new a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzaea> zzd = new HashMap<>();

    public zzadt(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar != null && !zzaeaVar.zzh && !zzah.zzc(zzaeaVar.zzd)) {
            zza.f("Timed out waiting for SMS.", new Object[0]);
            Iterator<zzacf> it = zzaeaVar.zzb.iterator();
            while (it.hasNext()) {
                it.next().zza(zzaeaVar.zzd);
            }
            zzaeaVar.zzi = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zzb(String str) {
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar == null) {
            return;
        }
        if (!zzaeaVar.zzi) {
            zze(str);
        }
        zzc(str);
    }

    public final boolean zzd(String str) {
        if (this.zzd.get(str) != null) {
            return true;
        }
        return false;
    }

    public final String zzb() {
        SigningInfo signingInfo;
        Signature[] apkContentsSigners;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT >= 28) {
                signingInfo = b.a(this.zzb).c(134217728, packageName).signingInfo;
                apkContentsSigners = signingInfo.getApkContentsSigners();
            } else {
                apkContentsSigners = b.a(this.zzb).c(64, packageName).signatures;
            }
            String zza2 = zza(packageName, apkContentsSigners[0].toCharsString());
            if (zza2 != null) {
                return zza2;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    public final void zzc(String str) {
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar == null) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = zzaeaVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzaeaVar.zzf.cancel(false);
        }
        zzaeaVar.zzb.clear();
        this.zzd.remove(str);
    }

    public final zzacf zza(zzacf zzacfVar, String str) {
        return new zzady(this, zzacfVar, str);
    }

    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes(zzq.zza));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e10) {
            zza.c(f.d("NoSuchAlgorithm: ", e10.getMessage()), new Object[0]);
            return null;
        }
    }

    public final void zzb(zzacf zzacfVar, String str) {
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar == null) {
            return;
        }
        zzaeaVar.zzb.add(zzacfVar);
        if (zzaeaVar.zzg) {
            zzacfVar.zzb(zzaeaVar.zzd);
        }
        if (zzaeaVar.zzh) {
            zzacfVar.zza(PhoneAuthCredential.zza(zzaeaVar.zzd, zzaeaVar.zze));
        }
        if (zzaeaVar.zzi) {
            zzacfVar.zza(zzaeaVar.zzd);
        }
    }

    public static /* synthetic */ void zza(zzadt zzadtVar, String str) {
        zzaea zzaeaVar = zzadtVar.zzd.get(str);
        if (zzaeaVar == null || zzah.zzc(zzaeaVar.zzd) || zzah.zzc(zzaeaVar.zze) || zzaeaVar.zzb.isEmpty()) {
            return;
        }
        Iterator<zzacf> it = zzaeaVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(PhoneAuthCredential.zza(zzaeaVar.zzd, zzaeaVar.zze));
        }
        zzaeaVar.zzh = true;
    }

    public final void zza(final String str, zzacf zzacfVar, long j4, boolean z9) {
        this.zzd.put(str, new zzaea(j4, z9));
        zzb(zzacfVar, str);
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar.zza <= 0) {
            zza.f("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaeaVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzadw
            @Override // java.lang.Runnable
            public final void run() {
                zzadt.this.zzb(str);
            }
        }, zzaeaVar.zza, TimeUnit.SECONDS);
        if (!zzaeaVar.zzc) {
            zza.f("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzadx zzadxVar = new zzadx(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        zzc.zza(this.zzb.getApplicationContext(), zzadxVar, intentFilter);
        new zzab(this.zzb).startSmsRetriever().addOnFailureListener(new zzadv(this));
    }
}

package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import o7.f;
import r6.h0;
import w6.b;

/* loaded from: classes.dex */
public final class zzp extends Exception {
    public static final zzo zza = new zzo(null);
    private static final Map zzb;
    private final zzn zzc;
    private final zzl zzd;
    private final String zze;
    private final Map zzf;

    static {
        zzpb zzpbVar = zzpb.JS_INTERNAL_ERROR;
        zzn zznVar = zzn.zzc;
        zzb = f.g1(new b(zzpb.JS_NETWORK_ERROR, new zzp(zzn.zze, zzl.zzm, null)), new b(zzpbVar, new zzp(zznVar, zzl.zzk, null)), new b(zzpb.JS_INVALID_SITE_KEY, new zzp(zzn.zzf, zzl.zzn, null)), new b(zzpb.JS_INVALID_SITE_KEY_TYPE, new zzp(zzn.zzg, zzl.zzo, null)), new b(zzpb.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzp(zzn.zzh, zzl.zzp, null)), new b(zzpb.JS_INVALID_ACTION, new zzp(zzn.zzi, zzl.zzq, null)), new b(zzpb.JS_PROGRAM_ERROR, new zzp(zznVar, zzl.zzu, null)));
    }

    public zzp(zzn zznVar, zzl zzlVar, String str) {
        this.zzc = zznVar;
        this.zzd = zzlVar;
        this.zze = str;
        zzn zznVar2 = zzn.zze;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzf = f.g1(new b(zznVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new b(zzn.zzk, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new b(zzn.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), new b(zzn.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), new b(zzn.zzh, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), new b(zzn.zzi, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), new b(zzn.zzc, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)));
    }

    public final zzl zza() {
        return this.zzd;
    }

    public final zzn zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        if (h0.g(this.zzd, zzl.zzT)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        if (recaptchaException == null) {
            return new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null);
        }
        return recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }
}

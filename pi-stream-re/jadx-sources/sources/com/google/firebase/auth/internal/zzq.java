package com.google.firebase.auth.internal;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzkj;
import com.google.android.gms.internal.p002firebaseauthapi.zzkq;
import com.google.android.gms.internal.p002firebaseauthapi.zzlx;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzq {
    private static zzq zza;
    private final String zzb;
    private final zzlx zzc;

    private zzq(Context context, String str, boolean z9) {
        zzlx zzlxVar;
        this.zzb = str;
        try {
            zzkj.zza();
            zzlx.zza zza2 = new zzlx.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzkq.zza);
            zza2.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzlxVar = zza2.zza();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e10.getMessage());
            zzlxVar = null;
        }
        this.zzc = zzlxVar;
    }

    public static zzq zza(Context context, String str) {
        zzq zzqVar = zza;
        if (zzqVar == null || !com.google.android.gms.internal.p002firebaseauthapi.zzw.zza(zzqVar.zzb, str)) {
            zza = new zzq(context, str, true);
        }
        return zza;
    }

    public final String zza(String str) {
        String str2;
        zzlx zzlxVar = this.zzc;
        if (zzlxVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzlxVar) {
                str2 = new String(((com.google.android.gms.internal.p002firebaseauthapi.zzbp) this.zzc.zza().zza(com.google.android.gms.internal.p002firebaseauthapi.zzbp.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e10.getMessage());
            return null;
        }
    }

    public final String zza() {
        if (this.zzc == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.google.android.gms.internal.p002firebaseauthapi.zzce zza2 = com.google.android.gms.internal.p002firebaseauthapi.zzbj.zza(byteArrayOutputStream);
        try {
            synchronized (this.zzc) {
                this.zzc.zza().zza().zza(zza2);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e10.getMessage());
            return null;
        }
    }
}

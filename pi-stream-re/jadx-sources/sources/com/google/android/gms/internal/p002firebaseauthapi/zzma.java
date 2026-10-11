package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* loaded from: classes.dex */
public final class zzma implements zzcd {
    private static final Object zza = new Object();
    private static final String zzb = "zzma";
    private final String zzc;
    private KeyStore zzd;

    /* loaded from: classes.dex */
    public static final class zza {
        KeyStore zza;
        private String zzb = null;

        public zza() {
            this.zza = null;
            if (zzma.zza()) {
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.zza = keyStore;
                    keyStore.load(null);
                    return;
                } catch (IOException | GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            }
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }
    }

    public zzma() {
        this(new zza());
    }

    public static /* synthetic */ boolean zza() {
        return true;
    }

    public static boolean zzc(String str) {
        zzma zzmaVar = new zzma();
        synchronized (zza) {
            if (zzmaVar.zzd(str)) {
                return false;
            }
            String zza2 = zzxq.zza("android-keystore://", str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
            return true;
        }
    }

    private final synchronized boolean zzd(String str) {
        String zza2;
        zza2 = zzxq.zza("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(zzb, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.zzd = keyStore;
                keyStore.load(null);
                return this.zzd.containsAlias(zza2);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        }
        return this.zzd.containsAlias(zza2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final synchronized boolean zzb(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return true;
        }
        return false;
    }

    private zzma(zza zzaVar) {
        this.zzc = null;
        this.zzd = zzaVar.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final synchronized zzbh zza(String str) {
        zzly zzlyVar;
        zzlyVar = new zzly(zzxq.zza("android-keystore://", str), this.zzd);
        byte[] zza2 = zzov.zza(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(zza2, zzlyVar.zza(zzlyVar.zzb(zza2, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return zzlyVar;
    }
}

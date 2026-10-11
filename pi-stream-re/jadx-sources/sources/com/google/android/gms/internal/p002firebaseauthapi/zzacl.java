package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final /* synthetic */ class zzacl {
    public static String zza(zzaci zzaciVar, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance("SHA-256").digest(str.getBytes()));
            int length = str2.length();
            int i10 = 0;
            while (i10 < length) {
                if (zzk.zza(str2.charAt(i10))) {
                    char[] charArray = str2.toCharArray();
                    while (i10 < length) {
                        char c6 = charArray[i10];
                        if (zzk.zza(c6)) {
                            charArray[i10] = (char) (c6 ^ ' ');
                        }
                        i10++;
                    }
                    return String.valueOf(charArray);
                }
                i10++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            zzaci.zza.c("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }

    public static void zzb(zzaci zzaciVar, String str) {
        zzaciVar.zza(str, null);
    }
}

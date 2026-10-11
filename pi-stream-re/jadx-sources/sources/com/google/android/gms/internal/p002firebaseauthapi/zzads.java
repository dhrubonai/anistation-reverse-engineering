package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;
import n.e;

/* loaded from: classes.dex */
public final class zzads {
    private static final Map<String, zzadu> zza = new e();

    public static PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, zzacw zzacwVar) {
        zza(str, zzacwVar);
        return new zzadr(onVerificationStateChangedCallbacks, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzacw zzacwVar) {
        zza.put(str, new zzadu(zzacwVar, System.currentTimeMillis()));
    }

    public static boolean zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        Map<String, zzadu> map = zza;
        if (map.containsKey(str)) {
            zzadu zzaduVar = map.get(str);
            if (System.currentTimeMillis() - zzaduVar.zzb < 120000) {
                zzacw zzacwVar = zzaduVar.zza;
                if (zzacwVar == null) {
                    return true;
                }
                zzacwVar.zza(onVerificationStateChangedCallbacks, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}

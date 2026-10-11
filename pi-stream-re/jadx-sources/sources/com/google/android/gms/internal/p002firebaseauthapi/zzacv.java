package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import w7.b;

/* loaded from: classes.dex */
public final class zzacv {
    private Context zza;
    private zzado zzb;
    private String zzc;
    private final FirebaseApp zzd;
    private boolean zze;
    private String zzf;

    public zzacv(FirebaseApp firebaseApp, String str) {
        this(firebaseApp.getApplicationContext(), firebaseApp, str);
    }

    private static String zza(FirebaseApp firebaseApp) {
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = FirebaseAuth.getInstance(firebaseApp).zzc().get();
        if (interopAppCheckTokenProvider == null) {
            return null;
        }
        try {
            AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) Tasks.await(interopAppCheckTokenProvider.getToken(false));
            if (appCheckTokenResult.getError() != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(appCheckTokenResult.getError())));
            }
            return appCheckTokenResult.getToken();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e10.getMessage());
            return null;
        }
    }

    private static String zzb(FirebaseApp firebaseApp) {
        HeartBeatController heartBeatController = FirebaseAuth.getInstance(firebaseApp).zzd().get();
        if (heartBeatController != null) {
            try {
                return (String) Tasks.await(heartBeatController.getHeartBeatsHeader());
            } catch (InterruptedException | ExecutionException e10) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e10.getMessage());
            }
        }
        return null;
    }

    public zzacv(Context context, FirebaseApp firebaseApp, String str) {
        this.zze = false;
        b.s(context);
        this.zza = context;
        b.s(firebaseApp);
        this.zzd = firebaseApp;
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(URLConnection uRLConnection) {
        String s9;
        if (this.zze) {
            s9 = g.s(this.zzc, "/FirebaseUI-Android");
        } else {
            s9 = g.s(this.zzc, "/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            this.zzb = new zzado(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzacu.zza());
        uRLConnection.setRequestProperty("X-Client-Version", s9);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.getOptions().getApplicationId());
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza = zza(this.zzd);
        if (!TextUtils.isEmpty(zza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza);
        }
        this.zzf = null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}

package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import w7.b;

/* loaded from: classes.dex */
public final class zzbl {
    private static long zza = 3600000;
    private static final com.google.android.gms.internal.p002firebaseauthapi.zzaq<String> zzb = com.google.android.gms.internal.p002firebaseauthapi.zzaq.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");
    private static final zzbl zzc = new zzbl();
    private Task<AuthResult> zzd;
    private Task<String> zze;
    private long zzf = 0;

    private zzbl() {
    }

    public static zzbl zzc() {
        return zzc;
    }

    public final Task<AuthResult> zza() {
        if (System.currentTimeMillis() - this.zzf < zza) {
            return this.zzd;
        }
        return null;
    }

    public final Task<String> zzb() {
        if (System.currentTimeMillis() - this.zzf < zza) {
            return this.zze;
        }
        return null;
    }

    private static void zza(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        com.google.android.gms.internal.p002firebaseauthapi.zzaq<String> zzaqVar = zzb;
        int size = zzaqVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str = zzaqVar.get(i10);
            i10++;
            edit.remove(str);
        }
        edit.commit();
    }

    public final void zza(Context context) {
        b.s(context);
        zza(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.zzd = null;
        this.zzf = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.firebase.auth.FirebaseAuth r13) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzbl.zza(com.google.firebase.auth.FirebaseAuth):void");
    }

    public static void zza(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f2361b);
        edit.putString("statusMessage", status.f2362c);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth) {
        b.s(context);
        b.s(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        edit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        b.s(context);
        b.s(firebaseAuth);
        b.s(firebaseUser);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        edit.putString("firebaseUserUid", firebaseUser.getUid());
        edit.commit();
    }

    public static void zza(Context context, zzags zzagsVar, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        Parcel obtain = Parcel.obtain();
        zzagsVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        edit.putString("verifyAssertionRequest", marshall == null ? null : Base64.encodeToString(marshall, 10));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }

    public static void zza(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("recaptchaToken", str);
        edit.putString("operation", str2);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }
}

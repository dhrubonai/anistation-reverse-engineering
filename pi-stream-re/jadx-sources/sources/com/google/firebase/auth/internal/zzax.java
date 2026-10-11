package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import b1.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.ArrayList;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public final class zzax {
    private static zzax zza;
    private boolean zzb = false;
    private BroadcastReceiver zzc;

    private zzax() {
    }

    private static AuthCredential zza(Intent intent) {
        b.s(intent);
        return com.google.firebase.auth.zzd.zza(((zzags) a0.p(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzags.CREATOR)).zzc(true));
    }

    public static zzax zza() {
        if (zza == null) {
            zza = new zzax();
        }
        return zza;
    }

    public static /* synthetic */ void zza(zzax zzaxVar, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        zza(context);
    }

    public static void zza(Context context) {
        zzax zzaxVar = zza;
        zzaxVar.zzb = false;
        if (zzaxVar.zzc != null) {
            b1.b a10 = b1.b.a(context);
            BroadcastReceiver broadcastReceiver = zza.zzc;
            synchronized (a10.f1284b) {
                ArrayList arrayList = (ArrayList) a10.f1284b.remove(broadcastReceiver);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        a aVar = (a) arrayList.get(size);
                        aVar.f1280d = true;
                        for (int i10 = 0; i10 < aVar.f1277a.countActions(); i10++) {
                            String action = aVar.f1277a.getAction(i10);
                            ArrayList arrayList2 = (ArrayList) a10.f1285c.get(action);
                            if (arrayList2 != null) {
                                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                    a aVar2 = (a) arrayList2.get(size2);
                                    if (aVar2.f1278b == broadcastReceiver) {
                                        aVar2.f1280d = true;
                                        arrayList2.remove(size2);
                                    }
                                }
                                if (arrayList2.size() <= 0) {
                                    a10.f1285c.remove(action);
                                }
                            }
                        }
                    }
                }
            }
        }
        zza.zzc = null;
    }

    private final void zza(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.zzc = broadcastReceiver;
        b1.b a10 = b1.b.a(activity);
        IntentFilter intentFilter = new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        synchronized (a10.f1284b) {
            a aVar = new a(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) a10.f1284b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                a10.f1284b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(aVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList arrayList2 = (ArrayList) a10.f1285c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    a10.f1285c.put(action, arrayList2);
                }
                arrayList2.add(aVar);
            }
        }
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return zza(activity, taskCompletionSource, firebaseAuth, (FirebaseUser) null);
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (this.zzb) {
            return false;
        }
        zza(activity, new zzbc(this, activity, taskCompletionSource, firebaseAuth, firebaseUser));
        this.zzb = true;
        return true;
    }

    public final boolean zza(Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        if (this.zzb) {
            return false;
        }
        zza(activity, new zzbe(this, activity, taskCompletionSource));
        this.zzb = true;
        return true;
    }
}

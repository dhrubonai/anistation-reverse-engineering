package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GetTokenResult;
import e5.a;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzat implements Runnable {
    final /* synthetic */ zzaq zza;
    private final String zzb;

    public zzat(zzaq zzaqVar, String str) {
        this.zza = zzaqVar;
        b.o(str);
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(this.zzb));
        if (firebaseAuth.getCurrentUser() != null) {
            Task<GetTokenResult> accessToken = firebaseAuth.getAccessToken(true);
            aVar = zzaq.zzc;
            aVar.e("Token refreshing started", new Object[0]);
            accessToken.addOnFailureListener(new zzas(this));
        }
    }
}

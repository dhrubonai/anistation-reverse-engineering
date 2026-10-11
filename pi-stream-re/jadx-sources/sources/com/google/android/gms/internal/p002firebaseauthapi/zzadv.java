package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import e5.a;
import r.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadv implements OnFailureListener {
    public zzadv(zzadt zzadtVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        a aVar;
        aVar = zzadt.zza;
        aVar.c(f.d("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}

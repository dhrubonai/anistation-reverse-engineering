package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zzxg implements zzwz<Mac> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzwz
    public final /* synthetic */ Mac zza(String str, Provider provider) {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }
}

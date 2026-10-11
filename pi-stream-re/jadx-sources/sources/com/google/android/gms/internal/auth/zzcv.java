package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l10, boolean z9) {
        super(zzczVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + super.zzc() + ": " + ((String) obj));
            return null;
        }
    }
}

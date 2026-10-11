package com.google.android.gms.internal.p002firebaseauthapi;

import r.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzl extends zzm {
    private final char zza;

    public zzl(char c6) {
        this.zza = c6;
    }

    public final String toString() {
        char c6 = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c6 & 15);
            c6 = (char) (c6 >> 4);
        }
        return f.e("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzj
    public final boolean zza(char c6) {
        if (c6 == this.zza) {
            return true;
        }
        return false;
    }
}

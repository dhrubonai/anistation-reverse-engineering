package com.google.firebase.auth;

import com.google.android.gms.tasks.Task;
import w7.b;

/* loaded from: classes.dex */
public final class TotpMultiFactorGenerator {
    public static final String FACTOR_ID = "totp";

    private TotpMultiFactorGenerator() {
    }

    public static Task<TotpSecret> generateSecret(MultiFactorSession multiFactorSession) {
        b.s(multiFactorSession);
        com.google.firebase.auth.internal.zzam zzamVar = (com.google.firebase.auth.internal.zzam) multiFactorSession;
        return FirebaseAuth.getInstance(zzamVar.zza().zza()).zza(zzamVar);
    }

    public static TotpMultiFactorAssertion getAssertionForEnrollment(TotpSecret totpSecret, String str) {
        b.s(str);
        b.s(totpSecret);
        return new TotpMultiFactorAssertion(str, totpSecret, null);
    }

    public static TotpMultiFactorAssertion getAssertionForSignIn(String str, String str2) {
        b.s(str2);
        b.s(str);
        return new TotpMultiFactorAssertion(str2, null, str);
    }
}

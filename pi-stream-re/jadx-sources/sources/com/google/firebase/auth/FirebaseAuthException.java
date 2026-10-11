package com.google.firebase.auth;

import com.google.firebase.FirebaseException;
import w7.b;

/* loaded from: classes.dex */
public class FirebaseAuthException extends FirebaseException {
    private final String zza;

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        b.o(str);
        this.zza = str;
    }

    public String getErrorCode() {
        return this.zza;
    }
}

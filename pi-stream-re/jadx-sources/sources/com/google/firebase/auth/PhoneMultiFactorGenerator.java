package com.google.firebase.auth;

import w7.b;

/* loaded from: classes.dex */
public class PhoneMultiFactorGenerator {
    public static final String FACTOR_ID = "phone";

    public static PhoneMultiFactorAssertion getAssertion(PhoneAuthCredential phoneAuthCredential) {
        b.s(phoneAuthCredential);
        return new PhoneMultiFactorAssertion(phoneAuthCredential);
    }
}

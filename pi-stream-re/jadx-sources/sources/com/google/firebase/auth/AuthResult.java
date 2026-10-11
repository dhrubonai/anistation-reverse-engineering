package com.google.firebase.auth;

import c5.b;

/* loaded from: classes.dex */
public interface AuthResult extends b {
    AdditionalUserInfo getAdditionalUserInfo();

    AuthCredential getCredential();

    FirebaseUser getUser();
}

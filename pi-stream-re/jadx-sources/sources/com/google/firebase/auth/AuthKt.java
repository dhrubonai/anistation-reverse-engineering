package com.google.firebase.auth;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.OAuthProvider;
import com.google.firebase.auth.UserProfileChangeRequest;
import h7.l;
import r6.h0;

/* loaded from: classes.dex */
public final class AuthKt {
    public static final ActionCodeSettings actionCodeSettings(l lVar) {
        h0.u(lVar, "init");
        ActionCodeSettings.Builder newBuilder = ActionCodeSettings.newBuilder();
        h0.s(newBuilder, "newBuilder(...)");
        lVar.invoke(newBuilder);
        ActionCodeSettings build = newBuilder.build();
        h0.s(build, "build(...)");
        return build;
    }

    public static final FirebaseAuth auth(Firebase firebase, FirebaseApp firebaseApp) {
        h0.u(firebase, "<this>");
        h0.u(firebaseApp, "app");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseApp);
        h0.s(firebaseAuth, "getInstance(...)");
        return firebaseAuth;
    }

    public static final FirebaseAuth getAuth(Firebase firebase) {
        h0.u(firebase, "<this>");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        h0.s(firebaseAuth, "getInstance(...)");
        return firebaseAuth;
    }

    public static final AuthCredential oAuthCredential(String str, l lVar) {
        h0.u(str, "providerId");
        h0.u(lVar, "init");
        OAuthProvider.CredentialBuilder newCredentialBuilder = OAuthProvider.newCredentialBuilder(str);
        h0.s(newCredentialBuilder, "newCredentialBuilder(...)");
        lVar.invoke(newCredentialBuilder);
        AuthCredential build = newCredentialBuilder.build();
        h0.s(build, "build(...)");
        return build;
    }

    public static final OAuthProvider oAuthProvider(String str, l lVar) {
        h0.u(str, "providerId");
        h0.u(lVar, "init");
        OAuthProvider.Builder newBuilder = OAuthProvider.newBuilder(str);
        h0.s(newBuilder, "newBuilder(...)");
        lVar.invoke(newBuilder);
        OAuthProvider build = newBuilder.build();
        h0.s(build, "build(...)");
        return build;
    }

    public static final UserProfileChangeRequest userProfileChangeRequest(l lVar) {
        h0.u(lVar, "init");
        UserProfileChangeRequest.Builder builder = new UserProfileChangeRequest.Builder();
        lVar.invoke(builder);
        UserProfileChangeRequest build = builder.build();
        h0.s(build, "build(...)");
        return build;
    }

    public static final OAuthProvider oAuthProvider(String str, FirebaseAuth firebaseAuth, l lVar) {
        h0.u(str, "providerId");
        h0.u(firebaseAuth, "firebaseAuth");
        h0.u(lVar, "init");
        OAuthProvider.Builder newBuilder = OAuthProvider.newBuilder(str, firebaseAuth);
        h0.s(newBuilder, "newBuilder(...)");
        lVar.invoke(newBuilder);
        OAuthProvider build = newBuilder.build();
        h0.s(build, "build(...)");
        return build;
    }
}

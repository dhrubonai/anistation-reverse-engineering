.class public final Lcom/google/firebase/auth/AuthKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final actionCodeSettings(Lh7/l;)Lcom/google/firebase/auth/ActionCodeSettings;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh7/l;",
            ")",
            "Lcom/google/firebase/auth/ActionCodeSettings;"
        }
    .end annotation

    .line 1
    const-string v0, "init"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/google/firebase/auth/ActionCodeSettings;->newBuilder()Lcom/google/firebase/auth/ActionCodeSettings$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "newBuilder(...)"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, v0}, Lh7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/firebase/auth/ActionCodeSettings$Builder;->build()Lcom/google/firebase/auth/ActionCodeSettings;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, "build(...)"

    .line 23
    .line 24
    invoke-static {p0, v0}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public static final auth(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "app"

    .line 7
    .line 8
    invoke-static {p1, p0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string p1, "getInstance(...)"

    .line 16
    .line 17
    invoke-static {p0, p1}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public static final getAuth(Lcom/google/firebase/Firebase;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance()Lcom/google/firebase/auth/FirebaseAuth;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "getInstance(...)"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static final oAuthCredential(Ljava/lang/String;Lh7/l;)Lcom/google/firebase/auth/AuthCredential;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lh7/l;",
            ")",
            "Lcom/google/firebase/auth/AuthCredential;"
        }
    .end annotation

    .line 1
    const-string v0, "providerId"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "init"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcom/google/firebase/auth/OAuthProvider;->newCredentialBuilder(Ljava/lang/String;)Lcom/google/firebase/auth/OAuthProvider$CredentialBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "newCredentialBuilder(...)"

    .line 16
    .line 17
    invoke-static {p0, v0}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, p0}, Lh7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/google/firebase/auth/OAuthProvider$CredentialBuilder;->build()Lcom/google/firebase/auth/AuthCredential;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "build(...)"

    .line 28
    .line 29
    invoke-static {p0, p1}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method

.method public static final oAuthProvider(Ljava/lang/String;Lcom/google/firebase/auth/FirebaseAuth;Lh7/l;)Lcom/google/firebase/auth/OAuthProvider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/firebase/auth/FirebaseAuth;",
            "Lh7/l;",
            ")",
            "Lcom/google/firebase/auth/OAuthProvider;"
        }
    .end annotation

    const-string v0, "providerId"

    invoke-static {p0, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firebaseAuth"

    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "init"

    invoke-static {p2, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {p0, p1}, Lcom/google/firebase/auth/OAuthProvider;->newBuilder(Ljava/lang/String;Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/firebase/auth/OAuthProvider$Builder;

    move-result-object p0

    const-string p1, "newBuilder(...)"

    invoke-static {p0, p1}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-interface {p2, p0}, Lh7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-virtual {p0}, Lcom/google/firebase/auth/OAuthProvider$Builder;->build()Lcom/google/firebase/auth/OAuthProvider;

    move-result-object p0

    const-string p1, "build(...)"

    invoke-static {p0, p1}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final oAuthProvider(Ljava/lang/String;Lh7/l;)Lcom/google/firebase/auth/OAuthProvider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lh7/l;",
            ")",
            "Lcom/google/firebase/auth/OAuthProvider;"
        }
    .end annotation

    const-string v0, "providerId"

    invoke-static {p0, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "init"

    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0}, Lcom/google/firebase/auth/OAuthProvider;->newBuilder(Ljava/lang/String;)Lcom/google/firebase/auth/OAuthProvider$Builder;

    move-result-object p0

    const-string v0, "newBuilder(...)"

    invoke-static {p0, v0}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1, p0}, Lh7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p0}, Lcom/google/firebase/auth/OAuthProvider$Builder;->build()Lcom/google/firebase/auth/OAuthProvider;

    move-result-object p0

    const-string p1, "build(...)"

    invoke-static {p0, p1}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final userProfileChangeRequest(Lh7/l;)Lcom/google/firebase/auth/UserProfileChangeRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh7/l;",
            ")",
            "Lcom/google/firebase/auth/UserProfileChangeRequest;"
        }
    .end annotation

    .line 1
    const-string v0, "init"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Lh7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;->build()Lcom/google/firebase/auth/UserProfileChangeRequest;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "build(...)"

    .line 19
    .line 20
    invoke-static {p0, v0}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

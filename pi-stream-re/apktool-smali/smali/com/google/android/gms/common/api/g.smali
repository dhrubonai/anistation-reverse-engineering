.class public interface abstract Lcom/google/android/gms/common/api/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/b;


# virtual methods
.method public abstract connect(Lcom/google/android/gms/common/internal/d;)V
.end method

.method public abstract disconnect()V
.end method

.method public abstract disconnect(Ljava/lang/String;)V
.end method

.method public abstract getAvailableFeatures()[Lb5/c;
.end method

.method public abstract getEndpointPackageName()Ljava/lang/String;
.end method

.method public abstract getLastDisconnectMessage()Ljava/lang/String;
.end method

.method public abstract getMinApkVersion()I
.end method

.method public abstract getRemoteService(Lcom/google/android/gms/common/internal/m;Ljava/util/Set;)V
.end method

.method public abstract getScopesForConnectionlessNonSignIn()Ljava/util/Set;
.end method

.method public abstract isConnected()Z
.end method

.method public abstract isConnecting()Z
.end method

.method public abstract onUserSignOut(Lcom/google/android/gms/common/internal/e;)V
.end method

.method public abstract requiresGooglePlayServices()Z
.end method

.method public abstract requiresSignIn()Z
.end method

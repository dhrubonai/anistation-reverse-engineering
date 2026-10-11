.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzafz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzacr;


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:J

.field private final zzc:Z

.field private final zzd:Ljava/lang/String;

.field private final zze:Ljava/lang/String;

.field private final zzf:Ljava/lang/String;

.field private final zzg:Ljava/lang/String;

.field private final zzh:Z

.field private zzi:Lcom/google/android/gms/internal/firebase-auth-api/zzaed;


# direct methods
.method public constructor <init>(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lw7/b;->o(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zza:Ljava/lang/String;

    .line 8
    .line 9
    iput-wide p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzb:J

    .line 10
    .line 11
    iput-boolean p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzc:Z

    .line 12
    .line 13
    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzd:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zze:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p7, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzf:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p8, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzg:Ljava/lang/String;

    .line 20
    .line 21
    iput-boolean p9, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzh:Z

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "phoneNumber"

    .line 2
    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zza:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zze:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "tenantId"

    .line 4
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzf:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v2, "recaptchaToken"

    .line 6
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzi:Lcom/google/android/gms/internal/firebase-auth-api/zzaed;

    if-eqz v1, :cond_2

    const-string v2, "autoRetrievalInfo"

    .line 8
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaed;->zza()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzg:Ljava/lang/String;

    if-eqz v1, :cond_3

    const-string v2, "playIntegrityToken"

    .line 10
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    :cond_3
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaed;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzi:Lcom/google/android/gms/internal/firebase-auth-api/zzaed;

    return-void
.end method

.method public final zzb()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzb:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzd:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zza:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zze()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzc:Z

    .line 2
    .line 3
    return v0
.end method

.method public final zzf()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzh:Z

    .line 2
    .line 3
    return v0
.end method

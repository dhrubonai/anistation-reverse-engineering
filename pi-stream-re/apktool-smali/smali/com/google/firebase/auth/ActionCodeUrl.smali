.class public Lcom/google/firebase/auth/ActionCodeUrl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzau;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzau<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzb:Ljava/lang/String;

.field private final zzc:Ljava/lang/String;

.field private final zzd:Ljava/lang/String;

.field private final zze:Ljava/lang/String;

.field private final zzf:Ljava/lang/String;

.field private final zzg:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v9, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const-string v2, "recoverEmail"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const-string v4, "resetPassword"

    .line 11
    .line 12
    const/4 v5, 0x4

    .line 13
    const-string v6, "signIn"

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const-string v8, "verifyEmail"

    .line 17
    .line 18
    move-object v1, v9

    .line 19
    invoke-static/range {v0 .. v8}, La3/g;->x(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x5

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "verifyBeforeChangeEmail"

    .line 28
    .line 29
    invoke-virtual {v9, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x6

    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "revertSecondFactorAddition"

    .line 38
    .line 39
    invoke-virtual {v9, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-static {v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzau;->zza(Ljava/util/Map;)Lcom/google/android/gms/internal/firebase-auth-api/zzau;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lcom/google/firebase/auth/ActionCodeUrl;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzau;

    .line 47
    .line 48
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "apiKey"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/google/firebase/auth/ActionCodeUrl;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "oobCode"

    .line 11
    .line 12
    invoke-static {p1, v2}, Lcom/google/firebase/auth/ActionCodeUrl;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-string v4, "mode"

    .line 17
    .line 18
    invoke-static {p1, v4}, Lcom/google/firebase/auth/ActionCodeUrl;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    invoke-static {v1}, Lw7/b;->o(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zzb:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v3}, Lw7/b;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iput-object v3, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zzc:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v5}, Lw7/b;->o(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object v5, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zzd:Ljava/lang/String;

    .line 42
    .line 43
    const-string v0, "continueUrl"

    .line 44
    .line 45
    invoke-static {p1, v0}, Lcom/google/firebase/auth/ActionCodeUrl;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zze:Ljava/lang/String;

    .line 50
    .line 51
    const-string v0, "languageCode"

    .line 52
    .line 53
    invoke-static {p1, v0}, Lcom/google/firebase/auth/ActionCodeUrl;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zzf:Ljava/lang/String;

    .line 58
    .line 59
    const-string v0, "tenantId"

    .line 60
    .line 61
    invoke-static {p1, v0}, Lcom/google/firebase/auth/ActionCodeUrl;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zzg:Ljava/lang/String;

    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    const/4 v1, 0x3

    .line 71
    new-array v1, v1, [Ljava/lang/Object;

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    aput-object v0, v1, v3

    .line 75
    .line 76
    const/4 v0, 0x1

    .line 77
    aput-object v2, v1, v0

    .line 78
    .line 79
    const/4 v0, 0x2

    .line 80
    aput-object v4, v1, v0

    .line 81
    .line 82
    const-string v0, "%s, %s and %s are required in a valid action code URL"

    .line 83
    .line 84
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1
.end method

.method public static parseLink(Ljava/lang/String;)Lcom/google/firebase/auth/ActionCodeUrl;
    .locals 1

    .line 1
    invoke-static {p0}, Lw7/b;->o(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-instance v0, Lcom/google/firebase/auth/ActionCodeUrl;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/google/firebase/auth/ActionCodeUrl;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-object v0

    .line 10
    :catch_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method private static zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "link"

    .line 2
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v1

    .line 4
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {p0, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 6
    :cond_0
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {p0, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lw7/b;->o(Ljava/lang/String;)V

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public getApiKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zzb:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zzc:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContinueUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zze:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLanguageCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zzf:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOperation()I
    .locals 2

    .line 1
    sget-object v0, Lcom/google/firebase/auth/ActionCodeUrl;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzau;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zzd:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzau;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zzd:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzau;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x3

    .line 25
    return v0
.end method

.method public final zza()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/ActionCodeUrl;->zzg:Ljava/lang/String;

    return-object v0
.end method

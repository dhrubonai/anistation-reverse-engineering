.class public final Lcom/google/firebase/auth/internal/zzbx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field zza:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/recaptcha/RecaptchaTasksClient;",
            ">;>;"
        }
    .end annotation
.end field

.field zzb:Lcom/google/firebase/FirebaseApp;

.field zzc:Lcom/google/firebase/auth/internal/zzbs;

.field private zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzafj;

.field private zze:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/firebase/auth/internal/zzbv;

    invoke-direct {v0}, Lcom/google/firebase/auth/internal/zzbv;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/google/firebase/auth/internal/zzbx;-><init>(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/internal/zzbs;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/internal/zzbs;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/auth/internal/zzbx;->zza:Ljava/util/Map;

    .line 4
    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzbx;->zzb:Lcom/google/firebase/FirebaseApp;

    .line 5
    iput-object p2, p0, Lcom/google/firebase/auth/internal/zzbx;->zze:Lcom/google/firebase/auth/FirebaseAuth;

    .line 6
    iput-object p3, p0, Lcom/google/firebase/auth/internal/zzbx;->zzc:Lcom/google/firebase/auth/internal/zzbs;

    return-void
.end method

.method public static bridge synthetic zza(Lcom/google/firebase/auth/internal/zzbx;Lcom/google/android/gms/internal/firebase-auth-api/zzafj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzbx;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzafj;

    return-void
.end method

.method private final zzb(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/recaptcha/RecaptchaTasksClient;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzbx;->zza:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/android/gms/tasks/Task;

    .line 8
    .line 9
    return-object p1
.end method

.method private static zzc(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzah;->zzc(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, "*"

    .line 8
    .line 9
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/recaptcha/RecaptchaTasksClient;",
            ">;"
        }
    .end annotation

    .line 7
    invoke-static {p1}, Lcom/google/firebase/auth/internal/zzbx;->zzc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    .line 9
    invoke-direct {p0, p1}, Lcom/google/firebase/auth/internal/zzbx;->zzb(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    if-eqz p2, :cond_0

    return-object p2

    .line 10
    :cond_0
    iget-object p2, p0, Lcom/google/firebase/auth/internal/zzbx;->zze:Lcom/google/firebase/auth/FirebaseAuth;

    const-string v0, "RECAPTCHA_ENTERPRISE"

    .line 11
    invoke-virtual {p2, v0}, Lcom/google/firebase/auth/FirebaseAuth;->zza(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    new-instance v0, Lcom/google/firebase/auth/internal/zzbw;

    invoke-direct {v0, p0, p1}, Lcom/google/firebase/auth/internal/zzbw;-><init>(Lcom/google/firebase/auth/internal/zzbx;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/google/android/recaptcha/RecaptchaAction;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-static {p1}, Lcom/google/firebase/auth/internal/zzbx;->zzc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-direct {p0, p1}, Lcom/google/firebase/auth/internal/zzbx;->zzb(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    .line 4
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    if-nez v0, :cond_1

    .line 5
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/auth/internal/zzbx;->zza(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    .line 6
    :cond_1
    new-instance p1, Lcom/google/firebase/auth/internal/zzbz;

    invoke-direct {p1, p0, p3}, Lcom/google/firebase/auth/internal/zzbz;-><init>(Lcom/google/firebase/auth/internal/zzbx;Lcom/google/android/recaptcha/RecaptchaAction;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ljava/lang/String;)Z
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzbx;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzafj;

    if-eqz v0, :cond_0

    .line 14
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafj;->zzb(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

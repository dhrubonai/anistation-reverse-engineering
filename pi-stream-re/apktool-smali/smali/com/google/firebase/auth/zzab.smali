.class final Lcom/google/firebase/auth/zzab;
.super Lcom/google/firebase/auth/internal/zzbo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/auth/internal/zzbo<",
        "Lcom/google/firebase/auth/AuthResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zza:Z

.field private final synthetic zzb:Lcom/google/firebase/auth/FirebaseUser;

.field private final synthetic zzc:Lcom/google/firebase/auth/EmailAuthCredential;

.field private final synthetic zzd:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;ZLcom/google/firebase/auth/FirebaseUser;Lcom/google/firebase/auth/EmailAuthCredential;)V
    .locals 0

    .line 1
    iput-boolean p2, p0, Lcom/google/firebase/auth/zzab;->zza:Z

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/firebase/auth/zzab;->zzb:Lcom/google/firebase/auth/FirebaseUser;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/firebase/auth/zzab;->zzc:Lcom/google/firebase/auth/EmailAuthCredential;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/firebase/auth/zzab;->zzd:Lcom/google/firebase/auth/FirebaseAuth;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/google/firebase/auth/internal/zzbo;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "FirebaseAuth"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "Email link login/reauth with empty reCAPTCHA token"

    .line 10
    .line 11
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "Got reCAPTCHA token for login/reauth with email link"

    .line 16
    .line 17
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    :goto_0
    iget-boolean v0, p0, Lcom/google/firebase/auth/zzab;->zza:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/firebase/auth/zzab;->zzd:Lcom/google/firebase/auth/FirebaseAuth;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->zzc(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v0, p0, Lcom/google/firebase/auth/zzab;->zzd:Lcom/google/firebase/auth/FirebaseAuth;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->zza(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/firebase/FirebaseApp;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v3, p0, Lcom/google/firebase/auth/zzab;->zzb:Lcom/google/firebase/auth/FirebaseUser;

    .line 37
    .line 38
    invoke-static {v3}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v4, p0, Lcom/google/firebase/auth/zzab;->zzc:Lcom/google/firebase/auth/EmailAuthCredential;

    .line 42
    .line 43
    new-instance v6, Lcom/google/firebase/auth/FirebaseAuth$zza;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/google/firebase/auth/zzab;->zzd:Lcom/google/firebase/auth/FirebaseAuth;

    .line 46
    .line 47
    invoke-direct {v6, v0}, Lcom/google/firebase/auth/FirebaseAuth$zza;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 48
    .line 49
    .line 50
    move-object v5, p1

    .line 51
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zzb(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/firebase/auth/EmailAuthCredential;Ljava/lang/String;Lcom/google/firebase/auth/internal/zzcc;)Lcom/google/android/gms/tasks/Task;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :cond_1
    iget-object v0, p0, Lcom/google/firebase/auth/zzab;->zzd:Lcom/google/firebase/auth/FirebaseAuth;

    .line 57
    .line 58
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->zzc(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, p0, Lcom/google/firebase/auth/zzab;->zzd:Lcom/google/firebase/auth/FirebaseAuth;

    .line 63
    .line 64
    invoke-static {v1}, Lcom/google/firebase/auth/FirebaseAuth;->zza(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/firebase/FirebaseApp;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v2, p0, Lcom/google/firebase/auth/zzab;->zzc:Lcom/google/firebase/auth/EmailAuthCredential;

    .line 69
    .line 70
    new-instance v3, Lcom/google/firebase/auth/FirebaseAuth$zzb;

    .line 71
    .line 72
    iget-object v4, p0, Lcom/google/firebase/auth/zzab;->zzd:Lcom/google/firebase/auth/FirebaseAuth;

    .line 73
    .line 74
    invoke-direct {v3, v4}, Lcom/google/firebase/auth/FirebaseAuth$zzb;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/EmailAuthCredential;Ljava/lang/String;Lcom/google/firebase/auth/internal/zzl;)Lcom/google/android/gms/tasks/Task;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1
.end method

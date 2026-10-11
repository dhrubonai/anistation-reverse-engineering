.class final Lcom/google/firebase/auth/zzac;
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
.field private final synthetic zza:Ljava/lang/String;

.field private final synthetic zzb:Z

.field private final synthetic zzc:Lcom/google/firebase/auth/FirebaseUser;

.field private final synthetic zzd:Ljava/lang/String;

.field private final synthetic zze:Ljava/lang/String;

.field private final synthetic zzf:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;ZLcom/google/firebase/auth/FirebaseUser;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/firebase/auth/zzac;->zza:Ljava/lang/String;

    .line 2
    .line 3
    iput-boolean p3, p0, Lcom/google/firebase/auth/zzac;->zzb:Z

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/firebase/auth/zzac;->zzc:Lcom/google/firebase/auth/FirebaseUser;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/google/firebase/auth/zzac;->zzd:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/google/firebase/auth/zzac;->zze:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/firebase/auth/zzac;->zzf:Lcom/google/firebase/auth/FirebaseAuth;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/google/firebase/auth/internal/zzbo;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 9
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
    iget-object v0, p0, Lcom/google/firebase/auth/zzac;->zza:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "Logging in as "

    .line 14
    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, " with empty reCAPTCHA token"

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/zzac;->zza:Ljava/lang/String;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v3, "Got reCAPTCHA token for login with email "

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-boolean v0, p0, Lcom/google/firebase/auth/zzac;->zzb:Z

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget-object v0, p0, Lcom/google/firebase/auth/zzac;->zzf:Lcom/google/firebase/auth/FirebaseAuth;

    .line 58
    .line 59
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->zzc(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-object v0, p0, Lcom/google/firebase/auth/zzac;->zzf:Lcom/google/firebase/auth/FirebaseAuth;

    .line 64
    .line 65
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->zza(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/firebase/FirebaseApp;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v3, p0, Lcom/google/firebase/auth/zzac;->zzc:Lcom/google/firebase/auth/FirebaseUser;

    .line 70
    .line 71
    invoke-static {v3}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v4, p0, Lcom/google/firebase/auth/zzac;->zza:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v5, p0, Lcom/google/firebase/auth/zzac;->zzd:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v6, p0, Lcom/google/firebase/auth/zzac;->zze:Ljava/lang/String;

    .line 79
    .line 80
    new-instance v8, Lcom/google/firebase/auth/FirebaseAuth$zza;

    .line 81
    .line 82
    iget-object v0, p0, Lcom/google/firebase/auth/zzac;->zzf:Lcom/google/firebase/auth/FirebaseAuth;

    .line 83
    .line 84
    invoke-direct {v8, v0}, Lcom/google/firebase/auth/FirebaseAuth$zza;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 85
    .line 86
    .line 87
    move-object v7, p1

    .line 88
    invoke-virtual/range {v1 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zzb(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/auth/internal/zzcc;)Lcom/google/android/gms/tasks/Task;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :cond_1
    iget-object v0, p0, Lcom/google/firebase/auth/zzac;->zzf:Lcom/google/firebase/auth/FirebaseAuth;

    .line 94
    .line 95
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->zzc(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v0, p0, Lcom/google/firebase/auth/zzac;->zzf:Lcom/google/firebase/auth/FirebaseAuth;

    .line 100
    .line 101
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->zza(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/firebase/FirebaseApp;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iget-object v3, p0, Lcom/google/firebase/auth/zzac;->zza:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v4, p0, Lcom/google/firebase/auth/zzac;->zzd:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v5, p0, Lcom/google/firebase/auth/zzac;->zze:Ljava/lang/String;

    .line 110
    .line 111
    new-instance v7, Lcom/google/firebase/auth/FirebaseAuth$zzb;

    .line 112
    .line 113
    iget-object v0, p0, Lcom/google/firebase/auth/zzac;->zzf:Lcom/google/firebase/auth/FirebaseAuth;

    .line 114
    .line 115
    invoke-direct {v7, v0}, Lcom/google/firebase/auth/FirebaseAuth$zzb;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 116
    .line 117
    .line 118
    move-object v6, p1

    .line 119
    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zzb(Lcom/google/firebase/FirebaseApp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/auth/internal/zzl;)Lcom/google/android/gms/tasks/Task;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1
.end method

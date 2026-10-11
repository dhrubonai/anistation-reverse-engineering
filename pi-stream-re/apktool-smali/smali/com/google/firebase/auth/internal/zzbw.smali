.class final Lcom/google/firebase/auth/internal/zzbw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/Continuation<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzafj;",
        "Lcom/google/android/gms/tasks/Task<",
        "Lcom/google/android/recaptcha/RecaptchaTasksClient;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final synthetic zza:Ljava/lang/String;

.field private final synthetic zzb:Lcom/google/firebase/auth/internal/zzbx;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/internal/zzbx;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/google/firebase/auth/internal/zzbw;->zza:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/firebase/auth/internal/zzbw;->zzb:Lcom/google/firebase/auth/internal/zzbx;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/google/firebase/auth/internal/zzbu;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p1}, Lcom/google/firebase/auth/internal/zzbu;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzafj;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafj;->zza()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzah;->zzc(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    new-instance p1, Lcom/google/firebase/auth/internal/zzbu;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzbw;->zza:Ljava/lang/String;

    .line 50
    .line 51
    const-string v1, "No Recaptcha Enterprise siteKey configured for tenant/project "

    .line 52
    .line 53
    invoke-static {v1, v0}, Lr/f;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-direct {p1, v0}, Lcom/google/firebase/auth/internal/zzbu;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_1
    const/16 v1, 0x2f

    .line 66
    .line 67
    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzac;->zza(C)Lcom/google/android/gms/internal/firebase-auth-api/zzac;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzac;->zza(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    const/4 v3, 0x4

    .line 80
    if-eq v2, v3, :cond_2

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const/4 v2, 0x3

    .line 85
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Ljava/lang/String;

    .line 90
    .line 91
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    new-instance p1, Ljava/lang/Exception;

    .line 98
    .line 99
    const-string v1, "Invalid siteKey format "

    .line 100
    .line 101
    invoke-static {v1, v0}, Lr/f;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    return-object p1

    .line 113
    :cond_3
    const-string v0, "RecaptchaHandler"

    .line 114
    .line 115
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_4

    .line 120
    .line 121
    iget-object v2, p0, Lcom/google/firebase/auth/internal/zzbw;->zza:Ljava/lang/String;

    .line 122
    .line 123
    new-instance v3, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v4, "Successfully obtained site key for tenant "

    .line 126
    .line 127
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    :cond_4
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzbw;->zzb:Lcom/google/firebase/auth/internal/zzbx;

    .line 141
    .line 142
    invoke-static {v0, p1}, Lcom/google/firebase/auth/internal/zzbx;->zza(Lcom/google/firebase/auth/internal/zzbx;Lcom/google/android/gms/internal/firebase-auth-api/zzafj;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, Lcom/google/firebase/auth/internal/zzbw;->zzb:Lcom/google/firebase/auth/internal/zzbx;

    .line 146
    .line 147
    iget-object v0, p1, Lcom/google/firebase/auth/internal/zzbx;->zzc:Lcom/google/firebase/auth/internal/zzbs;

    .line 148
    .line 149
    iget-object p1, p1, Lcom/google/firebase/auth/internal/zzbx;->zzb:Lcom/google/firebase/FirebaseApp;

    .line 150
    .line 151
    invoke-virtual {p1}, Lcom/google/firebase/FirebaseApp;->getApplicationContext()Landroid/content/Context;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Landroid/app/Application;

    .line 156
    .line 157
    invoke-interface {v0, p1, v1}, Lcom/google/firebase/auth/internal/zzbs;->zza(Landroid/app/Application;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzbw;->zzb:Lcom/google/firebase/auth/internal/zzbx;

    .line 162
    .line 163
    iget-object v0, v0, Lcom/google/firebase/auth/internal/zzbx;->zza:Ljava/util/Map;

    .line 164
    .line 165
    iget-object v1, p0, Lcom/google/firebase/auth/internal/zzbw;->zza:Ljava/lang/String;

    .line 166
    .line 167
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    return-object p1
.end method

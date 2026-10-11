.class public final Lcom/google/android/gms/internal/auth-api-phone/zzab;
.super Lx4/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lx4/a;-><init>(Landroid/app/Activity;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lx4/a;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final startSmsRetriever()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/internal/v;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzx;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api-phone/zzx;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzab;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [Lb5/c;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    sget-object v3, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zzc:Lb5/c;

    .line 18
    .line 19
    aput-object v3, v1, v2

    .line 20
    .line 21
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 22
    .line 23
    const/16 v1, 0x61f

    .line 24
    .line 25
    iput v1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public final startSmsUserConsent(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/internal/v;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzy;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api-phone/zzy;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzab;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    new-array p1, p1, [Lb5/c;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    sget-object v2, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zzd:Lb5/c;

    .line 18
    .line 19
    aput-object v2, p1, v1

    .line 20
    .line 21
    iput-object p1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 22
    .line 23
    const/16 p1, 0x620

    .line 24
    .line 25
    iput p1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

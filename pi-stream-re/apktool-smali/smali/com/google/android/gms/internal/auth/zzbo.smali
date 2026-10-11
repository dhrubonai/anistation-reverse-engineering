.class public final Lcom/google/android/gms/internal/auth/zzbo;
.super Lcom/google/android/gms/common/api/l;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lt4/d;)V
    .locals 2

    .line 1
    sget-object v0, Lt4/c;->a:Lcom/google/android/gms/common/api/i;

    if-nez p2, :cond_0

    .line 2
    sget-object p2, Lt4/d;->b:Lt4/d;

    :cond_0
    sget-object v1, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    .line 3
    invoke-direct {p0, p1, v0, p2, v1}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lt4/d;)V
    .locals 2

    .line 4
    sget-object v0, Lt4/c;->a:Lcom/google/android/gms/common/api/i;

    if-nez p2, :cond_0

    .line 5
    sget-object p2, Lt4/d;->b:Lt4/d;

    :cond_0
    sget-object v1, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    .line 6
    invoke-direct {p0, p1, v0, p2, v1}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    return-void
.end method


# virtual methods
.method public final getSpatulaHeader()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
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
    new-instance v1, Lcom/google/android/gms/internal/auth/zzbk;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth/zzbk;-><init>(Lcom/google/android/gms/internal/auth/zzbo;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 12
    .line 13
    const/16 v1, 0x5f0

    .line 14
    .line 15
    iput v1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public final performProxyRequest(Ly4/a;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly4/a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ly4/b;",
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
    new-instance v1, Lcom/google/android/gms/internal/auth/zzbl;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth/zzbl;-><init>(Lcom/google/android/gms/internal/auth/zzbo;Ly4/a;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 12
    .line 13
    const/16 p1, 0x5ee

    .line 14
    .line 15
    iput p1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method
